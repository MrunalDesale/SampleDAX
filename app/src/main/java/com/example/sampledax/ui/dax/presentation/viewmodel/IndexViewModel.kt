package com.example.sampledax.ui.dax.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sampledax.ui.dax.domain.entity.IndexEntity
import com.example.sampledax.ui.dax.domain.interactor.IndexUC
import com.example.sampledax.ui.dax.presentation.enums.ResponseWrapper
import com.example.sampledax.ui.dax.presentation.model.IndexModel
import io.reactivex.observers.DisposableObserver

class IndexViewModel(private var indexUC: IndexUC) : ViewModel() {
    var mMutableLiveDataIndexModel = MutableLiveData<ResponseWrapper<IndexModel>>()

    fun getIndexData() = mMutableLiveDataIndexModel

    fun getIndex() {
        mMutableLiveDataIndexModel.value = ResponseWrapper.loading()

        indexUC.execute(object : DisposableObserver<IndexEntity>() {
            override fun onNext(t: IndexEntity) {
                mMutableLiveDataIndexModel.value = ResponseWrapper.success(t.toEntity())
            }

            override fun onError(e: Throwable) {
                mMutableLiveDataIndexModel.value = ResponseWrapper.error(null, e.message)
            }

            override fun onComplete() {
            }

        }, null)
    }
}