package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public class zzeik extends zzbpj {
    private final zzcvr zza;
    private final zzddq zzb;
    private final zzcwl zzc;
    private final zzcxa zzd;
    private final zzcxf zze;
    private final zzdap zzf;
    private final zzcxz zzg;
    private final zzden zzh;
    private final zzdal zzi;
    private final zzcwg zzj;

    public zzeik(zzcvr zzcvr0, zzddq zzddq0, zzcwl zzcwl0, zzcxa zzcxa0, zzcxf zzcxf0, zzdap zzdap0, zzcxz zzcxz0, zzden zzden0, zzdal zzdal0, zzcwg zzcwg0) {
        this.zza = zzcvr0;
        this.zzb = zzddq0;
        this.zzc = zzcwl0;
        this.zzd = zzcxa0;
        this.zze = zzcxf0;
        this.zzf = zzdap0;
        this.zzg = zzcxz0;
        this.zzh = zzden0;
        this.zzi = zzdal0;
        this.zzj = zzcwg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() {
        this.zzg.zzds(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(zze zze0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int v, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    @Deprecated
    public final void zzj(int v) throws RemoteException {
        this.zzk(new zze(v, "", "undefined", null, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(zze zze0) {
        zze zze1 = zzfdk.zzc(8, zze0);
        this.zzj.zza(zze1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String s) {
        this.zzk(new zze(0, s, "undefined", null, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() {
        this.zze.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() {
        this.zzg.zzdp();
        this.zzi.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String s, String s1) {
        this.zzf.zzb(s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgq0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public void zzs(zzbwi zzbwi0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public void zzt(zzbwm zzbwm0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public void zzu() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public void zzv() {
        this.zzh.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public void zzy() {
        this.zzh.zzd();
    }
}

