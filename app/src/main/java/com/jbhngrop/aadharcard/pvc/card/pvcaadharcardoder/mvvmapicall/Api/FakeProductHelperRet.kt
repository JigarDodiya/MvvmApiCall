package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FakeProductHelperRet {

    private const val BASE_URL = "https://fakestoreapi.com/"

    fun getfakefroductinstens():Retrofit{

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}