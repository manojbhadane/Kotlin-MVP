package com.manojbhadane.kotlinmvpdemo.Dashboard

import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.TextView
import com.manojbhadane.kotlinmvpdemo.BaseActivity
import com.manojbhadane.kotlinmvpdemo.R

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
class DashBoardActivity : BaseActivity() {

    lateinit var mTxt: TextView

    override fun getLayoutResId(): Int {
        return R.layout.activity_dashboard;
    }

    override fun init() {

        var toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        mTxt = findViewById(R.id.textView) as TextView
        mTxt.text = "Manoj Bhadane"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}