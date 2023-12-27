package com.example.composelesons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier.run {
                    fillMaxSize()
                        .background(Color.Gray)
                }
            ){
               itemsIndexed(
                   listOf(
                       ItemRowModel(R.drawable.ben_stiller, "Ben Stiller",
                           "Best Comedic Actor" + "\nBest Comedic Actor" + "\nBest Comedic Actor" + "\nBest Comedic Actor"),
                       ItemRowModel(R.drawable.bred_pitt, "Bred Pitt", "test"),
                       ItemRowModel(R.drawable.jenyfer_enyston, "Enyston",
                               "No bra club"),
                       ItemRowModel(R.drawable.dark_wolf, "Dark Wolf",
                           "The best Python programmer" + "\nThe best Python programmer" + "\nThe best Python programmer" + "\nThe best Python programmer"),
                       ItemRowModel(R.drawable.johnson_rock, "Rock",
                           "the pumped-up grandfather"),
                       ItemRowModel(R.drawable.leonardo_dicaprio, "Dicaprio", "Лёнчик"),
                       ItemRowModel(R.drawable.scarlett, "Scarlet", "The Black Widow"),
                       )
               ){ _, item ->
                   ItemRow(item = item)
               }
            }
        }
    }
}





