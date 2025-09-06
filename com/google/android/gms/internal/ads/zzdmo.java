package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdmo extends zzbgk {
    @Nullable
    private final String zza;
    private final zzdia zzb;
    private final zzdif zzc;

    public zzdmo(@Nullable String s, zzdia zzdia0, zzdif zzdif0) {
        this.zza = s;
        this.zzb = zzdia0;
        this.zzc = zzdif0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final zzeb zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final zzbfp zze() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final zzbfw zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final IObjectWrapper zzg() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final String zzm() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final String zzn() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final List zzo() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final void zzp() throws RemoteException {
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final void zzq(Bundle bundle0) throws RemoteException {
        this.zzb.zzG(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final void zzr(Bundle bundle0) throws RemoteException {
        this.zzb.zzM(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgl
    public final boolean zzs(Bundle bundle0) throws RemoteException {
        return this.zzb.zzZ(bundle0);
    }
}

