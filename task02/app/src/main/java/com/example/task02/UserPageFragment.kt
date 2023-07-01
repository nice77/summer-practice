package com.example.task02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.task02.databinding.FragmentUserPageBinding

class UserPageFragment : Fragment(R.layout.fragment_user_page) {

    private var binding : FragmentUserPageBinding ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentUserPageBinding.bind(view)
        var user = findUser(arguments?.getInt("id")!!)
        println(user)
        binding?.run {
            tvTitle.text = user.name
            tvSubtitle.text = user.desc
            Glide.with(root)
                .load(user.url)
                .override(500, 500)
                .circleCrop()
                .into(imProfile)
        }
    }

    fun findUser(id : Int) : User {
        return UserRepository.list.filter { user -> user.id == id }.first()
    }
}