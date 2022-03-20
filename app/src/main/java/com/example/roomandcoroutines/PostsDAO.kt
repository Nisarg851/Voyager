package com.example.roomandcoroutines

import androidx.room.*

@Dao
interface PostsDAO {
    // Fetching Data Queries
    @Query("SELECT * FROM Posts WHERE id=:postId")
    suspend fun getPost(postId: Int): Post

    @Query("SELECT * FROM Posts")
    suspend fun getAllPosts(): List<Post>

    // Insert Data Queries
    @Insert
    suspend fun insertPost(post: Post)

    // Delete Data Queries
    @Query("DELETE FROM Posts WHERE id=:postId")
    suspend fun deletePost(postId: Int)

    @Query("DELETE FROM Posts")
    suspend fun deleteAllPost()
}