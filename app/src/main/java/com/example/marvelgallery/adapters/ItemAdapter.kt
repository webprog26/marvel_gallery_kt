package com.example.marvelgallery.adapters

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.View

abstract class ItemAdapter<T: RecyclerView.ViewHolder>
    (@LayoutRes open val layoutId: Int){

    abstract fun onCreateViewHolder(itemView: View): T

    @SuppressWarnings("UNCHECKED_CAST")
    fun bindVewHolder(holder: RecyclerView.ViewHolder) {
        (holder as T).onBindViewHolder()
    }

    abstract fun T.onBindViewHolder()
}