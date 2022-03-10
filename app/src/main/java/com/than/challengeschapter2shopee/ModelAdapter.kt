package com.than.challengeschapter2shopee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ModelAdapter(
    val context: Context,
    val list: List<Int>

) : RecyclerView.Adapter<ModelAdapter.ModelViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_model, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {

        Glide.with(context).load(list[position]).into(holder.img)

    }

    class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById(R.id.imgModel) as ImageView
    }
}