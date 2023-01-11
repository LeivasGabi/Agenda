package com.example.agendinha.model

import java.io.Serializable

data class User(
   var name: String,
   var birth: String,
   var cpf: String,
   var rg: String,
   var address: Address,
   var login: Login
) : Serializable
