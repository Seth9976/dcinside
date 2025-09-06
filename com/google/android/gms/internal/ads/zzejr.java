package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzm;

public final class zzejr extends zzbq {
    private final zzeky zza;

    public zzejr(Context context0, zzcgx zzcgx0, zzfch zzfch0, zzdiq zzdiq0, zzbl zzbl0) {
        zzela zzela0 = new zzela(zzdiq0, zzcgx0.zzj());
        zzela0.zze(zzbl0);
        this.zza = new zzeky(new zzelk(zzcgx0, context0, zzela0, zzfch0), zzfch0.zzL());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() {
        synchronized(this) {
            return this.zza.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() {
        synchronized(this) {
            return this.zza.zzb();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzm0) throws RemoteException {
        this.zza.zzd(zzm0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzm0, int v) throws RemoteException {
        synchronized(this) {
            this.zza.zzd(zzm0, v);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        synchronized(this) {
            return this.zza.zze();
        }
    }
}

