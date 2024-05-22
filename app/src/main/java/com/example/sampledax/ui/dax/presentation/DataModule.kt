package com.example.sampledax.ui.dax.presentation

import com.example.sampledax.ui.dax.data.mapper.DataMapper
import com.example.sampledax.ui.dax.presentation.viewmodel.IndexViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val PostModule = module {

    viewModel { IndexViewModel(get()) }

    factory { DataMapper() }
}