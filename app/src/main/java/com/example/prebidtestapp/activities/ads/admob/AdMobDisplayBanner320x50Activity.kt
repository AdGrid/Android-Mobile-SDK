/*
 *    Copyright 2023 AdGrid.io
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.example.prebidtestapp.activities.ads.admob

import android.os.Bundle
import com.example.prebidtestapp.ApplicationImpl
import com.example.prebidtestapp.activities.BaseAdActivity
import com.google.android.gms.ads.AdView

class AdMobDisplayBanner320x50Activity : BaseAdActivity() {

    companion object {
        const val AD_UNIT_ID = "ca-app-pub-1875909575462531/3793078260"
        const val CONFIG_ID = "prebid-ita-banner-320-50"
        const val WIDTH = 320
        const val HEIGHT = 50
    }

    private var bannerView: AdView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        ApplicationImpl.adGridSDK.adMobSupport.displayBannerViewOn(this, AD_UNIT_ID, CONFIG_ID, AdSize(
//            WIDTH, HEIGHT), adWrapperView
//        )
    }


    override fun onDestroy() {
        super.onDestroy()
        bannerView?.destroy()
    }

}
