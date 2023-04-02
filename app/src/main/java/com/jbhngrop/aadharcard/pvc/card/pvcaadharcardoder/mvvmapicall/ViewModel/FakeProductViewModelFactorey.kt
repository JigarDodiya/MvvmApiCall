package com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jbhngrop.aadharcard.pvc.card.pvcaadharcardoder.mvvmapicall.Repo.fakeProductRepo

class FakeProductViewModelFactorey (private val fakeProductRepo: fakeProductRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FakeProductViewModel(fakeProductRepo) as T
    }
}