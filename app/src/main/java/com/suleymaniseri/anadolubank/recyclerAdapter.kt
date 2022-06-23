package com.suleymaniseri.anadolubank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class recyclerAdapter(val touristPlaceList: ArrayList<TouristPlace> ) : RecyclerView.Adapter<recyclerAdapter.TouristPlaceVH>() {

    class TouristPlaceVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TouristPlaceVH {
        //Inflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return TouristPlaceVH(itemView)
    }

    override fun onBindViewHolder(holder: TouristPlaceVH, position: Int) {

        holder.itemView.recyclerviewtextview.text = touristPlaceList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return touristPlaceList.size
    }

}