package com.example.composable.Halaman

import android.content.Intent
import android.service.autofill.OnClickAction
import android.view.View.OnClickListener
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
fun NIM (NIM: String, navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("NIM : $NIM", fontSize = 18.sp)
        Spacer(modifier = Modifier.size(18.dp))
        Button(onClick = {
            navController.navigate("nama")
        }) {
            Text("Kembali", fontSize = 16.sp)
        }
    }
}

//@Preview
//@Composable
//fun tampilkan_nim(){
//    NIM("235150701111030")
//}