package com.am.uidesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.am.uidesign.R
import com.am.uidesign.viewHolder.BaseViewHolder
import com.am.uidesign.viewHolder.ByRatesListViewHolder
import com.am.uidesign.vo.ByRatesVO

class ByRatesListAdapter(private val context: Context) :
    BaseAdapter<BaseViewHolder<ByRatesVO>, ByRatesVO>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ByRatesVO> {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_byrates_list,parent,false)
        return ByRatesListViewHolder(view)
    }

}
