package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzgwh extends OutputStream {
    private static final byte[] zza;
    private final int zzb;
    private final ArrayList zzc;
    private int zzd;
    private byte[] zze;
    private int zzf;

    static {
        zzgwh.zza = new byte[0];
    }

    zzgwh(int v) {
        this.zzb = 0x80;
        this.zzc = new ArrayList();
        this.zze = new byte[0x80];
    }

    @Override
    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.zza());
    }

    @Override
    public final void write(int v) {
        synchronized(this) {
            if(this.zzf == this.zze.length) {
                this.zzc(1);
            }
            int v2 = this.zzf;
            this.zzf = v2 + 1;
            this.zze[v2] = (byte)v;
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            byte[] arr_b1 = this.zze;
            int v3 = this.zzf;
            int v4 = arr_b1.length - v3;
            if(v1 <= v4) {
                System.arraycopy(arr_b, v, arr_b1, v3, v1);
                this.zzf += v1;
                return;
            }
            System.arraycopy(arr_b, v, arr_b1, v3, v4);
            int v5 = v1 - v4;
            this.zzc(v5);
            System.arraycopy(arr_b, v + v4, this.zze, 0, v5);
            this.zzf = v5;
        }
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.zzd + this.zzf;
    }

    public final zzgwj zzb() {
        synchronized(this) {
            int v1 = this.zzf;
            byte[] arr_b = this.zze;
            if(v1 >= arr_b.length) {
                zzgwg zzgwg1 = new zzgwg(this.zze);
                this.zzc.add(zzgwg1);
                this.zze = zzgwh.zza;
            }
            else if(v1 > 0) {
                zzgwg zzgwg0 = new zzgwg(Arrays.copyOf(arr_b, v1));
                this.zzc.add(zzgwg0);
            }
            this.zzd += this.zzf;
            this.zzf = 0;
            return zzgwj.zzu(this.zzc);
        }
    }

    private final void zzc(int v) {
        zzgwg zzgwg0 = new zzgwg(this.zze);
        this.zzc.add(zzgwg0);
        int v1 = this.zzd + this.zze.length;
        this.zzd = v1;
        this.zze = new byte[Math.max(this.zzb, Math.max(v, v1 >>> 1))];
        this.zzf = 0;
    }
}

