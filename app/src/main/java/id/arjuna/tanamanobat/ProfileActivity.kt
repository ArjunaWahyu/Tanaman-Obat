package id.arjuna.tanamanobat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.arjuna.tanamanobat.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTopBar()
    }

    private fun setupTopBar() {
        binding.topAppBar.setNavigationOnClickListener {
            finish()
        }
    }
}