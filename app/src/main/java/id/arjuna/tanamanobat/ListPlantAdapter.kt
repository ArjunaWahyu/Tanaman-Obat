package id.arjuna.tanamanobat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlantAdapter(private val listPlant: ArrayList<Plant>) : RecyclerView.Adapter<ListPlantAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_plants, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val plant = listPlant[position]

        Glide.with(holder.itemView.context)
                .load(plant.photo)
                .apply(RequestOptions().override(55,55))
                .centerCrop()
                .into(holder.imgPhoto)

        holder.tvName.text = plant.name
        holder.tvDetail.text = plant.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(plant)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Plant)
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun getItemCount(): Int {
        return listPlant.size
    }
}