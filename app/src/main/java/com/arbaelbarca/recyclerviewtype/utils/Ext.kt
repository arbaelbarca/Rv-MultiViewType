package com.arbaelbarca.recyclerviewtype.utils

import android.content.Context
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.arbaelbarca.recyclerviewtype.R


fun Toolbar.setToolbar(
    message: String?, context: Context,
    appCompatActivity: AppCompatActivity
) {
    appCompatActivity.setSupportActionBar(this)
    appCompatActivity.supportActionBar?.title = message
    appCompatActivity.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    this.setTitleTextColor(ContextCompat.getColor(context, R.color.black))
    this.setNavigationOnClickListener {
        appCompatActivity.finish()
    }
}


fun View.showView() {
    this.visibility = View.VISIBLE
}


fun View.hideView(view: View) {
    view.visibility = View.GONE
}
