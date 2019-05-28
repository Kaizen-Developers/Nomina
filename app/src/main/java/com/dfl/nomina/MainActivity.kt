package com.dfl.nomina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import java.io.StringBufferInputStream
import java.text.DecimalFormat


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
                SumDescuentos()
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
                SumDescuentos()
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
                SumDescuentos()
            }
        })
    }

    fun SumFields() {
        var total=0

        if (edsalario.text.toString() != "") {
            var uno = Integer.parseInt(edsalario.text.toString())
            if (uno < (828116*2) ){
                total += 97032
            }
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
        totalDevengado.text =  total.toString()
    }

    fun SumDescuentos() {
        var Salud=0

        if (edsalario.text.toString() != "") {
            var dos=0
            if (edextra.text.toString() != "") {
                dos = Integer.parseInt(edextra.text.toString())
            }
            var uno = Integer.parseInt(edsalario.text.toString())
            Salud= ((uno+dos)*(0.04)*(2)).toInt()
        }
        totalDescuentos.text = Salud.toString()

        subtotalNomina.text=(Integer.parseInt(totalDevengado.text.toString())-Integer.parseInt(totalDescuentos.text.toString())).toString()
    }
}
