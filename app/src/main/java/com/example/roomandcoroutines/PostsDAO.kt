package com.example.roomandcoroutines

import androidx.room.*

@Dao
interface PostsDAO {
    @Query("SELECT * FROM Posts WHERE id=:postId")
    fun getPost(postId: Int): Post

    @Query("SELECT * FROM Posts")
    fun getAllPosts(): List<Post>

    @Insert
    fun insertPost(post: Post)

    @Query("DELETE FROM Posts WHERE id=:postId")
    fun deletePost(postId: Int)

    @Delete
    fun deleteAllPost()
}