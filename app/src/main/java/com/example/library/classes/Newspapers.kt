package com.example.library.classes

class Newspapers(
    id: Int,
    access: Boolean,
    name: String,
    val number: Int,
    val rusMonth: String,
    itemType: String = "Newspaper"
) : Library(id, access, name, itemType), takeInReadingRoom, digitisable {
    override fun detailedInfo(): String {
        return "Выпуск газеты $name (№ $number, $rusMonth) с id $id доступен: $access"
    }
}