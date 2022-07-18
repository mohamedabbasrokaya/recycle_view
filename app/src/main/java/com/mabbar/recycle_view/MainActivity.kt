package com.mabbar.recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var settingadapter:Setting_Adapter
    lateinit var itemList:MutableList<settingitem>//Immutable object

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycle_view)
        createsettingitem()
        settingadapter=Setting_Adapter(itemList)
        recyclerView.adapter=settingadapter

    }

    private fun createsettingitem() {
        itemList= mutableListOf()
        for (i in 0..1) {


            itemList.add(settingitem( title = "Iemoshan $i",
                subtilte = "smile $i",
                image = R.drawable.icon_image))
            itemList.add(
                settingitem(
                    title = "wifi $i",
                    subtilte = "internet $i",
                    image = R.drawable.icon_wifi

                )


            )
            itemList.add(
                settingitem(
                    title = "human$i",
                    subtilte = "run $i",
                    image = R.drawable.icon_run
            ))
            itemList.add(
                settingitem(
                    title = "location $i",
                    subtilte = "acess $i",
                    image = R.drawable.icon_location
            ))
        }




    }
}