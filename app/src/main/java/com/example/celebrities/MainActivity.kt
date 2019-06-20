package com.example.celebrities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  var celebrityAdapter:celebrityListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        celebrityAdapter = celebrityListAdapter(this@MainActivity)
        celebrity_ListView.adapter = celebrityAdapter
    }
}
