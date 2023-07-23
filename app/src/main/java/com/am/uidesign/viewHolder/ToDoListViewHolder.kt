package com.am.uidesign.viewHolder

import android.view.View
import com.am.uidesign.vo.ListItemVO
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_todo_list.view.*

class ToDoListViewHolder(val view: View) : BaseViewHolder<ListItemVO>(view) {
    private lateinit var vo : ListItemVO
    private var title = ""
    init {
        view.setOnClickListener {

        }
    }
    override fun bindData(data: ListItemVO) {
        vo = data
        Glide.with(itemView.context)
            .load( data.image)
            .into(itemView.iv_image)
        view.tv_title.text = data.text
    }

}
