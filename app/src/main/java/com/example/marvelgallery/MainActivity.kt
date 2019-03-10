package com.example.marvelgallery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.Window
import com.example.marvelgallery.adapters.CharacterItemAdapter
import com.example.marvelgallery.adapters.MainListAdapter
import com.example.marvelgallery.data.MarvelCharacter
import	kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val characters = listOf(
        MarvelCharacter(name = "3-D	Man",
            imageUrl = "http://www.lustfulmodels.com/k/katerina-peskova/bkgdt4/cover.jpg"),
        MarvelCharacter(name = "Abomination	(Emil	Blonsky)",
            imageUrl	= "https://content.wafflegirl.com/galleries/gthumb/1/409/1409364_5056b08_300x_.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val categoryItemAdapters = characters.map(::CharacterItemAdapter )
        recyclerView.adapter = MainListAdapter(categoryItemAdapters)
    }
}
