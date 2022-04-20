package com.gmail.orlandroyd.stockmarket.domain.repository

import com.gmail.orlandroyd.stockmarket.domain.model.CompanyInfo
import com.gmail.orlandroyd.stockmarket.domain.model.CompanyListing
import com.gmail.orlandroyd.stockmarket.domain.model.IntradayInfo
import com.gmail.orlandroyd.stockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}