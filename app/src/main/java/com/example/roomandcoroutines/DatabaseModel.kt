package com.example.roomandcoroutines

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Post::class], version = 1)
abstract class DatabaseModel: RoomDatabase(){
    abstract fun postsDAO(): PostsDAO

}