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


        //TODO passar tipo de servico para proxima tela


        view.findViewById<ImageButton>(R.id.btn_easy).setOnClickListener{
            findNavController().navigate(R.id.actionHomeToService)
        }

        view.findViewById<ImageButton>(R.id.btn_regular).setOnClickListener{
            findNavController().navigate(R.id.actionHomeToService)
        }

        view.findViewById<ImageButton>(R.id.btn_hard).setOnClickListener{
            findNavController().navigate(R.id.actionHomeToService)
        }
    }
}