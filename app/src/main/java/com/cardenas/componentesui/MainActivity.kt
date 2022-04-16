package com.cardenas.componentesui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //llamar por id y generr el metodo onclick
        imageButton.setOnClickListener{
            Toast.makeText(this, "Image Button Activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ImageButtonActivity::class.java)
            startActivity(intent)
        }

    }

    //onclick automatico
    fun edit_text(view: View) {
        Toast.makeText(this, "Edit Text Activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, EditTextActivity::class.java)
        startActivity(intent)
    }

    fun android_button(view: View) {
        Toast.makeText(this, "Android Button Activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, AndroidButtonActivity::class.java)
        startActivity(intent)
    }

    fun check_box(view: View) {
        Toast.makeText(this, "Check box actvity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, CheckBoxActivity::class.java)
        startActivity(intent)
    }

    fun radio_button(view: View) {
        Toast.makeText(this, "Radio button activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, RadioButtontActivity::class.java)
        startActivity(intent)
    }

    fun switch_button(view: View) {
        Toast.makeText(this, "Switch button activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SwitchButtonActivity::class.java)
        startActivity(intent)
    }

    fun toggle_button(view: View) {
        Toast.makeText(this, "Toggle button activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, ToggleButtonActivity::class.java)
        startActivity(intent)
    }

    fun rating_button(view: View) {
        Toast.makeText(this, "Rating bar activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, RatingBarActivity::class.java)
        startActivity(intent)
    }

    fun spinner(view: View) {
        Toast.makeText(this, "Spinner activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SpinnerActivity::class.java)
        startActivity(intent)
    }

    fun progress_bar(view: View) {
        Toast.makeText(this, "Progress bar activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, ProgressBarActivity::class.java)
        startActivity(intent)
    }

    fun date_picker(view: View) {
        Toast.makeText(this, "Date picker activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DatePickerActivity::class.java)
        startActivity(intent)
    }

    fun time_picker(view: View) {
        Toast.makeText(this, "Time picker activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, TimePickerActivity::class.java)
        startActivity(intent)
    }

    fun floating_button(view: View) {
        Toast.makeText(this, "Floating action button activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, FloatingActionButtonActivity::class.java)
        startActivity(intent)
    }

    fun floating_labels(view: View) {
        Toast.makeText(this, "Floating labels activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, FloatingLabelsActivity::class.java)
        startActivity(intent)
    }

    fun seek_bar(view: View) {
        Toast.makeText(this, "Seek bar activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SeekBarActivity::class.java)
        startActivity(intent)
    }

    fun simple_dialog(view: View) {
        Toast.makeText(this, "Simple dialog activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SimpleDialogActivity::class.java)
        startActivity(intent)
    }

    fun custom_dialog(view: View) {
        Toast.makeText(this, "Custom dialog activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, CustomAlertDialogActivity::class.java)
        startActivity(intent)
    }

    fun snack_bar(view: View) {
        Toast.makeText(this, "Snack bar activity", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SnackbarActivity::class.java)
        startActivity(intent)
    }
}