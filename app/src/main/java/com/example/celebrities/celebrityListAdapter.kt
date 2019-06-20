package com.example.celebrities

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.celebrity_row.view.*

class celebrityListAdapter:BaseAdapter {
    private var celebrityDatabase:celebrity_database? = null
    private var context:Context? = null

    constructor(context:Context)
    {
          celebrityDatabase = celebrity_database()
        this.context = context
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val celebrity:celebrity = celebrityDatabase?.celebrityList?.get(position)
            ?: celebrity("No Actor","No Description",R.drawable.placeholder,false)

        var celebrityView:View
        var layoutInflator:LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if(celebrity.isAlive == true)
        {
            celebrityView = layoutInflator.inflate(R.layout.alive_celebrity_row,null)

        }
        else {

            celebrityView = layoutInflator.inflate(R.layout.celebrity_row, null)
        }
        celebrityView.actor_image1.setImageResource(celebrity?.image ?:R.drawable.placeholder)
        celebrityView.lbl_ActorName.setText(celebrity.name)
        celebrityView.lbl_ActorDes.setText(celebrity.des)

        return celebrityView
    }

    override fun getItem(position: Int): Any {                                                //celebrity objects according to position
            return  celebrityDatabase?.celebrityList?.get(position) ?:
            celebrity("No Actor ","No Description",R.drawable.placeholder,false)
    }

    override fun getItemId(position: Int): Long {                                             //access index value of arrayList

        return position.toLong()

    }

    override fun getCount(): Int {
        return celebrityDatabase?.celebrityList?.size ?:0                                       //?: elvis operator
                                                                                                 // because our list is nullable but return type is not nullable we used elvis operator
                                                                                                // specify default value
    }
}