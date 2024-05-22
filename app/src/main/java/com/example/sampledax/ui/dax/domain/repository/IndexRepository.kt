package com.example.sampledax.ui.dax.domain.repository

import com.example.sampledax.ui.dax.domain.entity.IndexEntity
import io.reactivex.Observable

interface IndexRepository {
    fun getIndexData(): Observable<IndexEntity>
}