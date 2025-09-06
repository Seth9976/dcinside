package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbqi extends zzbpj {
    private final Adapter zza;
    private final zzbwh zzb;

    zzbqi(Adapter adapter0, zzbwh zzbwh0) {
        this.zza = adapter0;
        this.zzb = zzbwh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int v) throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzg(ObjectWrapper.wrap(this.zza), v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(zze zze0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int v, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int v) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(zze zze0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String s, String s1) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgq0, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(zzbwi zzbwi0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(zzbwm zzbwm0) throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzm(ObjectWrapper.wrap(this.zza), new zzbwi(zzbwm0.zzf(), zzbwm0.zze()));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws RemoteException {
        zzbwh zzbwh0 = this.zzb;
        if(zzbwh0 != null) {
            zzbwh0.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}

