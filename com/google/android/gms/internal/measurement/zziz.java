package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

final class zziz extends zziw {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private zziz(byte[] arr_b, int v, int v1, boolean z) {
        super(null);
        this.zzj = 0x7FFFFFFF;
        this.zzd = arr_b;
        this.zze = v1 + v;
        this.zzg = v;
        this.zzh = v;
    }

    zziz(byte[] arr_b, int v, int v1, boolean z, zziy zziy0) {
        this(arr_b, 0, v1, false);
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final double zza() throws IOException {
        return Double.longBitsToDouble(this.zzy());
    }

    private final void zzaa() {
        int v = this.zze + this.zzf;
        this.zze = v;
        int v1 = v - this.zzh;
        int v2 = this.zzj;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.zzf = v3;
            this.zze = v - v3;
            return;
        }
        this.zzf = 0;
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(this.zzw());
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzb(int v) throws zzkb {
        if(v < 0) {
            throw zzkb.zzf();
        }
        int v1 = v + this.zzc();
        if(v1 < 0) {
            throw zzkb.zzg();
        }
        int v2 = this.zzj;
        if(v1 > v2) {
            throw zzkb.zzi();
        }
        this.zzj = v1;
        this.zzaa();
        return v2;
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final void zzc(int v) throws zzkb {
        if(this.zzi != v) {
            throw zzkb.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzd() throws IOException {
        return this.zzx();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final void zzd(int v) {
        this.zzj = v;
        this.zzaa();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zze() throws IOException {
        return this.zzw();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final boolean zze(int v) throws IOException {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.zze - this.zzg >= 10) {
                    while(v1 < 10) {
                        int v4 = this.zzg;
                        this.zzg = v4 + 1;
                        if(this.zzd[v4] >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw zzkb.zze();
                }
                else {
                    while(true) {
                        if(v1 >= 10) {
                            throw zzkb.zze();
                        }
                        if(this.zzv() >= 0) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
            case 1: {
                this.zzf(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            do {
                                int v2 = this.zzi();
                                if(v2 == 0) {
                                    break;
                                }
                                int v3 = this.zza;
                                if(v3 >= this.zzb) {
                                    throw zzkb.zzh();
                                }
                                this.zza = v3 + 1;
                                boolean z = this.zze(v2);
                                --this.zza;
                            }
                            while(z);
                            this.zzc(v >>> 3 << 3 | 4);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzkb.zza();
                            }
                            this.zzf(4);
                            return true;
                        }
                    }
                }
                this.zzf(this.zzx());
                return true;
            }
        }
    }

    private final void zzf(int v) throws IOException {
        if(v >= 0) {
            int v1 = this.zzg;
            if(v <= this.zze - v1) {
                this.zzg = v1 + v;
                return;
            }
        }
        throw v >= 0 ? zzkb.zzi() : zzkb.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzf() throws IOException {
        return this.zzx();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzg() throws IOException {
        return this.zzw();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzh() throws IOException {
        return zziw.zza(this.zzx());
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzi() throws IOException {
        if(this.zzt()) {
            this.zzi = 0;
            return 0;
        }
        int v = this.zzx();
        this.zzi = v;
        if(v >>> 3 == 0) {
            throw zzkb.zzc();
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final int zzj() throws IOException {
        return this.zzx();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final long zzk() throws IOException {
        return this.zzy();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final long zzl() throws IOException {
        return this.zzz();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    final long zzm() throws IOException {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zzv();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzkb.zze();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final long zzn() throws IOException {
        return this.zzy();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final long zzo() throws IOException {
        return zziw.zza(this.zzz());
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final long zzp() throws IOException {
        return this.zzz();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final zzik zzq() throws IOException {
        int v = this.zzx();
        if(v > 0) {
            int v1 = this.zzg;
            if(v <= this.zze - v1) {
                zzik zzik0 = zzik.zza(this.zzd, v1, v);
                this.zzg += v;
                return zzik0;
            }
        }
        if(v == 0) {
            return zzik.zza;
        }
        if(v > 0) {
            int v2 = this.zzg;
            if(v <= this.zze - v2) {
                int v3 = v + v2;
                this.zzg = v3;
                return zzik.zzb(Arrays.copyOfRange(this.zzd, v2, v3));
            }
        }
        throw v > 0 ? zzkb.zzi() : zzkb.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final String zzr() throws IOException {
        int v = this.zzx();
        if(v > 0) {
            int v1 = this.zzg;
            if(v <= this.zze - v1) {
                String s = new String(this.zzd, v1, v, zzjv.zza);
                this.zzg += v;
                return s;
            }
        }
        if(v != 0) {
            throw v >= 0 ? zzkb.zzi() : zzkb.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final String zzs() throws IOException {
        int v = this.zzx();
        if(v > 0) {
            int v1 = this.zzg;
            if(v <= this.zze - v1) {
                String s = zzmp.zzb(this.zzd, v1, v);
                this.zzg += v;
                return s;
            }
        }
        if(v != 0) {
            throw v > 0 ? zzkb.zzi() : zzkb.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final boolean zzt() throws IOException {
        return this.zzg == this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.zziw
    public final boolean zzu() throws IOException {
        return this.zzz() != 0L;
    }

    private final byte zzv() throws IOException {
        int v = this.zzg;
        if(v == this.zze) {
            throw zzkb.zzi();
        }
        this.zzg = v + 1;
        return this.zzd[v];
    }

    private final int zzw() throws IOException {
        int v = this.zzg;
        if(this.zze - v < 4) {
            throw zzkb.zzi();
        }
        this.zzg = v + 4;
        return (this.zzd[v + 3] & 0xFF) << 24 | (this.zzd[v] & 0xFF | (this.zzd[v + 1] & 0xFF) << 8 | (this.zzd[v + 2] & 0xFF) << 16);
    }

    private final int zzx() throws IOException {
        int v5;
        int v = this.zzg;
        int v1 = this.zze;
        if(v1 != v) {
            byte[] arr_b = this.zzd;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzg = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.zzg = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.zzg = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.zzg = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.zzg = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzg = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzg = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzg = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzg = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.zzg = v3;
                    return v11;
                }
            }
        }
        return (int)this.zzm();
    }

    private final long zzy() throws IOException {
        int v = this.zzg;
        if(this.zze - v < 8) {
            throw zzkb.zzi();
        }
        this.zzg = v + 8;
        return (((long)this.zzd[v + 7]) & 0xFFL) << 56 | (((long)this.zzd[v]) & 0xFFL | (((long)this.zzd[v + 1]) & 0xFFL) << 8 | (((long)this.zzd[v + 2]) & 0xFFL) << 16 | (((long)this.zzd[v + 3]) & 0xFFL) << 24 | (((long)this.zzd[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzd[v + 5]) & 0xFFL) << 40 | (((long)this.zzd[v + 6]) & 0xFFL) << 0x30);
    }

    private final long zzz() throws IOException {
        long v12;
        long v9;
        long v5;
        int v = this.zzg;
        int v1 = this.zze;
        if(v1 != v) {
            byte[] arr_b = this.zzd;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzg = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.zzg = v3;
                    return v5;
                }
                int v6 = arr_b[v3] << 14 ^ v4;
                if(v6 >= 0) {
                    v5 = (long)(v6 ^ 0x3F80);
                    v3 = v + 3;
                    this.zzg = v3;
                    return v5;
                }
                int v7 = v6 ^ arr_b[v + 3] << 21;
                if(v7 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v7);
                    this.zzg = v3;
                    return v5;
                }
                v3 = v + 5;
                long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                if(v8 >= 0L) {
                    v9 = 0xFE03F80L;
                    v5 = v8 ^ v9;
                    this.zzg = v3;
                    return v5;
                }
                int v10 = v + 6;
                long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                if(v11 < 0L) {
                    v12 = 0xFFFFFFF80FE03F80L;
                    v5 = v11 ^ v12;
                    v3 = v10;
                    this.zzg = v3;
                    return v5;
                }
                v3 = v + 7;
                v8 = v11 ^ ((long)arr_b[v10]) << 42;
                if(v8 >= 0L) {
                    v9 = 0x3F80FE03F80L;
                    v5 = v8 ^ v9;
                    this.zzg = v3;
                    return v5;
                }
                v10 = v + 8;
                v11 = v8 ^ ((long)arr_b[v3]) << 49;
                if(v11 < 0L) {
                    v12 = 0xFFFE03F80FE03F80L;
                    v5 = v11 ^ v12;
                    v3 = v10;
                    this.zzg = v3;
                    return v5;
                }
                v3 = v + 9;
                long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                boolean z = false;
                if(v13 >= 0L) {
                    z = true;
                }
                else if(((long)arr_b[v3]) >= 0L) {
                    z = true;
                    v3 = v + 10;
                }
                if(z) {
                    this.zzg = v3;
                    return v13;
                }
            }
        }
        return this.zzm();
    }
}

