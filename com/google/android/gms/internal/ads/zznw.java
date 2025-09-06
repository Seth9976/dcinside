package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class zznw {
    private final zzbo zza;
    private zzfxn zzb;
    private zzfxq zzc;
    @Nullable
    private zzug zzd;
    private zzug zze;
    private zzug zzf;

    public zznw(zzbo zzbo0) {
        this.zza = zzbo0;
        this.zzb = zzfxn.zzn();
        this.zzc = zzfxq.zzd();
    }

    @Nullable
    public final zzbq zza(zzug zzug0) {
        return (zzbq)this.zzc.get(zzug0);
    }

    @Nullable
    public final zzug zzb() {
        return this.zzd;
    }

    @Nullable
    public final zzug zzc() {
        Object object0;
        if(this.zzb.isEmpty()) {
            return null;
        }
        zzfxn zzfxn0 = this.zzb;
        if(zzfxn0 instanceof List) {
            if(zzfxn0.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (zzug)zzfxn0.get(zzfxn0.size() - 1);
        }
        Iterator iterator0 = zzfxn0.iterator();
        do {
            object0 = iterator0.next();
        }
        while(iterator0.hasNext());
        return (zzug)object0;
    }

    @Nullable
    public final zzug zzd() {
        return this.zze;
    }

    @Nullable
    public final zzug zze() {
        return this.zzf;
    }

    public final void zzg(zzbk zzbk0) {
        this.zzd = zznw.zzj(zzbk0, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list0, @Nullable zzug zzug0, zzbk zzbk0) {
        this.zzb = zzfxn.zzl(list0);
        if(!list0.isEmpty()) {
            this.zze = (zzug)list0.get(0);
            zzug0.getClass();
            this.zzf = zzug0;
        }
        if(this.zzd == null) {
            this.zzd = zznw.zzj(zzbk0, this.zzb, this.zze, this.zza);
        }
        this.zzl(zzbk0.zzn());
    }

    public final void zzi(zzbk zzbk0) {
        this.zzd = zznw.zzj(zzbk0, this.zzb, this.zze, this.zza);
        this.zzl(zzbk0.zzn());
    }

    @Nullable
    private static zzug zzj(zzbk zzbk0, zzfxn zzfxn0, @Nullable zzug zzug0, zzbo zzbo0) {
        zzbq zzbq0 = zzbk0.zzn();
        int v = zzbk0.zze();
        Object object0 = zzbq0.zzo() ? null : zzbq0.zzf(v);
        int v1 = !zzbk0.zzw() && !zzbq0.zzo() ? zzbq0.zzd(v, zzbo0, false).zzc(zzei.zzs(zzbk0.zzk())) : -1;
        for(int v2 = 0; v2 < zzfxn0.size(); ++v2) {
            zzug zzug1 = (zzug)zzfxn0.get(v2);
            if(zznw.zzm(zzug1, object0, zzbk0.zzw(), zzbk0.zzb(), zzbk0.zzc(), v1)) {
                return zzug1;
            }
        }
        return !zzfxn0.isEmpty() || zzug0 == null || !zznw.zzm(zzug0, object0, zzbk0.zzw(), zzbk0.zzb(), zzbk0.zzc(), v1) ? null : zzug0;
    }

    private final void zzk(zzfxp zzfxp0, @Nullable zzug zzug0, zzbq zzbq0) {
        if(zzug0 != null) {
            if(zzbq0.zza(zzug0.zza) != -1) {
                zzfxp0.zza(zzug0, zzbq0);
                return;
            }
            zzbq zzbq1 = (zzbq)this.zzc.get(zzug0);
            if(zzbq1 != null) {
                zzfxp0.zza(zzug0, zzbq1);
            }
        }
    }

    private final void zzl(zzbq zzbq0) {
        zzfxp zzfxp0 = new zzfxp();
        if(this.zzb.isEmpty()) {
            this.zzk(zzfxp0, this.zze, zzbq0);
            if(!zzfuk.zza(this.zzf, this.zze)) {
                this.zzk(zzfxp0, this.zzf, zzbq0);
            }
            if(!zzfuk.zza(this.zzd, this.zze) && !zzfuk.zza(this.zzd, this.zzf)) {
                this.zzk(zzfxp0, this.zzd, zzbq0);
            }
        }
        else {
            for(int v = 0; v < this.zzb.size(); ++v) {
                this.zzk(zzfxp0, ((zzug)this.zzb.get(v)), zzbq0);
            }
            if(!this.zzb.contains(this.zzd)) {
                this.zzk(zzfxp0, this.zzd, zzbq0);
            }
        }
        this.zzc = zzfxp0.zzc();
    }

    private static boolean zzm(zzug zzug0, @Nullable Object object0, boolean z, int v, int v1, int v2) {
        if(!zzug0.zza.equals(object0)) {
            return false;
        }
        return z ? zzug0.zzb == v && zzug0.zzc == v1 : zzug0.zzb == -1 && zzug0.zze == v2;
    }
}

