package com.example.testapplication2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication2.databinding.ItemDogBinding
import com.example.testapplication2.models.DogWithBreeds

class DogAdapter(
    private val onClick: (dog: DogWithBreeds) -> Unit,
) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    private val dogsList = mutableListOf<DogWithBreeds>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        return DogViewHolder(ItemDogBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false)).also { dogViewHolder ->
            dogViewHolder.itemView.setOnClickListener {
                onClick.invoke(dogsList[dogViewHolder.adapterPosition])
            }
        }
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.bind(dogsList[position])
    }

    override fun getItemCount() = dogsList.size

    fun submitList(dogs: List<DogWithBreeds>) {
        dogsList.clear()
        dogsList.addAll(dogs)
        notifyDataSetChanged()
    }


    class DogViewHolder(private val binding: ItemDogBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dog: DogWithBreeds) = with(binding) {
            this.tvName.text = dog.dogName
        }
    }
}