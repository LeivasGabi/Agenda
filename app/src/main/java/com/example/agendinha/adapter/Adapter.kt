package com.example.agendinha.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.agendinha.R
import com.example.agendinha.model.Address
import com.example.agendinha.model.Schedule
import kotlinx.android.synthetic.main.res_layout.view.*

class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var listService: List<Schedule>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListServiceViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ListServiceViewHolder -> {
                holder.bind(listService[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return listService.size
    }

    fun setDataSet(list: List<Schedule>) {
        listService = list
    }

    class ListServiceViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val typeService = itemView.textViewTypeService
        private val dateService = itemView.textViewDate
        private val addressService = itemView.textViewAddress

        fun bind(schedule: Schedule) {
            typeService.text = schedule.type
            dateService.text = schedule.date
            addressService.text = concatenate(schedule.address)
        }
        fun concatenate(address: Address) : String {
            return "${address.street}," +
                    "${address.number} - " +
                    "${address.district}, " +
                    "${address.city} - " +
                    "${address.state} / "
        }
    }
}

