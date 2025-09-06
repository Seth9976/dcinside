package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zze;

final class zzdti extends zzbk {
    final zzdtc zza;
    final zzdtj zzb;

    zzdti(zzdtj zzdtj0, zzdtc zzdtc0) {
        this.zza = zzdtc0;
        this.zzb = zzdtj0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        long v = this.zzb.zza;
        this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        this.zza.zzc(this.zzb.zza);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int v) throws RemoteException {
        this.zza.zzd(this.zzb.zza, v);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zze0) throws RemoteException {
        this.zza.zzd(this.zzb.zza, zze0.zza);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}

