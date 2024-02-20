package br.senai.sp.jandira.calculoimc

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculoimc.ui.theme.CalculoImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculoImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Box (
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(200.dp)
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.height(160.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier.size(height = 80.dp, width = 80.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Calculadora IMC",
                    fontSize = 25.sp,
                    color = Color.White
                )
            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box (
                modifier = Modifier
                    .background(Color.Green)
                    .height(400.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Column {
                    Box (
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    ){
                        Text(
                            text = "Seus dados",
                            color = Color.Red,
                            fontSize = 30.sp
                        )

                    }
                    Column (
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .padding(20.dp)
                            .background(Color.Blue)
                    ){
                        Text(text = "Seu peso")
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "Insira seu peso")
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color.Red
                            ),
                            modifier = Modifier
                                .background(Color.White)
                                .width(200.dp)
                        )
                        Text(text = "Sua altura")
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "Insira sua altura")
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color.Red
                            ),
                            modifier = Modifier.background(Color.White)
                        )
                    }
                    Button(onClick = { /*TODO*/ }) {

                    }
                }
            }
        }
        Box {
            Row {
                Column {

                }
                Text(text = "")
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculoImcTheme {
        Greeting()
    }
}