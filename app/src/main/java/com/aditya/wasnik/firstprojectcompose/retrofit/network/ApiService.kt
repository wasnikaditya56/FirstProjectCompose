package com.aditya.wasnik.firstprojectcompose.retrofit.network

import com.aditya.wasnik.firstprojectcompose.retrofit.Post
import retrofit2.http.GET

interface ApiService {

    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("posts")
    suspend fun getPost():List<Post>
}