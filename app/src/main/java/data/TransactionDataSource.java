package data;

import java.util.List;

import kotlin.Unit;

interface TransactionDataSource {

    fun listAll(success:(List<Transaction>) -> Unit, failure:() -> Unit)
}
