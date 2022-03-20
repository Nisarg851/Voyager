package com.example.roomandcoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database: DatabaseModel = Room.databaseBuilder(
            applicationContext,
            DatabaseModel::class.java,
            "Database"
        ).build()

        GlobalScope.launch{
            val currentDateAndTime: Date = Date()
            val post: Post = Post(1,"Person A","Person's Image","Post Image",false,0,"Post Description", currentDateAndTime.toString())
            database.postsDAO().insertPost(post)
            Log.e("query", "Coroutine: Post Inserted")
        }
    }
}