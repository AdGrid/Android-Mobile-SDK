![](https://lh4.googleusercontent.com/2yVlIW15EbpfQsumK7I14Aja8Nu_9Da1CxfO4Ez0bwYHfLptDntz6TZFjRjsBloyYoMRpiuAyxxSrkypKoa42CiJYZxOeY329InSvuTyxVtaSe-BfsnZ0RWpgqt6jjKyYgQR4Sw7Zx2XUooOGBoxJ_0)

# Mobile SDK Documentation

AdGrid Mobile is a library that provides an end-to-end header bidding solution for mobile app publishers via [adgrid.io](https://adgrid.io). AdGrid Mobile libraries are available for iOS and Android. At this moment, AdGrid’s Mobile SDK only supports Display Ad units.
  
Please follow the instructions below for integration of the SDK into your mobile app. Reach out to [support@adgrid.io](mailto:support@adgrid.io) if you have any questions.

## Android Library

1.  **Add AdGridSDK reference to your project.**
	* Add library
		+  Manually add adgrid.aar into your project under “lib” directory
		+  Add via Gradle. TBD*
		+  Add dependencies via “build.gradle” file

```xml
implementation "org.prebid:prebid-mobile-sdk:2.1.0"  
implementation "org.prebid:prebid-mobile-sdk-gam-event-handlers:2.1.0"  
implementation "org.prebid:prebid-mobile-sdk-admob-adapters:2.1.0"  
implementation 'com.google.android.gms:play-services-ads:22.2.0'  
implementation 'com.github.bumptech.glide:glide:4.15.1'
```

* Add google account id into AndroidManifest.xml file under application tag

Example:

```xml
<meta-data android:name="com.google.android.gms.ads.APPLICATION_ID" 
android:value="ca-app-pub-3940256099942544~3347511713"/>
```

2. **Initialize SDK**

```kotlin
val adGridSdk = AdGridSDK()
adGridSdk.initialize({value}, {value})
```

> 1. context: Context – Context of application or activity <font color=red>*(required)</font>
		Example of value: **this(Activity, Application, Fragment.Context)**
> 2. accountId: String – Id of your account on AdGrid Server <font color=red>*(required)</font>
		Example of value: **“adgrid_mobile_test_tagid”**

3. **Display Ad View**

```kotlin
adGridSdk.adManagerOriginalApiSupport.displayAdViewOn({value}, {value}, {value}, {value}, {value})
```

> 1.  activity: Activity – Activity where you will show your ad <font color=red>*(required)</font>
	Example of value: **this(Activity, Fragment.Activity)**
> 2.  adUnitId: String – Google Ad Manager ad ID <font color=red>*(required)</font>
	Example of value: **“/92510019/adgrid_prebid”**
> 3.  prebidConfigId: String – Id of stored impression on AdGrid Prebid Server <font color=red>*(required)</font>. Please reach out to [support@adgrid.io](mailto:support@adgrid.io) to receive your IDs.
	Example of value: **“adgrid-io-amp-92510019-320-50”**
> 4.  adSize: com.google.android.gms.ads.AdSize – Size of Ad <font color=red>*(required)</font>
	Example of value: **AdSize(320, 50)**
> 5.  adWrapperView: View – Container view of Ad <font color=red>*(required)</font>
	Example of value: **adWrapperView**