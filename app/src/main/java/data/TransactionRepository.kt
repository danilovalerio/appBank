package data

class TransactionRepository (private val contaCeoDataSource: TransactionDataSource) : TransactionDataSource {

    override fun listAll(success: (List<Transaction>) -> Unit, failure: () -> Unit) {
        contaCeoDataSource.listAll(success, failure)
    }
}