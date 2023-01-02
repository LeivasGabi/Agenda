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
                        "gabe",
                        "9999999999",
                        "12344567890",
                        "99589404",
                        "18/08/1998",
                        "0589384",
                        "Rua dois",
                        "Jardim",
                        "RS"
                    )
                )
            return list
        }
    }
}