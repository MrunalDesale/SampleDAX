package com.example.sampledax.ui.dax.domain.interactor

import com.example.sampledax.ui.dax.domain.entity.IndexEntity
import com.example.sampledax.ui.dax.domain.repository.IndexRepository
import io.reactivex.Observable

class IndexUC(private val indexRepository: IndexRepository) :
    UseCase<IndexEntity, Nothing>() {
    override fun build(param: Nothing?): Observable<IndexEntity> {
        return indexRepository.getIndexData()
    }
}