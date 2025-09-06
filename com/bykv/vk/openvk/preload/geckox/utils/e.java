package com.bykv.vk.openvk.preload.geckox.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

public final class e {
    public static String a(Context context0) {
        try {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            if(connectivityManager0 == null) {
                return "unknow";
            }
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isAvailable()) {
                return "unknow";
            }
            NetworkInfo networkInfo1 = connectivityManager0.getNetworkInfo(1);
            if(networkInfo1 != null) {
                NetworkInfo.State networkInfo$State0 = networkInfo1.getState();
                if(networkInfo$State0 != null && (networkInfo$State0 == NetworkInfo.State.CONNECTED || networkInfo$State0 == NetworkInfo.State.CONNECTING)) {
                    return "WIFI";
                }
            }
            switch(((TelephonyManager)context0.getSystemService("phone")).getNetworkType()) {
                case 1: 
                case 2: 
                case 4: 
                case 7: 
                case 11: {
                    return "2G";
                }
                case 13: {
                    return "4G";
                }
                case 3: 
                case 5: 
                case 6: 
                case 8: 
                case 9: 
                case 10: 
                case 12: 
                case 14: 
                case 15: {
                    return "3G";
                }
                default: {
                    return "unknow";
                }
            }
        }
        catch(Throwable throwable0) {
        }
        GeckoLogger.w("gecko-debug-tag", "getNetworkState:", throwable0);
        return "null";
    }
}

