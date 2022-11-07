package me.ahrsoft.aldeaupp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import me.ahrsoft.aldeaupp.model.PhraseData

class MainViewModel() : ViewModel() {

    private var _phrase = MutableLiveData<String>()
    val phrase get() = _phrase

    init {
        getPhrase()
    }

    fun getPhrase() {
        _phrase.value = PhraseData().random().text
    }

}