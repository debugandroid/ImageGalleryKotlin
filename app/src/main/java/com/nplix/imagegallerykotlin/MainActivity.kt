package com.nplix.imagegallerykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlideApp.with(this)
                .load("https://www.nplix.com/wp-content/uploads/2018/02/9l_326fiszk-luca-bravo.jpg")
                .centerInside()
                .into(ImageView)
    }
}
