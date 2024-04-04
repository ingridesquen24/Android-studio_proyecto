package com.example.ifadesame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.ifadesame.databinding.ActivityDirectorioBinding

class Directorio : AppCompatActivity() {
    private lateinit var binding:ActivityDirectorioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_directorio)
        binding= ActivityDirectorioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // SPINER

        val spinnerGenero = findViewById<Spinner>(R.id.spinnerCiudad)

        // Datos a mostrar en el Spinner
        val generos = arrayOf("", "Chiclayo", "Lambayeque")

        // Crear un ArrayAdapter para las opciones y un diseño predeterminado
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, generos)

        // Establecer el diseño a utilizar cuando se abre el Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Establecer el adaptador en el Spinner
        spinnerGenero.adapter = adapter

        // Establecer el elemento seleccionado inicialmente en blanco
        spinnerGenero.setSelection(0)

        // Agregar un listener para detectar la selección del Spinner
        spinnerGenero.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Obtener el elemento seleccionado del Spinner
                val selectedItem = parent?.getItemAtPosition(position).toString()

                // Lo igualamos a la variable Sexo para Guardar en firestore
                if (selectedItem.isNotEmpty()) {
                    val ciudad:String=selectedItem
                    if(ciudad=="Chiclayo"){
                        binding.idChiclayo.isVisible=true
                    }
                    else if(ciudad=="Lambayeque"){
                        binding.idLambayeque.isVisible=true
                        binding.idChiclayo.isGone=true
                    }
                    //Toast.makeText(applicationContext,"Opc seleccionada ${selectedItem}",Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // No se requiere ninguna acción específica cuando no se selecciona nada
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            val intent1 = Intent(this,Menu::class.java)

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