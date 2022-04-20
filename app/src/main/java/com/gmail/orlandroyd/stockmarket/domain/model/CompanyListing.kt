package com.gmail.orlandroyd.stockmarket.domain.model

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)