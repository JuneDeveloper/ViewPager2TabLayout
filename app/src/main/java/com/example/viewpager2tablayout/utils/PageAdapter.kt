package com.example.viewpager2tablayout.utils

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2tablayout.fragments.ViewPagerFragment
import com.example.viewpager2tablayout.model.Page

class PageAdapter(fragment: FragmentActivity,private val pageList:MutableList<Page>):
    FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("page" to pageList[position])
        return fragment
    }
}