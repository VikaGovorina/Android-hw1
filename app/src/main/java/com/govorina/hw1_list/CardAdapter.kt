package com.govorina.hw1_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardAdapter() : RecyclerView.Adapter<CardViewHolder>(){
    private val numberList = ArrayList<Int>()
    private var is_even = true

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        return CardViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false), this)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(numberList[position], is_even)
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    fun setItems(list: ArrayList<Int>) {
        numberList.clear()
        numberList.addAll(list)
        notifyDataSetChanged()
    }

    fun addItems(item: Int) {  
        numberList.add(item)
        notifyDataSetChanged() 
    }

    fun getItems(): ArrayList<Int> {
        return numberList
    }

    fun color_change() {
        is_even = !is_even
        notifyDataSetChanged()
    }

    fun set_is_even(f: Boolean) {
        is_even = f
        notifyDataSetChanged()
    }

    fun get_is_even() : Boolean {
        return is_even
    }

}
