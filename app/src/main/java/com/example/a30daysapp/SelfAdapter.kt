package com.example.a30daysapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter now accepts a Context and a List<Day>
class SelfAdapter(private val context: Context, private val days: List<Day>) :
    RecyclerView.Adapter<SelfAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Use context to inflate the layout
        val view = LayoutInflater.from(context).inflate(R.layout.item_tip, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val day = days[position] // Access the days list
        holder.dayIndicator.text = "Day ${day.number}"
        holder.header.text = day.title
        holder.image.setImageResource(day.imageResId) // Set image resource
        holder.caption.text = day.description
    }

    override fun getItemCount(): Int {
        return days.size // Return the size of the days list
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayIndicator: TextView = itemView.findViewById(R.id.dayNumber)
        val header: TextView = itemView.findViewById(R.id.tipTitle)
        val image: ImageView = itemView.findViewById(R.id.tipImage)
        val caption: TextView = itemView.findViewById(R.id.tipDescription)
    }
}
