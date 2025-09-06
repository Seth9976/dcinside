package com.google.android.gms.internal.ads;

public final class zzatp {
    private final byte[] zza;
    private int zzb;
    private int zzc;

    public zzatp(byte[] arr_b) {
        this.zza = new byte[0x100];
        for(int v = 0; v < 0x100; ++v) {
            this.zza[v] = (byte)v;
        }
        int v1 = 0;
        for(int v2 = 0; v2 < 0x100; ++v2) {
            byte b = this.zza[v2];
            v1 = v1 + b + arr_b[v2 % arr_b.length] & 0xFF;
            this.zza[v2] = this.zza[v1];
            this.zza[v1] = b;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] arr_b) {
        int v = this.zzb;
        int v1 = this.zzc;
        for(int v2 = 0; v2 < 0x100; ++v2) {
            v = v + 1 & 0xFF;
            byte b = this.zza[v];
            v1 = v1 + b & 0xFF;
            this.zza[v] = this.zza[v1];
            this.zza[v1] = b;
            arr_b[v2] = (byte)(this.zza[this.zza[v] + b & 0xFF] ^ arr_b[v2]);
        }
        this.zzb = v;
        this.zzc = v1;
    }
}

