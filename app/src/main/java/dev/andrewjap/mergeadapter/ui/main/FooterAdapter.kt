package dev.andrewjap.mergeadapter.ui.main

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.andrewjap.mergeadapter.R
import dev.andrewjap.mergeadapter.util.inflate

class FooterAdapter : RecyclerView.Adapter<FooterAdapter.FooterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FooterViewHolder {
        return FooterViewHolder(parent.inflate(R.layout.item_footer))
    }

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: FooterViewHolder, position: Int) {
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_footer
    }

    inner class FooterViewHolder(view: View) : RecyclerView.ViewHolder(view)
}