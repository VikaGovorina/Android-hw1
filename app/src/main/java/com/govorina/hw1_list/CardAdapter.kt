package com.govorina.hw1_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardAdapter() : RecyclerView.Adapter<CardViewHolder>(){
    private val numberList = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(numberList[position])
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

}
