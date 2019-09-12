package com.example.bankapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import data.TransactionRepository
import data.remote.ContaCeoApi
import data.remote.ContaCeoDataSource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TransactionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transactions_activity)

        addFragmentTo(R.id.content_frame, createFragment())
//        setSupportActionBar(toolbar)
    }


    fun createViewModel(): TransactionsViewModel {
        val retrofit = Retrofit.Builder().baseUrl("http://dog.ceo/api/").addConverterFactory(
            GsonConverterFactory.create()).build()
        val contaCeoDataSource = ContaCeoDataSource(retrofit.create(ContaCeoApi::class.java))
        val repository = TransactionRepository(contaCeoDataSource)
        return TransactionsViewModel(repository, applicationContext)
    }

    fun createFragment(): TransactionsFragment {
        return TransactionsFragment.newInstance(createViewModel())
    }

}