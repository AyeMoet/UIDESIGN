package com.am.uidesign.viewHolder

import android.view.View
import com.am.uidesign.vo.ByRoomVO
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.adapter_byroom_list.view.*

class ByRoomListViewHolder(val view: View) : BaseViewHolder<ByRoomVO>(view) {
    private lateinit var vo : ByRoomVO
    private var title = ""
    init {
        view.setOnClickListener {

        }
    }
    override fun bindData(data: ByRoomVO) {
        vo = data
        Glide.with(itemView.context)
            .load( data.image)
            .into(itemView.iv_image)
        view.tv_title.text = data.name
        view.tv_description.text = data.description
        view.tv_price.text = data.price.toString()
    }

}
