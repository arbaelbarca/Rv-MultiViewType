package com.arbaelbarca.recyclerviewtype.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.datasource.local.DataList
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenu
import com.arbaelbarca.recyclerviewtype.datasource.local.DataMenuTop
import kotlinx.android.synthetic.main.layout_item_header.view.*
import kotlinx.android.synthetic.main.layout_item_menu.view.*

class AdapterListCustom(
    val dataList: MutableList<DataList>
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        val ITEM_HEADER = 0
        val ITEM_MENU = 1
        val ITEM_MENU_BOTTOM = 3
        val ITEM_MENU_TOP = 2
    }

    override fun getItemViewType(position: Int): Int {
        return dataList[position].viewType
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ITEM_MENU_TOP -> {
                return MenuViewHolderTop(
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.layout_item_menu,
                        parent, false
                    )
                )
            }
            ITEM_HEADER -> {
                return HeaderViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.layout_item_header,
                        parent, false
                    )
                )
            }
            ITEM_MENU_BOTTOM -> {
                return MenuViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                        R.layout.layout_item_menu,
                        parent, false
                    )
                )
            }
            ITEM_MENU -> MenuViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_item_menu,
                    parent, false
                )
            )
            else -> throw throw IllegalArgumentException("Undefined view type")
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val dataItem = dataList[position]
        if (dataItem.viewType == ITEM_HEADER) {
            val holderView = holder as HeaderViewHolder
            val data = dataList[position]
            holderView.bindHeader(data)
        } else if (dataItem.viewType == ITEM_MENU_BOTTOM) {
            val holderView = holder as MenuViewHolderDua
            val dataMenu = dataList[position].dataMenu
            holderView.bindMenu(dataMenu!!)
        } else if (dataItem.viewType == ITEM_MENU_TOP) {
            val holderView = holder as MenuViewHolderTop
            val dataMenu = dataList[position].dataMenuTop
            holderView.bindMenu(dataMenu!!)
        } else {
            val holderView = holder as MenuViewHolder
            val dataMenu = dataList[position].dataMenu
            dataMenu?.let { holderView.bindMenu(it) }
        }
    }

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindHeader(dataList: DataList) {
            val text = dataList.text
            itemView.apply {
                tvHeader.text = text
            }
        }
    }


    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindMenu(dataListMenu: MutableList<DataMenu>) {
            val adapterMenu = AdapterMenu(dataListMenu)
            itemView.apply {
                rvListMenu.apply {
                    adapter = adapterMenu
                    layoutManager = GridLayoutManager(itemView.context, 3)
                    hasFixedSize()
                }
            }


        }
    }

    class MenuViewHolderDua(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindMenu(dataListMenu: MutableList<DataMenu>) {
            val adapterMenu = AdapterMenuBottom(dataListMenu)
            itemView.apply {
                rvListMenu.apply {
                    adapter = adapterMenu
                    layoutManager = GridLayoutManager(itemView.context, 3)
                    hasFixedSize()
                }
            }
        }
    }


    class MenuViewHolderTop(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindMenu(dataListMenu: MutableList<DataMenuTop>) {
            val adapterMenu = AdapterMenuTop(dataListMenu)
            itemView.apply {
                rvListMenu.apply {
                    adapter = adapterMenu
                    layoutManager = GridLayoutManager(itemView.context, 3)
                    hasFixedSize()
                }
            }
        }
    }
}