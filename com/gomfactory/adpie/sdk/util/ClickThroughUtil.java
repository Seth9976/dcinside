package com.gomfactory.adpie.sdk.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.InAppBrowser;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;

public class ClickThroughUtil {
    public static final String TAG = "ClickThroughUtil";
    private static final long VALIDATION_TIME = 500L;
    private static ArrayList choiceBrowser;
    private static long sLastClickTime;

    static {
        ClickThroughUtil.choiceBrowser = new ArrayList();
    }

    public static void addTargetBrowser(String s) {
        if(!TextUtils.isEmpty(s)) {
            for(Object object0: ClickThroughUtil.choiceBrowser) {
                if(((String)object0).equals(s)) {
                    return;
                }
                if(false) {
                    break;
                }
            }
            ClickThroughUtil.choiceBrowser.add(s);
        }
    }

    public static void clearTargetBrowser() {
        ClickThroughUtil.choiceBrowser.clear();
    }

    public static boolean goToBrowser(Context context0, String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                Intent intent0 = new Intent();
                intent0.setAction("android.intent.action.VIEW");
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("ClickThroughUtil", ":::clickEvent:::Open Browser : " + s);
                }
                intent0.setData(Uri.parse(s));
                intent0.addFlags(0x10000000);
                if(!ClickThroughUtil.choiceBrowser.isEmpty()) {
                    Iterator iterator0 = ClickThroughUtil.choiceBrowser.iterator();
                label_9:
                    if(!iterator0.hasNext()) {
                        intent0.setPackage(null);
                        goto label_30;
                    }
                    Object object0 = iterator0.next();
                    String s1 = (String)object0;
                    intent0.setPackage(s1);
                    try {
                        context0.startActivity(intent0);
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened browser. (" + s1 + ") " + s);
                        }
                    }
                    catch(ActivityNotFoundException unused_ex) {
                        goto label_9;
                    }
                    return true;
                }
                intent0.setPackage("com.sec.android.app.sbrowser");
                try {
                    context0.startActivity(intent0);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened the Samsung browser. " + s);
                    }
                    return true;
                }
                catch(ActivityNotFoundException unused_ex) {
                    intent0.setPackage("com.android.chrome");
                    try {
                        context0.startActivity(intent0);
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened the Chrome browser. " + s);
                        }
                        return true;
                    }
                    catch(ActivityNotFoundException unused_ex) {
                        intent0.setPackage(null);
                    }
                }
            label_30:
                context0.startActivity(intent0);
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened browser. " + s);
                }
                return true;
            }
            catch(Exception exception0) {
            }
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("ClickThroughUtil", exception0);
            }
        }
        return false;
    }

    public static boolean goToWebView(Context context0, String s) {
        String s2;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Uri uri0 = Uri.parse(s);
        String s1 = uri0.getScheme();
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("ClickThroughUtil", "landingUrl : " + s + ", scheme : " + s1);
        }
        Class class0 = InAppBrowser.class;
        if(!s1.equalsIgnoreCase("http") && !s1.equalsIgnoreCase("https")) {
            if(uri0.getScheme().equalsIgnoreCase("intent")) {
                try {
                    s2 = null;
                    Intent intent0 = Intent.parseUri(s, 1);
                    s2 = intent0.getStringExtra("browser_fallback_url");
                    context0.startActivity(intent0);
                    return true;
                }
                catch(ActivityNotFoundException activityNotFoundException0) {
                    AdPieLog.e("ClickThroughUtil", activityNotFoundException0);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("ClickThroughUtil", "fallbackUrl : " + s2);
                    }
                    if(!TextUtils.isEmpty(s2)) {
                        try {
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("ClickThroughUtil", ":::clickEvent:::Open WebView. (fallback) " + s2);
                            }
                            Intent intent1 = new Intent(context0, class0);
                            intent1.putExtra("url", s2);
                            context0.startActivity(intent1);
                            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened WebView. (fallback) " + s2);
                            }
                            return true;
                        }
                        catch(ActivityNotFoundException activityNotFoundException1) {
                        }
                        catch(Exception exception0) {
                            AdPieLog.e("ClickThroughUtil", exception0);
                            return ClickThroughUtil.goToBrowser(context0, s2);
                        }
                        AdPieLog.e("ClickThroughUtil", activityNotFoundException1);
                        return ClickThroughUtil.goToBrowser(context0, s2);
                    }
                    return false;
                }
                catch(URISyntaxException uRISyntaxException0) {
                    Log.e("ClickThroughUtil", "Can\'t resolve intent://", uRISyntaxException0);
                    AdPieLog.e("ClickThroughUtil", uRISyntaxException0);
                    return false;
                }
            }
            if(s1.equalsIgnoreCase("market")) {
                try {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("ClickThroughUtil", ":::clickEvent:::Open Google Play Store. " + s);
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(s));
                    intent2.setPackage("com.android.vending");
                    context0.startActivity(intent2);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened Google Play Store. " + s);
                    }
                    return true;
                }
                catch(ActivityNotFoundException activityNotFoundException2) {
                }
                AdPieLog.e("ClickThroughUtil", activityNotFoundException2);
                try {
                    String s3 = String.format("https://play.google.com/store/apps/details?%s", uri0.getQuery());
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("ClickThroughUtil", ":::clickEvent:::Open Google Play Store. " + s3);
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(Uri.parse(s3));
                    intent3.setPackage("com.android.vending");
                    context0.startActivity(intent3);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened Google Play Store. " + s3);
                    }
                    return true;
                }
                catch(ActivityNotFoundException activityNotFoundException3) {
                }
                catch(Exception exception1) {
                    AdPieLog.e("ClickThroughUtil", exception1);
                    return false;
                }
                AdPieLog.e("ClickThroughUtil", activityNotFoundException3);
                return false;
            }
            try {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("ClickThroughUtil", ":::clickEvent:::Start intent. " + s);
                }
                context0.startActivity(Intent.parseUri(s, 1));
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully started intent. " + s);
                }
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException4) {
            }
            catch(URISyntaxException uRISyntaxException1) {
                AdPieLog.e("ClickThroughUtil", uRISyntaxException1);
                return false;
            }
            AdPieLog.e("ClickThroughUtil", activityNotFoundException4);
            return false;
        }
        try {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("ClickThroughUtil", ":::clickEvent:::Open WebView. " + s);
            }
            Intent intent4 = new Intent(context0, class0);
            intent4.putExtra("url", s);
            context0.startActivity(intent4);
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("ClickThroughUtil", ":::clickEvent:::You have successfully opened WebView. " + s);
            }
            return true;
        }
        catch(ActivityNotFoundException activityNotFoundException5) {
        }
        catch(Exception exception2) {
            AdPieLog.e("ClickThroughUtil", exception2);
            return ClickThroughUtil.goToBrowser(context0, s);
        }
        AdPieLog.e("ClickThroughUtil", activityNotFoundException5);
        return ClickThroughUtil.goToBrowser(context0, s);
    }

    public static boolean isValidClick() {
        if(SystemClock.elapsedRealtime() - ClickThroughUtil.sLastClickTime < 500L) {
            return false;
        }
        ClickThroughUtil.sLastClickTime = SystemClock.elapsedRealtime();
        return true;
    }
}

