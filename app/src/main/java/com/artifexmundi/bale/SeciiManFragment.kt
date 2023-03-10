package com.artifexmundi.bale

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.cooont.Util26255
import com.artifexmundi.bale.cooont.Util26255.vfbgthhyhyhy
import com.artifexmundi.bale.cooont.Util26255.urlMainhyyhj2u
import com.artifexmundi.bale.vebbvii.ViModt6g2t2g
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeciiManFragment : Fragment() {
    val viewMainModel by activityViewModel<ViModt6g2t2g>(named("MainModel"))
    lateinit var countryDev: String
    lateinit var wv: String
    lateinit var apps: String
    private lateinit var mContext: Context

    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secii_man, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModel.bg2gb2gb5gb5.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                shareP.edit().putString("mainId", main).apply()
            }
        }

        viewMainModel.hy2hy2yh5hy5.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDev = it.geo
                apps = it.appsChecker
                wv = it.view

                shareP.edit().putString(vfbgthhyhyhy, countryDev).apply()
                shareP.edit().putString(Util26255.bghyyhhyhy, apps).apply()
                shareP.edit().putString(urlMainhyyhj2u, wv).apply()

                findNavController().navigate(R.id.action_seciiManFragment_to_prrrFiilFragment)
            }
        }
    }
}