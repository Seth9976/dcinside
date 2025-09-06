package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzfvc;

public class zzo {
    protected static final zzfvc zza;

    static {
        zzo.zza = zzfvc.zza(4000);
    }

    @VisibleForTesting
    static String zzd(String s) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        return arr_stackTraceElement.length < 4 ? s : s + " @" + arr_stackTraceElement[3].getLineNumber();
    }

    public static void zze(String s) {
        if(zzo.zzm(3)) {
            if(s.length() <= 4000) {
                Log.d("Ads", s);
                return;
            }
            boolean z = true;
            for(Object object0: zzo.zza.zzd(s)) {
                String s1 = (String)object0;
                if(z) {
                    Log.d("Ads", s1);
                }
                else {
                    Log.d("Ads-cont", s1);
                }
                z = false;
            }
        }
    }

    public static void zzf(String s, Throwable throwable0) {
        if(zzo.zzm(3)) {
            Log.d("Ads", s, throwable0);
        }
    }

    public static void zzg(String s) {
        if(zzo.zzm(6)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzo.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.e("Ads", s1);
                    }
                    else {
                        Log.e("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.e("Ads", s);
        }
    }

    public static void zzh(String s, Throwable throwable0) {
        if(zzo.zzm(6)) {
            Log.e("Ads", s, throwable0);
        }
    }

    public static void zzi(String s) {
        if(zzo.zzm(4)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzo.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.i("Ads", s1);
                    }
                    else {
                        Log.i("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.i("Ads", s);
        }
    }

    public static void zzj(String s) {
        if(zzo.zzm(5)) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzo.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.w("Ads", s1);
                    }
                    else {
                        Log.w("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.w("Ads", s);
        }
    }

    public static void zzk(String s, Throwable throwable0) {
        if(zzo.zzm(5)) {
            Log.w("Ads", s, throwable0);
        }
    }

    public static void zzl(String s, @Nullable Throwable throwable0) {
        if(zzo.zzm(5)) {
            if(throwable0 != null) {
                zzo.zzk(zzo.zzd(s), throwable0);
                return;
            }
            zzo.zzj(zzo.zzd(s));
        }
    }

    public static boolean zzm(int v) {
        return v >= 5 || Log.isLoggable("Ads", v);
    }
}

