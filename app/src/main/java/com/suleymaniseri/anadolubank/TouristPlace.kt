package com.suleymaniseri.anadolubank

import android.os.Parcel
import android.os.Parcelable


data class TouristPlace(
    val name : String?,
    val image : Int,
    val detail: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(image)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TouristPlace> {
        override fun createFromParcel(parcel: Parcel): TouristPlace {
            return TouristPlace(parcel)
        }

        override fun newArray(size: Int): Array<TouristPlace?> {
            return arrayOfNulls(size)
        }
    }
}
