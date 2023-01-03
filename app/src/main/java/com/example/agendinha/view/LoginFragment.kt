package com.example.agendinha.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.agendinha.R
import com.example.agendinha.resource.DataSourceUser
import com.example.agendinha.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var viewModel: UserViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setLogin(view)
    }

    private fun setLogin(view: View) {

        viewModel = ViewModelProvider(this, UserViewModel.UserViewModelFactory(DataSourceUser())).get(UserViewModel::class.java)

        viewModel.userLiveData.observe(viewLifecycleOwner, Observer { users ->
            validateLogin(users.email, users.password, view)
        })
        viewModel.getUser()
    }
    private fun validateLogin(email: String, password: String, view: View) {
        view.findViewById<Button>(R.id.btn_sign_in).setOnClickListener {
            if (editTextEmailLogin.text.toString() == email && editTextPassword.text.toString() == password) {
                findNavController().navigate(R.id.actionLoginToPerfil)
            }
        }
        view.findViewById<Button>(R.id.btn_sign_up).setOnClickListener {
            findNavController().navigate(R.id.actionCreateRegistration)
        }
    }
}


