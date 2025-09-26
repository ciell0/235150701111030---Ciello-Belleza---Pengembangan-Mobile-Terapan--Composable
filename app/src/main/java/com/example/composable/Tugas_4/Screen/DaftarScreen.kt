package com.example.composable.Tugas_4.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun pendaftaran () {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Pendaftaran", fontSize = 50.sp, fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(70.dp))

        Text("Nama", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "Masukkan nama anda",
            onValueChange = {},
            modifier = Modifier.width(350.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("NIM", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "masukkan NIM anda",
            onValueChange = {},
            modifier = Modifier.width(350.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Email", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "masukkan email anda",
            onValueChange = {},
            modifier = Modifier.width(350.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {}) {
            Text("LOGIN", fontSize = 18.sp)
        }
    }
}

@Preview
@Composable
fun tampil(){
    pendaftaran()
}