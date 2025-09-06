package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import o3.h;

class zzw {
    final boolean zza;
    @h
    final String zzb;
    @h
    final Throwable zzc;
    final int zzd;
    private static final zzw zze;

    static {
        zzw.zze = new zzw(true, 3, 1, null, null);
    }

    private zzw(boolean z, int v, int v1, @h String s, @h Throwable throwable0) {
        this.zza = z;
        this.zzd = v;
        this.zzb = s;
        this.zzc = throwable0;
    }

    zzw(boolean z, int v, int v1, String s, Throwable throwable0, zzv zzv0) {
        this(false, 1, 5, null, null);
    }

    @h
    String zza() {
        return this.zzb;
    }

    @Deprecated
    static zzw zzb() {
        return zzw.zze;
    }

    static zzw zzc(@NonNull String s) {
        return new zzw(false, 1, 5, s, null);
    }

    static zzw zzd(@NonNull String s, @NonNull Throwable throwable0) {
        return new zzw(false, 1, 5, s, throwable0);
    }

    final void zze() {
        if(!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if(this.zzc != null) {
                Log.d("GoogleCertificatesRslt", this.zza(), this.zzc);
                return;
            }
            Log.d("GoogleCertificatesRslt", this.zza());
        }
    }

    static zzw zzf(int v) {
        return new zzw(true, v, 1, null, null);
    }

    static zzw zzg(int v, int v1, @NonNull String s, @h Throwable throwable0) {
        return new zzw(false, v, v1, s, throwable0);
    }
}

