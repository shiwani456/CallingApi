package com.example.recycleviewapidatadisplay.Activity.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.recycleviewapidatadisplay.Activity.model.Result
import com.example.recycleviewapidatadisplay.Activity.model.User
import com.example.recycleviewapidatadisplay.R
import java.util.ArrayList

class DataDisplayClass(user :User?, context : Context?) : RecyclerView.Adapter<DataDisplayClass.MyViewHolder>() {



    private var user:User ?= null
    private var context:Context ?= null


    init {
        this.user = user
        this.context = context
    }
    open inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v)

    internal inner class ItemViewHolder(itemView: View) : MyViewHolder(itemView) {
        internal var userAgeTextView: TextView = itemView.findViewById<View>(R.id.userAgeTextView) as TextView
        internal var userNameTextView: TextView = itemView.findViewById<View>(R.id.userNameTextView) as TextView
        internal var userPictureImageView: ImageView = itemView.findViewById<View>(R.id.userPictureImageView) as ImageView

    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DataDisplayClass.MyViewHolder {
        val newsView = LayoutInflater.from(p0.context).inflate(R.layout.dashboard_layout, p0, false)
       return ItemViewHolder(newsView)

    }

    override fun getItemCount(): Int {
        return user!!.results.size

    }

    override fun onBindViewHolder(p0: DataDisplayClass.MyViewHolder, p1: Int) {



        val data: Result? = user!!.results[p1]
        val holder = p0 as ItemViewHolder
        Glide.with(context!!)
                .load(data!!.picture.thumbnail)
                .into(holder.userPictureImageView)
        holder.userNameTextView.text = data.name.title+" "+data.name.first+" "+data.name.last
        holder.userAgeTextView.text = data.dob.age.toString()



    }

}