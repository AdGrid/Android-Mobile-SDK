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

class GamOriginalApiDisplayBanner300x250Activity : BaseAdActivity() {

    companion object {
        const val AD_UNIT_ID = "/68001964/adgrid_demo"
        const val CONFIG_ID = "adgrid-amp-68001964-300-250"
        const val WIDTH = 300
        const val HEIGHT = 250
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ApplicationImpl.adGridSDK.adManagerOriginalApiSupport.displayAdViewOn(
            this,
            AD_UNIT_ID,
            CONFIG_ID,
            AdSize(
                WIDTH,
                HEIGHT
            ),
            adWrapperView
        )
    }

}
