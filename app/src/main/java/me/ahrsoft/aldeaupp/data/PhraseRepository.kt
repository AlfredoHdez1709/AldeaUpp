package me.ahrsoft.aldeaupp.data

import me.ahrsoft.aldeaupp.data.model.Phrase
import me.ahrsoft.aldeaupp.data.network.PhraseService

class PhraseRepository {
    private val api = PhraseService()

    suspend fun getRandomPhrase(): Phrase {
        return api.getRandomPhrases()
    }
}