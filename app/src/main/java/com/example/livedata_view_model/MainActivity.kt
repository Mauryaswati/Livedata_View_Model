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
        super.onCreate(savedInstanceState)
        binding.hint = "Enter the value"
        binding.buttonName = "Add"
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        factory = ViewModelFactory(0)
        viewModel = ViewModelProvider(this, factory)[ViewModeldemo::class.java]
       // binding.tvCount.text = viewModel.totalCount.toString()
        binding.lifecycleOwner = this
        binding.myViewModel=viewModel

    }
}
