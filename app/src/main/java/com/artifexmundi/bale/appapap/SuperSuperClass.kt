package com.artifexmundi.bale.appapap


import com.artifexmundi.bale.cooont.Util26255.myIdhyyh
import com.artifexmundi.bale.innt.bghyhyjujik3ik62
import com.artifexmundi.bale.innt.nhhjuujkiikik
import com.my.tracker.MyTracker
import android.app.Application
import android.content.Context
import com.artifexmundi.bale.cooont.Util26255.thyyh
import com.artifexmundi.bale.cooont.Util26255.instIdhyhy
import com.artifexmundi.bale.cooont.Util26255.hyhyh
import com.onesignal.OneSignal
import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class SuperSuperClass:Application() {


    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(thyyh)
        gtojggtgthgithgthugt()
        gtgituhghtihghthugut()

        val bghydsdcc = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val settingsggt = getSharedPreferences("PREFS_NAME", 0)

        val trackerParams26226 = MyTracker.getTrackerParams()
        val trackerConfig2625 = MyTracker.getTrackerConfig()
        val instID255 = MyTracker.getInstanceId(this)
        trackerConfig2625.isTrackingLaunchEnabled = true
        val IDIN2555 = UUID.randomUUID().toString()

        if (settingsggt.getBoolean("my_first_time", true)) {
            trackerParams26226.setCustomUserId(IDIN2555)
            bghydsdcc.edit().putString(myIdhyyh, IDIN2555).apply()
            bghydsdcc.edit().putString(instIdhyhy, instID255).apply()
            settingsggt.edit().putBoolean("my_first_time", false).apply()
        } else {
            val shIDIN2255 = bghydsdcc.getString(myIdhyyh, IDIN2555)
            trackerParams26226.setCustomUserId(shIDIN2255)
        }
        MyTracker.initTracker(hyhyh, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@SuperSuperClass)
            modules(
                listOf(
                    nhhjuujkiikik, bghyhyjujik3ik62
                )
            )
        }
    }

    private fun gtgituhghtihghthugut() {
        Branch.getAutoInstance(this)
    }

    private fun gtojggtgthgithgthugt() {
        Branch.enableTestMode()
    }
}