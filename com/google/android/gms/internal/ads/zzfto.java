package com.google.android.gms.internal.ads;

import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Locale;

public final class zzfto {
    private final String zza;

    public zzfto(String s) {
        this.zza = "UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] " + s;
    }

    // 去混淆评级： 低(20)
    public final int zza(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", zzfto.zze(this.zza, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzb(Throwable throwable0, String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", zzfto.zze(this.zza, s, arr_object), throwable0) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzc(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 4) ? Log.i("PlayCore", zzfto.zze(this.zza, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzd(String s, @Nullable Object[] arr_object) {
        return Log.isLoggable("PlayCore", 5) ? Log.w("PlayCore", zzfto.zze(this.zza, s, arr_object)) : 0;
    }

    private static String zze(String s, String s1, @Nullable Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return s + " : " + s1;
    }
}

