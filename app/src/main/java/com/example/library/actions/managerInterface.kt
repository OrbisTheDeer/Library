package com.example.library.actions
import com.example.library.classes.Shop
import com.example.library.classes.BookShop
import com.example.library.classes.NewspaperShop
import com.example.library.classes.DiscShop
import com.example.library.classes.Manager
import com.example.library.classes.Books
import com.example.library.classes.Newspapers
import com.example.library.classes.Discs

fun managerInterface(shopList: List<Shop<*>>) {
    var ans: Int = 1
    while (true) {
        println("0. Вернуться в главное меню \n1. Купить книгу в книжном магазине \n2. Купить газету в газетном киоске \n3. Купить диск в магазине дисков")
        var purchase = readlnOrNull()?.toIntOrNull()

        when (purchase) {
            0 -> ans = 100
            1 -> {
                val shop = shopList[0] as? BookShop
                if (shop != null) {
                    val manager = Manager<Books>()
                    manager.toBuy(shop)
                } else {
                    println("В магазине нет книг для покупки")
                }
            }

            2 -> {
                val shop = shopList[1] as? NewspaperShop
                if (shop != null) {
                    val manager = Manager<Newspapers>()
                    manager.toBuy(shop)
                } else {
                    println("В магазине нет газет для покупки")
                }
            }

            3 -> {
                val shop = shopList[2] as? DiscShop
                if (shop != null) {
                    val manager = Manager<Discs>()
                    manager.toBuy(shop)
                } else {
                    println("В магазине нет дисков для покупки")
                }
            }
            else -> {
                println("The value must be between 1 and 3")
                ans = 0
            }
        }
        if (ans == 0) continue
        if (ans == 100) break
    }
}