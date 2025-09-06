package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import w4.d;

public final class zzcw {
    @d
    public static int zza(int v, int v1, int v2) {
        if(v < 0 || v >= v2) {
            throw new IndexOutOfBoundsException();
        }
        return v;
    }

    @h4.d({"#1"})
    @d
    public static Object zzb(@Nullable Object object0) {
        if(object0 == null) {
            throw new IllegalStateException();
        }
        return object0;
    }

    @h4.d({"#1"})
    @d
    public static String zzc(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException();
        }
        return s;
    }

    @d
    public static void zzd(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @d
    public static void zze(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(((String)object0));
        }
    }

    @d
    public static void zzf(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    @d
    public static void zzg(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }
}

