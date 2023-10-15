package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //se debería hacer que el botón añadiera notificaciones al registro
        binding.bGuardar.setOnClickListener {
            /*String salida = "Datos del parque"
            salida += binding.nombre.text
            salida += binding.descripcion.text
            salida += binding.telefono.text
            salida += binding.web.text
            añadir los datos del horario
            */

            //se comprueban los checkboxs
            if (binding.cbMascotas.isChecked){

            }

            if (binding.cbDeportes.isChecked){

            }

            if (binding.cbRestaurante.isChecked){

            }

            if (binding.cbParqueInf.isChecked){

            }

            //en caso de que en las opciones de hora estuviera 24 h, se cambiaría el otro
            if (binding.hApertura.selectedItem.equals("24 h")){

            }

            if (binding.hCierre.selectedItem.equals("24 h")){

            }


            Log.d("Guardado del parque", "salida")
        }
    }
}