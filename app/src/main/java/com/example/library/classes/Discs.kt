package com.example.library.classes

class Discs(
    id: Int,
    access: Boolean,
    name: String,
    val type: String,
    itemType: String = "Disc"
) : Library(id, access, name, itemType), takeHomable{
    override fun detailedInfo(): String {
        return " $type $name available: $access"
    }
}