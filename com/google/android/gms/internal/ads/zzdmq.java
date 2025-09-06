package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdmq extends zzbgm {
    @Nullable
    private final String zza;
    private final zzdia zzb;
    private final zzdif zzc;

    public zzdmq(@Nullable String s, zzdia zzdia0, zzdif zzdif0) {
        this.zza = s;
        this.zzb = zzdia0;
        this.zzc = zzdif0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final zzeb zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final zzbfp zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final zzbfw zze() throws RemoteException {
        return this.zzc.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final String zzh() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final List zzm() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final void zzo(Bundle bundle0) throws RemoteException {
        this.zzb.zzG(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final void zzp(Bundle bundle0) throws RemoteException {
        this.zzb.zzM(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzq(Bundle bundle0) throws RemoteException {
        return this.zzb.zzZ(bundle0);
    }
}

