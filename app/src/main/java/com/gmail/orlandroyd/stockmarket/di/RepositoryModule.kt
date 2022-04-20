package com.gmail.orlandroyd.stockmarket.di

import com.gmail.orlandroyd.stockmarket.data.csv.CSVParser
import com.gmail.orlandroyd.stockmarket.data.csv.CompanyListingsParser
import com.gmail.orlandroyd.stockmarket.data.repository.StockRepositoryImpl
import com.gmail.orlandroyd.stockmarket.domain.model.CompanyListing
import com.gmail.orlandroyd.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}