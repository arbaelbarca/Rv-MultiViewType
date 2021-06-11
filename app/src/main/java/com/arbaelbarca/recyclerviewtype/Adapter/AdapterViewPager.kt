package com.arbaelbarca.recyclerviewtype.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.arbaelbarca.recyclerviewtype.MainActivity
import com.arbaelbarca.recyclerviewtype.presentation.ui.fragment.DanaKelolaanFragment
import com.arbaelbarca.recyclerviewtype.presentation.ui.fragment.ImbalHasilFragment

class AdapterViewPager(val mutableList: Array<String>, mainActivity: MainActivity) :
    FragmentStateAdapter(mainActivity) {
    override fun getItemCount(): Int {
        return mutableList.size
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ImbalHasilFragment()
            }
            1 -> {
                DanaKelolaanFragment()
            }
            else -> throw IllegalArgumentException("Undefined view type")
        }
    }
}