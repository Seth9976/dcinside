package com.pgl.ssdk;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.webkit.WebView;

public class h0 {
    public static String a() {
        if(Build.VERSION.SDK_INT >= 26) {
            PackageInfo packageInfo0 = WebView.getCurrentWebViewPackage();
            if(packageInfo0 != null) {
                return packageInfo0.applicationInfo == null ? "!error!" : packageInfo0.applicationInfo.publicSourceDir;
            }
            return "!error!";
        }
        return "!version_error!";
    }
}

