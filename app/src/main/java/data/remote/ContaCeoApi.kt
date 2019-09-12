package data.remote

import retrofit2.Call
import retrofit2.http.GET

interface ContaCeoApi {
    @GET("transactions/list")
    fun listTransactions(): Call<ContaCeoResponse>
}