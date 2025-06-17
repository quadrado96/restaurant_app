package com.quadrado.app_restaurante

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quadrado.app_restaurante.databinding.ItemDoPedidoBinding

data class Pedido(
    val nome: String,
    val preco: String,
    val imagemResId: Int
)

class PedidoAdapter(
    private val listaPedidos: List<Pedido>
) : RecyclerView.Adapter<PedidoAdapter.PedidoViewHolder>() {

    inner class PedidoViewHolder(private val binding: ItemDoPedidoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pedido: Pedido) {
            binding.tvNomeProduto.text = pedido.nome
            binding.tvPrecoProduto.text = pedido.preco
            binding.imgProduto.setImageResource(pedido.imagemResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PedidoViewHolder {
        val binding = ItemDoPedidoBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PedidoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PedidoViewHolder, position: Int) {
        holder.bind(listaPedidos[position])
    }

    override fun getItemCount(): Int = listaPedidos.size
}
