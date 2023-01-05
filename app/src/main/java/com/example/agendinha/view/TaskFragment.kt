package com.example.agendinha.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.agendinha.R
import com.example.agendinha.model.Schedule


class TaskFragment : Fragment(R.layout.fragment_task) {

    private val args : ServiceFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO salvar a o servico e mostrar na recyclerview
        //TODO dialog para salvo com sucesso

       view.findViewById<TextView>(R.id.typeService).text = args.typeService.toString()

        val typeService = requireArguments()
        val hour = view.findViewById<EditText>(R.id.editTextTaskHour)
        val date = view.findViewById<EditText>(R.id.editTextTaskDate)
        val task = view.findViewById<EditText>(R.id.editTextTask)

        val schudule = Schedule(
            type = typeService.toString(),
            hour = hour.text.toString(),
            date = date.text.toString(),
            task = task.text.toString()
        )
    }
}

