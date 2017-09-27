package com.manojbhadane.kotlinmvpdemo.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.manojbhadane.kotlinmvpdemo.Listener.RecyclerViewClickListener
import com.manojbhadane.kotlinmvpdemo.Model.MyData
import com.manojbhadane.kotlinmvpdemo.R

/**
 * Created by manoj.bhadane on 27-09-2017.
 */
class RecyclerViewAdapter(val list: ArrayList<MyData>, val listener: RecyclerViewClickListener) : RecyclerView.Adapter<RecyclerViewAdapter.Viewholder>() {


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Viewholder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.listitem_recyclerview, parent, false)


        return Viewholder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.Viewholder?, position: Int) {
        holder?.bindItems(list[position])
        holder?.mTxt?.setOnClickListener { listener.onItemClick(position) }
    }

    class Viewholder(view: View) : RecyclerView.ViewHolder(view) {

        val mTxt = itemView.findViewById(R.id.txt) as TextView

        fun bindItems(data: MyData) {
            mTxt.text = data.Name
        }
    }
}