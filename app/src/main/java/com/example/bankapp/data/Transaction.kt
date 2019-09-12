package com.example.bankapp.data

data class Transaction(
    var title: String,
    var desc: String,
    var date: String,
    var value: Double? = null
)