package com.artifexmundi.bale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.databinding.FragmentGaame1Binding
import com.google.android.material.snackbar.Snackbar


class Gaame1Fragment : Fragment() {
    private var fragmentGaame1Binding: FragmentGaame1Binding? = null
    private val binding
        get() = fragmentGaame1Binding ?: throw RuntimeException("FragmentGaame1Binding = null")




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaame1Binding = FragmentGaame1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gthgigthghtghgthgt()



        } catch (e: Exception) {
            ujujujujuj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gthgigthghtghgthgt() {
        binding.btnPlayGameeee.setOnClickListener {
            ghtiigthgtihgthghgth()
        }
    }

    private fun ghtiigthgtihgthghgth() {
        ggthhigthgth()
    }

    private fun ggthhigthgth() {
        findNavController().navigate(R.id.action_gaame1Fragment_to_gaaame2Fragment)
    }


    override fun onDestroy() {
        fragmentGaame1Binding = null
        super.onDestroy()
    }


    private fun ujujujujuj() {
        Snackbar.make(
            binding.root,
            "Error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}