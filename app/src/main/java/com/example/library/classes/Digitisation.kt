package com.example.library.classes

import com.example.library.actions.searchMaxId

class Digitisation<in T : Library> () {
    fun digitise(library: List<Library>, item: T): Discs {
        return Discs(searchMaxId(library) + 1, access = true, item.name, "CD")
    }
}