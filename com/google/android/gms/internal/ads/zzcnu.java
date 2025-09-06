package com.google.android.gms.internal.ads;

public final class zzcnu {
    private final zzdrw zza;
    private final zzfca zzb;

    zzcnu(zzdrw zzdrw0, zzfca zzfca0) {
        this.zza = zzdrw0;
        this.zzb = zzfca0;
    }

    public final void zza(long v, int v1) {
        String s;
        zzdrv zzdrv0 = this.zza.zza();
        zzdrv0.zzd(this.zzb.zzb.zzb);
        zzdrv0.zzb("action", "ad_closed");
        zzdrv0.zzb("show_time", String.valueOf(v));
        zzdrv0.zzb("ad_format", "app_open_ad");
        switch(v1 - 1) {
            case 0: {
                s = "h";
                break;
            }
            case 1: {
                s = "bb";
                break;
            }
            case 2: {
                s = "cc";
                break;
            }
            case 3: {
                s = "cb";
                break;
            }
            case 4: {
                s = "ac";
                break;
            }
            default: {
                s = "u";
            }
        }
        zzdrv0.zzb("acr", s);
        zzdrv0.zzg();
    }
}

