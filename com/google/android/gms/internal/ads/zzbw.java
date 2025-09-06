package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public class zzbw {
    public final boolean zzA;
    public final zzfxq zzB;
    public final zzfxs zzC;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final zzfxn zzl;
    public final zzfxn zzm;
    public final int zzn;
    public final zzfxn zzo;
    public final int zzp;
    public final int zzq;
    public final int zzr;
    public final zzfxn zzs;
    public final zzbu zzt;
    public final zzfxn zzu;
    public final int zzv;
    public final int zzw;
    public final boolean zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        new zzbw(new zzbv());
    }

    protected zzbw(zzbv zzbv0) {
        this.zza = 0x7FFFFFFF;
        this.zzb = 0x7FFFFFFF;
        this.zzc = 0x7FFFFFFF;
        this.zzd = 0x7FFFFFFF;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = zzbv0.zze;
        this.zzj = zzbv0.zzf;
        this.zzk = zzbv0.zzg;
        this.zzl = zzbv0.zzh;
        this.zzm = zzbv0.zzi;
        this.zzn = 0;
        this.zzo = zzbv0.zzj;
        this.zzp = 0;
        this.zzq = 0x7FFFFFFF;
        this.zzr = 0x7FFFFFFF;
        this.zzs = zzbv0.zzm;
        this.zzt = zzbv0.zzn;
        this.zzu = zzbv0.zzo;
        this.zzv = zzbv0.zzp;
        this.zzw = 0;
        this.zzx = false;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        this.zzB = zzfxq.zzc(zzbv0.zzq);
        this.zzC = zzfxs.zzl(zzbv0.zzr);
    }

    // 去混淆评级： 中等(90)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zzk == ((zzbw)object0).zzk && this.zzi == ((zzbw)object0).zzi && this.zzj == ((zzbw)object0).zzj && this.zzl.equals(((zzbw)object0).zzl) && this.zzm.equals(((zzbw)object0).zzm) && this.zzo.equals(((zzbw)object0).zzo) && this.zzs.equals(((zzbw)object0).zzs) && this.zzt.equals(((zzbw)object0).zzt) && this.zzu.equals(((zzbw)object0).zzu) && this.zzv == ((zzbw)object0).zzv && this.zzB.equals(((zzbw)object0).zzB) && this.zzC.equals(((zzbw)object0).zzC);
    }

    @Override
    public int hashCode() {
        return (((((((((((((this.zzk - 1048002209) * 0x1F + this.zzi) * 0x1F + this.zzj) * 0x1F + this.zzl.hashCode()) * 0x1F + this.zzm.hashCode()) * 961 + this.zzo.hashCode()) * 961 + 0x7FFFFFFF) * 0x1F + 0x7FFFFFFF) * 0x1F + this.zzs.hashCode()) * 0x1F + 0x745F) * 0x1F + this.zzu.hashCode()) * 0x1F + this.zzv) * 887503681 + this.zzB.hashCode()) * 0x1F + this.zzC.hashCode();
    }
}

