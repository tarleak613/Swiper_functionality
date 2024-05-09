package com.example.myapplication2

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ColorFragment : Fragment() {

    companion object {
        private const val ARG_COLOR = "color"

        fun newInstance(color: Int): ColorFragment {
            val fragment = ColorFragment()
            val args = Bundle()
            args.putInt(ARG_COLOR, color)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = View(context)
        view.setBackgroundColor(arguments?.getInt(ARG_COLOR) ?: Color.WHITE)
        return view
    }
}
