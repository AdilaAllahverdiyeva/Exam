package com.example.exam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList: List<Customer>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item1 = itemList[position]
        holder.bind(item1)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Customer) {
            val image = itemView.findViewById<ImageView>(R.id.avatar)
            val title = itemView.findViewById<TextView>(R.id.title)
            val address = itemView.findViewById<TextView>(R.id.address)

            title.text = item.title
            address.text = item.address



        }
    }
}