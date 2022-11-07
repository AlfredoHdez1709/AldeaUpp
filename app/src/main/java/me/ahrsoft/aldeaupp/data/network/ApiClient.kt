package me.ahrsoft.aldeaupp.data.network

import me.ahrsoft.aldeaupp.data.model.Phrase
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("jokes/random")
    suspend fun getPhase() : Response<Phrase>
}