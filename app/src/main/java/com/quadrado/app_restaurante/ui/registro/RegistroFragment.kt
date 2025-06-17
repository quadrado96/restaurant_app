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
            Cliente("João Silva", "17/06/2025 10h00", null),
            Cliente("Maria Souza", "16/06/2025 09h30", "17/06/2025 11h15"),
            Cliente("Carlos Lima", "15/06/2025 14h00", null),
            Cliente("Brunno Quadrado", "17/06/2025 08h45", "17/06/2025 10h30"),
            Cliente("Ruan Alexandre", "16/06/2025 12h10", null),
            Cliente("Daniel Jeronimo", "15/06/2025 16h20", "15/06/2025 18h00"),
            Cliente("Filipe Bárbaro", "14/06/2025 11h00", null),
            Cliente("Michael Nakamura", "13/06/2025 13h35", "13/06/2025 15h50"),
            Cliente("Larissa Martins", "17/06/2025 09h00", null),
            Cliente("Beatriz Lima", "16/06/2025 10h20", "16/06/2025 12h15"),
            Cliente("Renato Silva", "15/06/2025 17h10", null),
            Cliente("Tatiane Alves", "14/06/2025 14h00", "14/06/2025 16h40"),
            Cliente("Fernando Rocha", "13/06/2025 09h30", null),
            Cliente("Camila Dias", "12/06/2025 15h45", "12/06/2025 18h10"),
            Cliente("Lucas Mendes", "11/06/2025 13h00", null)
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
