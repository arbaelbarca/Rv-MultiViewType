package com.arbaelbarca.recyclerviewtype.presentation.ui.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.arbaelbarca.recyclerviewtype.R
import com.arbaelbarca.recyclerviewtype.adapter.AdapterListCustom
import com.arbaelbarca.recyclerviewtype.adapter.AdapterViewPagerImbal
import com.arbaelbarca.recyclerviewtype.adapter.AdapterViewPagerMain
import com.arbaelbarca.recyclerviewtype.baseapp.BaseFragmentBinding
import com.arbaelbarca.recyclerviewtype.databinding.FragmentImbalHasilBinding
import com.arbaelbarca.recyclerviewtype.datasource.local.DataList
import com.arbaelbarca.recyclerviewtype.datasource.local.Menus
import com.arbaelbarca.recyclerviewtype.utils.Constants
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_imbal_hasil.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ImbalHasilFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImbalHasilFragment : BaseFragmentBinding<FragmentImbalHasilBinding>() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var adapterListCustom: AdapterListCustom
    val mutableListData: MutableList<DataList> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentImbalHasilBinding
        get() = FragmentImbalHasilBinding::inflate

    override fun setupView(binding: FragmentImbalHasilBinding) {
        initial(binding)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ImbalHasilFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ImbalHasilFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun initial(binding: FragmentImbalHasilBinding) {
        initTabFragment(binding)
        Menus.setDataMenuTop(mutableListData)
        Menus.setDataMenu1(mutableListData)
        Menus.setDataMenu2(mutableListData)
        Menus.setDataMenu3(mutableListData)
        Menus.setDataMenu4(mutableListData)
        Menus.setDataMenu5(mutableListData)
        Menus.setDataMenu6(mutableListData)
        Menus.setDataMenu7(mutableListData)
        Menus.setDataMenuBottom(mutableListData)

        adapterListCustom = AdapterListCustom(mutableListData)
        binding.rvListData.apply {
            adapter = adapterListCustom
            layoutManager = LinearLayoutManager(requireContext())
            hasFixedSize()
        }

        setDataLineChart2()
    }

    private fun initTabFragment(binding: FragmentImbalHasilBinding) {
        val mutableListString: MutableList<String> = arrayListOf()
        mutableListString.addAll(listOf("Y1", "Y3", "5Y", "10Y", "12X", "1M", "2M", "10M"))
        val adapterViewPagerImbal = AdapterViewPagerImbal(mutableListString)

        binding.apply {
            rvFragmentImbal.apply {
                adapter = adapterViewPagerImbal
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                hasFixedSize()
            }
        }
    }


    private fun setDataLineChart2() {
        val kasus = ArrayList<Entry>()
        kasus.add(Entry(0F, 3f))
        kasus.add(Entry(1F, 6f))
        kasus.add(Entry(2F, 8f))
        kasus.add(Entry(3F, 10F))
        kasus.add(Entry(4F, 15F))

        val sembuh = ArrayList<Entry>()
        sembuh.add(Entry(0F, 7f))
        sembuh.add(Entry(1F, 10F))
        sembuh.add(Entry(2F, 20F))
        sembuh.add(Entry(3F, 11f))
        sembuh.add(Entry(4F, 40F))

        val meninggal = ArrayList<Entry>()
        meninggal.add(Entry(0F, 0F))
        meninggal.add(Entry(1F, 0F))
        meninggal.add(Entry(2F, 40F))
        meninggal.add(Entry(3F, 0F))
        meninggal.add(Entry(4F, 0F))

        val kasusLineDataSet = LineDataSet(kasus, "2.5%")
        kasusLineDataSet.mode = LineDataSet.Mode.CUBIC_BEZIER
        kasusLineDataSet.color =
            ContextCompat.getColor(requireContext(), R.color.text_color_blue_tua)
        kasusLineDataSet.circleRadius = 5f
        kasusLineDataSet.setCircleColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.text_color_blue_tua
            )
        )
//        kasusLineDataSet.enableDashedLine(10f, 5f, 0f)
//        kasusLineDataSet.enableDashedHighlightLine(10f, 5f, 0f)
        kasusLineDataSet.color = Color.DKGRAY
        kasusLineDataSet.setCircleColor(Color.DKGRAY)
        kasusLineDataSet.lineWidth = 1f
        kasusLineDataSet.circleRadius = 3f
        kasusLineDataSet.setDrawCircleHole(false)
        kasusLineDataSet.valueTextSize = 9f
//        kasusLineDataSet.setDrawFilled(true)
        kasusLineDataSet.formLineWidth = 1f
//        kasusLineDataSet.formLineDashEffect = DashPathEffect(floatArrayOf(10f, 5f), 0f)
        kasusLineDataSet.formSize = 15f

        val sembuhLineDataSet = LineDataSet(sembuh, "8.53%")
        sembuhLineDataSet.mode = LineDataSet.Mode.HORIZONTAL_BEZIER
        sembuhLineDataSet.color =
            ContextCompat.getColor(requireContext(), R.color.text_color_ungu_tua)
        sembuhLineDataSet.circleRadius = 5f
        sembuhLineDataSet.setCircleColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.text_color_ungu_tua
            )
        )

        val meninggalLineDataSet = LineDataSet(meninggal, "10%")
        meninggalLineDataSet.mode = LineDataSet.Mode.LINEAR
        meninggalLineDataSet.color =
            ContextCompat.getColor(requireContext(), R.color.text_color_green)
        meninggalLineDataSet.circleRadius = 5f
        meninggalLineDataSet.gradientColor
        meninggalLineDataSet.fillColor = 10
        meninggalLineDataSet.setCircleColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.text_color_green
            )
        )

//Setup Legend
        val legend = lineChartGrafik.legend
        legend.isEnabled = true
        legend.verticalAlignment = Legend.LegendVerticalAlignment.TOP
        legend.horizontalAlignment = Legend.LegendHorizontalAlignment.LEFT
        legend.orientation = Legend.LegendOrientation.HORIZONTAL
        legend.setDrawInside(false)

        setYAxis()
        lineChartGrafik.apply {
            description.isEnabled = false
            val xAxisLabels = listOf("Juli", "Okt", "Jan", "Aprl", "Jul")
            xAxis.valueFormatter = IndexAxisValueFormatter(xAxisLabels)
            xAxis.textSize = 10f
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            data = LineData(kasusLineDataSet, sembuhLineDataSet, meninggalLineDataSet)
            animate()
        }


    }

    private fun setYAxis() {
        val leftYAxis: YAxis = lineChartGrafik.axisRight
        leftYAxis.textColor = Color.BLACK //Set the font color of the left Y axis
        leftYAxis.textSize = 11f //Set the font size of the left Y axis
        //leftYAxis.setGridColor(Color.parseColor("#ff8b3d"));Set the color of grid lines
        //leftYAxis.setAxisMaximum(1000f);//Set the maximum value of Y axis
        leftYAxis.axisMinimum = 0f //Set the minimum value of Y axis to 0
        leftYAxis.setDrawGridLines(true) //Set a horizontal straight line from the Y axis
        leftYAxis.isGranularityEnabled = true
        leftYAxis.setDrawAxisLine(true) //Set the left Y axis display
        //leftYAxis.setDrawZeroLine(false);
        val rightYAxis: YAxis = lineChartGrafik.axisLeft
        rightYAxis.isEnabled = false //Set the right Y axis to hide
    }


}