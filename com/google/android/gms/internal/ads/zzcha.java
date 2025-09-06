package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

public final class zzcha {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    zzcha(zzcgy zzcgy0, zzcgz zzcgz0) {
        this.zza = zzcgy0.zza;
        this.zzb = zzcgy0.zzb;
        this.zzd = zzcgy0.zzd;
        this.zzc = zzcgy0.zzc;
    }

    final long zza() {
        return this.zzc;
    }

    final Context zzb() {
        return this.zzb;
    }

    public final zzk zzc() {
        return new zzk(this.zzb, this.zza);
    }

    final zzbfe zzd() {
        return new zzbfe(this.zzb);
    }

    final VersionInfoParcel zze() {
        return this.zza;
    }

    final String zzf() {
        return zzv.zzq().zzc(this.zzb, this.zza.afmaVersion);
    }

    final WeakReference zzg() {
        return this.zzd;
    }
}

