package com.arbaelbarca.recyclerviewtype.datasource.local

import com.arbaelbarca.recyclerviewtype.Adapter.AdapterListCustom
import com.arbaelbarca.recyclerviewtype.R

class Menus {
    companion object {
        var dataListMenu: MutableList<DataMenu>? = null
        var dataListMenuTop: MutableList<DataMenuTop>? = null

        fun setDataMenu1(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu("Saham", R.drawable.bg_rounded_grenn),
                    DataMenu("Pasar Uang", R.drawable.bg_rounded_ungu),
                    DataMenu("Saham", R.drawable.bg_rounded_bluenavy)
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER,
                    "Jenis reksa dana", null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu, null
                )
            )

            return mutableListData
        }


        fun setDataMenu2(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu("5,50% / 5 thn", R.drawable.bg_rounded_grenn),
                    DataMenu("6,29% / thn", R.drawable.bg_rounded_ungu),
                    DataMenu("6,29% / thn", R.drawable.bg_rounded_bluenavy)
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER,
                    "Imbal hasil",
                    null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu, null
                )
            )

            return mutableListData

        }

        fun setDataMenu3(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu("jejeje", R.drawable.bg_rounded_grenn),
                    DataMenu("cakepss", R.drawable.bg_rounded_ungu),
                    DataMenu("6,29% / thn", R.drawable.bg_rounded_bluenavy)
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER, "Dana kelolaan", null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu, null
                )
            )

            return mutableListData
        }

        fun setDataMenu4(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu(
                        "1 Juta",
                        R.drawable.bg_rounded_grenn
                    ), DataMenu(
                        "100 Ribu",
                        R.drawable.bg_rounded_ungu
                    ), DataMenu(
                        "100 Ribu",
                        R.drawable.bg_rounded_bluenavy
                    )
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER, "Min. Pembelian", null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu, null
                )
            )
            return mutableListData
        }


        fun setDataMenu5(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu(
                        "5 Tahun",
                        R.drawable.bg_rounded_grenn
                    ), DataMenu(
                        "10 Tahun",
                        R.drawable.bg_rounded_ungu
                    ), DataMenu(
                        "20 Tahun",
                        R.drawable.bg_rounded_bluenavy
                    )
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER, "Jangka Waktu", null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu, null
                )
            )
            return mutableListData
        }

        fun setDataMenuTop(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenuTop = ArrayList()
            dataListMenuTop?.addAll(
                listOf(
                    DataMenuTop(
                        "BNI-AM Inspiring Equity Fund",
                        R.drawable.bg_rounded_grenn,
                        R.drawable.bni
                    ), DataMenuTop(
                        "Cipta Dana Cash",
                        R.drawable.bg_rounded_ungu,
                        R.drawable.ciptadana
                    ), DataMenuTop(
                        "Ascend Reksa Dana Saham Eq...",
                        R.drawable.bg_rounded_bluenavy,
                        R.drawable.ascend
                    )
                )
            )

            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU_TOP,
                    "",
                    null,
                    dataListMenuTop
                )
            )
            return mutableListData
        }

        fun setDataMenu7(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu(
                        "16 Apr 2014",
                        R.drawable.bg_rounded_grenn
                    ), DataMenu(
                        "14 Jan 2006",
                        R.drawable.bg_rounded_ungu
                    ), DataMenu(
                        "20 Feb 2007",
                        R.drawable.bg_rounded_bluenavy
                    )
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER, "Peluncuran", null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu,
                    null
                )
            )

            return mutableListData
        }

        fun setDataMenu6(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu(
                        "Tinggi",
                        R.drawable.bg_rounded_grenn
                    ), DataMenu(
                        "Rendah",
                        R.drawable.bg_rounded_ungu
                    ), DataMenu(
                        "Jauh",
                        R.drawable.bg_rounded_bluenavy
                    )
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_HEADER, "Tingkat Resiko", null, null
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "",
                    dataListMenu, null
                )
            )
            return mutableListData
        }

        fun setDataMenuBottom(
            mutableListData: MutableList<DataList>? = null
        ): MutableList<DataList>? {
            dataListMenu = ArrayList()
            dataListMenu?.addAll(
                listOf(
                    DataMenu(
                        "Detail",
                        R.drawable.bg_rounded_green_line
                    ), DataMenu(
                        "Detail",
                        R.drawable.bg_rounded_green_line
                    ), DataMenu(
                        "Detail",
                        R.drawable.bg_rounded_green_line
                    ), DataMenu(
                        "Beli",
                        R.drawable.bg_rounded_green_container
                    ), DataMenu(
                        "Beli",
                        R.drawable.bg_rounded_green_container
                    ), DataMenu(
                        "Beli",
                        R.drawable.bg_rounded_green_container
                    )
                )
            )
            mutableListData?.add(
                DataList(
                    AdapterListCustom.ITEM_MENU,
                    "sedunia 1",
                    dataListMenu, null
                )
            )
            return mutableListData
        }


    }


}