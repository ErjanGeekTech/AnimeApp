package com.example.animeapp.extensions

import android.app.Activity
import android.widget.Toast

fun Activity.showText(text: String){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}