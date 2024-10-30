package com.govorina.hw1_list

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CardViewHolder(view: View, adapter: CardAdapter) : RecyclerView.ViewHolder(view){
    val image = view.findViewById<ImageView>(R.id.image_view)
    val text = view.findViewById<TextView>(R.id.text_1)

    init {
        view.setOnClickListener {
            adapter.color_change()
        }
    }

    fun bind(num: Int, is_even: Boolean) {
        text.text = "$num"
        if (is_even) {
            image.setBackgroundResource(if (num % 2 == 0) R.color.red else R.color.blue)
        } else {
            image.setBackgroundResource(if (num % 2 == 0) R.color.blue else R.color.red)
        }
    }
}