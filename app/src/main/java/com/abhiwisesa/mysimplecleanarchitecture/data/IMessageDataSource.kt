package com.abhiwisesa.mysimplecleanarchitecture.data

import com.abhiwisesa.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}