package com.example.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(@StringRes val name : Int,
               val dogAge : Int,
               @StringRes val dogHobbies : Int,
               @DrawableRes val dogPicture : Int)