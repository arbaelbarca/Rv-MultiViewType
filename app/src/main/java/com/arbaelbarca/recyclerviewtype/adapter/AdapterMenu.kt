package com.arbaelbarca.recyclerviewtype.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemListmenuBinding
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemMenuBinding
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenu
import kotlinx.android.synthetic.main.layout_item_listmenu.view.*

class AdapterMenu(val dataListMenu: List<DataMenu>) : RecyclerView.Adapter<AdapterMenu.MyHolder>() {
    class MyHolder(val layoutItemMenuBinding: LayoutItemListmenuBinding) :
        RecyclerView.ViewHolder(layoutItemMenuBinding.root) {
        fun bind(dataMenu: DataMenu) {
            itemView.apply {
                layoutItemMenuBinding.apply {
                    tvTitleMenuList.setBackgroundResource(dataMenu.drawable)
                    tvTitleMenuList.text = dataMenu.text
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val binding = LayoutItemListmenuBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )

        return MyHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataListMenu.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val dataMenuItem = dataListMenu[position]
        holder.bind(dataMenuItem)
    }
}