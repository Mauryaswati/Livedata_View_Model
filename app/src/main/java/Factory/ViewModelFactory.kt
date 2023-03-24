package com.example.livedata_view_model
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class ViewModelFactory(private var input: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModeldemo::class.java)){
            return ViewModeldemo(input) as T
        }
        throw IllegalArgumentException("Unknown viewmodel class") // ye code chal raha hi
    }
}
