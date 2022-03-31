package com.example.mycomposeapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapplication.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeApplicationTheme() {
                ComposablePreview()
            }
        }
    }
    @Preview(name = "Light Mode")
    @Preview(name = "Dark Mode",
        showBackground = true,
        uiMode = Configuration.UI_MODE_NIGHT_YES
    )
    @Composable
    private fun ComposablePreview() {
        showText()
    }

    @Composable
     fun showText() {
        Row(modifier = Modifier.padding(8.dp,10.dp)){
            Column {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .border(2.dp, Color.Black)
                )
            }
            Column() {
                Text(text = "Hello Android!")
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = " Practice by Ahsaan!",
                    color = Color.Cyan,
                    fontStyle = FontStyle.Italic
                )


            }
        }

    }
}
