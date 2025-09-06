package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

final class zzko {
    private final zzbo zza;
    private final zzbp zzb;
    private final zzlt zzc;
    private final zzdh zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzil zzh;
    @Nullable
    private zzkl zzi;
    @Nullable
    private zzkl zzj;
    @Nullable
    private zzkl zzk;
    @Nullable
    private zzkl zzl;
    private int zzm;
    @Nullable
    private Object zzn;
    private long zzo;
    private List zzp;
    private final zzjs zzq;

    public zzko(zzlt zzlt0, zzdh zzdh0, zzjs zzjs0, zzil zzil0) {
        this.zzc = zzlt0;
        this.zzd = zzdh0;
        this.zzq = zzjs0;
        this.zzh = zzil0;
        this.zza = new zzbo();
        this.zzb = new zzbp();
        this.zzp = new ArrayList();
    }

    private final long zzA(Object object0) {
        for(int v = 0; v < this.zzp.size(); ++v) {
            zzkl zzkl0 = (zzkl)this.zzp.get(v);
            if(zzkl0.zzb.equals(object0)) {
                return zzkl0.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    @Nullable
    private final zzkm zzB(zzbq zzbq0, zzkl zzkl0, long v) {
        long v7;
        zzkm zzkm0 = zzkl0.zzg;
        long v1 = zzkl0.zze() + zzkm0.zze - v;
        if(zzkm0.zzg) {
            long v2 = 0L;
            int v3 = zzbq0.zzi(zzbq0.zza(zzkm0.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if(v3 == -1) {
                return null;
            }
            int v4 = zzbq0.zzd(v3, this.zza, true).zzc;
            Object object0 = this.zza.zzb;
            object0.getClass();
            long v5 = zzkm0.zza.zzd;
            if(zzbq0.zze(v4, this.zzb, 0L).zzn == v3) {
                Pair pair0 = zzbq0.zzm(this.zzb, this.zza, v4, 0x8000000000000001L, Math.max(0L, v1));
                if(pair0 == null) {
                    return null;
                }
                object0 = pair0.first;
                long v6 = (long)(((Long)pair0.second));
                zzkl zzkl1 = zzkl0.zzg();
                if(zzkl1 == null || !zzkl1.zzb.equals(object0)) {
                    v5 = this.zzA(object0);
                    if(v5 == -1L) {
                        v5 = this.zze;
                        this.zze = v5 + 1L;
                    }
                }
                else {
                    v5 = zzkl1.zzg.zza.zzd;
                }
                v7 = v6;
                v2 = 0x8000000000000001L;
            }
            else {
                v7 = 0L;
            }
            zzug zzug0 = zzko.zzF(zzbq0, object0, v7, v5, this.zzb, this.zza);
            if(v2 != 0x8000000000000001L && zzkm0.zzc != 0x8000000000000001L) {
                zzbq0.zzn(zzkm0.zza.zza, this.zza).zzb();
            }
            return this.zzC(zzbq0, zzug0, v2, v7);
        }
        zzug zzug1 = zzkm0.zza;
        zzbq0.zzn(zzug1.zza, this.zza);
        if(zzug1.zzb()) {
            int v8 = zzug1.zzb;
            if(this.zza.zza(v8) != -1) {
                int v9 = this.zza.zzg.zza(v8).zza(zzug1.zzc);
                if(v9 < 0) {
                    return this.zzD(zzbq0, zzug1.zza, v8, v9, zzkm0.zzc, zzug1.zzd);
                }
                long v10 = zzkm0.zzc;
                if(v10 != 0x8000000000000001L) {
                    this.zzz(zzbq0, zzug1.zza, zzug1.zzb);
                    return this.zzE(zzbq0, zzug1.zza, Math.max(0L, v10), zzkm0.zzc, zzug1.zzd);
                }
                Pair pair1 = zzbq0.zzm(this.zzb, this.zza, this.zza.zzc, 0x8000000000000001L, Math.max(0L, v1));
                if(pair1 != null) {
                    v10 = (long)(((Long)pair1.second));
                    this.zzz(zzbq0, zzug1.zza, zzug1.zzb);
                    return this.zzE(zzbq0, zzug1.zza, Math.max(0L, v10), zzkm0.zzc, zzug1.zzd);
                }
            }
            return null;
        }
        int v11 = this.zza.zze(zzug1.zze);
        if(v11 != this.zza.zza(zzug1.zze)) {
            return this.zzD(zzbq0, zzug1.zza, zzug1.zze, v11, zzkm0.zze, zzug1.zzd);
        }
        this.zzz(zzbq0, zzug1.zza, zzug1.zze);
        return this.zzE(zzbq0, zzug1.zza, 0L, zzkm0.zze, zzug1.zzd);
    }

    private final zzkm zzC(zzbq zzbq0, zzug zzug0, long v, long v1) {
        zzbq0.zzn(zzug0.zza, this.zza);
        return zzug0.zzb() ? this.zzD(zzbq0, zzug0.zza, zzug0.zzb, zzug0.zzc, v, zzug0.zzd) : this.zzE(zzbq0, zzug0.zza, v1, v, zzug0.zzd);
    }

    private final zzkm zzD(zzbq zzbq0, Object object0, int v, int v1, long v2, long v3) {
        zzug zzug0 = new zzug(object0, v, v1, v3);
        long v4 = zzbq0.zzn(zzug0.zza, this.zza).zzf(zzug0.zzb, zzug0.zzc);
        boolean z = v1 != this.zza.zze(v);
        return new zzkm(zzug0, (v4 == 0x8000000000000001L || v4 > 0L ? 0L : Math.max(0L, v4 - 1L)), v2, 0x8000000000000001L, v4, false, false, false, false);
    }

    private final zzkm zzE(zzbq zzbq0, Object object0, long v, long v1, long v2) {
        zzbq0.zzn(object0, this.zza);
        zzug zzug0 = new zzug(object0, v2, -1);
        boolean z = zzko.zzK(zzug0);
        boolean z1 = this.zzI(zzbq0, zzug0);
        boolean z2 = this.zzH(zzbq0, zzug0, z);
        long v3 = this.zza.zzd;
        if(v3 != 0x8000000000000001L && v >= v3) {
            v = Math.max(0L, v3 - 1L);
        }
        return new zzkm(zzug0, v, v1, 0x8000000000000001L, v3, false, z, z1, z2);
    }

    private static zzug zzF(zzbq zzbq0, Object object0, long v, long v1, zzbp zzbp0, zzbo zzbo0) {
        zzbq0.zzn(object0, zzbo0);
        zzbq0.zze(zzbo0.zzc, zzbp0, 0L);
        zzbq0.zza(object0);
        zzbq0.zzn(object0, zzbo0);
        int v2 = zzbo0.zzd(v);
        return v2 == -1 ? new zzug(object0, v1, -1) : new zzug(object0, v2, zzbo0.zze(v2), v1);
    }

    private final void zzG() {
        zzfxk zzfxk0 = new zzfxk();
        for(zzkl zzkl0 = this.zzi; zzkl0 != null; zzkl0 = zzkl0.zzg()) {
            zzfxk0.zzf(zzkl0.zzg.zza);
        }
        zzkn zzkn0 = () -> {
            zzfxn zzfxn0 = zzfxk0.zzi();
            this.zzc.zzT(zzfxn0, (this.zzj == null ? null : this.zzj.zzg.zza));
        };
        this.zzd.zzh(zzkn0);
    }

    private final boolean zzH(zzbq zzbq0, zzug zzug0, boolean z) {
        int v = zzbq0.zza(zzug0.zza);
        return !zzbq0.zze(zzbq0.zzd(v, this.zza, false).zzc, this.zzb, 0L).zzi && zzbq0.zzi(v, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    private final boolean zzI(zzbq zzbq0, zzug zzug0) {
        if(!zzko.zzK(zzug0)) {
            return false;
        }
        int v = zzbq0.zzn(zzug0.zza, this.zza).zzc;
        int v1 = zzbq0.zza(zzug0.zza);
        return zzbq0.zze(v, this.zzb, 0L).zzo == v1;
    }

    private final boolean zzJ(zzbq zzbq0) {
        zzkl zzkl0 = this.zzi;
        if(zzkl0 == null) {
            return true;
        }
        int v = zzbq0.zza(zzkl0.zzb);
        while(true) {
            v = zzbq0.zzi(v, this.zza, this.zzb, this.zzf, this.zzg);
            while(true) {
                zzkl0.getClass();
                if(zzkl0.zzg() == null || zzkl0.zzg.zzg) {
                    break;
                }
                zzkl0 = zzkl0.zzg();
            }
            zzkl zzkl1 = zzkl0.zzg();
            if(v == -1 || zzkl1 == null || zzbq0.zza(zzkl1.zzb) != v) {
                break;
            }
            zzkl0 = zzkl1;
        }
        boolean z = this.zzu(zzkl0);
        zzkl0.zzg = this.zzj(zzbq0, zzkl0.zzg);
        return !z;
    }

    private static final boolean zzK(zzug zzug0) {
        return !zzug0.zzb() && zzug0.zze == -1;
    }

    @Nullable
    public final zzkl zza() {
        zzkl zzkl0 = this.zzi;
        if(zzkl0 == null) {
            return null;
        }
        if(zzkl0 == this.zzj) {
            this.zzj = zzkl0.zzg();
        }
        zzkl0.zzo();
        int v = this.zzm - 1;
        this.zzm = v;
        if(v == 0) {
            this.zzk = null;
            this.zzn = this.zzi.zzb;
            this.zzo = this.zzi.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        this.zzG();
        return this.zzi;
    }

    public final zzkl zzb() {
        zzkl zzkl0 = this.zzj;
        zzcw.zzb(zzkl0);
        this.zzj = zzkl0.zzg();
        this.zzG();
        zzkl zzkl1 = this.zzj;
        zzcw.zzb(zzkl1);
        return zzkl1;
    }

    public final zzkl zzc(zzkm zzkm0) {
        zzkl zzkl0;
        long v = this.zzk == null ? 1000000000000L : this.zzk.zze() + this.zzk.zzg.zze - zzkm0.zzb;
        for(int v1 = 0; true; ++v1) {
            zzkl0 = null;
            if(v1 >= this.zzp.size()) {
                break;
            }
            zzkm zzkm1 = ((zzkl)this.zzp.get(v1)).zzg;
            if(zzko.zzr(zzkm1.zze, zzkm0.zze) && zzkm1.zzb == zzkm0.zzb && zzkm1.zza.equals(zzkm0.zza)) {
                zzkl0 = (zzkl)this.zzp.remove(v1);
                break;
            }
        }
        if(zzkl0 == null) {
            zzkl0 = zzkc.zzd(this.zzq.zza, zzkm0, v);
        }
        else {
            zzkl0.zzg = zzkm0;
            zzkl0.zzq(v);
        }
        zzkl zzkl1 = this.zzk;
        if(zzkl1 == null) {
            this.zzi = zzkl0;
            this.zzj = zzkl0;
        }
        else {
            zzkl1.zzp(zzkl0);
        }
        this.zzn = null;
        this.zzk = zzkl0;
        ++this.zzm;
        this.zzG();
        return zzkl0;
    }

    @Nullable
    public final zzkl zzd() {
        return this.zzk;
    }

    @Nullable
    public final zzkl zze() {
        return this.zzi;
    }

    @Nullable
    public final zzkl zzf(zzue zzue0) {
        for(int v = 0; v < this.zzp.size(); ++v) {
            zzkl zzkl0 = (zzkl)this.zzp.get(v);
            if(zzkl0.zza == zzue0) {
                return zzkl0;
            }
        }
        return null;
    }

    @Nullable
    public final zzkl zzg() {
        return this.zzl;
    }

    @Nullable
    public final zzkl zzh() {
        return this.zzj;
    }

    @Nullable
    public final zzkm zzi(long v, zzlb zzlb0) {
        return this.zzk == null ? this.zzC(zzlb0.zza, zzlb0.zzb, zzlb0.zzc, zzlb0.zzs) : this.zzB(zzlb0.zza, this.zzk, v);
    }

    public final zzkm zzj(zzbq zzbq0, zzkm zzkm0) {
        long v1;
        zzug zzug0 = zzkm0.zza;
        boolean z = zzko.zzK(zzug0);
        boolean z1 = this.zzI(zzbq0, zzug0);
        boolean z2 = this.zzH(zzbq0, zzug0, z);
        zzbq0.zzn(zzkm0.zza.zza, this.zza);
        long v = !zzug0.zzb() && zzug0.zze != -1 ? 0L : 0x8000000000000001L;
        if(zzug0.zzb()) {
            v1 = this.zza.zzf(zzug0.zzb, zzug0.zzc);
            return zzug0.zzb() ? new zzkm(zzug0, zzkm0.zzb, zzkm0.zzc, v, v1, false, z, z1, z2) : new zzkm(zzug0, zzkm0.zzb, zzkm0.zzc, v, v1, false, z, z1, z2);
        }
        if(v != 0x8000000000000001L) {
            return zzug0.zzb() ? new zzkm(zzug0, zzkm0.zzb, zzkm0.zzc, 0L, 0L, false, z, z1, z2) : new zzkm(zzug0, zzkm0.zzb, zzkm0.zzc, 0L, 0L, false, z, z1, z2);
        }
        v1 = this.zza.zzd;
        return zzug0.zzb() ? new zzkm(zzug0, zzkm0.zzb, zzkm0.zzc, 0x8000000000000001L, v1, false, z, z1, z2) : new zzkm(zzug0, zzkm0.zzb, zzkm0.zzc, 0x8000000000000001L, v1, false, z, z1, z2);
    }

    public final zzug zzk(zzbq zzbq0, Object object0, long v) {
        zzbp zzbp0;
        long v3;
        zzkl zzkl0;
        Object object2;
        int v6;
        int v1 = zzbq0.zzn(object0, this.zza).zzc;
        Object object1 = this.zzn;
        if(object1 == null) {
            zzkl0 = this.zzi;
        alab1:
            while(true) {
            label_10:
                if(zzkl0 == null) {
                    for(zzkl zzkl1 = this.zzi; zzkl1 != null; zzkl1 = zzkl1.zzg()) {
                        int v4 = zzbq0.zza(zzkl1.zzb);
                        if(v4 != -1 && zzbq0.zzd(v4, this.zza, false).zzc == v1) {
                            v3 = zzkl1.zzg.zza.zzd;
                            break alab1;
                        }
                    }
                    long v5 = this.zzA(object0);
                    if(v5 == -1L) {
                        v3 = this.zze;
                        this.zze = v3 + 1L;
                        if(this.zzi == null) {
                            this.zzn = object0;
                            this.zzo = v3;
                        }
                    }
                    else {
                        v3 = v5;
                    }
                    break;
                }
                if(zzkl0.zzb.equals(object0)) {
                    v3 = zzkl0.zzg.zza.zzd;
                    break;
                }
                zzkl0 = zzkl0.zzg();
            }
            zzbq0.zzn(object0, this.zza);
            zzbq0.zze(this.zza.zzc, this.zzb, 0L);
            v6 = zzbq0.zza(object0);
            object2 = object0;
        }
        else {
            int v2 = zzbq0.zza(object1);
            if(v2 == -1 || zzbq0.zzd(v2, this.zza, false).zzc != v1) {
                zzkl0 = this.zzi;
                goto label_10;
            }
            else {
                v3 = this.zzo;
                zzbq0.zzn(object0, this.zza);
                zzbq0.zze(this.zza.zzc, this.zzb, 0L);
                v6 = zzbq0.zza(object0);
                object2 = object0;
            }
        }
        while(true) {
            zzbp0 = this.zzb;
            if(v6 < zzbp0.zzn) {
                break;
            }
            zzbq0.zzd(v6, this.zza, true);
            if(this.zza.zzd(this.zza.zzd) != -1) {
                object2 = this.zza.zzb;
                object2.getClass();
            }
            --v6;
        }
        return zzko.zzF(zzbq0, object2, v, v3, zzbp0, this.zza);
    }

    public final void zzl() {
        if(this.zzm == 0) {
            return;
        }
        zzkl zzkl0 = this.zzi;
        zzcw.zzb(zzkl0);
        this.zzn = zzkl0.zzb;
        this.zzo = zzkl0.zzg.zza.zzd;
        while(zzkl0 != null) {
            zzkl0.zzo();
            zzkl0 = zzkl0.zzg();
        }
        this.zzi = null;
        this.zzk = null;
        this.zzj = null;
        this.zzm = 0;
        this.zzG();
    }

    // 检测为 Lambda 实现
    final void zzm(zzfxk zzfxk0, zzug zzug0) [...]

    public final void zzn() {
        if(this.zzl == null || this.zzl.zzt()) {
            this.zzl = null;
            for(int v = 0; v < this.zzp.size(); ++v) {
                zzkl zzkl0 = (zzkl)this.zzp.get(v);
                if(!zzkl0.zzt()) {
                    this.zzl = zzkl0;
                    return;
                }
            }
        }
    }

    public final void zzo(long v) {
        zzkl zzkl0 = this.zzk;
        if(zzkl0 != null) {
            zzkl0.zzn(v);
        }
    }

    public final void zzp() {
        if(!this.zzp.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < this.zzp.size(); ++v) {
                ((zzkl)this.zzp.get(v)).zzo();
            }
            this.zzp = arrayList0;
            this.zzl = null;
            this.zzn();
        }
    }

    public final void zzq(zzbq zzbq0, zzil zzil0) {
        this.zzh = zzil0;
        this.zzp();
    }

    static boolean zzr(long v, long v1) {
        return v == 0x8000000000000001L || v == v1;
    }

    public final boolean zzs(zzue zzue0) {
        return this.zzk != null && this.zzk.zza == zzue0;
    }

    public final boolean zzt(zzue zzue0) {
        return this.zzl != null && this.zzl.zza == zzue0;
    }

    public final boolean zzu(zzkl zzkl0) {
        zzcw.zzb(zzkl0);
        boolean z = false;
        if(zzkl0.equals(this.zzk)) {
            return false;
        }
        this.zzk = zzkl0;
        while(zzkl0.zzg() != null) {
            zzkl0 = zzkl0.zzg();
            zzkl0.getClass();
            if(zzkl0 == this.zzj) {
                this.zzj = this.zzi;
                z = true;
            }
            zzkl0.zzo();
            --this.zzm;
        }
        zzkl zzkl1 = this.zzk;
        zzkl1.getClass();
        zzkl1.zzp(null);
        this.zzG();
        return z;
    }

    // 去混淆评级： 低(20)
    public final boolean zzv() {
        return this.zzk == null || !this.zzk.zzg.zzi && this.zzk.zzs() && this.zzk.zzg.zze != 0x8000000000000001L && this.zzm < 100;
    }

    public final boolean zzw(zzbq zzbq0, long v, long v1) {
        zzkm zzkm1;
        zzkl zzkl0 = this.zzi;
        zzkl zzkl1 = null;
        while(zzkl0 != null) {
            zzkm zzkm0 = zzkl0.zzg;
            if(zzkl1 == null) {
                zzkm1 = this.zzj(zzbq0, zzkm0);
            }
            else {
                zzkm zzkm2 = this.zzB(zzbq0, zzkl1, v);
                if(zzkm2 == null) {
                    return !this.zzu(zzkl1);
                }
                if(zzkm0.zzb != zzkm2.zzb || !zzkm0.zza.equals(zzkm2.zza)) {
                    return !this.zzu(zzkl1);
                }
                zzkm1 = zzkm2;
            }
            zzkl0.zzg = zzkm1.zza(zzkm0.zzc);
            if(!zzko.zzr(zzkm0.zze, zzkm1.zze)) {
                zzkl0.zzr();
                boolean z = zzkl0 == this.zzj && (v1 == 0x8000000000000000L || v1 >= (zzkm1.zze == 0x8000000000000001L ? 0x7FFFFFFFFFFFFFFFL : zzkm1.zze + zzkl0.zze()));
                return !this.zzu(zzkl0) && !z;
            }
            zzkl1 = zzkl0;
            zzkl0 = zzkl0.zzg();
        }
        return true;
    }

    public final boolean zzx(zzbq zzbq0, int v) {
        this.zzf = v;
        return this.zzJ(zzbq0);
    }

    public final boolean zzy(zzbq zzbq0, boolean z) {
        this.zzg = z;
        return this.zzJ(zzbq0);
    }

    private final long zzz(zzbq zzbq0, Object object0, int v) {
        zzbq0.zzn(object0, this.zza);
        return 0L;
    }
}

