package com.example.agendinha.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendinha.R
import kotlinx.android.synthetic.main.fragment_sign_up.*


class PerfilFragment : Fragment(R.layout.fragment_perfil) {

    private val args : PerfilFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Thread(Runnable {
            Thread.sleep(1000)
            view.findViewById<TextView>(R.id.textViewEmail).text = args.user.email
            view.findViewById<TextView>(R.id.textViewName).text = args.user.name
            view.findViewById<TextView>(R.id.textViewPhone).text = args.user.phone
            view.findViewById<TextView>(R.id.textViewCPF).text = args.user.cpf
            view.findViewById<TextView>(R.id.textViewRG).text = args.user.rg
            view.findViewById<TextView>(R.id.textViewBirth).text = args.user.birth
            view.findViewById<TextView>(R.id.textViewCEP).text = args.user.cep
            view.findViewById<TextView>(R.id.textViewStreet).text = args.user.street
            view.findViewById<TextView>(R.id.editTextDistrit).text = args.user.district
            view.findViewById<TextView>(R.id.editTextState).text = args.user.state
        })

        println(args.user.email)
        println(args.user.name)
        println(args.user.phone)
        println(args.user.cpf)
        println(args.user.rg)
        println(args.user.birth)
        println(args.user.cep)
        println(args.user.street)
        println(args.user.district)
        println(args.user.state)


//        view.findViewById<TextView>(R.id.textViewEmail).setText(args.user.email)
//        view.findViewById<TextView>(R.id.textViewName).setText(args.user.name)
//        view.findViewById<TextView>(R.id.textViewPhone).setText(args.user.phone)
//        view.findViewById<TextView>(R.id.textViewCPF).setText(args.user.cpf)
//        view.findViewById<TextView>(R.id.textViewRG).setText(args.user.rg)
//        view.findViewById<TextView>(R.id.textViewBirth).setText(args.user.birth)
//        view.findViewById<TextView>(R.id.textViewCEP).setText(args.user.cep)
//        view.findViewById<TextView>(R.id.textViewStreet).setText(args.user.street)
//        view.findViewById<TextView>(R.id.editTextDistrit).setText(args.user.district)
//        view.findViewById<TextView>(R.id.editTextState).setText(args.user.state)

        view.findViewById<Button>(R.id.btn_next).setOnClickListener {
            findNavController().navigate(R.id.actionPerfilToHome)
        }
    }
}