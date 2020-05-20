package dev.andrewjap.mergeadapter.ui.main

import androidx.recyclerview.widget.DiffUtil
import dev.andrewjap.mergeadapter.domain.News

class NewsDiffCallback : DiffUtil.ItemCallback<News>() {

    override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
        return oldItem.title == newItem.title && oldItem.coverUrl == newItem.coverUrl
    }

    override fun areContentsTheSame(oldItem: News, newItem: News): Boolean = oldItem == newItem
}