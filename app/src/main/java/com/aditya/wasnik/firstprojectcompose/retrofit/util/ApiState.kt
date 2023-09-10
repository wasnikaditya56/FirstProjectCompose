package com.aditya.wasnik.firstprojectcompose.retrofit.util

import com.aditya.wasnik.firstprojectcompose.retrofit.Post

sealed class ApiState {

    class Success(val data: List<Post>) : ApiState()

    class Failure(val msg:Throwable) : ApiState()
    object Loading : ApiState()

    object Empty : ApiState()
}