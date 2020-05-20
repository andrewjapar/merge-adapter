package dev.andrewjap.mergeadapter.repository

import dev.andrewjap.mergeadapter.domain.News

interface NewsRepository {
    fun get(): List<News>
}

class NewsRepositoryImpl: NewsRepository {

    override fun get(): List<News> {
        return listOf(
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", ""),
            News("test 123", "https://media.istockphoto.com/photos/dark-wood-background-picture-id933501774", "")
        )
    }
}