package com.example.agendinha.model

import java.io.Serializable

data class Schedule(
    var type: String,
    var hour: String,
    var task: String,
    var date: String
): Serializable
