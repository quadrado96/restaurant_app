package com.quadrado.app_restaurante.ui.registro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.quadrado.app_restaurante.Cliente
import com.quadrado.app_restaurante.ClienteAdapter
import com.quadrado.app_restaurante.R
import com.quadrado.app_restaurante.databinding.FragmentRegistroBinding

class RegistroFragment : Fragment() {

    private var _binding: FragmentRegistroBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val registroViewModel =
            ViewModelProvider(this)[RegistroViewModel::class.java]

        _binding = FragmentRegistroBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurando a RecyclerView
        val listaClientes = listOf(
            Cliente("Amanda Torres", "18/06/2025 08h00", "18/06/2025 09h45"),
            Cliente("Beatriz Lima", "18/06/2025 10h20", "18/06/2025 12h15"),
            Cliente("Brunno Quadrado", "18/06/2025 08h45", "18/06/2025 10h30"),
            Cliente("Camila Dias", "18/06/2025 15h45", "18/06/2025 18h10"),
            Cliente("Carlos Lima", "18/06/2025 14h00", null),
            Cliente("Daniel Jeronimo", "18/06/2025 09h15", "18/06/2025 11h00"),
            Cliente("Eduardo Martins", "18/06/2025 11h30", null),
            Cliente("Fernando Rocha", "18/06/2025 09h30", null),
            Cliente("Filipe Bárbaro", "18/06/2025 11h00", null),
            Cliente("João Silva", "18/06/2025 10h00", null),
            Cliente("Larissa Martins", "18/06/2025 09h00", null),
            Cliente("Lucas Mendes", "18/06/2025 13h00", null),
            Cliente("Maria Souza", "18/06/2025 09h30", "18/06/2025 11h15"),
            Cliente("Michael Nakamura", "18/06/2025 13h35", "18/06/2025 15h50"),
            Cliente("Nathalia Ribeiro", "18/06/2025 12h50", "18/06/2025 14h20"),
            Cliente("Renato Silva", "18/06/2025 17h10", null),
            Cliente("Roberto Nunes", "18/06/2025 16h10", null),
            Cliente("Ruan Alexandre", "18/06/2025 12h10", null),
            Cliente("Tatiane Alves", "18/06/2025 14h00", "18/06/2025 16h40"),
            Cliente("Vitória Ferreira", "18/06/2025 10h40", null)
        )




        val adapter = ClienteAdapter(listaClientes)
        binding.recyclerClientes.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerClientes.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
