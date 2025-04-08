package com.example.seatwork



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CountryAdapter(private val context: Context, private val countryList: List<Country>) : BaseAdapter() {
    override fun getCount(): Int = countryList.size
    override fun getItem(position: Int): Any = countryList[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.activity_list_item, parent, false)

        val flagImage: ImageView = view.findViewById(R.id.flagImage)
        val countryName: TextView = view.findViewById(R.id.countryName)

        val country = countryList[position]
        flagImage.setImageResource(country.flag)
        countryName.text = country.name

        return view
    }
}
