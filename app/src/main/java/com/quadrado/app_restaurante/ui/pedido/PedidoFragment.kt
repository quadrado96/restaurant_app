package com.quadrado.app_restaurante.ui.pedido

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.quadrado.app_restaurante.Pedido
import com.quadrado.app_restaurante.PedidoAdapter
import com.quadrado.app_restaurante.R
import com.quadrado.app_restaurante.databinding.FragmentPedidoBinding

class PedidoFragment : Fragment() {

    private var _binding: FragmentPedidoBinding? = null
    private val binding get() = _binding!!

    private lateinit var pedidoAdapter: PedidoAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this).get(PedidoViewModel::class.java)
        _binding = FragmentPedidoBinding.inflate(inflater, container, false)

        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val listaPedidos = listOf(
            Pedido("Pastel de Queijo", "R$ 5,00", R.drawable.restaurant_fill),
            Pedido("Pastel de Queijo", "R$ 5,00", R.drawable.restaurant_fill),
            Pedido("Esfiha de Carne", "R$ 5,50", R.drawable.restaurant_fill),
            Pedido("Suco Natural", "R$ 6,00", R.drawable.restaurant_fill),
            Pedido("Coxinha de Frango", "R$ 6,00", R.drawable.restaurant_fill)
        )

        pedidoAdapter = PedidoAdapter(listaPedidos)
        binding.recyclerPedido.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = pedidoAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
