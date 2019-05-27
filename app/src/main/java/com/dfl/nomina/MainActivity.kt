package com.dfl.nomina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import java.io.StringBufferInputStream


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edsalario.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                SumFields()
            }
        })
        edextra.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                SumFields()
            }
        })
        edbonifica.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                SumFields()
            }
        })
    }

    fun SumFields() {
        var total=0

        if (edsalario.text.toString() != "") {
            var uno = Integer.parseInt(edsalario.text.toString())
            total += uno
        }
        if (edextra.text.toString() != "") {
            var dos = Integer.parseInt(edextra.text.toString())
            total += dos
        }
        if (edbonifica.text.toString() != "") {
            var tres = Integer.parseInt(edbonifica.text.toString())
            total += tres
        }
        subtotal.text = total.toString()

    }


}
