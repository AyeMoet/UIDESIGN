package com.am.uidesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.viewpager.widget.PagerAdapter
import com.am.uidesign.databinding.AdapterListBinding
import com.am.uidesign.vo.EventVO


class EventVpAdapter(context: Context) : PagerAdapter(){

    var eventList = mutableListOf<EventVO>()
    var context: Context = context


    private var _binding : AdapterListBinding?= null
    private val binding get() = _binding!!

    override fun getCount(): Int {
        return eventList.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    @NonNull
    override fun instantiateItem(@NonNull container: ViewGroup, position: Int): Any {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        _binding = AdapterListBinding.inflate(inflater,container,false)
        val data=eventList[position]

        binding.apply {
            ivImage.setImageResource(data.image!!)
            tvTitle.text=data.title
            tvDescription.text=data.address
        }
        container.addView(binding.root)
        return binding.root
    }

    fun setItemList(bannerList: MutableList<EventVO>) {
        this.eventList.clear()
        this.eventList.addAll(bannerList)
        notifyDataSetChanged()
    }

    override fun isViewFromObject(@NonNull view: View, @NonNull `object`: Any): Boolean {
        return view == `object`
    }
}