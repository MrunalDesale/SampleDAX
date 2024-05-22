package com.example.sampledax.ui.dax.data


class ExceptionFactory {

    companion object {

        fun create(code: Int, message: String?): Exception {
            when (code) {
                404 -> {
                    return UserNotFoundException(message)
                }
                else -> return UserNotFoundException(message)
            }
        }
    }

}
