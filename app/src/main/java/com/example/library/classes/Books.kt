package com.example.library.classes

class Books(
    id: Int,
    access: Boolean,
    name: String,
    val pages: Int,
    val author: String,
    itemType: String = "Book"
) : Library(id, access, name, itemType), takeHomable, takeInReadingRoom, digitisable {
    override fun detailedInfo():String {
        return "Книга: $name ($pages стр.) автора $author с id: $id доступна: $access"
    }
}