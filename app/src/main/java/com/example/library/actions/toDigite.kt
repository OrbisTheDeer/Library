package com.example.library.actions
import com.example.library.classes.Library
import com.example.library.classes.Discs
import com.example.library.classes.Digitisation
import com.example.library.classes.digitisable

inline fun <reified T> List<Library>.filter(): List<T> {
    var filtered = mutableListOf<T>()
    for (el in this) {
        if (el is T) {
            filtered.add(el)
        }
    }
    return filtered
}

fun searchMaxId(library: List<Library>) : Int {
    var maxId = 0
    for (el in library.filter<Discs>()) {
        maxId = maxOf(maxId, el.id)
    }
    return maxId
}

fun toDigite(item: Int, curLib: List<Library>, library: MutableList<Library>) : Int{
    var ans: Int = 1
    val curItem = curLib[item - 1]
    if (curItem is digitisable) {
        if (curItem.access) {
            library.add(Digitisation<Library>().digitise(library, curItem))
            println("Успешно оцифровано и добавлено в библиотеку дисков!")
        }
        else {
            ans = 0
            println("You can't take it now!")
        }
    }
    else {
        ans = 0
        println("Only Books and Newspapers can be taken digitise!")
    }
    return ans
}