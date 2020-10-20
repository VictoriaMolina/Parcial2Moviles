package com.example.segundoparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPagina.setOnClickListener {
            val usuario = txtUsuario.text.toString()
            val password = txtPass.text.toString()

            if(usuario == "segundoparcial" && password == "1"){
                val intent = Intent(this, MenuActivity::class.java).apply {
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_LONG).show()
            }

        }

    }
}