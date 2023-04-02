package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Application

import android.app.Application
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Api.FakeProductHelperRet
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Api.Fakestoreservice
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Repo.fakeProductRepo

class MvvmApplication : Application() {

    lateinit var fakeProductRepo: fakeProductRepo

    override fun onCreate() {
        super.onCreate()

        val fakestoreservice = FakeProductHelperRet.getfakefroductinstens().create(Fakestoreservice::class.java)
         fakeProductRepo = fakeProductRepo(fakestoreservice)

    }

}