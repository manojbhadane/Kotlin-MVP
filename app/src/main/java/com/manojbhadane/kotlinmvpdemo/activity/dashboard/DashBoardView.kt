package com.manojbhadane.kotlinmvpdemo.activity.dashboard

import com.manojbhadane.kotlinmvpdemo.model.MyData

/**
 * Created by manoj.bhadane on 27-09-2017.
 */
interface DashBoardView {
    fun showList(list: ArrayList<MyData>)
}