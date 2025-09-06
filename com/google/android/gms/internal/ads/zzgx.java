package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public final class zzgx implements zzfy {
    private final zzfy zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public zzgx(zzfy zzfy0) {
        this.zza = zzfy0;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.zza.zza(arr_b, v, v1);
        if(v2 != -1) {
            this.zzb += (long)v2;
        }
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) throws IOException {
        this.zzc = zzgd0.zza;
        this.zzd = Collections.emptyMap();
        try {
            return this.zza.zzb(zzgd0);
        }
        finally {
            Uri uri0 = this.zzc();
            if(uri0 != null) {
                this.zzc = uri0;
            }
            this.zzd = this.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgy0) {
        zzgy0.getClass();
        this.zza.zzf(zzgy0);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}

