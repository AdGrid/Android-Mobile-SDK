package com.example.prebidtestapp

import android.app.Application
import io.adgrid.adgridsdk.AdGridSDK
import io.adgrid.adgridsdk.utils.Settings
import org.prebid.mobile.TargetingParams

class ApplicationImpl : Application() {

    companion object {
        lateinit var adGridSDK: AdGridSDK

        private const val SERVICE_ACCOUNT_ID = "vitalii_overchuk";
    }

    override fun onCreate() {
        super.onCreate()
        Settings.init(this)
        TargetingParams.setSubjectToGDPR(true)

        adGridSDK = AdGridSDK()
        adGridSDK.initialize(this, SERVICE_ACCOUNT_ID)
    }
}