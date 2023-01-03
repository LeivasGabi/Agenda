package com.example.agendinha.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.agendinha.Resource.DataSourceService
import com.example.agendinha.model.Schedule

class ServiceViewModel (private val repositoryMock: DataSourceService) : ViewModel() {
    var ServiceLiveData = MutableLiveData<List<Schedule>>()

    fun getSchedule(){
        repositoryMock.getSchedule {  schedules->
            ServiceLiveData.postValue(schedules)
        }
    }

    class ServiceViewModelFactory(private val repositoryMock: DataSourceService) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return ServiceViewModel(repositoryMock) as T
        }
    }
}