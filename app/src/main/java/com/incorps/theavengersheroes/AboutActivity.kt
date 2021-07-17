package com.incorps.theavengersheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {

    private val pageTitle: String = "About"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setActionBarTitle(pageTitle)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}