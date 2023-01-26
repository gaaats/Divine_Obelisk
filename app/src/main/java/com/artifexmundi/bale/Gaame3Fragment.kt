package com.artifexmundi.bale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.databinding.FragmentGaame3Binding
import com.google.android.material.snackbar.Snackbar


class Gaame3Fragment : Fragment() {
    private var gaame3Binding: FragmentGaame3Binding? = null
    private val binding
        get() = gaame3Binding ?: throw RuntimeException("FragmentGaame3Binding = null")




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gaame3Binding = FragmentGaame3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gthgithgihtghu()
            hgitughhgthtghgt()

        } catch (e: Exception) {
            ujujujujuj()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun hgitughhgthtghgt() {
        binding.btnTryAgain.setOnClickListener {
            gtgtgtihigthgt()
        }
    }

    private fun gtgtgtihigthgt() {
        findNavController().navigate(R.id.action_gaame3Fragment_to_gaame1Fragment)
    }

    private fun gthgithgihtghu() {
        binding.btnExit.setOnClickListener {
            aaaaaaaaa()
        }
    }

    override fun onDestroy() {
        gaame3Binding = null
        super.onDestroy()
    }

    private fun aaaaaaaaa() {
        AlertDialog.Builder(requireContext())
            .setTitle("CLOSE")
            .setMessage("Please, do not close me, CLOSE?")
            .setPositiveButton("Yes, CLOSE") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("No") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
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