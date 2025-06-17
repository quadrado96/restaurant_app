package com.quadrado.app_restaurante.ui.cardapio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.quadrado.app_restaurante.Produto
import com.quadrado.app_restaurante.R

class ProdutoAdapter(
    private val produtos: List<Produto>,
    private val onAddClick: (Produto) -> Unit,
    private val onRemoveClick: (Produto) -> Unit
) : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {

    inner class ProdutoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nome: TextView = view.findViewById(R.id.tv_nome_produto)
        val preco: TextView = view.findViewById(R.id.tv_preco_produto)
        val imagem: ImageView = view.findViewById(R.id.img_produto)
        val botaoAdd: ImageView = view.findViewById(R.id.img_acao_1)
        val botaoSub: ImageView = view.findViewById(R.id.img_acao_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_produto, parent, false)
        return ProdutoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = produtos[position]
        holder.nome.text = produto.nome
        holder.preco.text = "R$ %.2f".format(produto.preco)

        holder.botaoAdd.setOnClickListener { onAddClick(produto) }
        holder.botaoSub.setOnClickListener { onRemoveClick(produto) }
    }

    override fun getItemCount(): Int = produtos.size
}
