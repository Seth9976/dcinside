package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.google.firebase.perf.logging.a;
import java.net.URI;

public class k {
    private static String[] a;

    public static boolean a(@NonNull URI uRI0, @NonNull Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getIdentifier("firebase_performance_whitelisted_domains", "array", "com.dcinside.app.android");
        if(v == 0) {
            return true;
        }
        a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if(k.a == null) {
            k.a = resources0.getStringArray(v);
        }
        String s = uRI0.getHost();
        if(s == null) {
            return true;
        }
        String[] arr_s = k.a;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(s.contains(arr_s[v1])) {
                return true;
            }
        }
        return false;
    }
}

