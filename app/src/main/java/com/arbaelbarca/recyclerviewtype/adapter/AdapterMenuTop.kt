package com.arbaelbarca.recyclerviewtype.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemMenuTopBinding
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenuTop
import kotlinx.android.synthetic.main.layout_item_menu_top.view.*

class AdapterMenuTop(val dataMenuList: MutableList<DataMenuTop>) :
    RecyclerView.Adapter<AdapterMenuTop.MyHolderTop>() {
    class MyHolderTop(val layoutItemMenuTopBinding: LayoutItemMenuTopBinding) :
        RecyclerView.ViewHolder(layoutItemMenuTopBinding.root) {
        fun bind(dataMenu: DataMenuTop) {
            itemView.apply {
                layoutItemMenuTopBinding.apply {
                    llBgMenuTop.setBackgroundResource(dataMenu.background)
                    imgMenuTop.setBackgroundResource(dataMenu.drawable)
                    tvTitleMenuTop.text = dataMenu.text
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolderTop {
        val binding = LayoutItemMenuTopBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )

        return MyHolderTop(binding)
    }

    override fun getItemCount(): Int {
        return dataMenuList.size
    }

    override fun onBindViewHolder(holder: MyHolderTop, position: Int) {
        val dataMenu = dataMenuList[position]
        holder.bind(dataMenu)
    }
}