package com.example.library.actions
import com.example.library.classes.Library

fun chooseAction(item: Int, curLib: List<Library>, library: MutableList<Library>): Int{
    var ans: Int = 1
    println("0. Вернуться в главное меню \n1. Взять домой \n2. Читать в читальном зале  \n3. Подробная информация \n4. Вернуть в библиотеку \n5. Оцифровать ")
    when (readlnOrNull()?.toIntOrNull()) {
        0 -> ans = 0
        1 -> ans = takeHome(item, curLib)
        2 -> ans = takeToReadingRoom(item, curLib)
        3 -> println(curLib[item - 1].detailedInfo())
        4 -> ans = returnItem(item, curLib)
        5 -> ans = toDigite(item, curLib, library)
        else -> {
            println("Вы возвращены в главное меню")
            ans = 0}
    }
    return ans
}