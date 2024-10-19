package br.com.pedro.listrecyclerestados

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EstadoAcitivty:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val imgEstado = intent.getIntExtra("imgEstado",0)
        val tNome = intent.getStringExtra("tNome")
        val tDescricao = intent.getStringExtra("tDescricao")
        val tSigla = intent.getStringExtra("tSigla")
        val tCapital = intent.getStringExtra("tCapital")
        val tRegiao = intent.getStringExtra("tRegiao")


        if(imgEstado > 0){
            val img = findViewById<View>(R.id.img) as ImageView
            img.setImageResource(imgEstado)
        }

        val tNomeEstado = findViewById<TextView>(R.id.tNome)
        val tSiglaEstado = findViewById<TextView>(R.id.tSigla)
        val tDescricaoEstado = findViewById<TextView>(R.id.tDescricao)
        val tCapitalEstado = findViewById<TextView>(R.id.tCapital)
        val tRegiaoEstado = findViewById<TextView>(R.id.tRegiao)

        tNomeEstado.text = tNome
        tSiglaEstado.text = "Sigla: $tSigla"
        tDescricaoEstado.text = "Descrição: $tDescricao"
        tCapitalEstado.text = "Estado: ${tCapital}"
        tRegiaoEstado.text = "Regiao: ${tRegiao}"





    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> {
                supportFinishAfterTransition()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}