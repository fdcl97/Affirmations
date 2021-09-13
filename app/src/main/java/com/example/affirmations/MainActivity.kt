package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize data.
        val myDataSet = Datasource().loadAffirmations()

        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataSet)//use our adapter

        recyclerView.setHasFixedSize(true)//When the changes in the content won't change the size of the recyclerview



    }
}