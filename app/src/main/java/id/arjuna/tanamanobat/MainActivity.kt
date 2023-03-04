package id.arjuna.tanamanobat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlants: RecyclerView
    private var list: ArrayList<Plant> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlants = findViewById(R.id.rv_tanamanObat)
        rvPlants.setHasFixedSize(true)

        list.addAll(PlantsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        showProfile()
        return super.onOptionsItemSelected(item)
    }

    private fun showProfile(){
        startActivity(Intent(this, ProfileActivity::class.java))
    }

    private fun showSelectedPlant(plant: Plant) {
        Toast.makeText(this, plant.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        rvPlants.layoutManager = LinearLayoutManager(this)
        val listPlantAdapter = ListPlantAdapter(list)
        rvPlants.adapter = listPlantAdapter

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
}