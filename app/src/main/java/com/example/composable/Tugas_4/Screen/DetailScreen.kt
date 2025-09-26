package com.example.composable.Tugas_4.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun detail (){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Detail", fontSize = 50.sp, fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(70.dp))

        OutlinedTextField("Ciello Belleza Zukhrufi Susilantoro",
            onValueChange = {},
            label = { Text("Nama")
            Modifier.fillMaxWidth()})
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField("235150701111030",
            onValueChange = {},
            label = { Text("NIM")
                Modifier.fillMaxWidth()})
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField("ciellobelleza@gmail.com",
            onValueChange = {},
            label = { Text("Email")
                Modifier.fillMaxWidth()})
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField("Malang, East Java, Indonesia",
            onValueChange = {},
            label = { Text("Alamat")
                Modifier.fillMaxWidth()})

        Spacer(modifier = Modifier.height(20.dp).width(65.dp))

        Button(onClick = {}) {
            Text("DAFTAR", fontSize = 18.sp)
        }
    }
}

@Preview
@Composable
fun show(){
    detail()
}