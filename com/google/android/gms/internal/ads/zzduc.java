package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

public final class zzduc implements zzdct {
    private final Bundle zza;

    @VisibleForTesting
    public zzduc() {
        this.zza = new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zza(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzb(String s, String s1) {
        synchronized(this) {
            this.zza.putInt(s, 3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzc(String s) {
        synchronized(this) {
            this.zza.putInt(s, 1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzd(String s) {
        synchronized(this) {
            this.zza.putInt(s, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdct
    public final void zzf() {
    }

    public final Bundle zzg() {
        synchronized(this) {
            return new Bundle(this.zza);
        }
    }
}

