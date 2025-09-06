package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzwj {
    public static final zzwj zza;
    public final int zzb;
    private final zzfxn zzc;
    private int zzd;

    static {
        zzwj.zza = new zzwj(new zzbr[0]);
    }

    public zzwj(zzbr[] arr_zzbr) {
        this.zzc = zzfxn.zzm(arr_zzbr);
        this.zzb = arr_zzbr.length;
        for(int v = 0; v < this.zzc.size(); ++v) {
            for(int v1 = v + 1; v1 < this.zzc.size(); ++v1) {
                if(((zzbr)this.zzc.get(v)).equals(this.zzc.get(v1))) {
                    zzdo.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
        }
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzwj.class == class0 && this.zzb == ((zzwj)object0).zzb && this.zzc.equals(((zzwj)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzd;
        if(v == 0) {
            v = this.zzc.hashCode();
            this.zzd = v;
        }
        return v;
    }

    public final int zza(zzbr zzbr0) {
        int v = this.zzc.indexOf(zzbr0);
        return v < 0 ? -1 : v;
    }

    public final zzbr zzb(int v) {
        return (zzbr)this.zzc.get(v);
    }

    public final zzfxn zzc() {
        zzwi zzwi0 = new zzwi();
        return zzfxn.zzl(zzfyd.zzb(this.zzc, zzwi0));
    }
}

