package com.example.photosmine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class MenuFragment : Fragment() {

    lateinit var btnMenu1: Button
    lateinit var btnMenu2: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnMenu1 = view.findViewById(R.id.btn_menu1)
        btnMenu2 = view.findViewById(R.id.btn_menu2)

        btnMenu1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_photosFragment)
        }

        btnMenu2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_menuFragment_to_myPhotoFragment)
        }

    }
}