package com.mabbar.recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Setting_Adapter(var items:List<settingitem>):
    RecyclerView.Adapter<Setting_Adapter.SettingItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingItemViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_setting,parent,false)
        return SettingItemViewHolder(view);

    }

    override fun onBindViewHolder(holder: SettingItemViewHolder, position: Int) {
        //val item=items.get(position)
     val item=items[position]
        holder.title.setText(item.title)
        holder.subtitle.setText(item.subtilte)
        if (item.image!=null)
        holder.image.setImageResource(item.image)
        //item.image?.let {
          //  holder.image.setImageResource(it) }



    }

    override fun getItemCount(): Int {
        return items.size
    }



    public class SettingItemViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val title:TextView=itemView.findViewById(R.id.title)
        val subtitle:TextView=itemView.findViewById(R.id.subtitle)
        val image:ImageView=itemView.findViewById(R.id.image)





    }


}