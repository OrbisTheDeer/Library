package com.example.library.actions

import com.example.library.classes.Library

fun returnItem(item: Int, curLib: List<Library>): Int {
    var ans: Int = 1
    if (!curLib[item - 1].access) {
        curLib[item - 1].access = true
        println("You have successfully returned the ${curLib[item-1].getTypeItem()} ${curLib[item - 1].id} to the library!")
    } else{
        ans = 0
        println("The ${curLib[item-1].getTypeItem()} ${curLib[item - 1].id} is already in the Library")
    }
    return ans
}