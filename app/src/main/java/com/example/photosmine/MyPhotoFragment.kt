package com.example.photosmine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class MyPhotoFragment : Fragment() {

    lateinit var btnAdd1: Button
    lateinit var btnAdd2: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_my_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAdd1 = view.findViewById(R.id.btn_add1)
        btnAdd2 = view.findViewById(R.id.btn_add2)

        btnAdd1.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_myPhotoFragment_to_addPhotoFragment)
        }

        btnAdd2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_myPhotoFragment_to_mainActivity)
        }
    }
}