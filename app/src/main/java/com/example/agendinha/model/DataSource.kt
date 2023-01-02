package com.example.agendinha.model

import android.annotation.SuppressLint

class DataSource {
    companion object{
        @SuppressLint("SuspiciousIndentation")
        fun createDataSet() : ArrayList<User> {
            val list = ArrayList<User>()
                list.add(
                    User(
                        "gabrielle@gmail.com ",
                        "1234456",
                    )
                )
            return list
        }
    }
}