package com.example.viewpager2tablayout.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.viewpager2tablayout.R
import com.example.viewpager2tablayout.model.Page

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.fragment_first, container, false)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val webView:WebView = view.findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        val viewPagerItem = arguments?.getSerializable("page") as Page
        Log.d("TAGGGGGGGGGG","$viewPagerItem")
        webView.loadUrl(viewPagerItem.url)
    }
}