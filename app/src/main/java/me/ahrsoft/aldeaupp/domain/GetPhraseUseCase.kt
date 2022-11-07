package me.ahrsoft.aldeaupp.domain

import me.ahrsoft.aldeaupp.data.PhraseRepository
import me.ahrsoft.aldeaupp.data.model.Phrase

class GetPhraseUseCase {
    private val repository = PhraseRepository()
    suspend operator fun invoke() : Phrase = repository.getRandomPhrase()
}