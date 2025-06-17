package com.quadrado.app_restaurante.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.quadrado.app_restaurante.PedidoActivity
import com.quadrado.app_restaurante.R
import com.quadrado.app_restaurante.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.root.findViewById<View>(R.id.img_qrcode).setOnClickListener {
            abrirTelaQrCode()
        }

        binding.root.findViewById<View>(R.id.btn_scan).setOnClickListener {
            abrirTelaQrCode()
        }

        return root
    }

    private fun abrirTelaQrCode() {
        val intent = Intent(requireContext(), PedidoActivity::class.java)
        startActivity(intent)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}