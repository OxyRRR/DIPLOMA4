package com.example.room1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.room.Room
import com.example.photosmine.databinding.FragmentAddPhoto2Binding

import com.example.photosmine.room.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import com.example.photosmine.room.DbConnection
import com.example.photosmine.room.Photo
import com.example.photosmine.room.PhotoRepository

class AddPhotoFragment2: Fragment() {

    private lateinit var binding: FragmentAddPhoto2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddPhoto2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var db = Room.databaseBuilder(requireContext(), DbConnection::class.java, "db" ).build()
        var repository = PhotoRepository(db)


        binding.button.setOnClickListener {
            var name = binding.editTextTextPersonName.text.toString()
            var theme = binding.editTextTextPassword.text.toString()

            GlobalScope.launch {
                repository.incert(Photo(name, theme))
            }

            Navigation.findNavController(it)
                .navigate(R.id.action_addPhotoFragment2_to_addPhotoFragment)


        }
    }
}

