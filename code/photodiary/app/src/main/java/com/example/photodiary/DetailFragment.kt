package com.example.photodiary.ui.detail

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.photodiary.R
import com.example.photodiary.databinding.FragmentDetailBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        // Set the text in TextView
        binding.detailTextView.text = "On a beautiful day, I took this amazing picture of the sun! It was really inspiring for some reason.."

        // Set the image in ImageView (for example, you could set a static image or from your app's data)
        binding.detailImageView.setImageResource(R.drawable.sample_image)  // Use your image resource

        return binding.root
    }
}
