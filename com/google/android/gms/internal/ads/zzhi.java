package com.google.android.gms.internal.ads;

import android.util.Pair;

public abstract class zzhi extends zzbq {
    private final int zzb;
    private final zzwb zzc;

    public zzhi(boolean z, zzwb zzwb0) {
        this.zzc = zzwb0;
        this.zzb = zzwb0.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object object0) {
        if(object0 instanceof Pair) {
            Object object1 = ((Pair)object0).first;
            Object object2 = ((Pair)object0).second;
            int v = this.zzp(object1);
            if(v != -1) {
                int v1 = this.zzu(v).zza(object2);
                return v1 == -1 ? -1 : this.zzs(v) + v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int v, zzbo zzbo0, boolean z) {
        int v1 = this.zzq(v);
        int v2 = this.zzt(v1);
        int v3 = this.zzs(v1);
        this.zzu(v1).zzd(v - v3, zzbo0, z);
        zzbo0.zzc += v2;
        if(z) {
            Object object0 = this.zzv(v1);
            Object object1 = zzbo0.zzb;
            object1.getClass();
            zzbo0.zzb = Pair.create(object0, object1);
        }
        return zzbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int v, zzbp zzbp0, long v1) {
        int v2 = this.zzr(v);
        int v3 = this.zzt(v2);
        int v4 = this.zzs(v2);
        this.zzu(v2).zze(v - v3, zzbp0, v1);
        Pair pair0 = this.zzv(v2);
        if(!zzbp.zza.equals(zzbp0.zzb)) {
            pair0 = Pair.create(pair0, zzbp0.zzb);
        }
        zzbp0.zzb = pair0;
        zzbp0.zzn += v4;
        zzbp0.zzo += v4;
        return zzbp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int v) {
        int v1 = this.zzq(v);
        int v2 = this.zzs(v1);
        Object object0 = this.zzu(v1).zzf(v - v2);
        return Pair.create(this.zzv(v1), object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzg(boolean z) {
        if(this.zzb != 0) {
            int v = z ? this.zzc.zza() : 0;
            while(this.zzu(v).zzo()) {
                v = this.zzw(v, z);
                if(v != -1) {
                    continue;
                }
                return -1;
            }
            return this.zzt(v) + this.zzu(v).zzg(z);
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzh(boolean z) {
        int v = this.zzb;
        if(v != 0) {
            int v1 = z ? this.zzc.zzb() : v - 1;
            while(this.zzu(v1).zzo()) {
                v1 = this.zzx(v1, z);
                if(v1 != -1) {
                    continue;
                }
                return -1;
            }
            return this.zzt(v1) + this.zzu(v1).zzh(z);
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzj(int v, int v1, boolean z) {
        int v2 = this.zzr(v);
        int v3 = this.zzt(v2);
        int v4 = this.zzu(v2).zzj(v - v3, (v1 == 2 ? 0 : v1), z);
        if(v4 != -1) {
            return v3 + v4;
        }
        int v5;
        for(v5 = this.zzw(v2, z); v5 != -1 && this.zzu(v5).zzo(); v5 = this.zzw(v5, z)) {
        }
        if(v5 != -1) {
            return this.zzt(v5) + this.zzu(v5).zzg(z);
        }
        return v1 == 2 ? this.zzg(z) : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzk(int v, int v1, boolean z) {
        int v2 = this.zzr(v);
        int v3 = this.zzt(v2);
        int v4 = this.zzu(v2).zzk(v - v3, 0, false);
        if(v4 != -1) {
            return v3 + v4;
        }
        int v5;
        for(v5 = this.zzx(v2, false); v5 != -1 && this.zzu(v5).zzo(); v5 = this.zzx(v5, false)) {
        }
        return v5 == -1 ? -1 : this.zzt(v5) + this.zzu(v5).zzh(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzn(Object object0, zzbo zzbo0) {
        Object object1 = ((Pair)object0).first;
        Object object2 = ((Pair)object0).second;
        int v = this.zzp(object1);
        int v1 = this.zzt(v);
        this.zzu(v).zzn(object2, zzbo0);
        zzbo0.zzc += v1;
        zzbo0.zzb = object0;
        return zzbo0;
    }

    protected abstract int zzp(Object arg1);

    protected abstract int zzq(int arg1);

    protected abstract int zzr(int arg1);

    protected abstract int zzs(int arg1);

    protected abstract int zzt(int arg1);

    protected abstract zzbq zzu(int arg1);

    protected abstract Object zzv(int arg1);

    private final int zzw(int v, boolean z) {
        if(z) {
            return this.zzc.zzd(v);
        }
        return v < this.zzb - 1 ? v + 1 : -1;
    }

    private final int zzx(int v, boolean z) {
        if(z) {
            return this.zzc.zze(v);
        }
        return v > 0 ? v - 1 : -1;
    }
}

