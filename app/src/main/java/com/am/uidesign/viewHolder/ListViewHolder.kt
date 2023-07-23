package com.am.uidesign.viewHolder

import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_list.view.*

class ListViewHolder(val view: View) : BaseViewHolder<String>(view) {
    private lateinit var vo : String
    private var title = ""
    init {
        view.setOnClickListener {

        }
    }
    override fun bindData(data: String) {
        vo = data
//        Glide.with(itemView.context)
//            .load( data)
//            .into(itemView.iv_image)
    }

}
