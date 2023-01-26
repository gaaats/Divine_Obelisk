package com.artifexmundi.bale.apii

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Inteee62626 {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJS>
}

interface HostInterfacegttgtg {
    @GET("typo.json")
    suspend fun getDataDev(): Response<GeoDev>
}

class CountryRepohyyhyh(private val countryApihy2hy2hy: Inteee62626) {
    suspend fun hyyhyhhyyh5() = countryApihy2hy2hy.getData()
}

@Keep
data class GeoDev(
    @SerializedName("geo")
    val geo: String,
    @SerializedName("view")
    val view: String,
    @SerializedName("appsChecker")
    val appsChecker: String,
)
class DevRepo(private val hyohyjjhyijiyh: HostInterfacegttgtg) {
    suspend fun hykyhhyoihyjhiy() = hyohyjjhyijiyh.getDataDev()
}

@Keep
data class CountryCodeJS(
    @SerializedName("countryCode")
    val cou: String,
)


