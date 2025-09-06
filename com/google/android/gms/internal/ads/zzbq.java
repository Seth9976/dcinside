package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

public abstract class zzbq {
    public static final zzbq zza;

    static {
        zzbq.zza = new zzbn();
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzbq)) {
            return false;
        }
        if(((zzbq)object0).zzc() == this.zzc() && ((zzbq)object0).zzb() == this.zzb()) {
            zzbp zzbp0 = new zzbp();
            zzbo zzbo0 = new zzbo();
            zzbp zzbp1 = new zzbp();
            zzbo zzbo1 = new zzbo();
            for(int v = 0; v < this.zzc(); ++v) {
                if(!this.zze(v, zzbp0, 0L).equals(((zzbq)object0).zze(v, zzbp1, 0L))) {
                    return false;
                }
            }
            for(int v1 = 0; v1 < this.zzb(); ++v1) {
                if(!this.zzd(v1, zzbo0, true).equals(((zzbq)object0).zzd(v1, zzbo1, true))) {
                    return false;
                }
            }
            int v2 = this.zzg(true);
            if(v2 != ((zzbq)object0).zzg(true)) {
                return false;
            }
            int v3 = this.zzh(true);
            if(v3 == ((zzbq)object0).zzh(true)) {
                while(v2 != v3) {
                    int v4 = this.zzj(v2, 0, true);
                    if(v4 == ((zzbq)object0).zzj(v2, 0, true)) {
                        v2 = v4;
                        continue;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        zzbp zzbp0 = new zzbp();
        zzbo zzbo0 = new zzbo();
        int v = this.zzc() + 0xD9;
        for(int v1 = 0; v1 < this.zzc(); ++v1) {
            v = v * 0x1F + this.zze(v1, zzbp0, 0L).hashCode();
        }
        int v2 = v * 0x1F + this.zzb();
        for(int v3 = 0; v3 < this.zzb(); ++v3) {
            v2 = v2 * 0x1F + this.zzd(v3, zzbo0, true).hashCode();
        }
        for(int v4 = this.zzg(true); v4 != -1; v4 = this.zzj(v4, 0, true)) {
            v2 = v2 * 0x1F + v4;
        }
        return v2;
    }

    public abstract int zza(Object arg1);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbo zzd(int arg1, zzbo arg2, boolean arg3);

    public abstract zzbp zze(int arg1, zzbp arg2, long arg3);

    public abstract Object zzf(int arg1);

    // 去混淆评级： 低(20)
    public int zzg(boolean z) {
        return this.zzo() ? -1 : 0;
    }

    // 去混淆评级： 低(20)
    public int zzh(boolean z) {
        return this.zzo() ? -1 : this.zzc() - 1;
    }

    public final int zzi(int v, zzbo zzbo0, zzbp zzbp0, int v1, boolean z) {
        int v2 = this.zzd(v, zzbo0, false).zzc;
        if(this.zze(v2, zzbp0, 0L).zzo == v) {
            int v3 = this.zzj(v2, v1, z);
            return v3 == -1 ? -1 : this.zze(v3, zzbp0, 0L).zzn;
        }
        return v + 1;
    }

    public int zzj(int v, int v1, boolean z) {
        switch(v1) {
            case 0: {
                return v == this.zzh(z) ? -1 : v + 1;
            }
            case 1: {
                return v;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException();
                }
                return v == this.zzh(z) ? this.zzg(z) : v + 1;
            }
        }
    }

    public int zzk(int v, int v1, boolean z) {
        return v == this.zzg(false) ? -1 : v - 1;
    }

    public final Pair zzl(zzbp zzbp0, zzbo zzbo0, int v, long v1) {
        Pair pair0 = this.zzm(zzbp0, zzbo0, v, v1, 0L);
        pair0.getClass();
        return pair0;
    }

    @Nullable
    public final Pair zzm(zzbp zzbp0, zzbo zzbo0, int v, long v1, long v2) {
        zzcw.zza(v, 0, this.zzc());
        this.zze(v, zzbp0, v2);
        if(v1 == 0x8000000000000001L) {
            v1 = 0L;
        }
        int v3 = zzbp0.zzn;
        this.zzd(v3, zzbo0, false);
        while(v3 < zzbp0.zzo) {
            int v4 = Long.compare(v1, 0L);
            if(v4 == 0) {
                break;
            }
            this.zzd(v3 + 1, zzbo0, false);
            if(v4 < 0) {
                break;
            }
            ++v3;
        }
        this.zzd(v3, zzbo0, true);
        long v5 = zzbo0.zzd;
        if(v5 != 0x8000000000000001L) {
            v1 = Math.min(v1, v5 - 1L);
        }
        Object object0 = zzbo0.zzb;
        object0.getClass();
        return Pair.create(object0, Math.max(0L, v1));
    }

    public zzbo zzn(Object object0, zzbo zzbo0) {
        return this.zzd(this.zza(object0), zzbo0, true);
    }

    public final boolean zzo() {
        return this.zzc() == 0;
    }
}

