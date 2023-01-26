package com.artifexmundi.bale.innt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.artifexmundi.bale.apii.Inteee62626
import com.artifexmundi.bale.apii.CountryRepohyyhyh
import com.artifexmundi.bale.apii.DevRepo
import com.artifexmundi.bale.apii.HostInterfacegttgtg
import com.artifexmundi.bale.vebbvii.BeamModrfrf6r2rf
import com.artifexmundi.bale.vebbvii.ViModt6g2t2g
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun gthyhyhyhy(gyhyjuujujuj: Application): SharedPreferences {
    return gyhyjuujujuj.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hyjujjuuj(): Gson {
    return GsonBuilder().create()
}

val bghyhyjujik3ik62 = module {

    single  <HostInterfacegttgtg> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfacegttgtg::class.java)
    }

    single <Inteee62626> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Inteee62626::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://divineobelisk.fun/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        CountryRepohyyhyh(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        DevRepo(get(named("HostInter")))
    }
    single{
        hyjujjuuj()
    }
    single (named("SharedPreferences")) {
        gthyhyhyhy(androidApplication())
    }
}


val nhhjuujkiikik = module {
    viewModel (named("MainModel")){
        ViModt6g2t2g((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        BeamModrfrf6r2rf(get())
    }
}