package com.quadrado.app_restaurante

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ClienteAdapter(
    private val listaClientes: List<Cliente>
) : RecyclerView.Adapter<ClienteAdapter.ClienteViewHolder>() {

    inner class ClienteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNome: TextView = itemView.findViewById(R.id.tv_nome)
        val tvDataEntrada: TextView = itemView.findViewById(R.id.tv_data_entrada)
        val tvStatusPagamento: TextView = itemView.findViewById(R.id.tv_status_pagamento)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClienteViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cliente, parent, false)
        return ClienteViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClienteViewHolder, position: Int) {
        val cliente = listaClientes[position]
        holder.tvNome.text = cliente.nome
        holder.tvDataEntrada.text = "Entrada: ${cliente.dataEntrada}"
        holder.tvStatusPagamento.apply {
            if (cliente.dataSaida == null) {
                text = "Saída: Pendente"
                setTextColor(ContextCompat.getColor(context, android.R.color.holo_red_dark))
            } else {
                text = "Saída: ${cliente.dataSaida}"
                setTextColor(ContextCompat.getColor(context, android.R.color.holo_green_dark))
            }
        }
    }

    override fun getItemCount(): Int = listaClientes.size
}
