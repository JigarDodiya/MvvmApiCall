package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Fakestore
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Repo.fakeProductRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FakeProductViewModel (private val fakeProductRepo: fakeProductRepo) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO){
            fakeProductRepo.getfakeproduct()
        }
    }

    val productlist : LiveData<List<Fakestore>>
    get() = fakeProductRepo.product

}