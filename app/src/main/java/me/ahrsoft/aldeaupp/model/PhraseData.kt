package me.ahrsoft.aldeaupp.model

class PhraseData {
    fun random() : Phrase {
        val position = (0..3).random()
        return phrases[position]
    }
    private val phrases = listOf(
        Phrase(text = "Hola 1"),
        Phrase(text = "Hola 2"),
        Phrase(text = "Hola 3")
    )
}