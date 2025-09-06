package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzamk {
    public int zza;
    public int zzb;
    public byte[] zzc;
    private static final byte[] zzd;
    private boolean zze;

    static {
        zzamk.zzd = new byte[]{0, 0, 1};
    }

    public zzamk(int v) {
        this.zzc = new byte[0x80];
    }

    public final void zza(byte[] arr_b, int v, int v1) {
        if(!this.zze) {
            return;
        }
        int v2 = v1 - v;
        byte[] arr_b1 = this.zzc;
        int v3 = this.zza + v2;
        if(arr_b1.length < v3) {
            this.zzc = Arrays.copyOf(arr_b1, v3 + v3);
        }
        System.arraycopy(arr_b, v, this.zzc, this.zza, v2);
        this.zza += v2;
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzc(int v, int v1) {
        if(this.zze) {
            int v2 = this.zza - v1;
            this.zza = v2;
            if(this.zzb == 0 && v == 0xB5) {
                this.zzb = v2;
                this.zza(zzamk.zzd, 0, 3);
                return false;
            }
            this.zze = false;
            return true;
        }
        else if(v == 0xB3) {
            this.zze = true;
        }
        this.zza(zzamk.zzd, 0, 3);
        return false;
    }
}

