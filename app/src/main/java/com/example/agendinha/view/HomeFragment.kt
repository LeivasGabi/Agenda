package com.example.agendinha.view

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.agendinha.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.btn_easy).setOnClickListener{
            val action = HomeFragmentDirections.actionHomeToService(
                1
            )
            findNavController().navigate(action)
        }

        view.findViewById<ImageButton>(R.id.btn_regular).setOnClickListener{
            val action = HomeFragmentDirections.actionHomeToService(
                2
            )
            findNavController().navigate(action)
        }

        view.findViewById<ImageButton>(R.id.btn_hard).setOnClickListener{
            val action = HomeFragmentDirections.actionHomeToService(
                3
            )
            findNavController().navigate(action)
        }
    }
}