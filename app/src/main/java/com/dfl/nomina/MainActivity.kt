package com.dfl.nomina

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var auxilioTra: Int = 0
    private var salud: Int = 0
    private var pension: Int = 0
    private var saldosPorPagar: Int = 0

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
        var total = 0
        auxilioTra = 0

        if (edsalario.text.toString() != "") {
            var uno = Integer.parseInt(edsalario.text.toString())
            if (uno < (828116 * 2)) {
                auxilioTra = 97032
            }
            total += uno + auxilioTra
        }
        if (edextra.text.toString() != "") {
            var dos = Integer.parseInt(edextra.text.toString())
            total += dos
        }
        if (edbonifica.text.toString() != "") {
            var tres = Integer.parseInt(edbonifica.text.toString())
            total += tres
        }
        edauxilio.text = auxilioTra.toString()
        totalDevengado.text = total.toString()
    }

    fun SumDescuentos() {
        salud = 0
        pension = 0

        if (edsalario.text.toString() != "") {
            var dos = 0
            if (edextra.text.toString() != "") {
                dos = Integer.parseInt(edextra.text.toString())
            }
            var uno = Integer.parseInt(edsalario.text.toString())
            salud = ((uno + dos) * (0.04)).toInt()
            pension = ((uno + dos) * (0.04)).toInt()
        }
        edsalud.text = salud.toString()
        edpension.text = pension.toString()
        totalDescuentos.text = (salud + pension).toString()

        subtotalNomina.text =
            (Integer.parseInt(totalDevengado.text.toString()) - Integer.parseInt(totalDescuentos.text.toString())).toString()

    }

    fun totales(view: View) {
        saldosPorPagar += Integer.parseInt(subtotalNomina.text.toString())
        val intent = Intent(view.context, RegistroActivity::class.java)
        startActivity(intent)
    }
}
