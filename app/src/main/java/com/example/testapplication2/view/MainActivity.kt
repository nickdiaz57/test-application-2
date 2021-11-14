package com.example.testapplication2.view

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplication2.R
import com.example.testapplication2.databinding.ActivityMainBinding
import com.example.testapplication2.testmodels.Dog
import com.example.testapplication2.utils.Resource
import com.example.testapplication2.viewmodel.DogViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}