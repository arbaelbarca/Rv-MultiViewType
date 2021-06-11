package com.arbaelbarca.recyclerviewtype

import android.view.LayoutInflater
import com.arbaelbarca.recyclerviewtype.adapter.AdapterViewPagerMain
import com.arbaelbarca.recyclerviewtype.baseapp.BaseActivityBinding
import com.arbaelbarca.recyclerviewtype.databinding.ActivityMainBinding
import com.arbaelbarca.recyclerviewtype.utils.Constants
import com.arbaelbarca.recyclerviewtype.utils.setToolbar
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : BaseActivityBinding<ActivityMainBinding>() {
    private fun initial(binding: ActivityMainBinding) {
        binding.toolbar.setToolbar("Perbandingan", this, this)
        val adapterViewPagerPaket = AdapterViewPagerMain(Constants.titlesTabMain, this)
        binding.viewPager2Fragment.adapter = adapterViewPagerPaket
        TabLayoutMediator(binding.tabFragment, binding.viewPager2Fragment,
            TabLayoutMediator.TabConfigurationStrategy { tab: TabLayout.Tab, position: Int ->
                tab.text = Constants.titlesTabMain[position]
            }
        ).attach()
    }

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun setupView(binding: ActivityMainBinding) {
        initial(binding)
    }

}