package com.incorps.theavengersheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    private lateinit var imgDetail: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDetail: TextView

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        imgDetail = findViewById(R.id.img_photo_detail)
        tvName = findViewById(R.id.tv_name_detail)
        tvDetail = findViewById(R.id.tv_detail_detail)

        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(imgDetail)
        tvName.text = name
        tvDetail.text = detail
        if (name != null) {
            setActionBarTitle(name)
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}