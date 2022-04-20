package com.gmail.orlandroyd.stockmarket.data.mapper

import com.gmail.orlandroyd.stockmarket.data.local.CompanyListingEntity
import com.gmail.orlandroyd.stockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}