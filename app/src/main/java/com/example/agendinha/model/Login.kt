package com.example.agendinha.model

import java.io.Serializable

data class Login(
    var email: String,
    var password: String
): Serializable