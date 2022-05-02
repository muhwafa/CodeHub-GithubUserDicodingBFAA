package com.mikirinkode.codehub.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mikirinkode.codehub.data.source.remote.responses.UserResponse
import com.mikirinkode.codehub.databinding.ItemUserBinding

//class SearchResultAdapter : RecyclerView.Adapter<SearchResultAdapter.UserViewHolder>() {
//
//    private val list = ArrayList<UserResponse>()
//    private var onItemClickCallback: OnItemClickCallback? = null
//
//    fun setList(users: ArrayList<UserResponse>) {
//        list.clear()
//        list.addAll(users)
//        notifyDataSetChanged()
//    }
//
//    fun clearList(){
//        list.clear()
//    }
//
//    inner class UserViewHolder(private val binding: ItemUserBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        fun bind(user: UserResponse) {
//
//            binding.apply {
//                root.setOnClickListener {
//                    onItemClickCallback?.onItemClicked(user)
//                }
//
//                Glide.with(itemView)
//                    .load(user.avatarUrl)
//                    .centerCrop()
//                    .into(ivItemProfile)
//                tvItemUsername.text = user.username
//                tvItemUserUrl.text = user.htmlUrl
//
//
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
//        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return UserViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
//
//        holder.bind(list[position])
//    }
//
//    override fun getItemCount(): Int = list.size
//
//
//    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
//
//        this.onItemClickCallback = onItemClickCallback
//    }
//
//    interface OnItemClickCallback {
//        fun onItemClicked(data: UserResponse)
//    }
//}