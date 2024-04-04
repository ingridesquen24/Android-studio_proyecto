package com.example.ifadesame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.ifadesame.databinding.ActivityMensajeBinding

class Mensaje : AppCompatActivity() {
    private lateinit var binding:ActivityMensajeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        binding=ActivityMensajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text:String="¡Los Estás Haciendo Muy Bien!"
        // Recogemos datos del activity Anterior
        val bundle=intent.extras
        val Nivel=bundle?.getString("nivel")

        if(Nivel=="nivel01"){
            binding.linearlayout01.isVisible=true
        }else if(Nivel=="nivel02"){
            binding.linearlayout02.isVisible=true
        }else if(Nivel=="nivel03"){
            binding.linearlayout03.isVisible=true
        }

        binding.btnMenu.setOnClickListener(){
            val abrirmenu= Intent(this, Menu::class.java)
            startActivity(abrirmenu)
        }
        binding.btnApoyo.setOnClickListener(){
            Toast.makeText(this, "Abriendo directorio de Apoyo", Toast.LENGTH_SHORT).show()
            val abrirApoyo=Intent(this, Directorio::class.java)
            startActivity(abrirApoyo)
            //Toast.makeText(this, "Abriendo directorio de Apoyo", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            val intent1 = Intent(this,Test::class.java)

           // val usuario:String=binding.idUsuario.text.toString().trim()
            //val Profe:String=binding.idProfe.text.toString().trim()

            //intent1.putExtra("Nombre",usuario)
            //intent1.putExtra("ProfeUniversal",Profe)
            startActivity(intent1)
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}