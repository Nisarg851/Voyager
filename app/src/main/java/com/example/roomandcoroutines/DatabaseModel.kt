package com.example.roomandcoroutines

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Post::class], version = 1)
abstract class DatabaseModel: RoomDatabase(){
    abstract fun postsDAO(): PostsDAO

    companion object{
        @Volatile
        private var INSTANCE: DatabaseModel? = null
        fun getDatabaseInstance(applicationContext: Context): DatabaseModel{
            synchronized(this){
                var instance: DatabaseModel? = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        applicationContext,
                        DatabaseModel::class.java,
                        "Database"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
                return instance!!
            }
        }
    }

}