package com.google.android.gms.common;

import androidx.annotation.NonNull;
import o3.h;

public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    @h
    private final String zzc;
    @h
    private final Throwable zzd;

    private PackageVerificationResult(String s, int v, boolean z, @h String s1, @h Throwable throwable0) {
        this.zza = s;
        this.zzb = z;
        this.zzc = s1;
        this.zzd = throwable0;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String s, @NonNull String s1, @h Throwable throwable0) {
        return new PackageVerificationResult(s, 1, false, s1, throwable0);
    }

    public final void zzb() {
        if(!this.zzb) {
            String s = "PackageVerificationRslt: " + this.zzc;
            throw this.zzd == null ? new SecurityException(s) : new SecurityException(s, this.zzd);
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String s, int v) {
        return new PackageVerificationResult(s, v, true, null, null);
    }
}

