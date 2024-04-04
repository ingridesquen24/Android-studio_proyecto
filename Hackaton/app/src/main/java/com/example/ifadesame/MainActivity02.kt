package com.example.ifadesame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.ifadesame.databinding.ActivityMain02Binding
import com.example.ifadesame.databinding.ActivityMainBinding
import com.example.ifadesame.databinding.ActivityMenuBinding

class MainActivity02 : AppCompatActivity() {
    private lateinit var binding: ActivityMain02Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)
        binding= ActivityMain02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val buton=findViewById<CardView>(R.id.btnIniciar)
        buton.setOnClickListener(){
            val abrir= Intent(this, Test::class.java)
            startActivity(abrir)
        }


    }
}