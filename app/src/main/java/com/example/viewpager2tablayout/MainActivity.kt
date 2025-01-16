package com.example.viewpager2tablayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2tablayout.fragments.ViewPagerFragment
import com.example.viewpager2tablayout.model.Page
import com.example.viewpager2tablayout.utils.PageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val pages = Page.pages

    private lateinit var adapter:PageAdapter
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager2:ViewPager2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = PageAdapter(this,pages)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager2){ tab,position ->
            val name = pages[position].name
            tab.text = name
        }.attach()
    }
}