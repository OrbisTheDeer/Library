package com.example.library.classes

class Manager<T : Library>{
    fun toBuy(shop: Shop<T>): T {
        when (shop) {
            is BookShop -> {
                println("Менеджер купил книгу ${shop.getBuy().name}")
            }
            is NewspaperShop -> {
                println("Менеджер купил газету ${shop.getBuy().name}")
            }
            is DiscShop -> {
                println("Менеджер купил диск ${shop.getBuy().name}")
            }
        }
        return shop.getBuy()
    }
}