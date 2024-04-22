package com.example.lineallayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var check: ImageView
    private lateinit var btnAccept: Button
    private lateinit var textview1: TextView
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var lastname: EditText
    private lateinit var error: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Inicialización de variables
        check = findViewById(R.id.check)
        error = findViewById(R.id.error)
        btnAccept = findViewById(R.id.btnAccept)
        textview1 = findViewById(R.id.textview1)
        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        phone = findViewById(R.id.phone)
        lastname = findViewById(R.id.lastname)

        //Listener del boton
        btnAccept.setOnClickListener {
            btnAccept.isEnabled = false      //El boton se deshabilita
            btnAccept.text = ""             //El texto del boton desaparece
            textview1.visibility = View.INVISIBLE
            checkEmptyTextViews()       //Se manda a llamar a la funcion
        }
    }

    //Funcion para comprobar si los Text view tienen texto
    private fun checkEmptyTextViews() {
        val isTextView1Empty = name.text.toString().isNotEmpty()
        val isTextView2Empty = email.text.toString().isNotEmpty()
        val isTextView3Empty = lastname.text.toString().isNotEmpty()
        val isTextView4Empty = phone.text.toString().isNotEmpty()

        if (isTextView1Empty && isTextView2Empty && isTextView3Empty && isTextView4Empty) {
            //En caso de tener texto se marca como valido
            error.visibility = View.INVISIBLE
            check.visibility = View.VISIBLE
        } else {
            //En caso de no tener texto se marca como invalido
            check.visibility = View.INVISIBLE
            error.visibility = View.VISIBLE
        }
    }
}
