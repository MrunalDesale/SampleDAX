package com.example.sampledax.ui.dax.presentation.enums


enum class Status {
    SUCCESS,
    ERROR,
    LOADING

}


data class ResponseWrapper<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {

        fun <T> loading(): ResponseWrapper<T> = ResponseWrapper(Status.LOADING, null, null)

        fun <T> success(data: T): ResponseWrapper<T> = ResponseWrapper(Status.SUCCESS, data, null)

        fun <T> error(data: T?, message: String?): ResponseWrapper<T> = ResponseWrapper(Status.ERROR, data, message)

    }
}




sealed class Resource <T>(val data:T? = null, val errorCode: Int? = null)
{
    class Success<T> (data:T): Resource<T>(data)
    class Loading<T> (data: T? = null) : Resource<T>(data)
    class DataError<T> (errorCode: Int, errorMsg: String? = ""): Resource<T>(null,errorCode)

    companion object {

        /**
         * Returns [State.Loading] instance.
         */
        fun <T> loading() = Loading<T>()

    }

}