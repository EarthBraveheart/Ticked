package com.example.ticked.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ticked.R
import kotlinx.android.synthetic.main.fragment_item_event_box.view.*
class EventListAdapter : RecyclerView.Adapter<CustomViewHolder>(){

    val eventNmaeList = listOf<String>("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
    override fun getItemCount(): Int {
        return eventNmaeList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val callForRow = layoutInflater.inflate(R.layout.fragment_item_event_box, parent, false)
        return CustomViewHolder(callForRow)
    }
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val eventNameLists = eventNmaeList.get(position)
        holder?.view?.event_name_box.text = eventNameLists
    }
}

class CustomViewHolder(val view:View): RecyclerView.ViewHolder(view){

}
