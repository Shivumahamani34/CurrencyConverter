package com.smlab.currencyconverter.api

import com.smlab.currencyconverter.BuildConfig.CURRENCY_TOKEN
import com.smlab.currencyconverter.data.model.CurrencyRates
import com.smlab.currencyconverter.data.model.CurrencyTypes
import retrofit2.http.GET

interface CurrencyApi {
    @GET("/api/list?access_key=${CURRENCY_TOKEN}&format=1")
    suspend fun getCurrencyTypes(): CurrencyTypes

    @GET("/api/live?access_key=${CURRENCY_TOKEN}&format=1")
    suspend fun getCurrencyRates(): CurrencyRates
}