package com.example.marvelgallery.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.marvelgallery.R
import com.example.marvelgallery.data.MarvelCharacter
import com.example.marvelgallery.view_ext.bindView
import com.example.marvelgallery.view_ext.loadImage

class CharacterItemAdapter(
    val character: MarvelCharacter
) : ItemAdapter<CharacterItemAdapter.ViewHolder>(R.layout.item_character){
    override fun onCreateViewHolder(itemView: View) = ViewHolder(itemView)

    override fun CharacterItemAdapter.ViewHolder.onBindViewHolder() {
        textView.text = character.name
        imageView.loadImage(character.imageUrl)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView by bindView<TextView>(R.id.textView)
        val imageView by bindView<ImageView>(R.id.imageView)
    }
}