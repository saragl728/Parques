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
            comprobar los checkbox
            */
            Log.d("Guardado", "salida")
        }
    }
}