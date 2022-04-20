package com.gmail.orlandroyd.stockmarket.presentation.company_info

import com.gmail.orlandroyd.stockmarket.domain.model.CompanyInfo
import com.gmail.orlandroyd.stockmarket.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
