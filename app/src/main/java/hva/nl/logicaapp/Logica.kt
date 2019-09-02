package hva.nl.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.logica.*

class Logica : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logica)

        btnSubmit.setOnClickListener {checkAnswer()}
    }

    private fun checkAnswer() {
        val answer1 = txtAnswer1.text.toString()
        val answer2 = txtAnswer2.text.toString()
        val answer3 = txtAnswer3.text.toString()
        val answer4 = txtAnswer4.text.toString()

        if (answer1 != getString(R.string.t)
            || answer2 != getString(R.string.f)
            || answer3 != getString(R.string.f)
            || answer4 != getString(R.string.f)
        ) {
            return Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }

        return Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }
}
