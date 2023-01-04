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
import com.example.agendinha.resource.DataSourceUser
import com.example.agendinha.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_perfil.*
import kotlinx.android.synthetic.main.fragment_perfil.view.*
import kotlinx.android.synthetic.main.fragment_sign_up.*


class PerfilFragment : Fragment(R.layout.fragment_perfil) {

    private lateinit var viewModel: UserViewModel

    private val args: PerfilFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(
            this,
            UserViewModel.UserViewModelFactory(
                DataSourceUser()
            )
        ).get(UserViewModel::class.java)

        viewModel.userLiveData.observe(viewLifecycleOwner, Observer { users ->
            textViewEmail.text = users.email
            textViewName.text = users.name
            textViewPhone.text = users.phone
            textViewCPF.text = users.cpf
            textViewRG.text = users.rg
            textViewBirth.text = users.birth
            textViewCEP.text = users.cep
            textViewStreet.text = users.street
            textViewDistrict.text = users.district
            textViewState.text = users.state

        })
        viewModel.getUser()

        view.findViewById<Button>(R.id.btn_next).setOnClickListener {
            findNavController().navigate(R.id.actionPerfilToHome)
        }

        //TODO fazer um if para dados mockados e dados de entrada funcionarem ao mesmo tempo

//        view.findViewById<TextView>(R.id.textViewName).text = args.user.name
//        view.findViewById<TextView>(R.id.textViewRG).text = args.user.rg
//        view.findViewById<TextView>(R.id.textViewEmail).text = args.user.email
//        view.findViewById<TextView>(R.id.textViewCPF).text = args.user.cpf
//        view.findViewById<TextView>(R.id.textViewStreet).text = args.user.street
//        view.findViewById<TextView>(R.id.textViewCEP).text = args.user.cep
//        view.findViewById<TextView>(R.id.textViewPhone).text = args.user.phone
//        view.findViewById<TextView>(R.id.textViewDistrict).text = args.user.district
//        view.findViewById<TextView>(R.id.textViewState).text = args.user.state
//        view.findViewById<TextView>(R.id.textViewBirth).text = args.user.birth
    }
}
