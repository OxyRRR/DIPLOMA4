package com.example.room1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.room.Room
import com.example.photosmine.databinding.FragmentAddPhotoBinding

class AddPhotoFragment: Fragment() {

    private lateinit var binding: FragmentAddPhotoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddPhotoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var db = Room.databaseBuilder(requireContext(), DbConnection::class.java, "db").build()
        var repository = PhotoRepository(db)
        var adapter = PhotoListAdapter()

        repository.photos.observe(viewLifecycleOwner) {
            adapter.updateList(it)
        }

        binding.AdRecyclerView.adapter = adapter
        binding.floatingActionButton.setOnClickListener {
//            val navHost = Navigation.findNavController(this, R.id.nav_host_fragment)
//            navHost.navigate(R.id.action_userListFragment_to_userCreatFragment)
           // Navigation.findNavController(it).navigate(R.id.action_dogListFragment_to_dogCreatFragment)
            Navigation.findNavController(it).navigate(R.id.action_addPhotoFragment_to_addPhotoFragment2)
        }
    }


}