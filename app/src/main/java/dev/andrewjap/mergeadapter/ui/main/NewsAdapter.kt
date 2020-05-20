package dev.andrewjap.mergeadapter.ui.main

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import dev.andrewjap.mergeadapter.R
import dev.andrewjap.mergeadapter.domain.News
import dev.andrewjap.mergeadapter.util.inflate

class NewsAdapter : ListAdapter<News, NewsViewHolder>(NewsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(parent.inflate(R.layout.item_news))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_news
    }
}