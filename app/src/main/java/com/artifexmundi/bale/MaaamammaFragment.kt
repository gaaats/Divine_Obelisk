package com.artifexmundi.bale

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.vebbvii.ViModt6g2t2g
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MaaamammaFragment : Fragment() {
    private lateinit var mContext: Context

    val viewMainModel by activityViewModel<ViModt6g2t2g>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_maaamamma, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewMainModel.fbDeeegtgtt5g5tg(mContext)

        findNavController().navigate(R.id.action_maaamammaFragment_to_conCOnFragment)

    }
}