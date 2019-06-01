package com.dfl.nomina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var auxilioTra: Int = 0
    private var salud: Int = 0
    private var pension: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SumFields()
        SumDescuentos()
        SumFields2()
        SumDescuentos2()
        SumFields3()
        SumDescuentos3()
        SumFields4()
        SumDescuentos4()
        SumFields5()
        SumDescuentos5()

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

        edsalario2.addTextChangedListener(object : TextWatcher {

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
                SumFields2()
                SumDescuentos2()
            }
        })
        edextra2.addTextChangedListener(object : TextWatcher {

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
                SumFields2()
                SumDescuentos2()
            }
        })
        edbonifica2.addTextChangedListener(object : TextWatcher {

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
                SumFields2()
                SumDescuentos2()
            }
        })

        edsalario3.addTextChangedListener(object : TextWatcher {

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
                SumFields3()
                SumDescuentos3()
            }
        })
        edextra3.addTextChangedListener(object : TextWatcher {

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
                SumFields3()
                SumDescuentos3()
            }
        })
        edbonifica3.addTextChangedListener(object : TextWatcher {

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
                SumFields3()
                SumDescuentos3()
            }
        })

        edsalario4.addTextChangedListener(object : TextWatcher {

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
                SumFields4()
                SumDescuentos4()
            }
        })
        edextra4.addTextChangedListener(object : TextWatcher {

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
                SumFields4()
                SumDescuentos4()
            }
        })
        edbonifica4.addTextChangedListener(object : TextWatcher {

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
                SumFields4()
                SumDescuentos4()
            }
        })

        edsalario5.addTextChangedListener(object : TextWatcher {

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
                SumFields5()
                SumDescuentos5()
            }
        })
        edextra5.addTextChangedListener(object : TextWatcher {

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
                SumFields5()
                SumDescuentos5()
            }
        })
        edbonifica5.addTextChangedListener(object : TextWatcher {

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
                SumFields5()
                SumDescuentos5()
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

    fun SumFields2() {
        var total = 0
        auxilioTra = 0

        if (edsalario2.text.toString() != "") {
            var uno = Integer.parseInt(edsalario2.text.toString())
            if (uno < (828116 * 2)) {
                auxilioTra = 97032
            }
            total += uno + auxilioTra
        }
        if (edextra2.text.toString() != "") {
            var dos = Integer.parseInt(edextra2.text.toString())
            total += dos
        }
        if (edbonifica2.text.toString() != "") {
            var tres = Integer.parseInt(edbonifica2.text.toString())
            total += tres
        }
        edauxilio2.text = auxilioTra.toString()
        totalDevengado2.text = total.toString()
    }

    fun SumDescuentos2() {
        salud = 0
        pension = 0

        if (edsalario2.text.toString() != "") {
            var dos = 0
            if (edextra2.text.toString() != "") {
                dos = Integer.parseInt(edextra2.text.toString())
            }
            var uno = Integer.parseInt(edsalario2.text.toString())
            salud = ((uno + dos) * (0.04)).toInt()
            pension = ((uno + dos) * (0.04)).toInt()
        }
        edsalud2.text = salud.toString()
        edpension2.text = pension.toString()
        totalDescuentos2.text = (salud + pension).toString()

        subtotalNomina2.text =
            (Integer.parseInt(totalDevengado2.text.toString()) - Integer.parseInt(totalDescuentos2.text.toString())).toString()

    }

    fun SumFields3() {
        var total = 0
        auxilioTra = 0

        if (edsalario3.text.toString() != "") {
            var uno = Integer.parseInt(edsalario3.text.toString())
            if (uno < (828116 * 2)) {
                auxilioTra = 97032
            }
            total += uno + auxilioTra
        }
        if (edextra3.text.toString() != "") {
            var dos = Integer.parseInt(edextra3.text.toString())
            total += dos
        }
        if (edbonifica3.text.toString() != "") {
            var tres = Integer.parseInt(edbonifica3.text.toString())
            total += tres
        }
        edauxilio3.text = auxilioTra.toString()
        totalDevengado3.text = total.toString()
    }

    fun SumDescuentos3() {
        salud = 0
        pension = 0

        if (edsalario3.text.toString() != "") {
            var dos = 0
            if (edextra3.text.toString() != "") {
                dos = Integer.parseInt(edextra3.text.toString())
            }
            var uno = Integer.parseInt(edsalario3.text.toString())
            salud = ((uno + dos) * (0.04)).toInt()
            pension = ((uno + dos) * (0.04)).toInt()
        }
        edsalud3.text = salud.toString()
        edpension3.text = pension.toString()
        totalDescuentos3.text = (salud + pension).toString()

        subtotalNomina3.text =
            (Integer.parseInt(totalDevengado3.text.toString()) - Integer.parseInt(totalDescuentos3.text.toString())).toString()

    }

    fun SumFields4() {
        var total = 0
        auxilioTra = 0

        if (edsalario4.text.toString() != "") {
            var uno = Integer.parseInt(edsalario4.text.toString())
            if (uno < (828116 * 2)) {
                auxilioTra = 97032
            }
            total += uno + auxilioTra
        }
        if (edextra4.text.toString() != "") {
            var dos = Integer.parseInt(edextra4.text.toString())
            total += dos
        }
        if (edbonifica4.text.toString() != "") {
            var tres = Integer.parseInt(edbonifica4.text.toString())
            total += tres
        }
        edauxilio4.text = auxilioTra.toString()
        totalDevengado4.text = total.toString()
    }

    fun SumDescuentos4() {
        salud = 0
        pension = 0

        if (edsalario4.text.toString() != "") {
            var dos = 0
            if (edextra4.text.toString() != "") {
                dos = Integer.parseInt(edextra4.text.toString())
            }
            var uno = Integer.parseInt(edsalario4.text.toString())
            salud = ((uno + dos) * (0.04)).toInt()
            pension = ((uno + dos) * (0.04)).toInt()
        }
        edsalud4.text = salud.toString()
        edpension4.text = pension.toString()
        totalDescuentos4.text = (salud + pension).toString()

        subtotalNomina4.text =
            (Integer.parseInt(totalDevengado4.text.toString()) - Integer.parseInt(totalDescuentos4.text.toString())).toString()

    }

    fun SumFields5() {
        var total = 0
        auxilioTra = 0

        if (edsalario5.text.toString() != "") {
            var uno = Integer.parseInt(edsalario5.text.toString())
            if (uno < (828116 * 2)) {
                auxilioTra = 97032
            }
            total += uno + auxilioTra
        }
        if (edextra5.text.toString() != "") {
            var dos = Integer.parseInt(edextra5.text.toString())
            total += dos
        }
        if (edbonifica5.text.toString() != "") {
            var tres = Integer.parseInt(edbonifica5.text.toString())
            total += tres
        }
        edauxilio5.text = auxilioTra.toString()
        totalDevengado5.text = total.toString()
    }

    fun SumDescuentos5() {
        salud = 0
        pension = 0

        if (edsalario5.text.toString() != "") {
            var dos = 0
            if (edextra5.text.toString() != "") {
                dos = Integer.parseInt(edextra5.text.toString())
            }
            var uno = Integer.parseInt(edsalario5.text.toString())
            salud = ((uno + dos) * (0.04)).toInt()
            pension = ((uno + dos) * (0.04)).toInt()
        }
        edsalud5.text = salud.toString()
        edpension5.text = pension.toString()
        totalDescuentos5.text = (salud + pension).toString()

        subtotalNomina5.text =
            (Integer.parseInt(totalDevengado5.text.toString()) - Integer.parseInt(totalDescuentos5.text.toString())).toString()

    }

    fun totales(view: View) {
       var totSalario=0
       var totHextra=0
       var totAuxtra=0
       var totBonif=0
       var totDevenga=0
       var totSalud=0
       var totsaldosporpagar=0

        totSalario = Integer.parseInt(edsalario.text.toString()) +
                Integer.parseInt(edsalario2.text.toString()) +
                Integer.parseInt(edsalario3.text.toString()) +
                Integer.parseInt(edsalario4.text.toString()) +
                Integer.parseInt(edsalario5.text.toString())

        totHextra = Integer.parseInt(edextra.text.toString()) +
                Integer.parseInt(edextra2.text.toString()) +
                Integer.parseInt(edextra3.text.toString()) +
                Integer.parseInt(edextra4.text.toString()) +
                Integer.parseInt(edextra5.text.toString())

        totAuxtra = Integer.parseInt(edauxilio.text.toString()) +
                Integer.parseInt(edauxilio2.text.toString()) +
                Integer.parseInt(edauxilio3.text.toString()) +
                Integer.parseInt(edauxilio4.text.toString()) +
                Integer.parseInt(edauxilio5.text.toString())

        totBonif = Integer.parseInt(edbonifica.text.toString()) +
                Integer.parseInt(edbonifica2.text.toString()) +
                Integer.parseInt(edbonifica3.text.toString()) +
                Integer.parseInt(edbonifica4.text.toString()) +
                Integer.parseInt(edbonifica5.text.toString())

        totDevenga = Integer.parseInt(totalDevengado.text.toString()) +
                Integer.parseInt(totalDevengado2.text.toString()) +
                Integer.parseInt(totalDevengado3.text.toString()) +
                Integer.parseInt(totalDevengado4.text.toString()) +
                Integer.parseInt(totalDevengado5.text.toString())

        totSalud = Integer.parseInt(edsalud.text.toString()) +
                Integer.parseInt(edsalud2.text.toString()) +
                Integer.parseInt(edsalud3.text.toString()) +
                Integer.parseInt(edsalud4.text.toString()) +
                Integer.parseInt(edsalud5.text.toString())

        totsaldosporpagar = Integer.parseInt(subtotalNomina.text.toString()) +
                Integer.parseInt(subtotalNomina2.text.toString()) +
                Integer.parseInt(subtotalNomina3.text.toString()) +
                Integer.parseInt(subtotalNomina4.text.toString()) +
                Integer.parseInt(subtotalNomina5.text.toString())

        val intent = Intent(view.context, RegistroActivity::class.java)
        intent.putExtra("totSalario",totSalario)
        intent.putExtra("totHextra",totHextra)
        intent.putExtra("totAuxtra",totAuxtra)
        intent.putExtra("totBonif",totBonif)
        intent.putExtra("totDevenga",totDevenga)
        intent.putExtra("totSalud",totSalud)
        intent.putExtra("totsaldosporpagar",totsaldosporpagar)
        startActivity(intent)
    }
}
