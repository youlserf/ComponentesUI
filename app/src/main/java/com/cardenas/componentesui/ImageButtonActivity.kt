package com.cardenas.componentesui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ImageButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
    }

    fun firstImageButton(view: View) {
        val call = Uri.parse("tel:934289282")
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) ==
            PackageManager.PERMISSION_GRANTED){
            val i = Intent(Intent.ACTION_CALL, call)
            startActivity(i)
        }
        else{
            Toast.makeText(this, "No hay permiso para realizar llamada",
                Toast.LENGTH_LONG)
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CALL_PHONE),
                123
            )
        }
    }
}