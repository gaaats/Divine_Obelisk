package com.artifexmundi.bale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.databinding.FragmentGaaame2Binding
import com.artifexmundi.bale.ggggggaaamem.GameToto
import com.artifexmundi.bale.ggggggaaamem.GimiVvv
import com.google.android.material.snackbar.Snackbar


class Gaaame2Fragment : Fragment(), GameToto {
    private var gggg: FragmentGaaame2Binding? = null
    private val btbuuuu get() = gggg ?: throw RuntimeException("FragmentGaaame2Binding = null")

    val lllll = listOf(
        R.drawable.tt,
        R.drawable.rr,
    )

    private var rfrgttt55freeeeer: GimiVvv? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gggg = FragmentGaaame2Binding.inflate(inflater, container, false)
        return btbuuuu.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        try {

            btbuuuu.root.background.alpha = 220
            btbuuuu.btnStartGaaame.setOnClickListener {
                rfrgttt55freeeeer =
                    GimiVvv(requireContext(), this, R.drawable.gggg, lllll)
                rfrgttt55freeeeer!!.setBackgroundResource(R.drawable.bacck)
                rfrgttt55freeeeer!!.background.alpha = 160
                btbuuuu.root.addView(rfrgttt55freeeeer)
                btbuuuu.btnStartGaaame.visibility = View.GONE
                btbuuuu.tvScoreGame1.visibility = View.GONE
                btbuuuu.imgLogoGame1.visibility = View.GONE
            }
        } catch (e: Exception) {
            ffgttggtiiiiii()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun ffgttggtiiiiii() {
        Snackbar.make(
            btbuuuu.root,
            "Error, error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onDestroy() {
        gggg = null
        super.onDestroy()
    }

    override fun vvvvv(score: Int) {
        val scscscrhhhhhh = "Score : $score"
        btbuuuu.root.removeView(rfrgttt55freeeeer)
        btbuuuu.tvScoreGame1.text = scscscrhhhhhh
        btbuuuu.btnStartGaaame.visibility = View.VISIBLE
        btbuuuu.tvScoreGame1.visibility = View.VISIBLE
        btbuuuu.imgLogoGame1.visibility = View.VISIBLE
        rfrgttt55freeeeer = null

        findNavController().navigate(R.id.action_gaaame2Fragment_to_gaame3Fragment)
    }



}