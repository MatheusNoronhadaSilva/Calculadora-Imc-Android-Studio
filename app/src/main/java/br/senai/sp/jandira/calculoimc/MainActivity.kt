package br.senai.sp.jandira.calculoimc

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                .background(Color(0xffea1450))
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
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ){
            Box (
                modifier = Modifier
                    .offset(x = 0.dp, y = -30.dp)
                    .shadow(
                        elevation = 8.dp,
                        shape = RoundedCornerShape(10.dp),
                    )
                    .background(Color(0xFFf7f3f2))
                    .height(380.dp)
                    .width(300.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Column (
                    modifier = Modifier
                        .padding(vertical = 20.dp)
                ){
                    Box (
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    ){
                        Text(
                            text = "Seus dados",
                            color = Color(0xffea1450),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                    }
                    Column (
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .padding(20.dp)
                            .fillMaxHeight()
                    ){
                        Text(
                            text = "Seu peso",
                            color = Color(0xffea1450)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(
                                    text = "Seu peso em Kg",
                                    color = Color(0xFFA5A5A5)
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color(0xffea1450)
                            ),
                            modifier = Modifier
                                .background(Color.White, shape = RoundedCornerShape(10.dp))
                                .fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "Sua altura",
                            color = Color(0xffea1450)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(
                                    text = "Sua altura em cm",
                                    color = Color(0xFFA5A5A5),
                                )
                            },
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color.Red
                            ),
                            modifier = Modifier
                                .background(Color.White, shape = RoundedCornerShape(10.dp))
                                .fillMaxWidth()
                        )
                        Button(
                            onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .height(50.dp)
                                .offset(y = 35.dp)
                                .fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xffea1450)),
                        ) {
                            Text(
                                text = "CALCULAR",
                                fontSize = 20.sp
                            )
                        }
                    }
                }
            }

            Box (
                modifier = Modifier
                    .shadow(
                        elevation = 10.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .border(width = 2.dp, Color(0xffea1450), shape = RoundedCornerShape(10.dp))
                    .background(Color(0xff2d9560), shape = RoundedCornerShape(10.dp))
                    .width(300.dp)
                    .height(120.dp)

            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(horizontal = 20.dp)
                ){
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "Resultado",
                            fontSize = 15.sp,
                            color = Color.White
                        )
                        Text(
                            text = "Peso Ideal",
                            fontSize = 25.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "21.3",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
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