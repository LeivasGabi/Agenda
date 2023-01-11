package com.example.agendinha.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.agendinha.R
import com.example.agendinha.model.Schedule
import kotlinx.android.synthetic.main.fragment_task.*


class TaskFragment : Fragment(R.layout.fragment_task) {

    private val args : TaskFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        when(args.typeService) {
            1 ->
                textViewTypeTask.text = "Easy"
            2 ->
                textViewTypeTask.text = "Regular"
            3 ->
                textViewTypeTask.text = "Hard"
        }

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

        view.findViewById<Button>(R.id.btn_save).setOnClickListener {
            val action = TaskFragmentDirections.actionListSchedules(
                schudule
            )
            findNavController().navigate(action)
        }
    }
}

