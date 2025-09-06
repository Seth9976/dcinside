package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class zzcr {
    public static final Handler zza;
    public static final Executor zzb;

    static {
        zzcr.zza = new Handler(Looper.getMainLooper());
        zzcr.zzb = new zzcq("Google consent worker");
    }

    public static void zza() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}

