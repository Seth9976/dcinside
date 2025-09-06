package com.google.android.gms.internal.ads;

import android.os.IBinder;

final class zzfrt extends zzfsx {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zza(String s) {
        this.zzf = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zzb(String s) {
        this.zzb = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zzc(int v) {
        this.zzg = (byte)(this.zzg | 4);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zzd(int v) {
        this.zzc = v;
        this.zzg = (byte)(this.zzg | 1);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zze(float f) {
        this.zzd = f;
        this.zzg = (byte)(this.zzg | 2);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zzf(int v) {
        this.zzg = (byte)(this.zzg | 8);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zzg(IBinder iBinder0) {
        if(iBinder0 == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.zza = iBinder0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsx zzh(int v) {
        this.zze = v;
        this.zzg = (byte)(this.zzg | 16);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final zzfsy zzi() {
        if(this.zzg == 0x1F) {
            IBinder iBinder0 = this.zza;
            if(iBinder0 != null) {
                return new zzfrv(iBinder0, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.zza == null) {
            stringBuilder0.append(" windowToken");
        }
        if((this.zzg & 1) == 0) {
            stringBuilder0.append(" layoutGravity");
        }
        if((this.zzg & 2) == 0) {
            stringBuilder0.append(" layoutVerticalMargin");
        }
        if((this.zzg & 4) == 0) {
            stringBuilder0.append(" displayMode");
        }
        if((this.zzg & 8) == 0) {
            stringBuilder0.append(" triggerMode");
        }
        if((this.zzg & 16) == 0) {
            stringBuilder0.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}

