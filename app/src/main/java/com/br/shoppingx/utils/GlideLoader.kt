package com.br.shoppingx.utils

import android.content.Context
import android.widget.ImageView
import com.br.shoppingx.R
import com.bumptech.glide.Glide
import java.io.IOException

class GlideLoader(val context: Context) {

    fun loadUserPicture(image: Any, imageView: ImageView) {
        try {
            // Load the user image in the ImageView.
            Glide.with(context)
                    .load(image) // URI of the image
                    .centerCrop() // Scale type of the image.
                    .placeholder(R.drawable.blue_user) // A default place holder if image is failed to load.
                    .into(imageView) // the view  in which the image will be loaded.
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

}