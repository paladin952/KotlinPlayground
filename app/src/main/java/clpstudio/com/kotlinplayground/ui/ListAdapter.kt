package clpstudio.com.kotlinplayground.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import clpstudio.com.kotlinplayground.R

class ListAdapter() : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    var data: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val row = LayoutInflater.from(parent.context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(row)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    fun addAll(data: List<String>) {
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(itemData: String) {
            val titleText = itemView.findViewById<TextView>(R.id.title)
            titleText.text = itemData
        }
    }
}