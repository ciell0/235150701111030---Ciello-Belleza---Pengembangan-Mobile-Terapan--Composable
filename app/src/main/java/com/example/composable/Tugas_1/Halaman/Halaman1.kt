package com.example.composable.Tugas_1.Halaman

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun nama (name: String, navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Nama Lengkap : $name", fontSize = 18.sp)
        Spacer(modifier = Modifier.size(12.dp))
        Button(onClick = { navController.navigate("NIM") }) {
            Text("Next", fontSize = 16.sp)
        }
    }

}

//@Preview
//@Composable
//fun TampilkanNama (){
//    nama("Ciello Belleza Zukhrufi S")
//}
