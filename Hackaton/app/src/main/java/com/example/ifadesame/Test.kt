package com.example.ifadesame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.example.ifadesame.databinding.ActivityMenuBinding
import com.example.ifadesame.databinding.ActivityTestBinding

class Test : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding
    private var Respuesta01:String?=null
    private var Respuesta02:String?=null
    private var Respuesta03:String?=null
    private var Respuesta04:String?=null
    private var Respuesta05:String?=null

    private var Respuesta06:String?=null
    private var Respuesta07:String?=null
    private var Respuesta08:String?=null
    private var Respuesta09:String?=null
    private var Respuesta10:String?=null

    private var Respuesta11:String?=null
    private var Respuesta12:String?=null
    private var Respuesta13:String?=null
    private var Respuesta14:String?=null
    private var Respuesta15:String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        binding=ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idlinearlayout01.isVisible=true
        binding.idlinearlayout02.isGone=true
        binding.idlinearlayout03.isGone=true
        binding.idlinealayout04.isGone=true
        binding.idlinealayout05.isGone=true
        binding.idlinealayout06.isGone=true
        binding.idlinealayout07.isGone=true
        binding.idlinealayout08.isGone=true
        binding.idlinealayout09.isGone=true

        binding.idPreg01.setText("¿Tienes Frecuentes Dolores de Cabeza?")
        binding.idPreg02.setText("¿Duermes mal?")
        binding.idPreg03.setText("¿Se Asusta Con Facilidad?")
        binding.idPreg04.setText("¿Sufre de Temblor de Manos?")
        binding.idPreg05.setText("¿Se Siente Nervioso, tenso o Aburrido?")
        binding.idPreg06.setText("¿Sufre de mala Digestión?")
        binding.idPreg07.setText("¿No puede pensar con claridad?")
        binding.idPreg08.setText("¿Tiene Sensaciones desagradable en su estómago?")
        binding.idPreg09.setText("¿Se cansa con facilidad?")

        buttons()

        activar()

    }
    private fun buttons(){
        // RESPUESTA DE pregunta 01
        binding.idopc01.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta01=binding.idopc01.text.toString()
                binding.idlinearlayout01.isVisible=false
                binding.idlinearlayout02.isVisible=true
                binding.idCarga01.isVisible=true
            }
        }
        binding.idopc02.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta01=binding.idopc02.text.toString()
                binding.idlinearlayout01.isGone=true
                binding.idlinearlayout02.isVisible=true
                binding.idCarga01.isVisible=true
            }
        }

        // RESPUESTA DE pregunta 02
        binding.idopc03.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta02=binding.idopc03.text.toString()

                binding.idlinearlayout02.isGone=true
                binding.idlinearlayout03.isVisible=true
                binding.idCarga02.isVisible=true
            }
        }
        binding.idopc04.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta02=binding.idopc04.text.toString()

                binding.idlinearlayout02.isGone=true
                binding.idlinearlayout03.isVisible=true
                binding.idCarga02.isVisible=true
            }
        }

        // RESPUESTA DE pregunta 03
        binding.idopc05.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta03=binding.idopc05.text.toString()

                binding.idlinearlayout03.isGone=true
                binding.idlinealayout04.isVisible=true
                binding.idCarga03.isVisible=true
            }
        }
        binding.idopc06.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta03=binding.idopc06.text.toString()

                binding.idlinearlayout03.isGone=true
                binding.idlinealayout04.isVisible=true
                binding.idCarga03.isVisible=true
            }
        }


        // RESPUESTA DE pregunta 04
        binding.idopc07.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta04=binding.idopc07.text.toString()

                binding.idlinealayout04.isGone=true
                binding.idlinealayout05.isVisible=true
                binding.idCarga04.isVisible=true
            }
        }
        binding.idopc08.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta04=binding.idopc08.text.toString()
                binding.idlinealayout04.isGone=true
                binding.idlinealayout05.isVisible=true
                binding.idCarga04.isVisible=true
            }
        }


        // RESPUESTA DE pregunta 05
        binding.idopc09.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta05=binding.idopc09.text.toString()
                binding.idlinealayout05.isGone=true
                binding.idlinealayout06.isVisible=true
                binding.idCarga05.isVisible=true
            }
        }
        binding.idopc10.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta05=binding.idopc10.text.toString()

                binding.idlinealayout05.isGone=true
                binding.idlinealayout06.isVisible=true
                binding.idCarga05.isVisible=true
            }
        }


        // RESPUESTA DE pregunta 06
        binding.idopc11.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta06=binding.idopc11.text.toString()
                binding.idlinealayout06.isGone=true
                binding.idlinealayout07.isVisible=true
                binding.idCarga06.isVisible=true
            }
        }
        binding.idopc12.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta06=binding.idopc12.text.toString()

                binding.idlinealayout06.isGone=true
                binding.idlinealayout07.isVisible=true
                binding.idCarga06.isVisible=true
            }
        }


        // RESPUESTA DE pregunta 07
        binding.idopc13.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta07=binding.idopc13.text.toString()
                binding.idlinealayout07.isGone=true
                binding.idlinealayout08.isVisible=true
                binding.idCarga07.isVisible=true
            }
        }
        binding.idopc14.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta07=binding.idopc14.text.toString()

                binding.idlinealayout07.isGone=true
                binding.idlinealayout08.isVisible=true
                binding.idCarga07.isVisible=true
            }
        }


        // RESPUESTA DE pregunta 08
        binding.idopc15.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta08=binding.idopc15.text.toString()
                binding.idlinealayout08.isGone=true
                binding.idlinealayout09.isVisible=true
                binding.idCarga08.isVisible=true
            }
        }
        binding.idopc16.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta08=binding.idopc16.text.toString()

                binding.idlinealayout08.isGone=true
                binding.idlinealayout09.isVisible=true
                binding.idCarga08.isVisible=true
            }
        }


        // RESPUESTA DE pregunta 09
        binding.idopc17.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta08=binding.idopc17.text.toString()
                binding.idlinealayout09.isGone=true
                binding.idCarga09.isVisible=true
                Respuesta()
            }
        }
        binding.idopc18.setOnCheckedChangeListener{buttonView,isChecked->
            if(isChecked){
                //ACCION DE GUARDAR VARIABLE
                Respuesta08=binding.idopc18.text.toString()

                binding.idlinealayout09.isGone=true
                binding.idCarga09.isVisible=true
                Respuesta()
            }
        }

    }

    private fun Respuesta(){
        val diccionario = mutableMapOf<Int, String>()

        val resp:String=Respuesta01.toString()
        diccionario[1]=Respuesta01.toString()
        diccionario[2]=Respuesta02.toString()
        diccionario[3]=Respuesta03.toString()
        diccionario[4]=Respuesta04.toString()
        diccionario[5]=Respuesta05.toString()
        diccionario[6]=Respuesta06.toString()
        diccionario[7]=Respuesta07.toString()
        diccionario[8]=Respuesta08.toString()
        diccionario[9]=Respuesta09.toString()

        val cont=diccionario.count{it.value=="Si"}

        //Toast.makeText(this, "${cont}",Toast.LENGTH_SHORT).show()
        if(cont==0){
            //MENSAJE DE FELICIDADES
            val nivel="nivel01"
            Toast.makeText(this, "${cont}",Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, "Felicidades",Toast.LENGTH_SHORT).show()
            val abrir01= Intent(this, Mensaje::class.java)
            abrir01.putExtra("nivel",nivel)
            startActivity(abrir01)
            print("${cont} FELICIDADES")
        }else if(cont>0 && cont<3){
            //POCA INTENSIDAD
            val nivel ="nivel02"
            val abrir01= Intent(this, Mensaje::class.java)
            abrir01.putExtra("nivel",nivel)
            startActivity(abrir01)
            print("${cont} POCA INTENSIDAD")
        }
        else if(cont>3){
            // SINDROME DE ANGUSTIA
            val nivel ="nivel03"
            val abrir01= Intent(this, Mensaje::class.java)
            abrir01.putExtra("nivel",nivel)
            startActivity(abrir01)
            print("${cont} SINDROME DE ANGUSTIA")
        }


    }
    private fun activar(){
        if(Respuesta01!=null){
            binding.idlinearlayout01.isVisible=false
            binding.idlinearlayout02.isVisible=true
        }
        else if(Respuesta02!=null){
            binding.idlinearlayout03.isVisible=true
        }else if(Respuesta03!=null){
            binding.idlinealayout04.isVisible=true
        }
        else if(Respuesta04!=null){
            binding.idlinealayout05.isVisible=true
        }
        else if(Respuesta05!=null){
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            val intent1 = Intent(this,MainActivity::class.java)

            //val usuario:String=binding.idUsuario.text.toString().trim()
            //val Profe:String=binding.idProfe.text.toString().trim()

            //intent1.putExtra("Nombre",usuario)
            //intent1.putExtra("ProfeUniversal",Profe)
            startActivity(intent1)
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}