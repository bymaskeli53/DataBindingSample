package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setAdapter()


    }
    private fun setAdapter() {
        val todoList = listOf<Todo>(Todo("Read book","29.12.2022"),Todo("go to gym","always"))
        val adapter = TodoAdapter(todoList)
        binding.recyclerview.adapter = adapter
    }
}