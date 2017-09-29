package com.manojbhadane.kotlinmvpdemo.activity.dashboard

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.manojbhadane.kotlinmvpdemo.activity.anagramGame.AnagramActivity
import com.manojbhadane.kotlinmvpdemo.activity.BaseActivity
import com.manojbhadane.kotlinmvpdemo.listener.RecyclerViewClickListener
import com.manojbhadane.kotlinmvpdemo.model.MyData
import com.manojbhadane.kotlinmvpdemo.R
import com.manojbhadane.kotlinmvpdemo.adapter.RecyclerViewAdapter

/**
 * Created by manoj.bhadane on 26-09-2017.
 */
class DashBoardActivity : BaseActivity(), DashBoardView {

    lateinit var mTxt: TextView
    lateinit var mRecyclerView: RecyclerView

    private var presenter: DashBoardPresenterImpl? = null

    override fun getLayoutResId(): Int {
        return R.layout.activity_dashboard;
    }

    override fun init() {

        presenter = DashBoardPresenterImpl(this);

        var toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        mTxt = findViewById(R.id.textView) as TextView
        mRecyclerView = findViewById(R.id.recyclerview) as RecyclerView

        mTxt.text = "Recyclerview using kotlin"

        presenter?.bindlList()
    }

    override fun showList(list: ArrayList<MyData>) {
        mRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapter = RecyclerViewAdapter(list, object : RecyclerViewClickListener {
            override fun onItemClick(position: Int) {
                Toast.makeText(this@DashBoardActivity, "${position + 1} is clicked", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@DashBoardActivity, AnagramActivity::class.java))
            }
        })
        mRecyclerView.adapter = adapter
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