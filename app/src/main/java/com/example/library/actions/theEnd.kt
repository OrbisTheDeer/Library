package com.example.library.actions

fun theEnd(): Int {
    println("0. Вернуться в главное меню \n1. Выйти ")
    var ans: Int = 1
    when (readlnOrNull()?.toIntOrNull()) {
        0 -> ans = 0
        1 -> ans = 100
        else -> {
            println("Вы возвращены в главное меню")
            ans = 0}
    }
    return ans
}