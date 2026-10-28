package com.example.disasterapp.com.example.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.Disaster
import com.example.disasterapp.databinding.ItemDisasterBinding
typealias OnClickDisaster = (Disaster) -> Unit

class DisasterAdapter(
    private val listDisaster: List<Disaster>,
    private val onClickDisaster: OnClickDisaster
) : RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemDisasterViewHolder {
        val binding = ItemDisasterBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemDisasterViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemDisasterViewHolder,
        position: Int
    ) {
        holder.bind(listDisaster[position])
    }

    override fun getItemCount(): Int {
        return listDisaster.size
    }

    // Inner class yang digunakan untuk mengatur data
    // yang ditampilkan pada setiap item
    inner class ItemDisasterViewHolder(
        private val binding: ItemDisasterBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Disaster){
            with(binding){
                imgDisaster.setImageResource(data.imageDisaster)

                txtDisasterName.text = data.nameDisaster
                txtDisasterType.text = data.disasterType

                itemView.setOnClickListener {
                    onClickDisaster(data)
                }
            }
        }
    }
}