package com.fsn.cauly.blackdragoncore.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class h {
    public static String a(String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            unsupportedEncodingException0.printStackTrace();
            g.a(b.e, unsupportedEncodingException0.getMessage() + " url:" + s);
            return null;
        }
    }

    public static boolean a(Context context0) {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        if(connectivityManager0 == null) {
            g.a(b.b, "ConnectivityManager Not Provieded");
            return false;
        }
        try {
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            return networkInfo0 == null ? false : networkInfo0.isConnected();
        }
        catch(Exception unused_ex) {
            g.a(b.b, "Need android.permission.ACCESS_NETWORK_STATE Permission");
            throw new NullPointerException();
        }
    }
}

