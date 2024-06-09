package com.example.materialdesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarouselAdapter(private val items: List<CarouselItem>) : RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    data class CarouselItem(val imageResId: Int, val text: String)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_carousel, parent, false)
        return CarouselViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        val item = items[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.textView.text = item.text
    }

    override fun getItemCount(): Int = items.size

    class CarouselViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}
