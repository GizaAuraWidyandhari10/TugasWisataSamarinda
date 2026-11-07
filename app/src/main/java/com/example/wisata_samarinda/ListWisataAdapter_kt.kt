
package com.example.wisata_samarinda

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wisata_samarinda.databinding.ItemRowWisataBinding

class ListWisataAdapter(
    private val listWisata: ArrayList<Wisata>
) : RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {

    inner class ListViewHolder(
        var binding: ItemRowWisataBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val binding = ItemRowWisataBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    override fun onBindViewHolder(
        holder: ListViewHolder,
        position: Int
    ) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemName.text = wisata.name
        holder.binding.tvItemDescription.text = wisata.description
    }
}
