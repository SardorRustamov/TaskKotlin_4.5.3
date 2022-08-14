package com.example.uitask

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val result1 = findViewById(R.id.result_id) as TextView
        val result2 = findViewById(R.id.result_id2) as TextView

        val intent = intent
        val str1 = intent.getStringExtra("id")
        val str2 = intent.getStringExtra("pw")
        result1.setText(str1)
        result2.setText(str2)
    }
}