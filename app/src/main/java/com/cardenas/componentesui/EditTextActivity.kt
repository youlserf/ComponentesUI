package com.cardenas.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }

    fun register(view: View) {
        var nombre = firstName.text.toString()
        var apellido = lastName.text.toString()
        displayName.text = nombre + " " + apellido
    }

}