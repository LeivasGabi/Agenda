package com.example.agendinha.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendinha.R
import com.example.agendinha.model.Schedule
import kotlinx.android.synthetic.main.fragment_service.*


class ServiceFragment : Fragment(R.layout.fragment_service) {

    private val args : ServiceFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO salvar a o servico e mostrar na recyclerview
        //TODO dialog para salvo com sucesso

//       view.findViewById<TextView>(R.id.type_service).text = args.

        val typeService = requireArguments()
        val hour = view.findViewById<EditText>(R.id.serviceHour)
        val date = view.findViewById<EditText>(R.id.serviceDate)
        val address = view.findViewById<EditText>(R.id.serviceAddress)

        val schudule = Schedule(
            type = typeService.toString(),
            hour = hour.text.toString(),
            date = date.text.toString(),
            address = address.text.toString()
        )
    }
}

