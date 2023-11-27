package com.example.practicamvvm.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.practicamvvm.databinding.ActivityMainBinding
import com.example.practicamvvm.Io.viewModel.elBuenSazonViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private val elBuenSazonViewModel: elBuenSazonViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        elBuenSazonViewModel.elBuenSazonModel.observe(this, Observer { recipeCurrent ->
            binding.tvReceta.text = recipeCurrent.Receta
            binding.tvElBuenSazon.text = recipeCurrent.ElBuenSazon
        })

        binding.viewContainer.setOnClickListener {
            elBuenSazonViewModel.randomElBuenSazon()
        }
    }
}