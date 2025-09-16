package com.example.composable.Tugas_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composable.Tugas_1.Halaman.NIM
import com.example.composable.Tugas_1.Halaman.nama

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