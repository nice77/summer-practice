package com.example.task02

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.task02.databinding.ItemUserBinding

class Useritem(private val binding: ItemUserBinding,
               private val onItemClick: (User) -> Unit
) : ViewHolder(binding.root) {
    fun onBind(user : User) {
        binding.run {
            tvTitle.text = user.name
            tvSubtitle.text = user.desc

            root.setOnClickListener {
                onItemClick(user)
            }
        }
    }
}
