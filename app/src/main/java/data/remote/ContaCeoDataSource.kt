package data.remote

import data.Transaction
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ContaCeoDataSource (val contaCeoApi: ContaCeoApi) : TransactionDataSource {

        override fun listAll(success: (List<Transaction>) -> Unit, failure: () -> Unit) {
            val call = contaCeoApi.listTransactions()
            call.enqueue(object : Callback<ContaCeoResponse> {

                override fun onResponse(
                    call: Call<ContaCeoResponse>,
                    response: Response<ContaCeoResponse>
                ) {
                    if (response.isSuccessful) {
                        val transactions = mutableListOf<Transaction>()
                        response.body()?.message?.forEach {
                            transactions.add(Transaction(it))
                        }
                        success(transactions)
                    } else {
                        failure()
                    }
                }

                override fun onFailure(call: Call<ContaCeoResponse>, t: Throwable?) {
                    failure()
                }
            })

        }

    }
}