package com.example.agendinha.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat
import androidx.navigation.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agendinha.adapter.Adapter
import com.example.agendinha.resource.DataSourceSchedule
import kotlinx.android.synthetic.main.fragment_list.*


class ListFragment : AppCompatActivity() {

    private lateinit var listAdapter: Adapter
    private val args: ListFragmentArgs by navArgs()

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
        initAdapter()
        populateRecycler()
    }

    private fun initAdapter() {
        listAdapter = Adapter()

        recyclerView.apply {
            RecyclerView.LayoutManager = LinearLayoutManager(ContentProviderCompat.requireContext())
            adapter = listAdapter
        }
    }

    private fun populateRecycler() {
        DataSourceSchedule.createSchedule(args.schedule) {
            listAdapter.setDataSet(it)
        }
    }
}