package com.example.agendinha.resource

import com.example.agendinha.model.Schedule

class DataSourceService {
    fun getSchedule(callback: (schedules : Schedule) -> Unit)  {
        Thread(Runnable {
            Thread.sleep(1000)
            callback.invoke(
                    Schedule(
                        "",
                        "",
                        "",
                        ""
                    ),
                )
        }).start()
    }
}