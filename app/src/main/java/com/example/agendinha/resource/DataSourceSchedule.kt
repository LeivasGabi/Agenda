package com.example.agendinha.resource

import com.example.agendinha.model.Schedule

class DataSourceSchedule {
    companion object {
        fun createSchedule(schedule: Schedule, callback: (list: ArrayList<Schedule>) -> Unit) {
            var list = ArrayList<Schedule>()
            list.add(schedule)
            callback(list)
        }
    }
}