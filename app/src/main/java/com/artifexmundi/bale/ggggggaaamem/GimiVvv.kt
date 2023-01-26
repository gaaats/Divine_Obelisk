package com.artifexmundi.bale.ggggggaaamem

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.artifexmundi.bale.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GimiVvv(
    var bgbgbggb: Context,
    var gggggggg: GameToto,
    val bbbbbbb: Int,
    val kkkk: List<Int>
) : View(bgbgbggb) {


    private var vcvvcvc = 8
    private var vbbvvbbvvb: Paint? = null
    private var popoopo: Paint? = null
    private var nbnbnbnb = 0
    private var mjmjmj = Paint()
    private var kjkjjkjk = 0
    private var yyyyy = 0
    private var nhnnhnh: Paint? = null

    private var uuu = 0
    private var kikiik = 0
    private var tltltltlt = ""

    private var sssss = 3


    var cdccd = System.currentTimeMillis()

    private var fgtgtgt = 0

    private var totototo = ArrayList<HashMap<String, Any>>()
    private var gtgtjt = ArrayList<HashMap<String, Any>>()



    var eeee4 = kkkk.random()


    init {
        nhnnhnh = Paint()
        mjmjmj.color = Color.GREEN
        vbbvvbbvvb = Paint()
        popoopo = Paint()
        popoopo!!.textSize = 100f
        popoopo!!.alpha = 190
        popoopo!!.color = Color.WHITE
    }

    private fun mkmkmkmk() {
        Snackbar.make(
            this,
            "Error, error, error...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onDraw(canvas: Canvas?) {

        canvas!!.drawText(
            tltltltlt,
            uuu / 2f - 220f,
            kikiik / 2f,
            popoopo!!
        )


        super.onDraw(canvas)

        uuu = this@GimiVvv.measuredWidth
        kikiik = this@GimiVvv.measuredHeight

        var vfvfvfvf = System.currentTimeMillis() - cdccd

        if (nbnbnbnb % 700 < 10 + vcvvcvc) {
            val mmmmm = HashMap<String, Any>()

            mmmmm["lane"] = (0..2).random()
            mmmmm["startTime"] = nbnbnbnb
            totototo.add(mmmmm)
        }
        nbnbnbnb = nbnbnbnb + 10 + vcvvcvc
        val ffffff4 = uuu / 5
        val yhyhhyhy = ffffff4 + 10
        nhnnhnh!!.style = Paint.Style.FILL

        val vvffvf = resources.getDrawable(bbbbbbb, null)

        vvffvf.setBounds(
            kjkjjkjk * uuu / 3 + uuu / 15 + 5,
            kikiik - 120 - yhyhhyhy,
            kjkjjkjk * uuu / 3 + uuu / 15 + ffffff4 - 25+50+60,
            kikiik - 20
        )
        vvffvf.draw(canvas!!)
        nhnnhnh!!.color = Color.GREEN
        var cccf = 0

        vvcvv(canvas)


        if (vfvfvfvf >= 5000) {
            eeee4 = kkkk.random()
            cdccd = System.currentTimeMillis()
            vcvvcvc = vcvvcvc + 1 + Math.abs(yyyyy / 8)

            val mbmbmbmbmb = HashMap<String, Any>()
            mbmbmbmbmb["lane"] = (0..2).random()
            mbmbmbmbmb["startTime"] = nbnbnbnb
            gtgtjt.add(mbmbmbmbmb)
        }


        for (i in totototo.indices) {
            try {
                val edfrgfrgtgt = totototo[i]["lane"] as Int * uuu / 3 + uuu / 15
                var frgttt = nbnbnbnb - totototo[i]["startTime"] as Int


                val ddedfrkPodfrk = resources.getDrawable(eeee4, null)

                ddedfrkPodfrk.setBounds(
                    edfrgfrgtgt + 25,
                    frgttt - yhyhhyhy,
                    edfrgfrgtgt + ffffff4,
                    frgttt
                )
                ddedfrkPodfrk.draw(canvas)
                if (totototo[i]["lane"] as Int == kjkjjkjk) {
                    if (frgttt > kikiik - 2 - yhyhhyhy && frgttt < kikiik - 2) {
                        Log.d("life", "life is ${sssss}")

                        when (sssss) {
                            0 -> {
                                gggggggg.vvvvv(yyyyy)
                            }
                            1 -> {
                                gggggggg.vvvvv(yyyyy)
                            }
                            2 -> {
                                tltltltlt = "1 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                mjmjmj.color = Color.RED
                                sssss--
                                totototo.clear()
                            }
                            3 -> {
                                mjmjmj.color = Color.YELLOW
                                tltltltlt = "2 ♥ left"
                                CoroutineScope(Dispatchers.Main).launch {
                                    delay(800)
                                    tltltltlt = ""
                                }
                                popoopo!!.alpha = 200
                                sssss--
                                totototo.clear()
                            }
                        }
                    }
                    if (frgttt > kikiik + yhyhhyhy) {
                        totototo.removeAt(i)
                        yyyyy++
                        fgtgtgt++

                        if (yyyyy > cccf) {
                            cccf = yyyyy
                        }
                    }
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }



        nhnnhnh!!.color = Color.WHITE
        nhnnhnh!!.textSize = 40f
        canvas.drawText("Score: $yyyyy", 80f, kikiik - 40f, nhnnhnh!!)
        canvas.drawText("Speed: $vcvvcvc", 380f, kikiik - 40f, nhnnhnh!!)
        canvas!!.drawRect(
            (uuu - 200).toFloat(), kikiik - 40f,
            (uuu - 200 + 60 * sssss).toFloat(), kikiik - 80f, mjmjmj
        )


        invalidate()
    }

    private fun vvcvv(canvas: Canvas): Boolean {
        val jhjhjhj = uuu / 5
        val nhnhnhhn = jhjhjhj + 10
        vbbvvbbvvb!!.style = Paint.Style.FILL

        for (i in gtgtjt.indices) {

            val bvbvvbvb = gtgtjt[i]["lane"] as Int * uuu / 3 + uuu / 15
            var bgbgbgbg = nbnbnbnb - gtgtjt[i]["startTime"] as Int

            val mjmkmkmk = resources.getDrawable(R.drawable.cross, null)
            mjmkmkmk.setBounds(bvbvvbvb + 25, bgbgbgbg - nhnhnhhn, bvbvvbvb + nhnhnhhn, bgbgbgbg)
            mjmkmkmk.draw(canvas)

            if (gtgtjt[i]["lane"] as Int == kjkjjkjk) {
                if (bgbgbgbg > kikiik - 2 - nhnhnhhn && bgbgbgbg < kikiik - 2) {
                    when (sssss) {
                        1 -> {
                            sssss++
                            tltltltlt = "2 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            mjmjmj.color = Color.YELLOW
                            gtgtjt.clear()
                            return true
                        }
                        2 -> {
                            sssss++
                            tltltltlt = "3 ♥ left"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            mjmjmj.color = Color.GREEN
                            gtgtjt.clear()
                            return true
                        }
                        3 -> {
                            tltltltlt = "MAX health"
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                tltltltlt = ""
                            }
                            return true
                        }
                    }
                }
            }
        }
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        try {
            when (event!!.action) {
                MotionEvent.ACTION_DOWN -> {
                    val gthhjyijhjiy = event.x
                    if (gthhjyijhjiy < uuu / 2) {
                        if (kjkjjkjk > 0) {
                            kjkjjkjk--
                        }
                    }
                    if (gthhjyijhjiy > uuu / 2) {
                        if (kjkjjkjk < 2) {
                            kjkjjkjk++
                        }
                    }
                    invalidate()
                }
                MotionEvent.ACTION_UP -> {

                }
            }
        } catch (e: Exception) {
            mkmkmkmk()
        }

        return true
    }

}

