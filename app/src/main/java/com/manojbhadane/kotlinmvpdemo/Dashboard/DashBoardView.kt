package com.manojbhadane.kotlinmvpdemo.Dashboard

import com.manojbhadane.kotlinmvpdemo.Model.MyData

/**
 * Created by manoj.bhadane on 27-09-2017.
 */
interface DashBoardView {
    fun showList(list: ArrayList<MyData>)
}