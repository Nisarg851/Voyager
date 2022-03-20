package com.example.roomandcoroutines

import android.content.Context
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

        GlobalScope.launch{
            var DB: DatabaseModel = DatabaseModel.getDatabaseInstance(applicationContext)
            val currentDateAndTime: Date = Date()

            DB.postsDAO().insertPost(Post(null,"Person B","Person's Image","Post Image",false,0,"Post Description", currentDateAndTime.toString()))
            DB.postsDAO().insertPost(Post(null,"Person C","Person's Image","Post Image",false,0,"Post Description", currentDateAndTime.toString()))
            DB.postsDAO().insertPost(Post(null,"Person D","Person's Image","Post Image",false,0,"Post Description", currentDateAndTime.toString()))

            val postList: List<Post> = DB.postsDAO().getAllPosts()
            for(post in postList)
                Log.e("fun", "fetched Post $post")
//            DB.postsDAO().deletePost(1)
        }
    }
}