package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class zzoa implements zzoe {
    public static final zzfvf zza;
    private static final Random zzb;
    private final zzbp zzc;
    private final zzbo zzd;
    private final HashMap zze;
    private zzod zzf;
    private zzbq zzg;
    @Nullable
    private String zzh;
    private long zzi;

    static {
        zzoa.zza = new zzny();
        zzoa.zzb = new Random();
    }

    public zzoa() {
        throw null;
    }

    public zzoa(zzfvf zzfvf0) {
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        this.zze = new HashMap();
        this.zzg = zzbq.zza;
        this.zzi = -1L;
    }

    // 去混淆评级： 低(20)
    public static String zzd() [...] // 潜在的解密器

    @Override  // com.google.android.gms.internal.ads.zzoe
    @Nullable
    public final String zze() {
        synchronized(this) {
        }
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final String zzf(zzbq zzbq0, zzug zzug0) {
        synchronized(this) {
            return this.zzm(zzbq0.zzn(zzug0.zza, this.zzd).zzc, zzug0).zzb;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzg(zzlu zzlu0) {
        synchronized(this) {
            String s = this.zzh;
            if(s != null) {
                zznz zznz0 = (zznz)this.zze.get(s);
                if(zznz0 == null) {
                    throw null;
                }
                this.zzo(zznz0);
            }
            Iterator iterator0 = this.zze.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zznz zznz1 = (zznz)object0;
                iterator0.remove();
                if(zznz1.zzf) {
                    zzod zzod0 = this.zzf;
                    if(zzod0 != null) {
                        zzod0.zzd(zzlu0, zznz1.zzb, false);
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzh(zzod zzod0) {
        this.zzf = zzod0;
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzi(zzlu zzlu0) {
        synchronized(this) {
            if(this.zzf != null) {
                if(!zzlu0.zzb.zzo()) {
                    zzug zzug0 = zzlu0.zzd;
                    if(zzug0 == null) {
                    label_10:
                        zznz zznz1 = this.zzm(zzlu0.zzc, zzlu0.zzd);
                        if(this.zzh == null) {
                            this.zzh = zznz1.zzb;
                        }
                        zzug zzug1 = zzlu0.zzd;
                        if(zzug1 != null && zzug1.zzb()) {
                            zzug zzug2 = new zzug(zzug1.zza, zzug1.zzd, zzug1.zzb);
                            zznz zznz2 = this.zzm(zzlu0.zzc, zzug2);
                            if(!zznz2.zzf) {
                                zznz.zzf(zznz2, true);
                                zzlu0.zzb.zzn(zzlu0.zzd.zza, this.zzd);
                                zzei.zzv(0L);
                                zzei.zzv(0L);
                            }
                        }
                        if(!zznz1.zzf) {
                            zznz.zzf(zznz1, true);
                        }
                        if(zznz1.zzb.equals(this.zzh) && !zznz1.zzg) {
                            zznz.zze(zznz1, true);
                            this.zzf.zzc(zzlu0, zznz1.zzb);
                            return;
                        }
                    }
                    else {
                        long v1 = this.zzl();
                        if(zzug0.zzd >= v1) {
                            zznz zznz0 = (zznz)this.zze.get(this.zzh);
                            if(zznz0 == null || zznz0.zzd != -1L || zznz0.zzc == zzlu0.zzc) {
                                goto label_10;
                            }
                        }
                    }
                }
                return;
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzj(zzlu zzlu0, int v) {
        synchronized(this) {
            if(this.zzf != null) {
                Iterator iterator0 = this.zze.values().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    zznz zznz0 = (zznz)object0;
                    if(zznz0.zzk(zzlu0)) {
                        iterator0.remove();
                        if(zznz0.zzf) {
                            boolean z = zznz0.zzb.equals(this.zzh);
                            boolean z1 = v == 0 && z && zznz0.zzg;
                            if(z) {
                                this.zzo(zznz0);
                            }
                            this.zzf.zzd(zzlu0, zznz0.zzb, z1);
                        }
                    }
                }
                this.zzp(zzlu0);
                return;
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzoe
    public final void zzk(zzlu zzlu0) {
        synchronized(this) {
            if(this.zzf != null) {
                zzbq zzbq0 = this.zzg;
                this.zzg = zzlu0.zzb;
                Iterator iterator0 = this.zze.values().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    zznz zznz0 = (zznz)object0;
                    if(!zznz0.zzl(zzbq0, this.zzg) || zznz0.zzk(zzlu0)) {
                        iterator0.remove();
                        if(zznz0.zzf) {
                            if(zznz0.zzb.equals(this.zzh)) {
                                this.zzo(zznz0);
                            }
                            this.zzf.zzd(zzlu0, zznz0.zzb, false);
                        }
                    }
                }
                this.zzp(zzlu0);
                return;
            }
        }
        throw null;
    }

    private final long zzl() {
        zznz zznz0 = (zznz)this.zze.get(this.zzh);
        return zznz0 == null || zznz0.zzd == -1L ? this.zzi + 1L : zznz0.zzd;
    }

    private final zznz zzm(int v, @Nullable zzug zzug0) {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        zznz zznz0 = null;
        for(Object object0: this.zze.values()) {
            zznz zznz1 = (zznz)object0;
            zznz1.zzg(v, zzug0);
            if(zznz1.zzj(v, zzug0)) {
                long v2 = zznz1.zzd;
                if(v2 != -1L) {
                    int v3 = Long.compare(v2, v1);
                    if(v3 >= 0) {
                        if(v3 != 0 || zznz0.zze == null || zznz1.zze == null) {
                            continue;
                        }
                        zznz0 = zznz1;
                        continue;
                    }
                }
                zznz0 = zznz1;
                v1 = v2;
            }
        }
        if(zznz0 == null) {
            zznz zznz2 = new zznz(this, "4TFwzKrx7QX31BpS", v, zzug0);
            this.zze.put("4TFwzKrx7QX31BpS", zznz2);
            return zznz2;
        }
        return zznz0;
    }

    private static String zzn() [...] // 潜在的解密器

    private final void zzo(zznz zznz0) {
        if(zznz0.zzd != -1L) {
            this.zzi = zznz0.zzd;
        }
        this.zzh = null;
    }

    @m({"listener"})
    private final void zzp(zzlu zzlu0) {
        if(zzlu0.zzb.zzo()) {
            String s = this.zzh;
            if(s != null) {
                zznz zznz0 = (zznz)this.zze.get(s);
                zznz0.getClass();
                this.zzo(zznz0);
            }
        }
        else {
            zznz zznz1 = (zznz)this.zze.get(this.zzh);
            this.zzh = this.zzm(zzlu0.zzc, zzlu0.zzd).zzb;
            this.zzi(zzlu0);
            if(zzlu0.zzd != null && zzlu0.zzd.zzb() && (zznz1 == null || zznz1.zzd != zzlu0.zzd.zzd || zznz1.zze == null || zznz1.zze.zzb != zzlu0.zzd.zzb || zznz1.zze.zzc != zzlu0.zzd.zzc)) {
                zzug zzug0 = new zzug(zzlu0.zzd.zza, zzlu0.zzd.zzd);
                zznz.zzd(this.zzm(zzlu0.zzc, zzug0));
            }
        }
    }
}

