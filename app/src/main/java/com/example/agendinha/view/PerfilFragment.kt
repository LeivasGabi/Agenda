package com.example.agendinha.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendinha.R
import com.example.agendinha.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_perfil.*


class PerfilFragment : Fragment(R.layout.fragment_perfil) {

    private lateinit var viewModel: UserViewModel

    private val args: PerfilFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nextFragment(view)
        perfilInput(view)
    }

    private fun nextFragment(view: View) {

        view.findViewById<Button>(R.id.btn_next).setOnClickListener {
            findNavController().navigate(R.id.actionPerfilToHome)
        }
    }
    private fun perfilInput(view: View) {

        view.findViewById<TextView>(R.id.textViewName).text = args.user?.name
        view.findViewById<TextView>(R.id.textViewRG).text = args.user?.rg
        view.findViewById<TextView>(R.id.textViewCPF).text = args.user?.cpf
        view.findViewById<TextView>(R.id.textViewBirth).text = args.user?.birth
    }
}

