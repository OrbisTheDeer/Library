package com.example.library.classes

abstract class Library(
    val id: Int,
    var access: Boolean = true,
    val name: String,
    val itemType: String
){
    open fun info() :String {
        return "$name available: $access"
    }
    abstract fun detailedInfo(): String
    open fun getTypeItem(): String{
        return itemType
    }
}

interface takeHomable{}
interface takeInReadingRoom{}
interface digitisable{}