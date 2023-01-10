package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DoggiesAdapter
import com.example.dogglers.const.LayoutConst
import com.example.dogglers.data.DataSource
import com.example.dogglers.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {
    lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter =
            DoggiesAdapter(this, DataSource().loadDogs(), LayoutConst.HORIZONTAL)
        binding.horizontalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}