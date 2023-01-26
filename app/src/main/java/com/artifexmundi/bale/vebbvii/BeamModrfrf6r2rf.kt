package com.artifexmundi.bale.vebbvii


import android.webkit.WebView
import androidx.lifecycle.ViewModel
import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class BeamModrfrf6r2rf(application: Application): ViewModel() {
    val g5tgg5ttg = application.packageManager
    fun gthy58yh(webView: WebView): WebSettings{
       val gt2gt5hy5y5hy5h = webView.settings
        gt2gt5hy5y5hy5h.javaScriptEnabled = true
        gt2gt5hy5y5hy5h.useWideViewPort = true
        gt2gt5hy5y5hy5h.loadWithOverviewMode = true
        gt2gt5hy5y5hy5h.allowFileAccess = true
        gt2gt5hy5y5hy5h.domStorageEnabled = true
        gt2gt5hy5y5hy5h.userAgentString = gt2gt5hy5y5hy5h.userAgentString.replace("; wv", "")
        gt2gt5hy5y5hy5h.javaScriptCanOpenWindowsAutomatically = true
        gt2gt5hy5y5hy5h.setSupportMultipleWindows(false)
        gt2gt5hy5y5hy5h.displayZoomControls = false
        gt2gt5hy5y5hy5h.builtInZoomControls = true
        gt2gt5hy5y5hy5h.allowFileAccess = true
        gt2gt5hy5y5hy5h.allowContentAccess = true
        gt2gt5hy5y5hy5h.setSupportZoom(true)
        gt2gt5hy5y5hy5h.pluginState = WebSettings.PluginState.ON
        gt2gt5hy5y5hy5h.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gt2gt5hy5y5hy5h.cacheMode = WebSettings.LOAD_DEFAULT
        gt2gt5hy5y5hy5h.allowContentAccess = true
        gt2gt5hy5y5hy5h.mediaPlaybackRequiresUserGesture = false
        return gt2gt5hy5y5hy5h
    }

    fun dedfrrgtgthyhy(uri: String): Boolean {
        try {
            g5tgg5ttg.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun hhyvccxedrfrfrf(id: String) {
        OneSignal.setExternalUserId(
            id,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val vfbggbgttgt = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vfbggbgttgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vfbgnhhnnh =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vfbgnhhnnh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val vfbggthyyhjuujki = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $vfbggthyyhjuujki"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }




}