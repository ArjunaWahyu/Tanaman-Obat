package id.arjuna.tanamanobat

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Plant(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
): Parcelable
