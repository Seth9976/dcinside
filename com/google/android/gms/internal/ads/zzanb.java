package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzanb {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzanb(int v, int v1) {
        this.zzc = v;
        byte[] arr_b = new byte[0x83];
        this.zza = arr_b;
        arr_b[2] = 1;
    }

    public final void zza(byte[] arr_b, int v, int v1) {
        if(!this.zzd) {
            return;
        }
        int v2 = v1 - v;
        byte[] arr_b1 = this.zza;
        int v3 = this.zzb + v2;
        if(arr_b1.length < v3) {
            this.zza = Arrays.copyOf(arr_b1, v3 + v3);
        }
        System.arraycopy(arr_b, v, this.zza, this.zzb, v2);
        this.zzb += v2;
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int v) {
        boolean z = true;
        zzcw.zzf(!this.zzd);
        if(v != this.zzc) {
            z = false;
        }
        this.zzd = z;
        if(z) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int v) {
        if(!this.zzd) {
            return false;
        }
        this.zzb -= v;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final boolean zze() {
        return this.zze;
    }
}

