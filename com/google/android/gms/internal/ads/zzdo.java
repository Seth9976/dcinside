package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;
import w4.d;

public final class zzdo {
    private static final Object zza;

    static {
        zzdo.zza = new Object();
    }

    @d
    public static String zza(String s, @Nullable Throwable throwable0) {
        CharSequence charSequence0;
        if(throwable0 == null) {
            return TextUtils.isEmpty(null) ? s : s + "\n  " + null.replace("\n", "\n  ") + "\n";
        }
        Object object0 = zzdo.zza;
        __monitor_enter(object0);
        Throwable throwable1 = throwable0;
        try {
            while(true) {
                if(throwable1 == null) {
                    charSequence0 = Log.getStackTraceString(throwable0).trim().replace("\t", "    ");
                    break;
                }
                if(throwable1 instanceof UnknownHostException) {
                    charSequence0 = "UnknownHostException (no network)";
                    break;
                }
                throwable1 = throwable1.getCause();
            }
        }
        finally {
            __monitor_exit(object0);
        }
        return TextUtils.isEmpty(charSequence0) ? s : s + "\n  " + ((String)charSequence0).replace("\n", "\n  ") + "\n";
    }

    @d
    public static void zzb(@Size(max = 23L) String s, String s1) {
        synchronized(zzdo.zza) {
            Log.d(s, zzdo.zza(s1, null));
        }
    }

    @d
    public static void zzc(@Size(max = 23L) String s, String s1) {
        synchronized(zzdo.zza) {
            Log.e(s, zzdo.zza(s1, null));
        }
    }

    @d
    public static void zzd(@Size(max = 23L) String s, String s1, @Nullable Throwable throwable0) {
        synchronized(zzdo.zza) {
            Log.e(s, zzdo.zza(s1, throwable0));
        }
    }

    @d
    public static void zze(@Size(max = 23L) String s, String s1) {
        synchronized(zzdo.zza) {
            Log.i(s, zzdo.zza(s1, null));
        }
    }

    @d
    public static void zzf(@Size(max = 23L) String s, String s1) {
        synchronized(zzdo.zza) {
            Log.w(s, zzdo.zza(s1, null));
        }
    }

    @d
    public static void zzg(@Size(max = 23L) String s, String s1, @Nullable Throwable throwable0) {
        synchronized(zzdo.zza) {
            Log.w(s, zzdo.zza(s1, throwable0));
        }
    }
}

