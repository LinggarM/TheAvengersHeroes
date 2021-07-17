package com.incorps.theavengersheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvAvengers: RecyclerView
    private var list: ArrayList<Avengers> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAvengers = findViewById(R.id.rv_theavengers)
        rvAvengers.setHasFixedSize(true)

        list.addAll(AvengersData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAvengers.layoutManager = LinearLayoutManager(this)
        val avengersAdapter = AvengersAdapter(list)
        rvAvengers.adapter = avengersAdapter

        avengersAdapter.setOnItemClickCallback(object : AvengersAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Avengers) {
                showSelectedHero(data)
            }
        })
    }

    private fun showSelectedHero(data: Avengers) {
        val intentAvengers = Intent(this@MainActivity, DetailActivity::class.java)
        intentAvengers.putExtra(DetailActivity.EXTRA_IMG, data.photo)
        intentAvengers.putExtra(DetailActivity.EXTRA_NAME, data.name)
        intentAvengers.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
        startActivity(intentAvengers)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about -> {
                val intentAbout = Intent(this, AboutActivity::class.java)
                startActivity(intentAbout)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}