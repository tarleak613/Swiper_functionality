package com.example.myapplication2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // List of colors to display
        val colors = listOf(
            android.R.color.holo_green_dark,
            android.R.color.holo_red_dark,
            android.R.color.holo_orange_dark,
            android.R.color.holo_purple
        )

        // Set up ViewPager2
        viewPager = findViewById(R.id.viewPager)
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewPager.adapter = ColorAdapter(this, colors)
    }

    private inner class ColorAdapter(fa: FragmentActivity, private val colors: List<Int>) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = colors.size

        override fun createFragment(position: Int): ColorFragment {
            return ColorFragment.newInstance(ContextCompat.getColor(applicationContext, colors[position]))
        }
    }
}
