package com.example.chatapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.chat_library.ChatLauncher

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // подключаем layout

        val chatButton = findViewById<Button>(R.id.btnOpenChat)
        chatButton.setOnClickListener {
            ChatLauncher.start(this, username = "You")
        }
    }
}
