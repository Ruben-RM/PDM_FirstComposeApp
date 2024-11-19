package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyLayout()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyLayout() {
    MyFirstComposeAppTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        )
        {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(0.dp, 10.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Titulo",
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                )
            }

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Subtitulo",
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                )
            }

            Row(modifier = Modifier.fillMaxWidth())
            {
                Box(
                    modifier = Modifier.padding(10.dp, 0.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Text(
                        text = "Opcion 1",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }

                Box(
                    modifier = Modifier.padding(10.dp, 0.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Opcion 2",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }

                Box(
                    modifier = Modifier.padding(10.dp, 0.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Opcion 3",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }
            }

            Row(modifier = Modifier.fillMaxWidth()
                .border(BorderStroke(2.dp, Color.Blue)))
            {
                Box(
                    modifier = Modifier.padding(20.dp, 5.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Text(
                        text = "Texto 1",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }

                Box(
                    modifier = Modifier.padding(20.dp, 5.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Texto 2",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }

                Box(
                    modifier = Modifier.padding(20.dp, 5.dp),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        text = "Texto 3",
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif
                        )
                    )
                }
            }
        }
    }
}
