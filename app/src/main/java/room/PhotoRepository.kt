package com.example.room1.room

import androidx.lifecycle.LiveData

class PhotoRepository (var database: DbConnection) {
   var photos: LiveData<List<Photo>> = database.photoDao().getAll()

    fun getAll(): LiveData<List<Photo>> {
        return photos
    }

        suspend fun insert(photo: Photo) {
        database.photoDao().insert(photo)
        }

   suspend fun delete(photo: Photo) {
       database.photoDao().delete(photo)
   }


}