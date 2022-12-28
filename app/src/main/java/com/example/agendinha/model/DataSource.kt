package com.example.agendinha.model

class DataSource {
    companion object{
        fun createDataSet() : ArrayList<User> {
            val list = ArrayList<User>()
                list.add(
                    User(
                        " ",
                        " ",
                    )
                )
            return list
        }
    }
}