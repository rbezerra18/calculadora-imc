package jr.roberto.calculadoraimc

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle","CREATE. Estou criando a tela!")
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