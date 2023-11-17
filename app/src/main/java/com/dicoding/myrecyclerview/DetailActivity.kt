package com.dicoding.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val hero: Hero? = intent.getParcelableExtra("HERO_DATA")

        if(hero != null){
            val imgphoto: ImageView = findViewById(R.id.imgphoto)
            val textView3: TextView = findViewById(R.id.textView3)
            val textView4: TextView = findViewById(R.id.textView4)

            imgphoto.setImageResource(hero.photo)
            textView3.text = hero.name
            textView4.text = hero.description
        }
    }
}