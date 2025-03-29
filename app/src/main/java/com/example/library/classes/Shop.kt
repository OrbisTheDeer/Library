package com.example.library.classes

interface Shop<out T : Library> {
    val item: T
    fun getBuy(): T{
        return item
    }
}

class BookShop : Shop<Books> {
    override val item = Books(5, true, "Alice in Wonderland", 1500, "Lewis Carroll")
}
class NewspaperShop : Shop<Newspapers> {
    override val item = Newspapers(7, true, "Vedomosti", 1, Month.MARCH.rusName)
}
class DiscShop : Shop<Discs> {
    override val item = Discs(5, true, "League Of Legends", "CD")
}