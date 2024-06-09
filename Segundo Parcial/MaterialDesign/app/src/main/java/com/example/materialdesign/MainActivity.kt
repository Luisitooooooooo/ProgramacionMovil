package com.example.materialdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        val items = listOf(
            CarouselAdapter.CarouselItem(R.drawable.image1, "Wallpaper Gohan"),
            CarouselAdapter.CarouselItem(R.drawable.image2, "Wallpaper Fight"),
            CarouselAdapter.CarouselItem(R.drawable.image3, "Wallpaper Aura")
        )

        viewPager.adapter = CarouselAdapter(items)
    }
}
