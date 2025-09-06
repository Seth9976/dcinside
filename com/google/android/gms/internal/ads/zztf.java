package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class zztf implements zzui {
    private final ArrayList zza;
    private final HashSet zzb;
    private final zzuq zzc;
    private final zzra zzd;
    @Nullable
    private Looper zze;
    @Nullable
    private zzbq zzf;
    @Nullable
    private zzog zzg;

    public zztf() {
        this.zza = new ArrayList(1);
        this.zzb = new HashSet(1);
        this.zzc = new zzuq();
        this.zzd = new zzra();
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public zzbq zzM() {
        return null;
    }

    protected final zzog zzb() {
        zzog zzog0 = this.zzg;
        zzcw.zzb(zzog0);
        return zzog0;
    }

    protected final zzra zzc(@Nullable zzug zzug0) {
        return this.zzd.zza(0, zzug0);
    }

    protected final zzra zzd(int v, @Nullable zzug zzug0) {
        return this.zzd.zza(0, zzug0);
    }

    protected final zzuq zze(@Nullable zzug zzug0) {
        return this.zzc.zza(0, zzug0);
    }

    protected final zzuq zzf(int v, @Nullable zzug zzug0) {
        return this.zzc.zza(0, zzug0);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzg(Handler handler0, zzrb zzrb0) {
        this.zzd.zzb(handler0, zzrb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzh(Handler handler0, zzur zzur0) {
        this.zzc.zzb(handler0, zzur0);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzi(zzuh zzuh0) {
        this.zzb.remove(zzuh0);
        if(!this.zzb.isEmpty() && this.zzb.isEmpty()) {
            this.zzj();
        }
    }

    protected void zzj() {
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzk(zzuh zzuh0) {
        this.zze.getClass();
        this.zzb.add(zzuh0);
        if(this.zzb.isEmpty()) {
            this.zzl();
        }
    }

    protected void zzl() {
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzm(zzuh zzuh0, @Nullable zzgy zzgy0, zzog zzog0) {
        Looper looper0 = Looper.myLooper();
        zzcw.zzd(this.zze == null || this.zze == looper0);
        this.zzg = zzog0;
        zzbq zzbq0 = this.zzf;
        this.zza.add(zzuh0);
        if(this.zze == null) {
            this.zze = looper0;
            this.zzb.add(zzuh0);
            this.zzn(zzgy0);
            return;
        }
        if(zzbq0 != null) {
            this.zzk(zzuh0);
            zzuh0.zza(this, zzbq0);
        }
    }

    protected abstract void zzn(@Nullable zzgy arg1);

    protected final void zzo(zzbq zzbq0) {
        this.zzf = zzbq0;
        ArrayList arrayList0 = this.zza;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zzuh)arrayList0.get(v1)).zza(this, zzbq0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzp(zzuh zzuh0) {
        this.zza.remove(zzuh0);
        if(this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            this.zzq();
            return;
        }
        this.zzi(zzuh0);
    }

    protected abstract void zzq();

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzr(zzrb zzrb0) {
        this.zzd.zzc(zzrb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzs(zzur zzur0) {
        this.zzc.zzi(zzur0);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public void zzt(zzar zzar0) {
        throw null;
    }

    protected final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public boolean zzv() {
        return true;
    }
}

