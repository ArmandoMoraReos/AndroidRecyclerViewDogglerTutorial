package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DoggiesAdapter
import com.example.dogglers.const.LayoutConst
import com.example.dogglers.data.DataSource
import com.example.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    lateinit var binding : ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.gridRecyclerView.adapter = DoggiesAdapter(this, DataSource().loadDogs(), LayoutConst.GRID)
        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}