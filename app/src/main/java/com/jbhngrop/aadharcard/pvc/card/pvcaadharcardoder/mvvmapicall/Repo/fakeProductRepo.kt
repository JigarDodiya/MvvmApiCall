package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Api.Fakestoreservice
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Fakestore

class fakeProductRepo(private val fakestoreservice: Fakestoreservice) {

    val fakeproductlist = MutableLiveData<List<Fakestore>>()
    val product: LiveData<List<Fakestore>>
        get() = fakeproductlist

    suspend fun getfakeproduct() {

        val result = fakestoreservice.getfakeproduct()
        if (result.isSuccessful) {
            fakeproductlist.postValue(result.body())
        }
    }

}