 package com.example.teleb_application

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.Villanueva_App.ui.theme.Villanueava_ApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Villanueava_ApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Activity1() {
    Column() {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Max)
            )
        }
        Row() {
            Text(
                text = "Jetpack Compose Tutorials",
                modifier = Modifier.
                    padding(start = 16.dp, end = 16.dp , bottom = 16.dp, top = 16.dp),
                fontSize = 24.sp,
                textAlign = TextAlign.Start
            )
        }
        Row(){
            Text(
                text ="Jetpack Compose is a modern toolkit for building native Android UI. " +
                        "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Justify
            )
        }
        Row() {
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. " +
                        "You call Compose functions to say what elements you want and the Compose compiler " +
                        "does the rest. Compose is built around Composable functions. These functions let you define your app\\'s " +
                        "UI programmatically because they let you describe how it should look and provide data dependencies, rather " +
                        "than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. " +
                        "To create a Composable function, you add the @Composable annotation to the function name.",
                modifier =Modifier
                    .padding(start = 16.dp, bottom = 16.dp, end = 16.dp, top = 16.dp),
                fontSize =16.sp,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
fun Activity2(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(id = R.drawable.ic_task_completed)
            Image(painter = image, contentDescription = null)

            Text(
                text = "All tasks completed",
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Nice Work!",
                fontSize = 16.sp
            )
    }
}


@Composable
fun Activity3() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

// Activity 1
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Villanueava_ApplicationTheme {
        Activity1()
    }
}

//Activity 2
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Activity2Preview() {
    Villanueava_ApplicationTheme {
        Activity2()
    }
}

//Activity 3
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Activity3Preview() {
    Villanueava_ApplicationTheme {
        Activity3()
    }
}




