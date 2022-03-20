package com.example.roomandcoroutines

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            val DB: DatabaseModel = DatabaseModel.getDatabaseInstance(applicationContext)
//            DB.postsDAO().insertPost(Post(null,"Person B","Person's Image","Post Image",false,0,"Post Description", Date()))
        }
    }
}