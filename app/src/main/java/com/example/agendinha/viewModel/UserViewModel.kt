package com.example.agendinha.viewModel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.agendinha.model.User
import com.example.agendinha.view.LoginFragment
import kotlinx.android.synthetic.main.fragment_login.*

class UserViewModel(val fragment: LoginFragment): ViewModel() {

    fun validateLogin(user: User, callback: (result: (Boolean)) -> Unit) {
        if (user.login.email != fragment.editTextEmailLogin.text.toString() ||
            user.login.password != fragment.editTextPassword.text.toString()) {
            callback.invoke(false)
        } else {
            callback.invoke(true)
        }
    }

    class LoginViewModelProvider(
        val fragment: LoginFragment
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return UserViewModel(fragment) as T
        }
    }
}