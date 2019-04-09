package com.example.recycleviewapidatadisplay.Activity.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.recycleviewapidatadisplay.Activity.adapter.DataDisplayClass
import com.example.recycleviewapidatadisplay.Activity.model.User
import com.example.recycleviewapidatadisplay.Activity.rest.ApiClient

import com.example.recycleviewapidatadisplay.R
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var user: User?= null
    private var recycler_view : RecyclerView?= null
    private var mAdapter: DataDisplayClass ?= null
    var layoutManager: LinearLayoutManager? = null
    private val TAG = MainActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recycler_view!!.setHasFixedSize(false)
        loadData()
        mAdapter!!.notifyDataSetChanged()

    }
    private fun init()
    {

        recycler_view = findViewById(R.id.recycler_view)
        mAdapter = DataDisplayClass(user, this@MainActivity)
        layoutManager = LinearLayoutManager(this@MainActivity)
        recycler_view!!.layoutManager = layoutManager as RecyclerView.LayoutManager?
        recycler_view!!.adapter = mAdapter
        recycler_view!!.itemAnimator = DefaultItemAnimator()
        recycler_view!!.isNestedScrollingEnabled = true



    }
    private fun loadData() {
        val apiInterface = ApiClient.create()
        val call = apiInterface.getAllData
        call.enqueue(object : retrofit2.Callback<User> {
            override fun onResponse(call: retrofit2.Call<User>, response: Response<User>) {
                if (response.isSuccessful) {

                    val dataDetails = response.body() as User

                   user = dataDetails
                    Log.d( "Numberof" , ""+dataDetails.results.size);
                    mAdapter!!.notifyDataSetChanged()


                }


            }

            override fun onFailure(call: retrofit2.Call<User>, t: Throwable) {
                Log.e(TAG, t.message)


            }
        })



    }

}
