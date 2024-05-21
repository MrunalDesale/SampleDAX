package com.example.sampledax

import android.os.Bundle
import android.text.style.BulletSpan
import android.text.style.StyleSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sampledax.ui.theme.SampleDAXTheme

class MainActivity : ComponentActivity() {
    var mList = mutableListOf(Int)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SetCardView()
        }
    }
}

@Composable
fun SetCardView() {

    Box(Modifier.padding(10.dp)) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(Color(0xFFfafafa))
        ) {
            Text(text = "DAX", fontSize = 20.sp, modifier = Modifier.padding(10.dp))
            Text(
                text = "842016 $BULLET DE0000005489 $BULLET Index",
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 10.dp, top = 5.dp, bottom = 5.dp),
                color = Color(0xFF8c8c8c)
            )

            Card(
                modifier = Modifier
//                    .fillMaxHeight()
                    .padding(6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(Color(0xFFdce4ea)),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            ) {
                Text(text = "Tops & Flops", fontSize = 16.sp, modifier = Modifier.padding(10.dp))
                AddDynamicTopIndex(list = mutableListOf(1, 2, 3, 4, 5))
                AddDynamicFlopIndex(list = mutableListOf(1, 2, 3, 4, 5))

            }

            Card(
                modifier = Modifier
//                    .fillMaxHeight()
                    .padding(6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(Color(0xFFdce4ea)),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            ) {
                Text(
                    text = "Profil",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 0.dp)
                )
                ExpandableText(text = "Expandable cards are a popular UI element in Android app development. They allow developers to create a clean and compact user interface that can be easily expanded to show additional content. Through effectively using an expandable card, developers can provide users with a seamless and intuitive experience where they can access more detailed information without navigating to a new screen or context. This can be especially useful in mobile apps where screen real estate is limited and users are often on the go. By presenting information in an expandable card, developers can improve the user experience by reducing the number of taps and swipes required to access the desired content.")
            }
        }
    }
}

@Composable
fun AddDynamicTopIndex(list: MutableList<Int>) {
    if (list.size > 2) {
        for (i in 1..3) {
            Column {
                Row(horizontalArrangement = Arrangement.End) {
                    Text(
                        text = "Zalando $i",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(10.dp)
                            .weight(1f, true),
                        color = Color(0xFF40474e)
                    )
                    Text(
                        text = "2,43 $i%",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        color = Color(0xFF009f08)
                    )
                }
                Divider(color = Color(0xFFc3c3cc))
            }
        }
    }
}

@Composable
fun AddDynamicFlopIndex(list: MutableList<Int>) {
    if (list.size > 2) {
        for (i in 1..3) {
            Column {
                Row(horizontalArrangement = Arrangement.End) {
                    Text(
                        text = "Zalando $i",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(10.dp)
                            .weight(1f, true),
                        color = Color(0xFF40474e)
                    )
                    Text(
                        text = "1.43 $i%",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        color = Color(0xFFa8253d)
                    )
                }
                if (i < 3)
                    Divider(color = Color(0xFFc3c3cc))
            }
        }
    }
}

private const val MAX_LINES = 4
private const val BULLET = "\u2022"

@Composable
fun ExpandableText(modifier: Modifier = Modifier, text: String) {
    var isExpanded by remember { mutableStateOf(false) }
    val textLayoutResultState = remember { mutableStateOf<TextLayoutResult?>(null) }
    var isClickable by remember { mutableStateOf(false) }
    var finalText by remember { mutableStateOf(text) }
    val textLayoutResult = textLayoutResultState.value

    LaunchedEffect(key1 = textLayoutResult) {
        if (textLayoutResult == null)
            return@LaunchedEffect

        when {
            isExpanded -> {
                finalText = text
            }

            !isExpanded && textLayoutResult.hasVisualOverflow -> {
                val lastCharIndex = textLayoutResult.getLineEnd(MAX_LINES - 1)
                val adjustedText = text.substring(startIndex = 0, endIndex = lastCharIndex)
                    .dropLastWhile {
                        it == ' ' || it == '.'
                    }
                finalText = adjustedText
                isClickable = true
            }
        }
    }

    Text(
        text = finalText,
        maxLines = if (isExpanded) Int.MAX_VALUE else MAX_LINES,
        onTextLayout = {
            textLayoutResultState.value = it
        },
        modifier = modifier
            .padding(10.dp)
            .clickable(enabled = isClickable) {
                isExpanded = !isExpanded
            }
            .animateContentSize(),
        fontSize = 16.sp,
        overflow = TextOverflow.Ellipsis
    )

}

git config --global user.email "you@example.com"
git config --global user.name "Your Name"
