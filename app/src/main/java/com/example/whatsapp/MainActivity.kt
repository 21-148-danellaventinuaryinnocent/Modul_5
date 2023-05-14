package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp.adapter.MyAdapter
import com.example.whatsapp.fragment.Chat
import com.example.whatsapp.fragment.Panggilan
import com.example.whatsapp.fragment.Status
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val tabLayout = findViewById(R.id.tabLayout) as TabLayout
        val viewPager= findViewById(R.id.viewPager) as ViewPager

        val fragmentAdapter = MyAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(Chat(),"Chat")
        fragmentAdapter.addFragment(Status(),"Status")
        fragmentAdapter.addFragment(Panggilan(),"Panggilan")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        }
}