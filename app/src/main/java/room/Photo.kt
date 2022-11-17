package com.example.room1.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photo")

data class Photo(var number: String, var theme: String,){

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}