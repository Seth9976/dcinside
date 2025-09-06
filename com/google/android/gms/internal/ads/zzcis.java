package com.google.android.gms.internal.ads;

public final class zzcis {
    private zzcha zza;
    private zzcjn zzb;
    private zzfgr zzc;
    private zzcka zzd;
    private zzfdl zze;

    private zzcis() {
        throw null;
    }

    zzcis(zzcjm zzcjm0) {
    }

    public final zzcgx zza() {
        zzhez.zzc(this.zza, zzcha.class);
        zzhez.zzc(this.zzb, zzcjn.class);
        if(this.zzc == null) {
            this.zzc = new zzfgr();
        }
        if(this.zzd == null) {
            this.zzd = new zzcka();
        }
        if(this.zze == null) {
            this.zze = new zzfdl();
        }
        return new zzcih(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcis zzb(zzcha zzcha0) {
        this.zza = zzcha0;
        return this;
    }

    public final zzcis zzc(zzcjn zzcjn0) {
        this.zzb = zzcjn0;
        return this;
    }
}

