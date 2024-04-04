package com.example.ifadesame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ifadesame.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idRegistrarse.setOnClickListener(){
            val abrir= Intent(this, Registro::class.java)
            startActivity(abrir)
        }
        binding.btnIniciarSesion.setOnClickListener(){
            val abrir01= Intent(this, MainActivity02::class.java)
            startActivity(abrir01)
        }
        binding.btnAdmin.setOnClickListener(){

        }

    }
}