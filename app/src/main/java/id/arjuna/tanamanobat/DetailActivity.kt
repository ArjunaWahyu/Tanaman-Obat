package id.arjuna.tanamanobat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

//        supportActionBar!!.title = intent.getStringExtra("intent_name")
        Glide.with(this)
            .load(intent.getIntExtra("intent_photo",0))
            .centerCrop()
            .into(img_photo)

        tv_detail.text = intent.getStringExtra("intent_detail")
    }
}