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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun login () {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Login", fontSize = 50.sp, fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(70.dp))

        Text("Email", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "Masukkan email anda",
            onValueChange = {},
            modifier = Modifier.width(350.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Password", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "masukkan password anda",
            onValueChange = {},
            modifier = Modifier.width(350.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {}) {
            Text("LOGIN", Modifier.width(65.dp), fontSize = 18.sp, textAlign = TextAlign.Center)
        }

        Button(onClick = {}) {
            Text("DAFTAR", fontSize = 18.sp)
        }
    }
}

@Preview
@Composable
fun lihat(){
    login()
}