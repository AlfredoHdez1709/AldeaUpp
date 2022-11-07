package me.ahrsoft.aldeaupp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import me.ahrsoft.aldeaupp.domain.GetPhraseUseCase

class MainViewModel() : ViewModel() {

    private var _phrase = MutableLiveData<String>()
    val phrase get() = _phrase

    val isLoading =MutableLiveData<Boolean>()
    val getPhraseUseCase = GetPhraseUseCase()

    init {
        getPhrase()
    }

    fun getPhrase() = viewModelScope.launch {
//        _phrase.value = PhraseProvider().random().text
        isLoading.value = true
        val result = getPhraseUseCase()
        result.let {
            _phrase.value = it.text
            isLoading.value = false
        }
    }

}