package com.google.android.gms.internal.ads;

final class zzfnm extends zzfnj {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zza(String s) {
        if(s == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zzb(boolean z) {
        this.zzf = (byte)(this.zzf | 16);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zzc(boolean z) {
        this.zzf = (byte)(this.zzf | 4);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zzd(boolean z) {
        this.zzc = true;
        this.zzf = (byte)(this.zzf | 2);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zze(long v) {
        this.zze = 300L;
        this.zzf = (byte)(this.zzf | 0x20);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zzf(long v) {
        this.zzd = 100L;
        this.zzf = (byte)(this.zzf | 8);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnj zzg(boolean z) {
        this.zzb = z;
        this.zzf = (byte)(this.zzf | 1);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnj
    public final zzfnk zzh() {
        if(this.zzf == 0x3F) {
            String s = this.zza;
            if(s != null) {
                return new zzfno(s, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.zza == null) {
            stringBuilder0.append(" clientVersion");
        }
        if((this.zzf & 1) == 0) {
            stringBuilder0.append(" shouldGetAdvertisingId");
        }
        if((this.zzf & 2) == 0) {
            stringBuilder0.append(" isGooglePlayServicesAvailable");
        }
        if((this.zzf & 4) == 0) {
            stringBuilder0.append(" enableQuerySignalsTimeout");
        }
        if((this.zzf & 8) == 0) {
            stringBuilder0.append(" querySignalsTimeoutMs");
        }
        if((this.zzf & 16) == 0) {
            stringBuilder0.append(" enableQuerySignalsCache");
        }
        if((this.zzf & 0x20) == 0) {
            stringBuilder0.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}

