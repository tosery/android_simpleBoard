package com.bokchi.mysampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BoardWriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_write)

//        val writeBtn = findViewById<Button>(R.id.writeUploadBtn)
        val writeBtn:Button = findViewById(R.id.writeUploadBtn)
        writeBtn.setOnClickListener {

            val writeText = findViewById<EditText>(R.id.writeTextArea)

//            val database = Firebase.database
//            val myRef = database.getReference("board")
//
//            myRef.push().setValue(
//                Model(writeText.text.toString())
//            )
            // Write a message to the database
            val database = Firebase.database
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")


        }

    }
}