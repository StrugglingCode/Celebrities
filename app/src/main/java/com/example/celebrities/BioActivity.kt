package com.example.celebrities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bio.*

class BioActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_bio)

        var recieveData = intent.extras
        var actorName = recieveData.getString(ACTOR_NAME)
        var actorDes = recieveData.getString(ACTOR_DES)
        var image = recieveData.getInt(ACTOR_IMAGE)


        bio_actor_image.setImageResource(image)
        //textView_bio.text = "$actorName - $actorDes"
        textView.text = "$actorName - $actorDes"

    }

    companion object
    {
        var ACTOR_NAME = "name"
        var ACTOR_DES = "des"
        var ACTOR_IMAGE = "image"
    }
}