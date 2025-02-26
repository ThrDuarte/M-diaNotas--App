package com.example.cadastroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tnota1 = findViewById<EditText>(R.id.edtnota1)
        val tnota2 = findViewById<EditText>(R.id.edtnota2)
        val tnota3 = findViewById<EditText>(R.id.edtnota3)
        val tnota4 = findViewById<EditText>(R.id.edtnota4)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvTxv = findViewById<TextView>(R.id.tv_txv) // Adicionando TextView para exibir os dados

        btnEnviar.setOnClickListener {
            // Obtendo os valores inseridos nos EditTexts
            val nota1 = Integer.parseInt(tnota1.text.toString())
            val nota2 = Integer.parseInt(tnota2.text.toString())
            val nota3 = Integer.parseInt(tnota3.text.toString())
            val nota4 =Integer.parseInt(tnota4.text.toString())

            val media = (nota1 + nota2 + nota3 + nota4) / 4


            // Exibindo os dados no TextView
            tvTxv.text = "Média: ${media}"
        }
    }
}


