package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public class zzehj extends zzeik {
    private final zzdeb zza;

    public zzehj(zzcvr zzcvr0, zzddq zzddq0, zzcwl zzcwl0, zzcxa zzcxa0, zzcxf zzcxf0, zzcwg zzcwg0, zzdap zzdap0, zzden zzden0, zzcxz zzcxz0, zzdeb zzdeb0, zzdal zzdal0) {
        super(zzcvr0, zzddq0, zzcwl0, zzcxa0, zzcxf0, zzdap0, zzcxz0, zzden0, zzdal0, zzcwg0);
        this.zza = zzdeb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeik
    public final void zzs(zzbwi zzbwi0) {
        this.zza.zza(zzbwi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeik
    public final void zzt(zzbwm zzbwm0) throws RemoteException {
        zzbwi zzbwi0 = new zzbwi(zzbwm0.zzf(), zzbwm0.zze());
        this.zza.zza(zzbwi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeik
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzeik
    public final void zzv() {
        this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzeik
    public final void zzy() {
        this.zza.zzc();
    }
}

