package com.example.room1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.photosmine.databinding.PhotoItemsBinding
import com.example.room1.room.Photo

class PhotoListAdapter: RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {

   var photos: List<Photo> = mutableListOf()

  fun updateList(photos: List<Photo>){
      this.photos = photos
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding: PhotoListAdapter = PhotoItemsBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.photos = photos[position]
    }

    override fun getItemCount(): Int {
        return photos.size
    }
}