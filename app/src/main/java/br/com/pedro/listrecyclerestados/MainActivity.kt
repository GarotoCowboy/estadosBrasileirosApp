package br.com.pedro.listrecyclerestados

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var estados: List<Estados>? = emptyList()
    private lateinit var adapter: EstadosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
        // }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        recyclerView = findViewById(R.id.viewEstados)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        estados = Estados.EstadosData.getEstados()

        adapter = EstadosAdapter(this, estados, onClickEstados())

        recyclerView.adapter = adapter

    }

    private fun onClickEstados(): EstadosAdapter.EstadoOnClickListener {
     return object : EstadosAdapter.EstadoOnClickListener{

         @SuppressLint("RestrictedApi")
         override fun onClickEstado(holder: EstadosAdapter.EstadosViewHolder?, idx: Int) {
            val estado = estados?.getOrNull(idx) ?: return
             val intent = Intent(baseContext,EstadoAcitivty::class.java)
             val img: ImageView = holder!!.img
             intent.putExtra("imgEstado",estado.img)
             intent.putExtra("tNome",estado.nome)
             intent.putExtra("tSigla",estado.sigla)
             intent.putExtra("tDescricao",estado.descricao)
             intent.putExtra("tCapital",estado.capital)
             intent.putExtra("tRegiao",estado.regiao)




             startActivity(intent)

         }

     }
    }
}

