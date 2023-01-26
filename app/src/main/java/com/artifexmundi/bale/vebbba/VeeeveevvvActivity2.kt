package com.artifexmundi.bale.vebbba

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.artifexmundi.bale.cooont.Util26255.aps_idhyhy2hy
import com.artifexmundi.bale.cooont.Util26255.frgtgttggt
import com.artifexmundi.bale.cooont.Util26255.myIdhyyh
import com.artifexmundi.bale.databinding.ActivityVeeeveevvv2Binding
import com.artifexmundi.bale.vebbvii.BeamModrfrf6r2rf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VeeeveevvvActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hy255u = ActivityVeeeveevvv2Binding.inflate(layoutInflater)
        bgh2hyu5 = WebView(this)
        setContentView(bgh2hyu5)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(bgh2hyu5, true)
        viewBeamModelgt2tg2tg.gthy58yh(bgh2hyu5)

        bgh2hyu5.webViewClient = CustomViewgtgt62()
        bgh2hyu5.webChromeClient = ChromeClient36255()
        bgh2hyu5.loadUrl(gthybvffvvffv())
    }

    private lateinit var hy255u: ActivityVeeeveevvv2Binding
    lateinit var bgh2hyu5: WebView
    private var vfgbghyhyujjukid: ValueCallback<Array<Uri>>? = null
    private var vfbggtrfededhyh: String? = null
    private  val vfbgbgttggt = 1

    private val viewBeamModelgt2tg2tg by viewModel<BeamModrfrf6r2rf>(
        named("BeamModel")
    )


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != vfbgbgttggt || vfgbghyhyujjukid == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (vfbggtrfededhyh != null) {
                    results = arrayOf(Uri.parse(vfbggtrfededhyh))
                }
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    results = arrayOf(Uri.parse(dataString))
                }
            }
        }
        vfgbghyhyujjukid!!.onReceiveValue(results)
        vfgbghyhyujjukid = null
        return
    }

    inner class CustomViewgtgt62: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (viewBeamModelgt2tg2tg.dedfrrgtgthyhy(url)) {

                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    startActivity(intent)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            vfbgbnhnjmjm(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VeeeveevvvActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class ChromeClient36255 : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            vfgbghyhyujjukid?.onReceiveValue(null)
            vfgbghyhyujjukid = filePath
            var hyjjujuuj: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (hyjjujuuj!!.resolveActivity(packageManager) != null) {
                var hyjujuj: File? = null
                try {
                    hyjujuj = bgbgnhnhmjmjkk()
                    hyjjujuuj.putExtra("PhotoPath", vfbggtrfededhyh)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (hyjujuj != null) {
                    vfbggtrfededhyh = "file:" + hyjujuj.absolutePath
                    hyjjujuuj.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(hyjujuj)
                    )
                } else {
                    hyjjujuuj = null
                }
            }
            val ccdeeeded = Intent(Intent.ACTION_GET_CONTENT)
            ccdeeeded.addCategory(Intent.CATEGORY_OPENABLE)
            ccdeeeded.type = "image/*"
            val vfbggtgt: Array<Intent?> = hyjjujuuj?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val gthyhyhy = Intent(Intent.ACTION_CHOOSER)
            gthyhyhy.putExtra(Intent.EXTRA_INTENT, ccdeeeded)
            gthyhyhy.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            gthyhyhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, vfbggtgt)
            startActivityForResult(gthyhyhy, vfbgbgttggt)
            return true
        }

        fun bgbgnhnhmjmjkk(): File? {
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileName = "JPEG_" + timeStamp + "_"
            val storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
            )
        }
    }

    private fun gthybvffvvffv(): String {

        val cddsxcdcddc = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val cdvfbggbbg = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val vfbgnhhnnh = cdvfbggbbg.getString(frgtgttggt, null)
        Log.d("Lololol", vfbgnhhnnh.toString())
        val bgnhnhnhnh = cdvfbggbbg.getString(myIdhyyh, null)
        val bgnhnhnmj = cdvfbggbbg.getString(aps_idhyhy2hy, null)


        when (cdvfbggbbg.getString("WebInt", null)) {
            "campaign" -> {
                viewBeamModelgt2tg2tg.hhyvccxedrfrfrf(bgnhnhnmj.toString())
            }
            "deepLink" -> {
                viewBeamModelgt2tg2tg.hhyvccxedrfrfrf(bgnhnhnmj.toString())
            }
            "deepLinkNOApps" -> {
                viewBeamModelgt2tg2tg.hhyvccxedrfrfrf(bgnhnhnhnh.toString())
            }
            "geo" -> {
                viewBeamModelgt2tg2tg.hhyvccxedrfrfrf(bgnhnhnhnh.toString())
            }
        }
        return cddsxcdcddc.getString("SAVED_URL", vfbgnhhnnh).toString()
    }

    var hyjuujuj336 = ""
    fun vfbgbnhnjmjm(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (hyjuujuj336 == "") {
                hyjuujuj336 = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }
    private var vfbgbnhfrfrfhygt = false
    override fun onBackPressed() {

        if (bgh2hyu5.canGoBack()) {
            if (vfbgbnhfrfrfhygt) {
                bgh2hyu5.stopLoading()
                bgh2hyu5.loadUrl(hyjuujuj336)
            }
            this.vfbgbnhfrfrfhygt = true
            bgh2hyu5.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                vfbgbnhfrfrfhygt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}

