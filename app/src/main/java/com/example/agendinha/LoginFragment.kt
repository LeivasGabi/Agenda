package com.example.agendinha

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_sign_up).setOnClickListener {
            findNavController().navigate(R.id.actionCreateRegistration)
        }

        view.findViewById<Button>(R.id.btn_sign_in).setOnClickListener {
            findNavController().navigate(R.id.actionLogin)
            //TODO ir para tela de login
        }
    }
}

