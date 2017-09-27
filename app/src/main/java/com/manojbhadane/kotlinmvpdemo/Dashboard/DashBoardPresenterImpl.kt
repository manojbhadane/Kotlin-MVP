package com.manojbhadane.kotlinmvpdemo.Dashboard

import com.manojbhadane.kotlinmvpdemo.Model.MyData

/**
 * Created by manoj.bhadane on 27-09-2017.
 */
class DashBoardPresenterImpl(view: DashBoardView) : DashBoardPresenter {

    private var mView: DashBoardView? = view
    private val items = ArrayList<MyData>()

    override fun bindlList() {
        for (i in 1..50)
            items.add(MyData("Person : " + i))
        mView?.showList(items)
    }
}