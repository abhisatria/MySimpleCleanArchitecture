package com.abhiwisesa.mysimplecleanarchitecture.di

import com.abhiwisesa.mysimplecleanarchitecture.data.IMessageDataSource
import com.abhiwisesa.mysimplecleanarchitecture.data.MessageDataSource
import com.abhiwisesa.mysimplecleanarchitecture.data.MessageRepository
import com.abhiwisesa.mysimplecleanarchitecture.domain.IMessageRepository
import com.abhiwisesa.mysimplecleanarchitecture.domain.MessageInteractor
import com.abhiwisesa.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}