package com.example.agendinha.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.agendinha.resource.DataSourceUser
import com.example.agendinha.model.User

class UserViewModel (private val repositoryMock: DataSourceUser) : ViewModel() {

    var userLiveData = MutableLiveData<User>()

    fun getUser(){
        repositoryMock.getUser { users ->
            userLiveData.postValue(users)
        }
    }

    class UserViewModelFactory(private val repositoryMock: DataSourceUser) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return UserViewModel(repositoryMock) as T
        }
    }
}