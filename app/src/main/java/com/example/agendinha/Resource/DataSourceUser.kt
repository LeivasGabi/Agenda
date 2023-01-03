package com.example.agendinha.Resource

import com.example.agendinha.model.User

class DataSourceUser {
        fun getUser(callback: (users : User) -> Unit) {
            Thread(Runnable {
                Thread.sleep(1000)
                callback.invoke(
                    User(
                        "gabrielle@email",
                        "1234",
                        "Gabrielle",
                        "99999999",
                        "00000000000",
                        "111111111",
                        "18/07/1998",
                        "09908808",
                        "Rua W",
                        "Jardim",
                        "RS"
                    ),
                    )
            }).start()
        }
}