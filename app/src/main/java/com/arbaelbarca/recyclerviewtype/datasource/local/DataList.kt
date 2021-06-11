package com.arbaelbarca.recyclerviewtype.datasource.local

class DataList(
    val viewType: Int, val text: String,
    val dataMenu: MutableList<DataMenu>?,
    val dataMenuTop: MutableList<DataMenuTop>?
)

class DataMenu(val text: String, val drawable: Int)

class DataMenuTop(val text: String, val background: Int, val drawable: Int)
