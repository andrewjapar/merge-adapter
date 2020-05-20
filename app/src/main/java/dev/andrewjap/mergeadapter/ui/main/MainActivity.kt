package dev.andrewjap.mergeadapter.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import dev.andrewjap.mergeadapter.R
import dev.andrewjap.mergeadapter.repository.NewsRepositoryImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsAdapter = NewsAdapter()
        val footerAdapter = FooterAdapter()
        val config = MergeAdapter.Config
            .Builder()
            .setIsolateViewTypes(false)
            .build()

        val mergeAdapter = MergeAdapter(config, newsAdapter, footerAdapter)

        news_list.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = mergeAdapter
        }

        newsAdapter.submitList(NewsRepositoryImpl().get())
    }
}
