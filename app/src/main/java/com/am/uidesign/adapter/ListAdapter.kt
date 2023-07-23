package com.am.uidesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.am.uidesign.R
import com.am.uidesign.viewHolder.ListViewHolder
import com.am.uidesign.viewHolder.BaseViewHolder

class ListAdapter(private val context: Context) :
    BaseAdapter<BaseViewHolder<String>, String>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<String> {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_list,parent,false)
        return ListViewHolder(view)
    }

}
