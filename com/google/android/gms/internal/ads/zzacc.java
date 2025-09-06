package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class zzacc implements zzaco {
    private final byte[] zza;
    private final zzl zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze;
    private int zzf;
    private int zzg;

    static {
        zzas.zzb("media3.extractor");
    }

    public zzacc(zzl zzl0, long v, long v1) {
        this.zzb = zzl0;
        this.zzd = v;
        this.zzc = v1;
        this.zze = new byte[0x10000];
        this.zza = new byte[0x1000];
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.zzp(arr_b, v, v1);
        if(v2 == 0) {
            v2 = this.zzq(arr_b, v, v1, 0, true);
        }
        this.zzs(v2);
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final int zzb(byte[] arr_b, int v, int v1) throws IOException {
        int v4;
        this.zzt(v1);
        int v2 = this.zzf;
        int v3 = this.zzg - v2;
        if(v3 == 0) {
            v4 = this.zzq(this.zze, v2, v1, 0, true);
            if(v4 == -1) {
                return -1;
            }
            this.zzg += v4;
        }
        else {
            v4 = Math.min(v1, v3);
        }
        System.arraycopy(this.zze, this.zzf, arr_b, v, v4);
        this.zzf += v4;
        return v4;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final int zzc(int v) throws IOException {
        int v1 = this.zzr(1);
        if(v1 == 0) {
            v1 = this.zzq(this.zza, 0, 1, 0, true);
        }
        this.zzs(v1);
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final long zzd() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final long zze() {
        return this.zzd + ((long)this.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final long zzf() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final void zzg(int v) throws IOException {
        this.zzl(v, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final void zzh(byte[] arr_b, int v, int v1) throws IOException {
        this.zzm(arr_b, v, v1, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final void zzi(byte[] arr_b, int v, int v1) throws IOException {
        this.zzn(arr_b, v, v1, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final void zzj() {
        this.zzf = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final void zzk(int v) throws IOException {
        this.zzo(v, false);
    }

    public final boolean zzl(int v, boolean z) throws IOException {
        this.zzt(v);
        int v1 = this.zzg - this.zzf;
        while(v1 < v) {
            v1 = this.zzq(this.zze, this.zzf, v, v1, z);
            if(v1 == -1) {
                return false;
            }
            this.zzg = this.zzf + v1;
        }
        this.zzf += v;
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final boolean zzm(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        if(!this.zzl(v1, z)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - v1, arr_b, v, v1);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzaco
    public final boolean zzn(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        int v2;
        for(v2 = this.zzp(arr_b, v, v1); v2 < v1 && v2 != -1; v2 = this.zzq(arr_b, v, v1, v2, z)) {
        }
        this.zzs(v2);
        return v2 != -1;
    }

    public final boolean zzo(int v, boolean z) throws IOException {
        int v1;
        for(v1 = this.zzr(v); v1 < v && v1 != -1; v1 = this.zzq(this.zza, -v1, Math.min(v, v1 + 0x1000), v1, false)) {
        }
        this.zzs(v1);
        return v1 != -1;
    }

    private final int zzp(byte[] arr_b, int v, int v1) {
        int v2 = this.zzg;
        if(v2 == 0) {
            return 0;
        }
        int v3 = Math.min(v2, v1);
        System.arraycopy(this.zze, 0, arr_b, v, v3);
        this.zzu(v3);
        return v3;
    }

    private final int zzq(byte[] arr_b, int v, int v1, int v2, boolean z) throws IOException {
        if(Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int v3 = this.zzb.zza(arr_b, v + v2, v1 - v2);
        if(v3 == -1) {
            if(v2 != 0 || !z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2 + v3;
    }

    private final int zzr(int v) {
        int v1 = Math.min(this.zzg, v);
        this.zzu(v1);
        return v1;
    }

    private final void zzs(int v) {
        if(v != -1) {
            this.zzd += (long)v;
        }
    }

    private final void zzt(int v) {
        int v1 = this.zzf + v;
        int v2 = this.zze.length;
        if(v1 > v2) {
            this.zze = Arrays.copyOf(this.zze, Math.max(v1 + 0x10000, Math.min(v2 + v2, v1 + 0x80000)));
        }
    }

    private final void zzu(int v) {
        int v1 = this.zzg - v;
        this.zzg = v1;
        this.zzf = 0;
        byte[] arr_b = this.zze;
        byte[] arr_b1 = v1 >= arr_b.length - 0x80000 ? arr_b : new byte[v1 + 0x10000];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        this.zze = arr_b1;
    }
}

