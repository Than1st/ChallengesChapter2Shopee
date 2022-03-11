package com.than.challengeschapter2shopee

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageSlider : ImageSlider = findViewById(R.id.imageSlider)
        var slideModels : MutableList<SlideModel> = arrayListOf()
        slideModels.add(SlideModel(R.drawable.banner1))
        slideModels.add(SlideModel(R.drawable.banner2))
        slideModels.add(SlideModel(R.drawable.banner3))
        imageSlider.setImageList(slideModels, true)
    }
}