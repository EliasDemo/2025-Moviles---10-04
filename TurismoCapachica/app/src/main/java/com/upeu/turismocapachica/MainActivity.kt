package com.upeu.turismocapachica

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowDialog: Button = findViewById(R.id.btnShowDialog)

        btnShowDialog.setOnClickListener {
            mostrarDialogoPrincipal()
        }
    }

    private fun mostrarDialogoPrincipal() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Bienvenido a Turismo Capachica")
        builder.setMessage("Este es un mensaje de bienvenida. ¿Deseas continuar?")
        builder.setPositiveButton("Sí") { dialog, _ ->
            // Acción si el usuario acepta
            dialog.dismiss()
        }
        builder.setNegativeButton("No") { dialog, _ ->
            // Acción si el usuario cancela
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()
    }
}
