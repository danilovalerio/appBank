package com.example.bankapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class TransactionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transactions_activity)

        addFragmentTo(R.id.content_frame, createFragment())
//        setSupportActionBar(toolbar)
    }


    fun createViewModel(): TransactionsViewModel {
        return TransactionsViewModel()
    }

    fun createFragment(): BreedsFragment {
        return TransactionsFragment.newInstance(createViewModel())
    }


    fun AppCompatActivity.addFragmentTo(containerId: Int, fragment: Fragment, tag: String = "") {
        supportFragmentManager.beginTransaction().add(containerId, fragment, tag).commit()
    }

}