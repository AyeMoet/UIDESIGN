package com.am.uidesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.am.uidesign.R
import com.am.uidesign.viewHolder.ToDoListViewHolder
import com.am.uidesign.viewHolder.BaseViewHolder
import com.am.uidesign.vo.ListItemVO

class ToDoListAdapter(private val context: Context) :
    BaseAdapter<BaseViewHolder<ListItemVO>, ListItemVO>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ListItemVO> {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_todo_list,parent,false)
        return ToDoListViewHolder(view)
    }

}
