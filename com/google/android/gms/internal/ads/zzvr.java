package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class zzvr {
    private final zzdy zza;
    private zzvq zzb;
    private zzvq zzc;
    private zzvq zzd;
    private long zze;
    private final zzyk zzf;

    public zzvr(zzyk zzyk0) {
        this.zzf = zzyk0;
        this.zza = new zzdy(0x20);
        zzvq zzvq0 = new zzvq(0L, 0x10000);
        this.zzb = zzvq0;
        this.zzc = zzvq0;
        this.zzd = zzvq0;
    }

    public final int zza(zzl zzl0, int v, boolean z) throws IOException {
        int v1 = this.zzi(v);
        int v2 = zzl0.zza(this.zzd.zzc.zza, this.zzd.zza(this.zze), v1);
        if(v2 == -1) {
            if(!z) {
                throw new EOFException();
            }
            return -1;
        }
        this.zzn(v2);
        return v2;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long v) {
        zzvq zzvq0;
        if(v != -1L) {
            while(true) {
                zzvq0 = this.zzb;
                if(v < zzvq0.zzb) {
                    break;
                }
                this.zzf.zzc(zzvq0.zzc);
                this.zzb = this.zzb.zzb();
            }
            if(this.zzc.zza < zzvq0.zza) {
                this.zzc = zzvq0;
            }
        }
    }

    public final void zzd(zzhh zzhh0, zzvt zzvt0) {
        zzvr.zzm(this.zzc, zzhh0, zzvt0, this.zza);
    }

    public final void zze(zzhh zzhh0, zzvt zzvt0) {
        this.zzc = zzvr.zzm(this.zzc, zzhh0, zzvt0, this.zza);
    }

    public final void zzf() {
        zzvq zzvq0 = this.zzb;
        if(zzvq0.zzc != null) {
            this.zzf.zzd(zzvq0);
            zzvq0.zzb();
        }
        this.zzb.zze(0L, 0x10000);
        this.zzc = this.zzb;
        this.zzd = this.zzb;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdy0, int v) {
        while(v > 0) {
            int v1 = this.zzi(v);
            zzdy0.zzH(this.zzd.zzc.zza, this.zzd.zza(this.zze), v1);
            v -= v1;
            this.zzn(v1);
        }
    }

    private final int zzi(int v) {
        zzvq zzvq0 = this.zzd;
        if(zzvq0.zzc == null) {
            zzyd zzyd0 = this.zzf.zzb();
            zzvq zzvq1 = new zzvq(this.zzd.zzb, 0x10000);
            zzvq0.zzc = zzyd0;
            zzvq0.zzd = zzvq1;
        }
        return Math.min(v, ((int)(this.zzd.zzb - this.zze)));
    }

    private static zzvq zzj(zzvq zzvq0, long v) {
        while(v >= zzvq0.zzb) {
            zzvq0 = zzvq0.zzd;
        }
        return zzvq0;
    }

    private static zzvq zzk(zzvq zzvq0, long v, ByteBuffer byteBuffer0, int v1) {
        zzvq zzvq1 = zzvr.zzj(zzvq0, v);
        while(v1 > 0) {
            int v2 = Math.min(v1, ((int)(zzvq1.zzb - v)));
            byteBuffer0.put(zzvq1.zzc.zza, zzvq1.zza(v), v2);
            v1 -= v2;
            v += (long)v2;
            if(v == zzvq1.zzb) {
                zzvq1 = zzvq1.zzd;
            }
        }
        return zzvq1;
    }

    private static zzvq zzl(zzvq zzvq0, long v, byte[] arr_b, int v1) {
        zzvq zzvq1 = zzvr.zzj(zzvq0, v);
        int v2 = v1;
        while(v2 > 0) {
            int v3 = Math.min(v2, ((int)(zzvq1.zzb - v)));
            System.arraycopy(zzvq1.zzc.zza, zzvq1.zza(v), arr_b, v1 - v2, v3);
            v2 -= v3;
            v += (long)v3;
            if(v == zzvq1.zzb) {
                zzvq1 = zzvq1.zzd;
            }
        }
        return zzvq1;
    }

    private static zzvq zzm(zzvq zzvq0, zzhh zzhh0, zzvt zzvt0, zzdy zzdy0) {
        int v5;
        zzvq zzvq2;
        if(zzhh0.zzl()) {
            long v = zzvt0.zzb;
            zzdy0.zzI(1);
            zzvq zzvq1 = zzvr.zzl(zzvq0, v, zzdy0.zzN(), 1);
            byte[] arr_b = zzdy0.zzN();
            int v2 = arr_b[0] & 0x80;
            int v3 = arr_b[0] & 0x7F;
            zzhe zzhe0 = zzhh0.zzb;
            byte[] arr_b1 = zzhe0.zza;
            if(arr_b1 == null) {
                zzhe0.zza = new byte[16];
            }
            else {
                Arrays.fill(arr_b1, 0);
            }
            zzvq2 = zzvr.zzl(zzvq1, v + 1L, zzhe0.zza, v3);
            long v4 = v + 1L + ((long)v3);
            if(v2 == 0) {
                v5 = 1;
            }
            else {
                zzdy0.zzI(2);
                zzvq2 = zzvr.zzl(zzvq2, v4, zzdy0.zzN(), 2);
                v4 += 2L;
                v5 = zzdy0.zzq();
            }
            int[] arr_v = zzhe0.zzd != null && zzhe0.zzd.length >= v5 ? zzhe0.zzd : new int[v5];
            int[] arr_v1 = zzhe0.zze != null && zzhe0.zze.length >= v5 ? zzhe0.zze : new int[v5];
            if(v2 == 0) {
                arr_v[0] = 0;
                arr_v1[0] = zzvt0.zza - ((int)(v4 - zzvt0.zzb));
            }
            else {
                zzdy0.zzI(v5 * 6);
                zzvq2 = zzvr.zzl(zzvq2, v4, zzdy0.zzN(), v5 * 6);
                v4 += (long)(v5 * 6);
                zzdy0.zzL(0);
                for(int v1 = 0; v1 < v5; ++v1) {
                    arr_v[v1] = zzdy0.zzq();
                    arr_v1[v1] = zzdy0.zzp();
                }
            }
            zzhe0.zzc(v5, arr_v, arr_v1, zzvt0.zzc.zzb, zzhe0.zza, zzvt0.zzc.zza, zzvt0.zzc.zzc, zzvt0.zzc.zzd);
            int v6 = (int)(v4 - zzvt0.zzb);
            zzvt0.zzb += (long)v6;
            zzvt0.zza -= v6;
        }
        else {
            zzvq2 = zzvq0;
        }
        if(zzhh0.zze()) {
            zzdy0.zzI(4);
            zzvq zzvq3 = zzvr.zzl(zzvq2, zzvt0.zzb, zzdy0.zzN(), 4);
            int v7 = zzdy0.zzp();
            zzvt0.zzb += 4L;
            zzvt0.zza -= 4;
            zzhh0.zzj(v7);
            zzvq zzvq4 = zzvr.zzk(zzvq3, zzvt0.zzb, zzhh0.zzc, v7);
            zzvt0.zzb += (long)v7;
            int v8 = zzvt0.zza - v7;
            zzvt0.zza = v8;
            if(zzhh0.zzf != null && zzhh0.zzf.capacity() >= v8) {
                zzhh0.zzf.clear();
                return zzvr.zzk(zzvq4, zzvt0.zzb, zzhh0.zzf, zzvt0.zza);
            }
            zzhh0.zzf = ByteBuffer.allocate(v8);
            return zzvr.zzk(zzvq4, zzvt0.zzb, zzhh0.zzf, zzvt0.zza);
        }
        zzhh0.zzj(zzvt0.zza);
        return zzvr.zzk(zzvq2, zzvt0.zzb, zzhh0.zzc, zzvt0.zza);
    }

    private final void zzn(int v) {
        long v1 = this.zze + ((long)v);
        this.zze = v1;
        zzvq zzvq0 = this.zzd;
        if(v1 == zzvq0.zzb) {
            this.zzd = zzvq0.zzd;
        }
    }
}

