package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.util.Clock;

public final class zzcsp implements zza, zzcvt, zzcwn, zzcxh, zzcyq, zzdbc {
    private final Clock zza;
    private final zzbzf zzb;

    public zzcsp(Clock clock0, zzbzf zzbzf0) {
        this.zza = clock0;
        this.zzb = zzbzf0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        this.zzb.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvk0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfca0) {
        long v = this.zza.elapsedRealtime();
        this.zzb.zzk(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzh() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzi(zzbbq.zzb zzbbq$zzb0) {
        this.zzb.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzj(zzbbq.zzb zzbbq$zzb0) {
    }

    public final void zzk(zzm zzm0) {
        this.zzb.zzj(zzm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzl(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzm(zzbbq.zzb zzbbq$zzb0) {
        this.zzb.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbc
    public final void zzn(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zzb.zzh(true);
    }
}

