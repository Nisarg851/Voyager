package com.example.roomandcoroutines

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Posts")
data class Post(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val name: String,
    val profileImage: String,
    val postImage: String,
    val postBookmarked: Boolean,
    val postLikes: Int,
    val postDescription: String,
    val postDateAndTime: String
)