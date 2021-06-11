package com.arbaelbarca.recyclerviewtype.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.arbaelbarca.recyclerviewtype.MainActivity
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemMenuTabimbalhasilBinding
import com.arbaelbarca.recyclerviewtype.databinding.LayoutItemMenuTopBinding
import com.arbaelbarca.recyclerviewtype.presentation.ui.fragment.DanaKelolaanFragment
import com.arbaelbarca.recyclerviewtype.presentation.ui.fragment.ImbalHasilFragment
import com.arbaelbarca.recyclerviewtype.utils.showView
import java.lang.IllegalArgumentException

class AdapterViewPagerImbal(val mutableListString: MutableList<String>) :
    RecyclerView.Adapter<AdapterViewPagerImbal.Holder>() {

    class Holder(val binding: LayoutItemMenuTabimbalhasilBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) {
            binding.apply {
                tvTitleTabImbaHasil.text = text
                if (text.equals("5y", ignoreCase = true)) {
                    tvTitleTabImbaHasil.setTextColor(
                        ContextCompat.getColor(
                            itemView.context,
                            R.color.text_color_green
                        )
                    )
                    viewLineTitle.showView()
                }

            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Holder {
        val binding = LayoutItemMenuTabimbalhasilBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )

        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return mutableListString.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(mutableListString[position])
    }

}