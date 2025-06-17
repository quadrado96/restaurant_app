package com.quadrado.app_restaurante.ui.cardapio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.quadrado.app_restaurante.Produto
import com.quadrado.app_restaurante.databinding.FragmentCardapioBinding

class CardapioFragment : Fragment() {

    private var _binding: FragmentCardapioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardapioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val listaProdutos = listOf(
            Produto("Coxinha de Frango", 6.0),
            Produto("Esfiha de Carne", 5.5),
            Produto("Kibe Recheado", 6.5),
            Produto("Empada de Frango", 6.0),
            Produto("Pastel de Queijo", 5.0),
            Produto("Risole de Presunto e Queijo", 5.5),
            Produto("Enroladinho de Salsicha", 5.0),
            Produto("Quibe Vegetariano", 6.0),
            Produto("Croquete de Carne", 6.5),
            Produto("Bolinha de Queijo", 4.5),
            Produto("Mini Pizza de Calabresa", 7.0),
            Produto("Pão de Queijo", 3.0),
            Produto("Pastel de Carne", 5.5),
            Produto("Coxinha de Jaca", 6.0),
            Produto("Esfiha de Frango com Catupiry", 6.5),
            Produto("Torta Salgada de Legumes", 7.0),
            Produto("Refrigerante Lata", 5.0),
            Produto("Suco Natural", 6.0),
            Produto("Água Mineral", 3.0)
        )


        val adapter = ProdutoAdapter(
            produtos = listaProdutos,
            onAddClick = { produto -> /* ação de adicionar */ },
            onRemoveClick = { produto -> /* ação de remover */ }
        )

        binding.recyclerCardapio.adapter = adapter

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}