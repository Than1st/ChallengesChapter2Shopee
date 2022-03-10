package com.than.challengeschapter2shopee

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {
    private var modelList = arrayListOf<Int>()
    lateinit var adapter: ModelAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
    }
    private fun loadData() {
        modelList.add(R.drawable.banner1)
        modelList.add(R.drawable.banner2)
        modelList.add(R.drawable.banner3)

        var viewPager = findViewById<ViewPager2>(R.id.viewPagervertical)
        adapter = ModelAdapter(this,modelList)
        viewPager.adapter = adapter
    }
}