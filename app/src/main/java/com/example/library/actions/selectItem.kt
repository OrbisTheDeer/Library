package com.example.library.actions

import com.example.library.classes.Library

fun selectItem(curLib: List<Library>): Pair<Int, Int> {
    var ans: Int = 1
    println("Select the item \n0. Back to Main Menu")
    for ((i, el) in curLib.withIndex()) {
        println((i + 1).toString() + ". " + el.info())
    }
    var item = readlnOrNull()?.toIntOrNull()
    if (item == null) {
        ans = 0
        item = 0
        println("You are returned to the Main Menu")
    } else if (item == 0 || (item > curLib.count())) {
        println("You are returned to the Main Menu")
        ans = 0
    }
    return Pair(ans, item)
}