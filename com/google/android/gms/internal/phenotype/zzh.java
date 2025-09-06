package com.google.android.gms.internal.phenotype;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;

public final class zzh {
    private static final Object zzak = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzal = null;
    private static boolean zzam = false;
    private static volatile Boolean zzan;
    private static volatile Boolean zzbq;

    static {
        zzh.zzak = new Object();
    }

    public static void init(Context context0) {
        synchronized(zzh.zzak) {
            if(Build.VERSION.SDK_INT < 24 || !context0.isDeviceProtectedStorage()) {
                Context context1 = context0.getApplicationContext();
                if(context1 != null) {
                    context0 = context1;
                }
            }
            if(zzh.zzal != context0) {
                zzh.zzan = null;
            }
            zzh.zzal = context0;
        }
        zzh.zzam = false;
    }

    public static void maybeInit(Context context0) {
        if(zzh.zzal == null) {
            zzh.init(context0);
        }
    }
}

