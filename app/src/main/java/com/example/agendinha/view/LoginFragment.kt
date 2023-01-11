package com.example.agendinha.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendinha.R
import com.example.agendinha.model.User
import com.example.agendinha.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(R.layout.fragment_login) {

    private val args: LoginFragmentArgs by navArgs()
    private lateinit var viewModel: UserViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(
            this,
            UserViewModel.LoginViewModelProvider(
                this))[UserViewModel::class.java]

        setButtonClick()
    }

    private fun setButtonClick() {
        btn_sign_in.setOnClickListener {
            args.user?.let { it1 -> callValidateLogin(it1) }
        }

        btn_sign_up.setOnClickListener {
            findNavController().navigate(R.id.actionCreateRegistration)
        }
    }

    private fun callValidateLogin(user: User) {
        viewModel.validateLogin(user) {
            if (it) {
                findNavController().navigate(R.id.actionLoginToPerfil)
            } else {
                Toast.makeText(
                    requireContext(),
                    "Erro ao validar login! Verifique seus dados e tente novamente.",
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}