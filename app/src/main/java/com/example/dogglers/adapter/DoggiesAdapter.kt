package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dog

class DoggiesAdapter(private val context : Context, private val dogList : List<Dog>)
    : RecyclerView.Adapter<DoggiesAdapter.DoggiesViewHolder>()  {

    class DoggiesViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val dogPicture = view.findViewById<ImageView>(R.id.dog_picture)
        val dogName = view.findViewById<TextView>(R.id.dog_name)
        val dogAge = view.findViewById<TextView>(R.id.dog_age)
        val dogHobbie = view.findViewById<TextView>(R.id.dog_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoggiesViewHolder {
       val layout = LayoutInflater.from(context).inflate(R.layout.vertical_horizontal_list_item,
           parent, false)
        return DoggiesViewHolder(layout)
    }

    override fun onBindViewHolder(holder: DoggiesViewHolder, position: Int) {
        val item = dogList[position]
        holder.dogPicture.setImageResource(item.dogPicture)
        holder.dogName.text = context.resources.getString(item.name)
        holder.dogAge.text = item.dogAge.toString()
        holder.dogHobbie.text = item.dogHobbies.toString()
    }

    override fun getItemCount() = dogList.size

}