package com.example.testapplication2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication2.databinding.ItemDogBinding
import com.example.testapplication2.testmodels.Dog

class DogAdapter (
    private val dogList: MutableList<Dog> = mutableListOf()
        ) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = DogViewHolder.getInstance(parent)

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.loadDog(dogList[position])
    }

    override fun getItemCount() = dogList.size

    fun updateList(dogs: List<Dog>) {
        if (dogs.lastOrNull() != dogList.lastOrNull()) {
            val positionStart = dogList.size
            dogList.addAll(dogs)
            notifyItemRangeInserted(positionStart, dogs.size)
        }
    }

    fun clear() {
        val listSize = dogList.size
        dogList.clear()
        notifyItemRangeRemoved(0, listSize)
    }


    class DogViewHolder(
        private val binding: ItemDogBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun loadDog(dog: Dog) = with(binding) {
            tvName.text = dog.name
        }

        companion object {
            fun getInstance(parent: ViewGroup): DogViewHolder {
                val binding = ItemDogBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                return DogViewHolder(binding)
            }
        }
    }
}