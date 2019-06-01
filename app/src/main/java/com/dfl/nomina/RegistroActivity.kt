package com.dfl.nomina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val totSalario = intent.getIntExtra("totSalario", 0)
        lbsuaeldos.text = totSalario.toString()

        val totHextra = intent.getIntExtra("totHextra", 0)
        lbHextra.text = totHextra.toString()

        val totAuxtra = intent.getIntExtra("totAuxtra", 0)
        lbAuxtra.text = totAuxtra.toString()

        val totBonif = intent.getIntExtra("totBonif", 0)
        val totDevenga = intent.getIntExtra("totDevenga", 0)
        val cesantias = ((totDevenga - totBonif) * 0.0833).toInt()
        lbcesantias.text = cesantias.toString()
        val Intcesantias = (cesantias * 0.01).toInt()
        lbIntcesantias.text = Intcesantias.toString()

        lbPrimServ.text = cesantias.toString()
        val vcaciones = ((totDevenga - totBonif) * 0.0416).toInt()
        lbvcaciones.text = vcaciones.toString()

        lbbonificaciones.text = totBonif.toString()

        val Arl = ((totDevenga - totAuxtra) * 0.01).toInt()
        lbarl.text = Arl.toString()

        val pension = ((totDevenga - totAuxtra) * 0.12).toInt()
        lbpension.text = pension.toString()

        val cajacompensa = ((totDevenga - totAuxtra) * 0.04).toInt()
        lbcajacomp.text = cajacompensa.toString()

        val totgastperso =
            cajacompensa + pension + Arl + totBonif + vcaciones + cesantias + Intcesantias + cesantias + totAuxtra + totHextra + totSalario
        gastPersonal.text = totgastperso.toString()

        val totSalud = intent.getIntExtra("totSalud", 0)
        lbAportSalud.text = totSalud.toString()

        lbAportARL.text = Arl.toString()

        lbcajas.text = cajacompensa.toString()

        val retenomina = cajacompensa + Arl + totSalud
        lbtotAporNomina.text = retenomina.toString()

        val aporvarios = pension + totSalud
        lbpensioVarios.text = aporvarios.toString()
        totvarios.text = aporvarios.toString()

        lboblCesantias.text = cesantias.toString()
        lbIntcesantiados.text = Intcesantias.toString()
        lbPrimServdos.text = cesantias.toString()
        lbvcacionesdos.text = vcaciones.toString()

        val totobligaciones = cesantias + Intcesantias + cesantias + vcaciones
        lbtotobliglabo.text = totobligaciones.toString()

        val totsaldosporpagar = intent.getIntExtra("totsaldosporpagar", 0)
        lbsaldospagar.text = totsaldosporpagar.toString()

        totalDebe.text = totgastperso.toString()
        val totdescu = retenomina + aporvarios + totobligaciones + totsaldosporpagar
        totalHaber.text = totdescu.toString()
    }
}
