package com.example.agendinha.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.R
import androidx.recyclerview.widget.RecyclerView
import com.example.agendinha.model.Schedule
import kotlinx.android.synthetic.main.res_layout.view.*

class Adapter (private val onClicked: (Schedule) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Schedule>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate()
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileViewHolder -> {
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

    class ProfileViewHolder constructor(
        ItemView: View
    ): RecyclerView.ViewHolder(ItemView) {

        private val scheduleType = itemView.typeService


        fun bind(profile: Schedule, onClicked: (Schedule) -> Unit){
            scheduleType.text = profile.type


            itemView.setOnClickListener{
                onClicked(profile)
            }
        }
    }

}