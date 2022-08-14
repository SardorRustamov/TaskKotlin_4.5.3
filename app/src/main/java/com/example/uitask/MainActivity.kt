package com.example.uitask

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        show()
    }
    fun show(){
        val getID = findViewById(R.id.enter_id) as EditText
        val getPW = findViewById(R.id.pw_id) as EditText
        val button = findViewById(R.id.button_id) as Button

        button!!.setOnClickListener(View.OnClickListener {
            val name_ID = getID.text.toString()
            val name_PW = getPW.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("pw", name_PW)
            intent.putExtra("id", name_ID)
            startActivity(intent)
        })
    }
}