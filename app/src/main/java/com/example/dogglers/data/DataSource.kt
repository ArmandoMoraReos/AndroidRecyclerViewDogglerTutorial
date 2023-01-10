package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

class DataSource {

    fun loadDogs() : List<Dog>{
        return listOf(Dog(R.string.dog1, 2, R.string.hobbie1, R.drawable.bella),
            Dog(R.string.dog2, 3, R.string.hobbie2, R.drawable.faye),
            Dog(R.string.dog3, 4, R.string.hobbie3, R.drawable.frankie),
            Dog(R.string.dog4, 5, R.string.hobbie1, R.drawable.nox),
            Dog(R.string.dog5, 2, R.string.hobbie2, R.drawable.leroy),
            Dog(R.string.dog6, 2, R.string.hobbie3, R.drawable.tzeitel),)
    }
}