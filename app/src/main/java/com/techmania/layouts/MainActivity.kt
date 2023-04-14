package com.techmania.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techmania.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                //Greeting("Android")
                //MyLayouts(name = "Android")
                MyAlignments()

            }
        }
    }
}

@Composable
fun MyAlignments(){
    
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        //contentAlignment = Alignment.Center) for Box layout
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Hello",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Red).padding(start = 20.dp, end = 30.dp))

        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "Android",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Red)
                .width(100.dp))

        Spacer(modifier = Modifier.size(20.dp))

        Text(text = "Kotlin",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Red)
                .width(100.dp))

    }
    
}

@Composable
fun Greeting(name: String) {

}

@Composable
fun MyLayouts(name : String){

    Column {

        Box(modifier = Modifier
            .background(Color.Red)
            .height(200.dp)
            .width(300.dp)) {

            Row {
                Box(modifier = Modifier
                    .size(50.dp)
                    .background(Color.Blue))
                Column {
                    Text(text = "Hello ")
                    Text(text = "$name!")
                }
            }


        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutsTheme {
        //Greeting("Android")
        //MyLayouts(name = "Android")
        MyAlignments()
    }
}