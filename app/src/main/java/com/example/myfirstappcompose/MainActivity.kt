package com.example.myfirstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myfirstappcompose.ui.theme.MyFirstAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MiPrimerCompose(
                "Hola mundo perro es tu primer compose"
            )

            MiPrimerCompose(
                "Este es tu segundo compose reutilizando Texto y la funcion MiPrimerCompose"
            )



        }
    }
}

        @Composable
        fun MiPrimerCompose(valueText: String) {

            Text(
                text = valueText,
                fontSize = 18.sp
            )



        }
@Preview(showSystemUi = true)
@Composable
fun MiPrimerPreview(modifier: Modifier = Modifier) {
    MiPrimerCompose("Mi primer Preview" )


}





