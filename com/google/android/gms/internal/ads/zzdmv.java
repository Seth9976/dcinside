package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzdmv extends zzbhs {
    @Nullable
    private final String zza;
    private final zzdia zzb;
    private final zzdif zzc;
    private final zzdrw zzd;

    public zzdmv(@Nullable String s, zzdia zzdia0, zzdif zzdif0, zzdrw zzdrw0) {
        this.zza = s;
        this.zzb = zzdia0;
        this.zzc = zzdif0;
        this.zzd = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzB(Bundle bundle0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmO)).booleanValue()) {
            this.zzb.zzI(bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzC(Bundle bundle0) throws RemoteException {
        this.zzb.zzM(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzE(zzdd zzdd0) throws RemoteException {
        this.zzb.zzP(zzdd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzF(zzdr zzdr0) throws RemoteException {
        try {
            if(!zzdr0.zzf()) {
                this.zzd.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzb.zzQ(zzdr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzG(zzbhq zzbhq0) throws RemoteException {
        this.zzb.zzR(zzbhq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final boolean zzI() throws RemoteException {
        return !this.zzc.zzH().isEmpty() && this.zzc.zzk() != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final boolean zzJ(Bundle bundle0) throws RemoteException {
        return this.zzb.zzZ(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    @Nullable
    public final zzdy zzg() throws RemoteException {
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzgC)).booleanValue() ? null : this.zzb.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzeb zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzbfp zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzbft zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzbfw zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbht
    public final List zzv() throws RemoteException {
        return this.zzI() ? this.zzc.zzH() : Collections.emptyList();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzw() throws RemoteException {
        this.zzb.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzy(@Nullable zzdh zzdh0) throws RemoteException {
        this.zzb.zzC(zzdh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzz(Bundle bundle0) throws RemoteException {
        this.zzb.zzG(bundle0);
    }
}

