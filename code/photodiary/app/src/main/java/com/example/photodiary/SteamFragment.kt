package com.example.photodiary

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StreamFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_stream, container, false)

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerViewStream)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Set up the RecyclerView with an empty list and onItemClick callback
        val photoList = emptyList<Photo>()

        recyclerView.adapter = PhotoAdapter(photoList) { photo ->
            // Handle item click (log the photo description)
            Log.d("StreamFragment", "Item clicked: ${photo.description}")
        }

        return view
    }
}
