package id.utdi.jerymiannor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.utdi.jerymiannor.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                //Surface container yang menggunakan warna 'latar belakang' dari tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    // Layout kolom dengan modifier dan warna background
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        // Elemen gambar untuk foto progfil dengan modifier
        MyImage(imageResource = R.drawable.profile)

        // Elemen Spacer
        Spacer(modifier = Modifier.height(16.dp))

        // Elemen text untuk nama, no.hp, sosial media, dan email dengan modifier
        Text(
            text = "Jerymiannor",
            modifier = Modifier.padding(8.dp),
            fontSize = 24.sp,
            color = Color.Black
        )

        Text(
            text = "Phone: +628 910 111 213",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        Text(
            text = "Twitter: @iTzZer",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        Text(
            text = "Email: ZerOP@email.com",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun MyImage(imageResource: Int) {
    // Elemen image dengan modifier
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}