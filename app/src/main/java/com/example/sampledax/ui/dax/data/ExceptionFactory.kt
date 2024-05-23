package com.example.sampledax.ui.dax.data

class ExceptionFactory {
    companion object {
        fun create(code: Int, message: String?): Exception {
            return when (code) {
                404 -> {
                    NotFoundException(message)
                }
                else -> NotFoundException(message)
            }
        }
    }
}