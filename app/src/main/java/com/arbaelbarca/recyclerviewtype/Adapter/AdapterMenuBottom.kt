package com.arbaelbarca.recyclerviewtype.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenu
import kotlinx.android.synthetic.main.layout_item_listmenu.view.*

class AdapterMenuBottom(val dataMenuList: MutableList<DataMenu>) :
    RecyclerView.Adapter<AdapterMenuBottom.MyHolderDua>() {
    class MyHolderDua(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dataMenu: DataMenu) {
            itemView.apply {
                tvTitleMenuList.setBackgroundResource(dataMenu.drawable)
                tvTitleMenuList.text = dataMenu.text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolderDua {
        return MyHolderDua(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.layout_item_listmenu, parent, false
                )
        )
    }

    override fun getItemCount(): Int {
        return dataMenuList.size
    }

    override fun onBindViewHolder(holder: MyHolderDua, position: Int) {
        val dataMenu = dataMenuList[position]
        holder.bind(dataMenu)
    }
}