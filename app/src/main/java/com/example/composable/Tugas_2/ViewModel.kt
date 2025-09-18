package com.example.composable.Tugas_2

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.util.ArrayDeque
import kotlin.math.round

class CalculatorViewModel : ViewModel() {
    var display by mutableStateOf("0")
        private set

    // input handler from UI
    fun onInput(char: String) {
        if (display == "0" && char != ".") display = char
        else display += char
    }

    fun onClear() {
        display = "0"
    }

    fun onDeleteLast() {
        if (display.length <= 1) display = "0"
        else display = display.dropLast(1)
    }

    fun onCalculate() {
        val result = evaluateExpression(display)
        display = result ?: "Error"
    }


    private fun evaluateExpression(expr: String): String? {
        try {
            val tokens = tokenize(expr)
            if (tokens.isEmpty()) return null
            val rpn = toRPN(tokens) // shunting-yard
            val value = evalRPN(rpn)
            // format: if integer, show without .0
            val rounded = if ((value % 1.0).let { kotlin.math.abs(it) } < 1e-9) value.toLong().toString() else String.format("%.10f", value).trimEnd('0').trimEnd('.')
            return rounded
        } catch (e: Exception) {
            return null
        }
    }

    private fun tokenize(s: String): List<String> {
        val tokens = mutableListOf<String>()
        var i = 0
        while (i < s.length) {
            val c = s[i]
            when {
                c.isWhitespace() -> i++
                c.isDigit() || c == '.' -> {
                    val sb = StringBuilder()
                    while (i < s.length && (s[i].isDigit() || s[i] == '.')) {
                        sb.append(s[i])
                        i++
                    }
                    tokens.add(sb.toString())
                }
                c == '+' || c == '-' || c == '*' || c == '/' -> {
                    tokens.add(c.toString())
                    i++
                }
                else -> throw IllegalArgumentException("Invalid char: $c")
            }
        }
        return tokens
    }

    private fun precedence(op: String): Int = when (op) {
        "+", "-" -> 1
        "*", "/" -> 2
        else -> 0
    }

    private fun toRPN(tokens: List<String>): List<String> {
        val output = mutableListOf<String>()
        val ops = ArrayDeque<String>()
        for (t in tokens) {
            if (t.first().isDigit() || t.startsWith(".")) {
                output.add(t)
            } else { // operator
                while (ops.isNotEmpty() && precedence(ops.peek()) >= precedence(t)) {
                    output.add(ops.pop())
                }
                ops.push(t)
            }
        }
        while (ops.isNotEmpty()) output.add(ops.pop())
        return output
    }

    private fun evalRPN(rpn: List<String>): Double {
        val stack = ArrayDeque<Double>()
        for (t in rpn) {
            if (t.first().isDigit() || t.startsWith(".")) {
                stack.push(t.toDouble())
            } else {
                val b = stack.pop()
                val a = stack.pop()
                val res = when (t) {
                    "+" -> a + b
                    "-" -> a - b
                    "*" -> a * b
                    "/" -> {
                        if (b == 0.0) throw ArithmeticException("Division by zero")
                        a / b
                    }
                    else -> throw IllegalArgumentException("Unknown op $t")
                }
                stack.push(res)
            }
        }
        return stack.pop()
    }
}
