package com.example.library.actions

import com.example.library.classes.Library
import com.example.library.classes.takeHomable

fun takeHome(item: Int, curLib: List<Library>): Int {
    var ans: Int = 1
    val curItem = curLib[item - 1]
    if (curItem is takeHomable) {
        if (curItem.access) {
            curItem.access = false
            println("You have successfully taken the ${curItem.getTypeItem()} ${curItem.id} to home!")
        }
        else {
            ans = 0
            println("You can't take it now!")
        }
    }
    else {
        ans = 0
        println("Only Books and Discs can be taken home!")
    }
    return ans
}