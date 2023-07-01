package com.example.task02

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task02.databinding.ItemUserBinding

class UserAdapter(
    private var list: List<User>,
    private val onItemClick: (User) -> Unit
) : RecyclerView.Adapter<Useritem>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Useritem {
        return Useritem(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ),
            onItemClick = onItemClick
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Useritem, position: Int) {
        holder.onBind(list[position])
    }
}