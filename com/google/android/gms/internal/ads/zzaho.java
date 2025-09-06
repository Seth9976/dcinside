package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzaho {
    private static final long[] zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    static {
        zzaho.zza = new long[]{0x80L, 0x40L, 0x20L, 16L, 8L, 4L, 2L, 1L};
    }

    public zzaho() {
        this.zzb = new byte[8];
    }

    public final int zza() {
        return this.zzd;
    }

    public static int zzb(int v) {
        int v1 = 0;
        while(v1 < 8) {
            if((zzaho.zza[v1] & ((long)v)) == 0L) {
                ++v1;
                continue;
            }
            return v1 + 1;
        }
        return -1;
    }

    public static long zzc(byte[] arr_b, int v, boolean z) {
        long v1 = ((long)arr_b[0]) & 0xFFL;
        if(z) {
            v1 &= ~zzaho.zza[v - 1];
        }
        for(int v2 = 1; v2 < v; ++v2) {
            v1 = v1 << 8 | ((long)arr_b[v2]) & 0xFFL;
        }
        return v1;
    }

    public final long zzd(zzaco zzaco0, boolean z, boolean z1, int v) throws IOException {
        if(this.zzc == 0) {
            if(!zzaco0.zzn(this.zzb, 0, 1, z)) {
                return -1L;
            }
            int v1 = zzaho.zzb(this.zzb[0] & 0xFF);
            this.zzd = v1;
            if(v1 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int v2 = this.zzd;
        if(v2 > v) {
            this.zzc = 0;
            return -2L;
        }
        if(v2 != 1) {
            zzaco0.zzi(this.zzb, 1, v2 - 1);
        }
        this.zzc = 0;
        return zzaho.zzc(this.zzb, this.zzd, z1);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}

