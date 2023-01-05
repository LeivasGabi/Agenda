package com.example.agendinha.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.agendinha.R
import com.example.agendinha.adapter.Adapter
import com.example.agendinha.model.Schedule
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : AppCompatActivity() {

    private val args : ListFragmentArgs by navArgs()

    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapter()
        populateItems()
    }

    private fun populateItems() {
        adapter.setDataSet(listDataSet(args.taskArgs))
    }

    private fun listDataSet(schedule: Schedule) : List<Schedule>{
        return listOf(schedule)
    }

    private fun initAdapter() {
        adapter = Adapter { schedule ->
        }

        recyclerView.layoutManager = LinearLayoutManager(this@ListFragment)
        recyclerView.adapter = adapter
    }

}