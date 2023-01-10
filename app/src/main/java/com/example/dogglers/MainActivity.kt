package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.dogglers.adapter.DoggiesAdapter
import com.example.dogglers.data.Datasource
import com.example.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi(){
        val listDog = Datasource().loadDogs()
        binding.doggiesRv.adapter = DoggiesAdapter(this, listDog)
        binding.doggiesRv.layoutManager = LinearLayoutManager(this)

    }
}