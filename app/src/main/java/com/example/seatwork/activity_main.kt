package com.example.seatwork

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)
        val countryList = listOf(
            Country("USA", R.drawable.usa),
            Country("Canada", R.drawable.canada),
            Country("UK", R.drawable.uk),
            Country("Germany", R.drawable.germany)
        )
        listView.setOnItemClickListener { _, _, position, _ ->
            val clickedCountry = countryList[position]
            Toast.makeText(this, "You clicked: ${clickedCountry.name}", Toast.LENGTH_SHORT).show()
        }

        val adapter = CountryAdapter(this, countryList)
        listView.adapter = adapter
    }
}
