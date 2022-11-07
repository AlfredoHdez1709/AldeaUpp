package me.ahrsoft.aldeaupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import me.ahrsoft.aldeaupp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initObserver()
        //binding.textPhrase.text = PhraseData().random().text
    }

    private fun initObserver() {
        model.isLoading.observe(this){
            controllerUI(it)
        }
        model.phrase.observe(this){ phrase ->
            phrase?.let {
                with(binding){
                    textPhrase.text = it
                    textPhrase.setOnClickListener {
                        model.getPhrase()
                    }
                }
            }
        }
    }

    private fun controllerUI(isLoading : Boolean){
        with(binding){
            progressBar.isVisible = isLoading
            textPhrase.isVisible = !isLoading
        }
    }
}