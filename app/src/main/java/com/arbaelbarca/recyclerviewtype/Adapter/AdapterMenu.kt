package com.arbaelbarca.recyclerviewtype.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenu
import kotlinx.android.synthetic.main.layout_item_listmenu.view.*

class AdapterMenu(val dataListMenu: List<DataMenu>) : RecyclerView.Adapter<AdapterMenu.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dataMenu: DataMenu) {
            itemView.apply {
                tvTitleMenuList.setBackgroundResource(dataMenu.drawable)
                tvTitleMenuList.text = dataMenu.text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_item_listmenu, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataListMenu.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val dataMenuItem = dataListMenu[position]
        holder.bind(dataMenuItem)
    }
}