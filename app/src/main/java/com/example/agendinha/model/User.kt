package com.example.agendinha.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(
   var email: String,
   var password: String,
   var name: String,
   var phone: String,
   var cpf: String,
   var rg: String,
   var birth: String,
   var cep: String,
   var street: String,
   var distrit: String,
   var state: String
)
