package com.artifexmundi.bale

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.cooont.Util26255.bghyyhhyhy
import com.artifexmundi.bale.vebbvii.ViModt6g2t2g
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PrrrFiilFragment : Fragment() {

    val viewMainModel by activityViewModel<ViModt6g2t2g>(named("MainModel"))
    val shareP: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var appCamp: String
    private lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prrr_fiil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val checkFly = shareP.getString(bghyyhhyhy, null)
        val appsCamp = shareP.getString("appCamp", null)

        if (checkFly=="1" &&appsCamp == null) {
            viewMainModel.bgbgnh2hn5h5(mContext)
            viewMainModel.nh2hn2n5j5j5j.observe(viewLifecycleOwner) {
                if (it != null) {
                    appCamp = it.toString()
                    shareP.edit().putString("appCamp", appCamp).apply()
                    findNavController().navigate(R.id.action_prrrFiilFragment_to_fillloFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_prrrFiilFragment_to_fillloFragment)
        }
    }

}