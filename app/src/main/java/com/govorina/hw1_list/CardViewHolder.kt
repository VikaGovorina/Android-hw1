package com.govorina.hw1_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CardViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val image = view.findViewById<ImageView>(R.id.image_view)
    val text = view.findViewById<TextView>(R.id.text_1)

    fun bind(num: Int) {
        text.text = "$num"
        if (num % 2 == 0) {
            image.setBackgroundResource(R.color.red)
        } else {
            image.setBackgroundResource(R.color.blue)
        }
    }
}