package com.example.roomandcoroutines

import androidx.room.Entity

@Entity(tableName = "Posts")
data class PostModel(
    val name: String,
    val profileImage: String,
    val postImage: String,
    val postBookmarked: Boolean,
    val postLikes: Int,
    val postDescription: String,
    val postDateAndTime: String
)