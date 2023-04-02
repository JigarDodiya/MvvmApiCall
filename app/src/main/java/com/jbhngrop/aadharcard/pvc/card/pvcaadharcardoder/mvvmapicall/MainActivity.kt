package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Application.MvvmApplication
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Repo.fakeProductRepo
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.ViewModel.FakeProductViewModel
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.ViewModel.FakeProductViewModelFactorey
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var FakeProductRepo: fakeProductRepo
    lateinit var fakeProductViewModel: FakeProductViewModel

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this,R.layout.activity_main);

        FakeProductRepo = (application as MvvmApplication).fakeProductRepo

        fakeProductViewModel = ViewModelProvider(this,FakeProductViewModelFactorey(FakeProductRepo))[FakeProductViewModel::class.java]

        fakeProductViewModel.productlist.observe(this, Observer {

            binding.title=it.toString()

        })


    }
}