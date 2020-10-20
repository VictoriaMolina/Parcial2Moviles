package com.example.segundoparcial

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isGone
import kotlinx.android.synthetic.main.activity_about.view.*
import kotlinx.android.synthetic.main.activity_dialog.*
import kotlinx.android.synthetic.main.activity_dialog.view.*
import kotlinx.android.synthetic.main.activity_dialog.view.btnCancelar
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnplacas.setOnClickListener {
            val intent = Intent(this, QReader::class.java).apply {
            }
            startActivity(intent)
        }

        btnSesion.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
            }
            startActivity(intent)
        }

        btnAfiliados.setOnClickListener {

                val listItems = arrayOf("Visa", "PayPal", "Credito/Débito")
                val mBuilder = AlertDialog.Builder(this@MenuActivity)
                mBuilder.setTitle("Método de Pago")
                mBuilder.setSingleChoiceItems(listItems, -1) { dialogInterface, i ->
                    //txtView.text = listItems[i]
                    Toast.makeText(this,  listItems[i], Toast.LENGTH_LONG ).show()
                    dialogInterface.dismiss()
                }
                // Set the neutral/cancel button click listener
                mBuilder.setNeutralButton("Cancelar") { dialog, which ->
                    // Do something when click the neutral button
                    dialog.cancel()
                }
                val mDialog = mBuilder.create()
                mDialog.show()
    }

        btnAcerca.setOnClickListener {
            val DialogView = layoutInflater.inflate(R.layout.activity_about, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(DialogView).setTitle("Acerda de").show()

            DialogView.btnCancelar.setOnClickListener {
                mBuilder.dismiss()
            }

            DialogView.btnPagina.setOnClickListener {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/VictoriaMolina"))
                startActivity(i)
            }

    }}}