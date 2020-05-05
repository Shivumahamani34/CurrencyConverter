package com.smlab.currencyconverter.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.smlab.currencyconverter.data.model.CurrencyInfo

@Dao
interface RateDao {
    @Query("SELECT * from collect_table")
    suspend fun getAllList(): List<CurrencyInfo>

    @Query("SELECT * from collect_table WHERE code = :typeCode")
    suspend fun findRate(typeCode: String): CurrencyInfo

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateRate(rateData: CurrencyInfo)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateAllRate(rateList: List<CurrencyInfo>)
}