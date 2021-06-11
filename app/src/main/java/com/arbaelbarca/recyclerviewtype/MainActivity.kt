package com.arbaelbarca.recyclerviewtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arbaelbarca.recyclerviewtype.Adapter.AdapterViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val titles =
        arrayOf("Imbal hasil", "Dana Kelolaan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initial()
    }

    private fun initial() {
        val adapterViewPagerPaket = AdapterViewPager(titles, this)
        viewPager2Fragment.adapter = adapterViewPagerPaket
        TabLayoutMediator(tabFragment, viewPager2Fragment,
            TabLayoutMediator.TabConfigurationStrategy { tab: TabLayout.Tab, position: Int ->
                tab.text = titles[position]
            }
        ).attach()
    }

}