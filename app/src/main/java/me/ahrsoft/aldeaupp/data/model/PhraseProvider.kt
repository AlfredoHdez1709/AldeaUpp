package me.ahrsoft.aldeaupp.data.model

class PhraseProvider {
    fun random() : Phrase {
        val position = (0..9).random()
        return phrases[position]
    }
    private val phrases = listOf(
        Phrase(text = "Hola 1"),
        Phrase(text = "Hola 2"),
        Phrase(text = "Hola 3"),
        Phrase(text = "Hola 4"),
        Phrase(text = "Hola 5"),
        Phrase(text = "Hola 6"),
        Phrase(text = "Hola 7"),
        Phrase(text = "Hola 8"),
        Phrase(text = "Hola 9"),
        Phrase(text = "Hola 10"),
    )
}