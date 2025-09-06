package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzbr {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzab[] zzd;
    private int zze;

    static {
    }

    public zzbr(String s, zzab[] arr_zzab) {
        zzcw.zzd(arr_zzab.length > 0);
        this.zzb = s;
        this.zzd = arr_zzab;
        this.zza = arr_zzab.length;
        int v1 = zzbb.zzb(arr_zzab[0].zzo);
        if(v1 == -1) {
            v1 = zzbb.zzb(arr_zzab[0].zzn);
        }
        this.zzc = v1;
        String s1 = zzbr.zzc(arr_zzab[0].zzd);
        int v2 = arr_zzab[0].zzf | 0x4000;
        for(int v = 1; true; ++v) {
            zzab[] arr_zzab1 = this.zzd;
            if(v >= arr_zzab1.length) {
                break;
            }
            if(!s1.equals(zzbr.zzc(arr_zzab1[v].zzd))) {
                zzbr.zzd("languages", this.zzd[0].zzd, this.zzd[v].zzd, v);
                return;
            }
            zzab[] arr_zzab2 = this.zzd;
            if(v2 != (arr_zzab2[v].zzf | 0x4000)) {
                zzbr.zzd("role flags", Integer.toBinaryString(arr_zzab2[0].zzf), Integer.toBinaryString(this.zzd[v].zzf), v);
                return;
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
            return zzbr.class == class0 && this.zzb.equals(((zzbr)object0).zzb) && Arrays.equals(this.zzd, ((zzbr)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zze;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzd);
            v = (this.zzb.hashCode() + 0x20F) * 0x1F + v1;
            this.zze = v;
        }
        return v;
    }

    public final int zza(zzab zzab0) {
        for(int v = 0; true; ++v) {
            zzab[] arr_zzab = this.zzd;
            if(v >= arr_zzab.length) {
                break;
            }
            if(zzab0 == arr_zzab[v]) {
                return v;
            }
        }
        return -1;
    }

    public final zzab zzb(int v) {
        return this.zzd[v];
    }

    private static String zzc(@Nullable String s) {
        return s == null || s.equals("und") ? "" : s;
    }

    private static void zzd(String s, @Nullable String s1, @Nullable String s2, int v) {
        zzdo.zzd("TrackGroup", "", new IllegalStateException("Different " + s + " combined in one TrackGroup: \'" + s1 + "\' (track 0) and \'" + s2 + "\' (track " + v + ")"));
    }
}

