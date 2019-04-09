package com.example.recycleviewapidatadisplay.Activity.rest


import com.example.recycleviewapidatadisplay.Activity.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiInterface {


    @get :GET("iranjith4/radius-intern-mobile/master/users.json")
    val getAllData: Call<User>

}
