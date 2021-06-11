package com.arbaelbarca.recyclerviewtype.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemListmenuBinding
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemMenuBinding
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenu
import kotlinx.android.synthetic.main.layout_item_listmenu.view.*

class AdapterMenuBottom(val dataMenuList: MutableList<DataMenu>) :
    RecyclerView.Adapter<AdapterMenuBottom.MyHolderDua>() {
    class MyHolderDua(val binding: LayoutItemListmenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(dataMenu: DataMenu) {
            itemView.apply {
                binding.apply {
                    tvTitleMenuList.setBackgroundResource(dataMenu.drawable)
                    tvTitleMenuList.text = dataMenu.text
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolderDua {
        val binding = LayoutItemListmenuBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )

        return MyHolderDua(binding)
    }

    override fun getItemCount(): Int {
        return dataMenuList.size
    }

    override fun onBindViewHolder(holder: MyHolderDua, position: Int) {
        val dataMenu = dataMenuList[position]
        holder.bind(dataMenu)
    }
}