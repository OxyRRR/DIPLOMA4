package com.example.room1.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Photo::class], version = 1)
abstract class DbConnection: RoomDatabase(){

    abstract fun photoDao(): PhotoDao
}