package com.am.uidesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.am.uidesign.R
import com.am.uidesign.viewHolder.BaseViewHolder
import com.am.uidesign.viewHolder.ByRoomListViewHolder
import com.am.uidesign.vo.ByRoomVO

class ByRoomListAdapter(private val context: Context) :
    BaseAdapter<BaseViewHolder<ByRoomVO>, ByRoomVO>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ByRoomVO> {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_byroom_list,parent,false)
        return ByRoomListViewHolder(view)
    }

}
