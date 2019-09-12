package com.example.bankapp

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import data.Transaction

class TransactionsViewModel {
    val breeds = ObservableArrayList<Transaction>()
    val loadingVisibility = ObservableBoolean(false)
    val message = ObservableField<String>()
}