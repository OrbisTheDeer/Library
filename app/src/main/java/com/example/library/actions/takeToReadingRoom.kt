package com.example.library.actions

import com.example.library.classes.Library
import com.example.library.classes.takeInReadingRoom

fun takeToReadingRoom(item: Int, curLib: List<Library>): Int {
    var ans: Int = 1
    val curItem = curLib[item - 1]
    if (curItem is takeInReadingRoom) {
        if (curItem.access) {
            curItem.access = false
            println("You have successfully taken the ${curItem.getTypeItem()} ${curItem.id} to Reading Room!")
        }
        else {
            ans = 0
            println("You can't take it now!")
        }
    }
    else {
        ans = 0
        println("Only Books and Newspapers can be taken to the Reading Room!")
    }
    return ans
}