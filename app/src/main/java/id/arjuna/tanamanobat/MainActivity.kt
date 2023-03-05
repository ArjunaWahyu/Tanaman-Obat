package id.arjuna.tanamanobat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.arjuna.tanamanobat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Plant> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.rvTanamanObat.setHasFixedSize(true)
//
//        list.addAll(PlantsData.listData)

        setupTopBar()
        showRecyclerList()
    }

    private fun setupTopBar(){
        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId){
                R.id.profile -> {
                    showProfile()
                    true
                }
                else -> {false}
            }
        }
    }

    private fun showRecyclerList() {
        binding.rvTanamanObat.setHasFixedSize(true)
        list.addAll(PlantsData.listData)

        binding.rvTanamanObat.layoutManager = LinearLayoutManager(this)
        val listPlantAdapter = ListPlantAdapter(list)
        binding.rvTanamanObat.adapter = listPlantAdapter

        listPlantAdapter.setOnItemClickCallback(object : ListPlantAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Plant) {
                showSelectedPlant(data)

                startActivity(
                    Intent(applicationContext, DetailActivity::class.java)
                        .putExtra("intent_name", data.name)
                        .putExtra("intent_photo", data.photo)
                        .putExtra("intent_detail", data.detail)
                )
            }
        })
    }

    private fun showProfile(){
        startActivity(Intent(this, ProfileActivity::class.java))
    }

    private fun showSelectedPlant(plant: Plant) {
        Toast.makeText(this, plant.name, Toast.LENGTH_SHORT).show()
    }
}