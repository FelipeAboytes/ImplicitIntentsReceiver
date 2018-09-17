package com.example.felipeaboytes.implicitintentsreceiver

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        val uri = intent.data
        if (uri != null) {
            val textView = findViewById(R.id.text_uri_message) as TextView
            textView.text = "URI: " + uri.toString()
    }
}
}
