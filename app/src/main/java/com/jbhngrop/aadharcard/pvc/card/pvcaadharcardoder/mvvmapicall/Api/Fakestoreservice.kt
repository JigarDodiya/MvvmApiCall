package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Api


import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Fakestore
import retrofit2.Response
import retrofit2.http.GET

interface Fakestoreservice {

    @GET("/products")
    suspend fun getfakeproduct():Response<List<Fakestore>>

}