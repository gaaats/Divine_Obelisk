package com.artifexmundi.bale.vebbvii

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.artifexmundi.bale.apii.CountryCodeJS
import com.artifexmundi.bale.apii.CountryRepohyyhyh
import com.artifexmundi.bale.apii.DevRepo
import com.artifexmundi.bale.apii.GeoDev
import com.artifexmundi.bale.cooont.Util26255.apppshy6
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViModt6g2t2g(
    private val hyhyyhjujkikiik: CountryRepohyyhyh,
    private val bgnhhyyhhy: DevRepo,
    private val nhjuujujki: SharedPreferences,
    val bggthyyhhy: Application
) : ViewModel() {



    private val bghyyhhy3 = MutableLiveData<CountryCodeJS>()
    val gntjtgitg: LiveData<CountryCodeJS>
        get() = bghyyhhy3

    private val g2tg6gt = MutableLiveData<GeoDev>()
    val hy2hy2yh5hy5: LiveData<GeoDev>
        get() = g2tg6gt

    init {
        viewModelScope.launch(Dispatchers.IO) {
            t2g25t5ggt5hyyh()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getData()
        }
    }

    private val gt2tg25t5tg = MutableLiveData<String>()
    val nh2hn2n5j5j5j: LiveData<String>
        get() = gt2tg25t5tg

    private val hy2hy2h5uj5uj5 = MutableLiveData<String?>()
    val bg2gb2gb5gb5: LiveData<String?>
        get() = hy2hy2h5uj5uj5


    suspend fun getData() {
        bghyyhhy3.postValue(hyhyyhjujkikiik.hyyhyhhyyh5().body())
        gt2gt2gt2gt5tg5tgfff()
    }




    private val gt2gtgt25gt52tg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            gt2tg25t5tg.postValue(dataGotten)

            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search")
                        .logEvent(bggthyyhhy.applicationContext)

                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube")
                        .logEvent(bggthyyhhy.applicationContext)


                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display")
                        .logEvent(bggthyyhhy.applicationContext)

                }

                else -> {


                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel")
                        .logEvent(bggthyyhhy.applicationContext)
                    Log.d("Branch Check", "I'm here, branch bitch! No source though")
                }

            }

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }

    suspend fun gt2gt2gt2gt5tg5tgfff() {
        g2tg6gt.postValue(bgnhhyyhhy.hykyhhyoihyjhiy().body())
    }

    fun bgbgnh2hn5h5(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apppshy6, gt2gtgt25gt52tg, bggthyyhhy)
        AppsFlyerLib.getInstance().start(cont)
    }


    fun t2g25t5ggt5hyyh() {
        val vfbgbnhhnnjj = AdvertisingIdClient(bggthyyhhy)
        vfbgbnhhnnjj.start()
        val bhyyhjuujkiikik = vfbgbnhhnnjj.info.id.toString()
        hy2hy2h5uj5uj5.postValue(bhyyhjuujkiikik)
    }

    fun fbDeeegtgtt5g5tg(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val g2gt5tghyhyy = data.targetUri?.host.toString()
                nhjuujujki.edit().putString("deepSt", g2gt5tghyhyy).apply()
            }
        }
    }


}