package com.example.composable.Tugas_2

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CalculatorScreen(
    display: String,
    onInput: (String) -> Unit,
    onClear: () -> Unit,
    onDelete: () -> Unit,
    onEquals: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // Display
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.BottomEnd
        ) {
            Text(
                text = display,
                fontSize = 48.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth(),
                fontWeight = FontWeight.Bold
            )
        }

        // Buttons grid (4 x 4)
        val btnModifier = Modifier
            .weight(1f)
            .fillMaxHeight()

        Column(modifier = Modifier.fillMaxWidth().height(420.dp)) {
            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                CalcButton("7", Modifier.weight(1f), onInput)
                CalcButton("8", Modifier.weight(1f), onInput)
                CalcButton("9", Modifier.weight(1f), onInput)
                OpButton("/", Modifier.weight(1f)) { onInput("/") }
            }
            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                CalcButton("4", Modifier.weight(1f), onInput)
                CalcButton("5", Modifier.weight(1f), onInput)
                CalcButton("6", Modifier.weight(1f), onInput)
                OpButton("*", Modifier.weight(1f)) { onInput("*") }
            }
            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                CalcButton("1", Modifier.weight(1f), onInput)
                CalcButton("2", Modifier.weight(1f), onInput)
                CalcButton("3", Modifier.weight(1f), onInput)
                OpButton("-", Modifier.weight(1f)) { onInput("-") }
            }
            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                CalcButton("0", Modifier.weight(1f), onInput)
                CalcButton(".", Modifier.weight(1f), onInput)
                ActionButton("C", Modifier.weight(1f)) { onClear() }
                OpButton("+", Modifier.weight(1f)) { onInput("+") }
            }
            Row(modifier = Modifier.fillMaxWidth().height(64.dp)) {
                Button(onClick = { onEquals() }, modifier = Modifier.fillMaxSize()) {
                    Text("=", fontSize = 24.sp)
                }
            }
        }
    }
}

@Composable
fun CalcButton(text: String, modifier: Modifier = Modifier, onClick: (String) -> Unit) {
    Button(
        onClick = { onClick(text) },
        modifier = modifier.padding(4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text, fontSize = 20.sp)
    }
}

@Composable
fun OpButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = modifier.padding(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFB8C00)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text, fontSize = 20.sp)
    }
}

@Composable
fun ActionButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = modifier.padding(4.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCalculator() {
    CalculatorScreen(
        display = "123",
        onInput = {},
        onClear = {},
        onDelete = {},
        onEquals = {}
    )
}
