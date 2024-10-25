package com.example.app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
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
import com.example.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Cambiar Greeting por el layout de XML usando findViewById
                    setContentView(R.layout.activity_main)

                    // Referencias a los elementos del layout XML
                    val btnValidar = findViewById<Button>(R.id.btnValidar)
                    val btnNuevoCodigo = findViewById<Button>(R.id.btnNuevoCodigo)
                    val codeInputLayout = findViewById<LinearLayout>(R.id.codeInputLayout)

                    // Listener para el botón "Validar"
                    btnValidar.setOnClickListener {
                        // Lógica para validar el código ingresado
                    }

                    // Listener para el botón "Nuevo Código"
                    btnNuevoCodigo.setOnClickListener {
                        // Lógica para generar un nuevo código
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}
