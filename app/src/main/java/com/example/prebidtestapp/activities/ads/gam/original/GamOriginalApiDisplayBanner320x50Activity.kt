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
package com.example.prebidtestapp.activities.ads.gam.original

import android.os.Bundle
import com.example.prebidtestapp.ApplicationImpl
import com.example.prebidtestapp.activities.BaseAdActivity
import com.google.android.gms.ads.AdSize

class GamOriginalApiDisplayBanner320x50Activity : BaseAdActivity() {

    companion object {
        const val AD_UNIT_ID = "/92510019/adgrid_prebid"
        const val CONFIG_ID = "adgrid-io-amp-92510019-320-50"
        const val WIDTH = 320
        const val HEIGHT = 50
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ApplicationImpl.adGridSDK.adManagerOriginalApiSupport.displayAdViewOn(
            this,
            AD_UNIT_ID,
            CONFIG_ID,
            AdSize(WIDTH, HEIGHT),
            adWrapperView,
            null,
            hashMapOf("key1" to "value1"),
            30_000
        )
    }

}
