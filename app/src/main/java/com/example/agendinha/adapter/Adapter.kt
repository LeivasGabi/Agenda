package com.example.agendinha.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agendinha.R
import androidx.recyclerview.widget.RecyclerView
import com.example.agendinha.model.Schedule
import kotlinx.android.synthetic.main.res_layout.view.*

class Adapter (private val onClicked: (Schedule) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Schedule>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ScheduleViewHolder(

            LayoutInflater.from(parent.context).inflate(R.layout.fragment_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ScheduleViewHolder -> {
                holder.bind(items[position], onClicked)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(list: List<Schedule> ){
        this.items = list
    }

    class ScheduleViewHolder constructor(
        ItemView: View
    ): RecyclerView.ViewHolder(ItemView) {

        private val scheduleType = itemView.typeTask
        private val scheduleHour = itemView.scheduleHour
        private val scheduleDate = itemView.ScheduleDate
        private val scheduleTask = itemView.scheduleTaskType


        fun bind(schedule: Schedule, onClicked: (Schedule) -> Unit){
            scheduleType.text = schedule.type
            scheduleHour.text = schedule.hour
            scheduleDate.text = schedule.date
            scheduleTask.text = schedule.task

            itemView.setOnClickListener{
                onClicked(schedule)
            }
        }
    }
}


