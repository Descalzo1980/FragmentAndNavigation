package com.example.fragmentandnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = view.findViewById<Button>(R.id.btn_next)
        val messageView = view.findViewById<EditText>(R.id.et_msg)
        nextButton.setOnClickListener{
            val message = messageView.text.toString()
            val action = MessageFragmentDirections.actionMessageFragmentToLastFragment(message)
            view.findNavController().navigate(action)
        }
        return view
    }

}