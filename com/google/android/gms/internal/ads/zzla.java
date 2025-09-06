package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzla {
    private final zzog zza;
    private final List zzb;
    private final IdentityHashMap zzc;
    private final Map zzd;
    private final zzkz zze;
    private final HashMap zzf;
    private final Set zzg;
    private final zzlt zzh;
    private final zzdh zzi;
    private boolean zzj;
    @Nullable
    private zzgy zzk;
    private zzwb zzl;

    public zzla(zzkz zzkz0, zzlt zzlt0, zzdh zzdh0, zzog zzog0) {
        this.zza = zzog0;
        this.zze = zzkz0;
        this.zzl = new zzwb(0);
        this.zzc = new IdentityHashMap();
        this.zzd = new HashMap();
        this.zzb = new ArrayList();
        this.zzh = zzlt0;
        this.zzi = zzdh0;
        this.zzf = new HashMap();
        this.zzg = new HashSet();
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbq zzb() {
        if(!this.zzb.isEmpty()) {
            int v1 = 0;
            for(int v = 0; v < this.zzb.size(); ++v) {
                zzky zzky0 = (zzky)this.zzb.get(v);
                zzky0.zzd = v1;
                v1 += zzky0.zza.zzC().zzc();
            }
            return new zzlh(this.zzb, this.zzl);
        }
        return zzbq.zza;
    }

    public final zzbq zzc(int v, int v1, List list0) {
        boolean z = true;
        zzcw.zzd(v >= 0 && v <= v1 && v1 <= this.zza());
        if(list0.size() != v1 - v) {
            z = false;
        }
        zzcw.zzd(z);
        for(int v2 = v; v2 < v1; ++v2) {
            ((zzky)this.zzb.get(v2)).zza.zzt(((zzar)list0.get(v2 - v)));
        }
        return this.zzb();
    }

    // 检测为 Lambda 实现
    final void zzf(zzui zzui0, zzbq zzbq0) [...]

    public final void zzg(@Nullable zzgy zzgy0) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzgy0;
        for(int v = 0; v < this.zzb.size(); ++v) {
            zzky zzky0 = (zzky)this.zzb.get(v);
            this.zzv(zzky0);
            this.zzg.add(zzky0);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for(Object object0: this.zzf.values()) {
            zzkx zzkx0 = (zzkx)object0;
            try {
                zzkx0.zza.zzp(zzkx0.zzb);
            }
            catch(RuntimeException runtimeException0) {
                zzdo.zzd("MediaSourceList", "Failed to release child source.", runtimeException0);
            }
            zzkx0.zza.zzs(zzkx0.zzc);
            zzkx0.zza.zzr(zzkx0.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzue zzue0) {
        zzky zzky0 = (zzky)this.zzc.remove(zzue0);
        zzky0.getClass();
        zzky0.zza.zzG(zzue0);
        zzky0.zzc.remove(((zzty)zzue0).zza);
        if(!this.zzc.isEmpty()) {
            this.zzt();
        }
        this.zzu(zzky0);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbq zzk(int v, List list0, zzwb zzwb0) {
        if(!list0.isEmpty()) {
            this.zzl = zzwb0;
            for(int v1 = v; v1 < list0.size() + v; ++v1) {
                zzky zzky0 = (zzky)list0.get(v1 - v);
                if(v1 > 0) {
                    zzky zzky1 = (zzky)this.zzb.get(v1 - 1);
                    zzky0.zzc(zzky1.zzd + zzky1.zza.zzC().zzc());
                }
                else {
                    zzky0.zzc(0);
                }
                this.zzr(v1, zzky0.zza.zzC().zzc());
                this.zzb.add(v1, zzky0);
                this.zzd.put(zzky0.zzb, zzky0);
                if(this.zzj) {
                    this.zzv(zzky0);
                    if(this.zzc.isEmpty()) {
                        this.zzg.add(zzky0);
                    }
                    else {
                        this.zzs(zzky0);
                    }
                }
            }
        }
        return this.zzb();
    }

    public final zzbq zzl(int v, int v1, int v2, zzwb zzwb0) {
        zzcw.zzd(this.zza() >= 0);
        this.zzl = null;
        return this.zzb();
    }

    public final zzbq zzm(int v, int v1, zzwb zzwb0) {
        zzcw.zzd(v >= 0 && v <= v1 && v1 <= this.zza());
        this.zzl = zzwb0;
        this.zzw(v, v1);
        return this.zzb();
    }

    public final zzbq zzn(List list0, zzwb zzwb0) {
        this.zzw(0, this.zzb.size());
        return this.zzk(this.zzb.size(), list0, zzwb0);
    }

    public final zzbq zzo(zzwb zzwb0) {
        int v = this.zza();
        if(zzwb0.zzc() != v) {
            zzwb0 = zzwb0.zzf().zzg(0, v);
        }
        this.zzl = zzwb0;
        return this.zzb();
    }

    public final zzue zzp(zzug zzug0, zzyk zzyk0, long v) {
        Object object0 = ((Pair)zzug0.zza).first;
        zzug zzug1 = zzug0.zza(((Pair)zzug0.zza).second);
        zzky zzky0 = (zzky)this.zzd.get(object0);
        zzky0.getClass();
        this.zzg.add(zzky0);
        zzkx zzkx0 = (zzkx)this.zzf.get(zzky0);
        if(zzkx0 != null) {
            zzkx0.zza.zzk(zzkx0.zzb);
        }
        zzky0.zzc.add(zzug1);
        zzue zzue0 = zzky0.zza.zzH(zzug1, zzyk0, v);
        this.zzc.put(zzue0, zzky0);
        this.zzt();
        return zzue0;
    }

    public final zzwb zzq() {
        return this.zzl;
    }

    private final void zzr(int v, int v1) {
        while(v < this.zzb.size()) {
            zzky zzky0 = (zzky)this.zzb.get(v);
            zzky0.zzd += v1;
            ++v;
        }
    }

    private final void zzs(zzky zzky0) {
        zzkx zzkx0 = (zzkx)this.zzf.get(zzky0);
        if(zzkx0 != null) {
            zzkx0.zza.zzi(zzkx0.zzb);
        }
    }

    private final void zzt() {
        Iterator iterator0 = this.zzg.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zzky zzky0 = (zzky)object0;
            if(zzky0.zzc.isEmpty()) {
                this.zzs(zzky0);
                iterator0.remove();
            }
        }
    }

    private final void zzu(zzky zzky0) {
        if(zzky0.zze && zzky0.zzc.isEmpty()) {
            zzkx zzkx0 = (zzkx)this.zzf.remove(zzky0);
            zzkx0.getClass();
            zzkx0.zza.zzp(zzkx0.zzb);
            zzkx0.zza.zzs(zzkx0.zzc);
            zzkx0.zza.zzr(zzkx0.zzc);
            this.zzg.remove(zzky0);
        }
    }

    private final void zzv(zzky zzky0) {
        zzkq zzkq0 = (zzui zzui0, zzbq zzbq0) -> this.zze.zzh();
        zzkw zzkw0 = new zzkw(this, zzky0);
        zzkx zzkx0 = new zzkx(zzky0.zza, zzkq0, zzkw0);
        this.zzf.put(zzky0, zzkx0);
        Handler handler0 = new Handler(zzei.zzz(), null);
        zzky0.zza.zzh(handler0, zzkw0);
        Handler handler1 = new Handler(zzei.zzz(), null);
        zzky0.zza.zzg(handler1, zzkw0);
        zzky0.zza.zzm(zzkq0, this.zzk, this.zza);
    }

    private final void zzw(int v, int v1) {
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            zzky zzky0 = (zzky)this.zzb.remove(v1);
            this.zzd.remove(zzky0.zzb);
            this.zzr(v1, -zzky0.zza.zzC().zzc());
            zzky0.zze = true;
            if(this.zzj) {
                this.zzu(zzky0);
            }
        }
    }
}

