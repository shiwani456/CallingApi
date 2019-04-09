package com.example.recycleviewapidatadisplay.Activity.rest

import com.example.recycleviewapidatadisplay.Activity.rest.ApiInterface
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory

object ApiClient {


    private val BASE_URL = "https://raw.githubusercontent.com/"

    fun create(): ApiInterface {

        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

        return retrofit.create(ApiInterface::class.java)
    }

}
