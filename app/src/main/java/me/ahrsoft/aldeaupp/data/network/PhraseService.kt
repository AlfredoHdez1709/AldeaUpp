package me.ahrsoft.aldeaupp.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.ahrsoft.aldeaupp.core.RetrofitHelper
import me.ahrsoft.aldeaupp.data.model.Phrase

class PhraseService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getRandomPhrases() : Phrase {
        return withContext(Dispatchers.IO){
            val response = retrofit.create(ApiClient::class.java).getPhase()
            print(response.errorBody())
            response.body() ?: Phrase("No found")
        }
    }
}