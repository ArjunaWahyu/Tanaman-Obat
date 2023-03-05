package id.arjuna.tanamanobat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import id.arjuna.tanamanobat.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTopBar()
        setupContent()
    }

    private fun setupTopBar() {
        binding.topAppBar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun setupContent() {
        Glide.with(this)
            .load(intent.getIntExtra("intent_photo",0))
            .centerCrop()
            .into(binding.imgPhoto)

        binding.tvDetail.text = intent.getStringExtra("intent_detail")
    }
}