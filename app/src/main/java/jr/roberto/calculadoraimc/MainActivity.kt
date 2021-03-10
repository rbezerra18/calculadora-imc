package jr.roberto.calculadoraimc

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setListeners()
        Log.w("lifecycle","CREATE. Estou criando a tela!")

        val alturaEDT: EditText = alturaEDT
        val pesoEDT: EditText = pesoEDT
        val calcularBTN: Button = calcularBTN

        alturaEDT?.doAfterTextChanged() { _ -> }

        pesoEDT.doOnTextChanged() { _, _, _, _ -> }

        calcularBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }

    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        var subtituloTXT: TextView = subtituloTXT
        val imc: Float

        if(peso != null && altura != null) {
            imc = peso / (altura * altura)
            subtituloTXT.setText("Seu IMC é $imc!")
        }

    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","START. Deixei a tela visível para você!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","RESUME. Agora você pode interagir com a tela!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","PAUSE. A tela perdeu o foco, não é possível interagir!")
    }

    override fun onStop() {
        Log.w("lifecycle","STOP. A tela não está visível, mas ainda existe!")
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle","RESTART. A tela está retomando o foco!")
    }

    override fun onDestroy() {
        Log.w("lifecycle","DESTROY. A tela foi destruída!")
        super.onDestroy()
    }

}