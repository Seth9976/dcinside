package com.igaworks.ssp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
import android.net.NetworkInfo;

public abstract class e0 {
    public static String a(Context context0) {
        if(context0 == null) {
            return "unKnown";
        }
        try {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            if(connectivityManager0 == null) {
                return "unKnown";
            }
            NetworkInfo networkInfo0 = connectivityManager0.getNetworkInfo(0);
            NetworkInfo networkInfo1 = connectivityManager0.getNetworkInfo(1);
            if(networkInfo0 != null && (networkInfo0.getState() == NetworkInfo.State.CONNECTED || networkInfo0.getState() == NetworkInfo.State.CONNECTING)) {
                return "mobile";
            }
            return networkInfo1 == null || networkInfo1.getState() != NetworkInfo.State.CONNECTED && networkInfo1.getState() != NetworkInfo.State.CONNECTING ? "unknown" : "wifi";
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
        return "unKnown";
    }

    public static boolean b(Context context0) {
        NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnectedOrConnecting();
    }
}

