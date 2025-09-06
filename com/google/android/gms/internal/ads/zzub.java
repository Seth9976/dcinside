package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import h4.m;

public final class zzub extends zzwl {
    private final boolean zzb;
    private final zzbp zzc;
    private final zzbo zzd;
    private zztz zze;
    @Nullable
    private zzty zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzub(zzui zzui0, boolean z) {
        super(zzui0);
        boolean z1;
        if(z) {
            zzui0.zzv();
            z1 = true;
        }
        else {
            z1 = false;
        }
        this.zzb = z1;
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        zzui0.zzM();
        this.zze = zztz.zzq(zzui0.zzJ());
    }

    public final zzbq zzC() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzwl
    @Nullable
    protected final zzug zzD(zzug zzug0) {
        return zzug0.zza((this.zze.zze == null || !this.zze.zze.equals(zzug0.zza) ? zzug0.zza : zztz.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzwl
    protected final void zzE(zzbq zzbq0) {
        long v1;
        zzug zzug0 = null;
        if(this.zzh) {
            this.zze = this.zze.zzp(zzbq0);
            zzty zzty0 = this.zzf;
            if(zzty0 != null) {
                this.zzL(zzty0.zzn());
            }
        }
        else if(zzbq0.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzbq0) : zztz.zzr(zzbq0, zzbp.zza, zztz.zzc);
        }
        else {
            zzbq0.zze(0, this.zzc, 0L);
            Object object0 = this.zzc.zzb;
            zzty zzty1 = this.zzf;
            if(zzty1 == null) {
                v1 = 0L;
            }
            else {
                long v = zzty1.zzq();
                this.zze.zzn(zzty1.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                v1 = v == 0L ? 0L : v;
            }
            Pair pair0 = zzbq0.zzl(this.zzc, this.zzd, 0, v1);
            Object object1 = pair0.first;
            long v2 = (long)(((Long)pair0.second));
            this.zze = this.zzi ? this.zze.zzp(zzbq0) : zztz.zzr(zzbq0, object0, object1);
            zzty zzty2 = this.zzf;
            if(zzty2 != null && this.zzL(v2)) {
                Object object2 = this.zzK(zzty2.zza.zza);
                zzug0 = zzty2.zza.zza(object2);
            }
        }
        this.zzi = true;
        this.zzh = true;
        this.zzo(this.zze);
        if(zzug0 != null) {
            zzty zzty3 = this.zzf;
            zzty3.getClass();
            zzty3.zzr(zzug0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzwl
    public final void zzF() {
        if(!this.zzb) {
            this.zzg = true;
            this.zzB(null, this.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzwl
    public final void zzG(zzue zzue0) {
        ((zzty)zzue0).zzt();
        if(zzue0 == this.zzf) {
            this.zzf = null;
        }
    }

    public final zzty zzH(zzug zzug0, zzyk zzyk0, long v) {
        zzty zzty0 = new zzty(zzug0, zzyk0, v);
        zzty0.zzu(this.zza);
        if(this.zzh) {
            zzty0.zzr(zzug0.zza(this.zzK(zzug0.zza)));
            return zzty0;
        }
        this.zzf = zzty0;
        if(!this.zzg) {
            this.zzg = true;
            this.zzB(null, this.zza);
        }
        return zzty0;
    }

    @Override  // com.google.android.gms.internal.ads.zzwl
    public final zzue zzI(zzug zzug0, zzyk zzyk0, long v) {
        return this.zzH(zzug0, zzyk0, v);
    }

    private final Object zzK(Object object0) {
        return this.zze.zze == null || !object0.equals(zztz.zzc) ? object0 : this.zze.zze;
    }

    @m({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long v) {
        zzty zzty0 = this.zzf;
        int v1 = this.zze.zza(zzty0.zza.zza);
        if(v1 == -1) {
            return false;
        }
        this.zze.zzd(v1, this.zzd, false);
        long v2 = this.zzd.zzd;
        if(v2 != 0x8000000000000001L && v >= v2) {
            v = Math.max(0L, v2 - 1L);
        }
        zzty0.zzs(v);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    public final void zzt(zzar zzar0) {
        this.zze = this.zzi ? this.zze.zzp(new zzwh(this.zze.zzb, zzar0)) : zztz.zzq(zzar0);
        this.zza.zzt(zzar0);
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    public final void zzz() {
    }
}

