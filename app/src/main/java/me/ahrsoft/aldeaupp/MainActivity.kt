package me.ahrsoft.aldeaupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.ahrsoft.aldeaupp.databinding.ActivityMainBinding
import me.ahrsoft.aldeaupp.model.PhraseData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textPhrase.text = PhraseData().random().text
    }
}