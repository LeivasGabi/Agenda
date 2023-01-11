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
        inputIsEmpty()
    }

    private fun inputIsEmpty() {
        if(editTextEmail.text.toString() == "")
            editTextEmail.error = "This field is required"

        if(editTextNewPassword.text.toString() == "")
            editTextNewPassword.error = "This field is required"

        if(editTextName.text.toString() == "")
            editTextName.error = "This field is required"

        if(editTextPhone.text.toString() == "")
            editTextPhone.error = "This field is required"

        if(editTextCPF.text.toString() == "")
            editTextCPF.error = "This field is required"

        if(editTextRG.text.toString() == "")
            editTextRG.error = "This field is required"

        if(editTextBirth.text.toString() == "")
            editTextBirth.error = "This field is required"

        if(editTextCEP.text.toString() == "")
            editTextCEP.error = "This field is required"

        if(editTextStreet.text.toString() == "")
            editTextStreet.error = "This field is required"

        if(editTextDistrit.text.toString() == "")
            editTextDistrit.error = "This field is required"

        if(editTextState.text.toString() == "")
            editTextState.error = "This field is required"
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

//        val user = User(
//            email = email.text.toString(),
//            password = password.text.toString(),
//            name = name.text.toString(),
//            phone = phone.text.toString(),
//            cpf = cpf.text.toString(),
//            rg = rg.text.toString(),
//            birth = birth.text.toString(),
//            cep = cep.text.toString(),
//            street = street.text.toString(),
//            district = district.text.toString(),
//            state = state.text.toString()
//        )

//        view.findViewById<Button>(R.id.button).setOnClickListener {
//            val action = SignUpFragmentDirections.actionSignUpToPerfil(
//               user
//            )
//            findNavController().navigate(action)
       // }
    }
}