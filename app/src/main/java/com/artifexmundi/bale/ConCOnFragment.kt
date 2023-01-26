package com.artifexmundi.bale

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.artifexmundi.bale.cooont.Util26255.hyjjujujujuj
import com.artifexmundi.bale.vebbvii.ViModt6g2t2g
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class ConCOnFragment : Fragment() {
    private lateinit var mContext: Context


    val shareP: SharedPreferences by inject(named("SharedPreferences"))
    val viewMainModel by activityViewModel<ViModt6g2t2g>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_con_c_on, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModel.gntjtgitg.observe(viewLifecycleOwner) {
            if (it!=null) {
                country = it.cou
                shareP.edit().putString(hyjjujujujuj, country).apply()
                findNavController().navigate(R.id.action_conCOnFragment_to_seciiManFragment)
            }
        }
    }
}