package com.np.kotlinlearn_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMultiply = findViewById(R.id.btn_multiplication)
        btnDivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // Check if inputs are not empty
        if (etA.text.isNotEmpty() && etB.text.isNotEmpty()) {
            try {
                val a = etA.text.toString().toDouble()
                val b = etB.text.toString().toDouble()
                var result = 0.0

                when (v?.id) {
                    R.id.btn_add -> result = a + b
                    R.id.btn_subtraction -> result = a - b
                    R.id.btn_multiplication -> result = a * b
                    R.id.btn_division -> result = if (b != 0.0) a / b else Double.NaN
                }

                resultTv.text = "Result is $result"

            } catch (e: NumberFormatException) {
                resultTv.text = "Invalid input. Please enter valid numbers."
            }
        } else {
            resultTv.text = "Please enter values in both fields."
        }
    }
}
