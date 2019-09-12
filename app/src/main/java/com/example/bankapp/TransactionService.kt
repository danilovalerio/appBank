package com.example.bankapp

import data.Transaction

object TransactionService {
    private const val BASE_URL = "https://bank-app-test.herokuapp.com/api/statements/"
    //Busca os itens com base no id
    fun getTransactions(id:String): List<Transaction> {
        //cria url para o id
        val url = "$BASE_URL${id}"

        //faz  a requisição do get
        val json = HttpHelper.get(url)

        //cria a lista de transações a partir do JSON
        val transactions = fromJson<List<Transaction>>(json)
        return transactions
    }
}