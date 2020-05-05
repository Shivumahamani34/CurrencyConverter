package com.smlab.currencyconverter.data.repository

import com.smlab.currencyconverter.api.CurrencyApi
import org.koin.dsl.module

val currencyListRepoModule = module {
    factory { CurrencyListRepository(get()) }
}

class CurrencyListRepository (private val currencyApi: CurrencyApi) {
    suspend fun getCurrencyTypes() = currencyApi.getCurrencyTypes()
    suspend fun getCurrencyRates() = currencyApi.getCurrencyRates()
}