package com.example.agendinha.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.agendinha.R
import com.example.agendinha.model.User
import kotlinx.android.synthetic.main.fragment_sign_up.*


class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signUp(view)
    }

    private fun signUp(view: View) {

        val email = view.findViewById<EditText>(R.id.editTextEmail)
        val password = view.findViewById<EditText>(R.id.editTextNewPassword)
        val name = view.findViewById<EditText>(R.id.editTextName)
        val phone = view.findViewById<EditText>(R.id.editTextPhone)
        val cpf = view.findViewById<EditText>(R.id.editTextCPF)
        val rg = view.findViewById<EditText>(R.id.editTextRG)
        val birth = view.findViewById<EditText>(R.id.editTextBirth)
        val cep = view.findViewById<EditText>(R.id.editTextCEP)
        val street = view.findViewById<EditText>(R.id.editTextStreet)
        val district = view.findViewById<EditText>(R.id.editTextDistrit)
        val state  = view.findViewById<EditText>(R.id.editTextState)

        //TODO validar se campos estao vazios

        if(editTextEmail.length() == 0)
            editTextEmail.error = "This field is required"

        if(editTextNewPassword.length() == 0)
            editTextNewPassword.error = "This field is required"

        if(editTextName.length() == 0)
            editTextName.error = "This field is required"

        if(editTextPhone.length() == 0)
            editTextPhone.error = "This field is required"

        if(editTextCPF.length() == 0)
            editTextCPF.error = "This field is required"

        if(editTextRG.length() == 0)
            editTextRG.error = "This field is required"

        if(editTextBirth.length() == 0)
            editTextBirth.error = "This field is required"

        if(editTextCEP.length() == 0)
            editTextCEP.error = "This field is required"

        if(editTextStreet.length() == 0)
            editTextStreet.error = "This field is required"

        if(editTextDistrit.length() == 0)
            editTextDistrit.error = "This field is required"

        if(editTextState.length() == 0)
            editTextState.error = "This field is required"

        val user = User(
            email = email.text.toString(),
            password = password.text.toString(),
            name = name.text.toString(),
            phone = phone.text.toString(),
            cpf = cpf.text.toString(),
            rg = rg.text.toString(),
            birth = birth.text.toString(),
            cep = cep.text.toString(),
            street = street.text.toString(),
            district = district.text.toString(),
            state = state.text.toString()
        )

        view.findViewById<Button>(R.id.button).setOnClickListener {
            val action = SignUpFragmentDirections.actionSignUpToPerfil(
               user
            )
            findNavController().navigate(action)
        }
    }
}