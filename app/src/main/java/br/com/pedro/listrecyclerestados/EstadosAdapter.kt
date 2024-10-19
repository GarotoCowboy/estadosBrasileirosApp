package br.com.pedro.listrecyclerestados

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadosAdapter(
    private val context: Context,
    private val estados: List<Estados>?,
    private val onClickListener: EstadoOnClickListener
) :
    RecyclerView.Adapter<EstadosAdapter.EstadosViewHolder>() {

    interface EstadoOnClickListener {
        fun onClickEstado(holder: EstadosViewHolder?, idx: Int)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int):
                                                                EstadosViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.adapter_estados, viewGroup, false)
        return EstadosViewHolder(view)
    }

    override fun getItemCount(): Int = estados!!.size

    override fun onBindViewHolder(holder: EstadosViewHolder, position: Int) {
        val estado = estados!![position]

        holder.tNome.text = estado.nome
        holder.img.setImageResource(estado.img)

        holder.itemView.setOnClickListener{
            onClickListener.onClickEstado(holder,position)
        }
    }

    class EstadosViewHolder(view:View):RecyclerView.ViewHolder(view){
        val img: ImageView = view.findViewById(R.id.img)
        var tNome:TextView = view.findViewById(R.id.tNome)
    }
}