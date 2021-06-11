package com.arbaelbarca.recyclerviewtype.adapter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.arbaelbarca.recyclerviewtype.MainActivity
import com.arbaelbarca.recyclerviewtype.presentation.ui.fragment.DanaKelolaanFragment
import com.arbaelbarca.recyclerviewtype.presentation.ui.fragment.ImbalHasilFragment

class AdapterViewPagerMain(val mutableList: Array<String>, activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {
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