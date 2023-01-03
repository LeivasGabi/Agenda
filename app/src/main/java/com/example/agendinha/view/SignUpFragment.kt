package com.example.agendinha.view

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.agendinha.R


class SignUpFragment : Fragment(R.layout.fragment_sign_up) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signUp(view)
    }

    private fun signUp(view: View) {

        val name: String = view.findViewById<EditText>(R.id.editTextName).text.toString()
        val email: String = view.findViewById<EditText>(R.id.editTextEmail).text.toString()
        val password: String = view.findViewById<EditText>(R.id.editTextNewPassword).text.toString()
        val phone: String = view.findViewById<EditText>(R.id.editTextPhone).text.toString()
        val birth: String = view.findViewById<EditText>(R.id.editTextBirth).text.toString()
        val cpf: String = view.findViewById<EditText>(R.id.editTextCPF).text.toString()
        val rg: String = view.findViewById<EditText>(R.id.editTextRG).text.toString()
        val cep: String = view.findViewById<EditText>(R.id.editTextCEP).text.toString()
        val state: String = view.findViewById<EditText>(R.id.editTextState).text.toString()
        val street: String = view.findViewById<EditText>(R.id.editTextStreet).text.toString()
        val district: String = view.findViewById<EditText>(R.id.editTextDistrit).text.toString()


    }
}