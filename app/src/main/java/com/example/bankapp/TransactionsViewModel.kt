package com.example.bankapp

import android.content.Context
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import data.Transaction

class TransactionsViewModel(val repository: TransactionDataSource, val context: Context) {
    val breeds = ObservableArrayList<Transaction>()
    val loadingVisibility = ObservableBoolean(false)
    val message = ObservableField<String>()

    fun load(){
        loadingVisibility.set(true)
        message.set("")
        repository.listAll({ items ->
            breeds.clear()
            breeds.addAll(items)
            if (items.isEmpty()) {
                message.set(context.getString(R.string.transaction_empty))
            }
            loadingVisibility.set(false)
        }, {
            message.set(context.getString(R.string.transaction_failed))
            loadingVisibility.set(false)
        })
    }
    }
}