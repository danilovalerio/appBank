package com.example.bankapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bankapp.R
import com.example.bankapp.data.Transaction

class  AdapterTransacoes(private var listTransaction: List<Transaction>) :
    RecyclerView.Adapter<AdapterTransacoes.MyViewHolder>() {

//    private var listTransaction: List<Transaction>

    //para exibir os dados dentro de cada elemento de lista
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var title: TextView
        internal var desc: TextView
        internal var date: TextView
        internal var value: TextView

        init {

            title = itemView.findViewById(R.id.tvTitle)
            desc = itemView.findViewById(R.id.tvDesc)
            date = itemView.findViewById(R.id.tvDate)
            value = itemView.findViewById(R.id.tvValue)
        }
    }

    fun AdapterTransacoes(lista: List<Transaction>) {
        listTransaction = lista
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //Pega o objeto itemLista e converte numa visualização
        val itemLista = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_transacoes, parent, false)

        return MyViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val transaction = listTransaction.get(position)
        holder.title.setText(transaction.title)
        holder.desc.setText(transaction.desc)
        holder.date.setText(transaction.date)
        holder.value.setText(transaction.value.toString())
    }

    override fun getItemCount(): Int {

        return listTransaction.size

    }
}
