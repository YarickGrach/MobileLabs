package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Timber: «посадить дерево»
        Timber.plant(Timber.DebugTree())

        editText = findViewById(R.id.editText)

        // Log.v с тегом "From EditText"
        findViewById<Button>(R.id.button_log).setOnClickListener {
            Log.v("From EditText", editText.text.toString())
        }

        // Timber.v без тега
        findViewById<Button>(R.id.button_timber).setOnClickListener {
            Timber.v(editText.text.toString())
        }
    }
}
