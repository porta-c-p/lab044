package com.example.lab04app

import android.os.Bundle
import android.graphics.Typeface
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrimeraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primera)

        // 🔽 Aquí aplicas el estilo al TextView con ID miTexto
        val miTexto = findViewById<TextView>(R.id.miTexto)
        miTexto.text = "¡Hola desde PrimeraActivity con estilo!"
        miTexto.textSize = 24f
        miTexto.setTypeface(null, Typeface.BOLD)
        miTexto.setTextColor(ContextCompat.getColor(this, R.color.purple_500))

        // Esta parte la puedes dejar tal cual
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
