package dev.andrewjap.mergeadapter.ui.main

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.andrewjap.mergeadapter.domain.News
import dev.andrewjap.mergeadapter.util.load
import kotlinx.android.synthetic.main.item_news.view.*

class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val coverImage by lazy { view.iv_cover_image }
    private val title by lazy { view.tv_title }

    fun onBind(item: News) {
        title.text = item.title
        coverImage.load(item.coverUrl)
    }
}