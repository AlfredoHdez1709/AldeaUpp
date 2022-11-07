package me.ahrsoft.aldeaupp.data.model

import com.google.gson.annotations.SerializedName

data class Phrase(
    @SerializedName("value") val text : String
)
