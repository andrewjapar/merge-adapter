package dev.andrewjap.mergeadapter.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(viewType: Int): View {
    return LayoutInflater.from(context).inflate(viewType, this, false)
}