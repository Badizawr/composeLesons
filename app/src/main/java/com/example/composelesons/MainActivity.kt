package com.example.composelesons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(
                modifier = Modifier.run {
                    fillMaxSize()
                }
            ){
               itemsIndexed(
                   listOf("item1", "item2", "end", "start", "scroll")
               ){ _, item ->
                    Text(text = item,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
               }
            }
        }
    }
}





