package com.example.bankapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bankapp.databinding.TransactionsFragmentBinding

class TransactionsFragment : Fragment() {

    lateinit var viewModel: TransactionsViewModel

    companion object {
        fun newInstance(viewModel: TransactionsViewModel): TransactionsFragment {
            val fragment = TransactionsFragment()
            fragment.viewModel = viewModel
            return fragment
        }
    }

    override fun onCreateView(@NonNull inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : TransactionsFragmentBinding = TransactionsFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.recyclerView.adapter = TransactionsAdapter(emptyList())
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        return binding.root
    }
}