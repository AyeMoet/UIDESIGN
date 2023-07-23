package com.am.uidesign.viewHolder

import android.view.View
import com.am.uidesign.vo.ByRatesVO
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_todo_list.view.*

class ByRatesListViewHolder(val view: View) : BaseViewHolder<ByRatesVO>(view) {
    private lateinit var vo : ByRatesVO
    private var title = ""
    init {
        view.setOnClickListener {

        }
    }
    override fun bindData(data: ByRatesVO) {
        vo = data
//        Glide.with(itemView.context)
//            .load( data.image)
//            .into(itemView.iv_image)
//        view.tv_title.text = data.text
    }

}
