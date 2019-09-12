package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bankapp.adapter.AdapterTransacoes
import com.example.bankapp.data.Transaction
import java.util.ArrayList

class ExtratoActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    private val listTransactions = ArrayList<Transaction>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extrato)

        //instanciando o recyclerView
        mRecyclerView = findViewById(R.id.dados_list_recyclerview)

        //Listagem de transações
        this.criarListTransaction()

        //Configurar adapter
        val adapterTransacoes = AdapterTransacoes(listTransactions)

        //Configurar RecyclerView
        val mLayoutManager = LinearLayoutManager(applicationContext)
        mRecyclerView.setLayoutManager(mLayoutManager)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.setAdapter(adapterTransacoes)

    }

    fun criarListTransaction() {
        val tran = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran)
        val tran2 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran2)
        val tran3 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran3)
        val tran4 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran4)
        val tran5 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran5)
        val tran6 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran6)
        val tran7 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran7)
        val tran8 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran8)
        val tran9 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran9)
        val tran10 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran10)
        val tran11 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran11)
        val tran12 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran12)
        val tran13 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran13)
        val tran14 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran14)
        val tran15 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran15)
        val tran16 = Transaction("Titulo", "Cond", "12/12/2012", 333.0)
        this.listTransactions.add(tran16)
    }
}
