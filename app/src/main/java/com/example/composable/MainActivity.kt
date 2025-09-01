package com.example.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composable.Halaman.NIM
import com.example.composable.Halaman.nama
import com.example.composable.ui.theme.ComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = "nama"){
                composable("nama") {
                    nama("Ciello Belleza Zukhrufi S", navController)
                }
                composable("NIM") {
                    NIM("2351507011111030", navController)
                }
            }



//            ComposableTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { PaddingValues ->
//
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
        }
    }
}

//@Preview
//@Composable
//fun Tampilkan_nama (){
//    nama("Ciello Belleza Zukhrufi S")
//}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ComposableTheme {
//        Greeting("Android")
//    }
//}