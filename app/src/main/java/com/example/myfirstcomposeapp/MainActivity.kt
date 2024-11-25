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
import androidx.compose.ui.text.style.TextAlign
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
                MyLayout()
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
            Text(
                text = "Titulo",
                modifier = Modifier.fillMaxWidth()
                    .padding(0.dp, 10.dp),
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            )

            Text(
                text = "Subtitulo",
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            )


            Row(modifier = Modifier.fillMaxWidth())
            {
                for(i in 1..3)
                {
                    Box(
                        modifier = Modifier.padding(10.dp, 0.dp),
                        contentAlignment = Alignment.Center
                    )
                    {
                        MyText("Opcion $i")
                    }
                }
            }

            Row(modifier = Modifier.fillMaxWidth()
                .border(BorderStroke(2.dp, Color.Blue)))
            {
                for(i in 1..3)
                {
                    Box(
                        modifier = Modifier.padding(20.dp, 5.dp),
                        contentAlignment = Alignment.Center
                    )
                    {
                        MyText("Texto $i")
                    }
                }

            }
        }
    }
}

@Composable
fun MyText(texto: String)
{
    Text(
        text = texto,
        style = TextStyle(
            color = Color.Gray,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif
        )
    )
}