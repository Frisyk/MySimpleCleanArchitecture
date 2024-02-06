package bangkit.capstone.mysimplecleanarchitecture.data

import bangkit.capstone.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}