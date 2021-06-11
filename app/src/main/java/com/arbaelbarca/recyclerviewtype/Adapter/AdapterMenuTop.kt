package com.arbaelbarca.recyclerviewtype.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenu
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenuTop
import kotlinx.android.synthetic.main.layout_item_menu_top.view.*

class AdapterMenuTop(val dataMenuList: MutableList<DataMenuTop>) :
    RecyclerView.Adapter<AdapterMenuTop.MyHolderTop>() {
    class MyHolderTop(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dataMenu: DataMenuTop) {
            itemView.apply {
                llBgMenuTop.setBackgroundResource(dataMenu.background)
                imgMenuTop.setBackgroundResource(dataMenu.drawable)
                tvTitleMenuTop.text = dataMenu.text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolderTop {
        return MyHolderTop(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.layout_item_menu_top, parent, false
                )
        )
    }

    override fun getItemCount(): Int {
        return dataMenuList.size
    }

    override fun onBindViewHolder(holder: MyHolderTop, position: Int) {
        val dataMenu = dataMenuList[position]
        holder.bind(dataMenu)
    }
}