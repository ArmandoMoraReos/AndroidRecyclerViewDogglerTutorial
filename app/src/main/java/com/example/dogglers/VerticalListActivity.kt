package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dogglers.adapter.DoggiesAdapter
import com.example.dogglers.const.LayoutConst
import com.example.dogglers.data.DataSource
import com.example.dogglers.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter =
            DoggiesAdapter(this, DataSource().loadDogs(), LayoutConst.VERTICAL)
        binding.verticalRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}