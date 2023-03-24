package com.example.livedata_view_model


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedata_view_model.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: ViewModeldemo
    lateinit var factory: ViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// RUN AK
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)//BINA VIEW HA HI DATA SET AKR EAHA HII


        binding.hint = "Enter the value"
        binding.buttonName = "Add"
        factory = ViewModelFactory(125)

        viewModel = ViewModelProvider(this, factory)[ViewModeldemo::class.java]
       // binding.tvCount.text = viewModel.totalCount.toString()
        binding.lifecycleOwner = this
        binding.myViewModel=viewModel

    }
}
