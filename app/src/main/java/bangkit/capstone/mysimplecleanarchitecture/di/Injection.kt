package bangkit.capstone.mysimplecleanarchitecture.di

import bangkit.capstone.mysimplecleanarchitecture.data.IMessageDataSource
import bangkit.capstone.mysimplecleanarchitecture.data.MessageDataSource
import bangkit.capstone.mysimplecleanarchitecture.data.MessageRepository
import bangkit.capstone.mysimplecleanarchitecture.domain.IMessageRepository
import bangkit.capstone.mysimplecleanarchitecture.domain.MessageInteractor
import bangkit.capstone.mysimplecleanarchitecture.domain.MessageUseCase

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