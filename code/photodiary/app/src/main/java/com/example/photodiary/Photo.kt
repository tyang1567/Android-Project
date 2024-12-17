package com.example.photodiary

import android.graphics.Bitmap

data class Photo(
    val imageBitmap: Bitmap,   // Bitmap image for the photo
    val description: String    // Description of the photo
)
