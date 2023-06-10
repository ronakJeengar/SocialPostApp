package com.ronakj.socially

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ronakj.socially.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        binding?.fab?.setOnClickListener{

        }

    }
}