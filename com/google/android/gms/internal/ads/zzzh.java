package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

final class zzzh implements zzabh {
    private final zzaal zza;
    private final zzaaq zzb;
    private zzab zzc;

    public zzzh(zzaal zzaal0, zzaaq zzaaq0) {
        this.zza = zzaal0;
        this.zzb = zzaaq0;
        this.zzc = new zzz().zzag();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final Surface zza() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        this.zza.zzm(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzc() {
        this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzd(boolean z) {
        if(z) {
            this.zza.zzi();
        }
        this.zzb.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zze(zzab zzab0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzf(boolean z) {
        this.zza.zzc(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzg(int v, zzab zzab0) {
        int v1 = zzab0.zzv;
        if(v1 != this.zzc.zzv || zzab0.zzw != this.zzc.zzw) {
            this.zzb.zzb(v1, zzab0.zzw);
        }
        float f = zzab0.zzx;
        if(f != this.zzc.zzx) {
            this.zza.zzl(f);
        }
        this.zzc = zzab0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzh() {
        this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzi(boolean z) {
        this.zza.zze(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzj() {
        this.zza.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzk() {
        this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzl() {
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzm(long v, long v1) throws zzabg {
        try {
            this.zzb.zzd(v, v1);
        }
        catch(zzib zzib0) {
            throw new zzabg(zzib0, this.zzc);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzn(int v) {
        this.zza.zzj(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzo(zzabe zzabe0, Executor executor0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzp(Surface surface0, zzdz zzdz0) {
        this.zza.zzm(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzq(float f) {
        this.zza.zzn(f);
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzr(long v, long v1, long v2, long v3) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzs(List list0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final void zzt(zzaai zzaai0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzu(long v, boolean z, long v1, long v2, zzabf zzabf0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzv() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzw() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzabh
    public final boolean zzx(boolean z) {
        return this.zza.zzo(z);
    }
}

