package com.example.agendinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
Crie um app de agendamento que conte com 4 telas.
A primeira tela deve ser a de login, deve conter 3 botões,
um de ‘Login’, outro de ‘Cadastre-se’ e um de ‘Esqueci minha senha’,
deve conter também 2 campos, ‘usuário’ ou ‘email’, e ‘senha’.
A segunda tela deve ser a de ‘Cadastro’ e deve conter os campos de informações pessoais,
endereço e contato.

Nome Completo,/
 data de nascimento,/
 CPF,/
  RG,/
  Logradouro,/
Bairro,/
 Cidade,
 CEP,/
  Estado
   e País,
   Número de celular,/
e email./

 Na tela home devem conter 3 botões com fotos indicando serviço, fácil, médio e difícil
*/