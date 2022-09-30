package com.example.fragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class LastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_last, container, false)
        val message = LastFragmentArgs.fromBundle(requireArguments()).message
        val lastFragment = view.findViewById<TextView>(R.id.tv_message)
        lastFragment.text = message
        return view
    }
}