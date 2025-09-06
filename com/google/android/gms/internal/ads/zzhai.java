package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

public final class zzhai {
    private static final zzhai zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzhai.zza = new zzhai(0, new int[0], new Object[0], false);
    }

    private zzhai() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhai(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.zze = -1;
        this.zzb = v;
        this.zzc = arr_v;
        this.zzd = arr_object;
        this.zzf = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzhai)) {
            return false;
        }
        int v = this.zzb;
        if(v == ((zzhai)object0).zzb) {
            int[] arr_v = this.zzc;
            int[] arr_v1 = ((zzhai)object0).zzc;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.zzd;
            Object[] arr_object1 = ((zzhai)object0).zzd;
            int v2 = this.zzb;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!arr_object[v3].equals(arr_object1[v3])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb;
        int[] arr_v = this.zzc;
        int v2 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.zzd;
        int v5 = this.zzb;
        for(int v1 = 0; v1 < v5; ++v1) {
            v2 = v2 * 0x1F + arr_object[v1].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v2;
    }

    public final int zza() {
        int v5;
        int v = this.zze;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.zzb; ++v1) {
                int v3 = this.zzc[v1];
                int v4 = v3 >>> 3;
                switch(v3 & 7) {
                    case 0: {
                        v5 = zzgww.zzD(v4 << 3) + zzgww.zzE(((long)(((Long)this.zzd[v1]))));
                        break;
                    }
                    case 1: {
                        ((Long)this.zzd[v1]).longValue();
                        v5 = zzgww.zzD(v4 << 3) + 8;
                        break;
                    }
                    case 2: {
                        int v7 = ((zzgwj)this.zzd[v1]).zzd();
                        v5 = zzgww.zzD(v4 << 3) + (zzgww.zzD(v7) + v7);
                        break;
                    }
                    case 3: {
                        int v6 = zzgww.zzD(v4 << 3);
                        v5 = v6 + v6 + ((zzhai)this.zzd[v1]).zza();
                        break;
                    }
                    case 5: {
                        ((Integer)this.zzd[v1]).intValue();
                        v5 = zzgww.zzD(v4 << 3) + 4;
                        break;
                    }
                    default: {
                        throw new IllegalStateException(new zzgyf("Protocol message tag had invalid wire type."));
                    }
                }
                v2 += v5;
            }
            this.zze = v2;
            return v2;
        }
        return v;
    }

    public final int zzb() {
        int v = this.zze;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.zzb; ++v1) {
                int v3 = zzgww.zzD(this.zzc[v1] >>> 3);
                int v4 = ((zzgwj)this.zzd[v1]).zzd();
                v2 = zzgww.zzD(v4) + v2 + v3 + v4 + 4;
            }
            this.zze = v2;
            return v2;
        }
        return v;
    }

    public static zzhai zzc() {
        return zzhai.zza;
    }

    final zzhai zzd(zzhai zzhai0) {
        if(zzhai0.equals(zzhai.zza)) {
            return this;
        }
        this.zzg();
        int v = this.zzb + zzhai0.zzb;
        this.zzn(v);
        System.arraycopy(zzhai0.zzc, 0, this.zzc, this.zzb, zzhai0.zzb);
        System.arraycopy(zzhai0.zzd, 0, this.zzd, this.zzb, zzhai0.zzb);
        this.zzb = v;
        return this;
    }

    static zzhai zze(zzhai zzhai0, zzhai zzhai1) {
        int v = zzhai0.zzb + zzhai1.zzb;
        int[] arr_v = Arrays.copyOf(zzhai0.zzc, v);
        System.arraycopy(zzhai1.zzc, 0, arr_v, zzhai0.zzb, zzhai1.zzb);
        Object[] arr_object = Arrays.copyOf(zzhai0.zzd, v);
        System.arraycopy(zzhai1.zzd, 0, arr_object, zzhai0.zzb, zzhai1.zzb);
        return new zzhai(v, arr_v, arr_object, true);
    }

    static zzhai zzf() {
        return new zzhai();
    }

    final void zzg() {
        if(!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if(this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzgze.zzb(stringBuilder0, v, String.valueOf(this.zzc[v1] >>> 3), this.zzd[v1]);
        }
    }

    final void zzj(int v, Object object0) {
        this.zzg();
        this.zzn(this.zzb + 1);
        int v1 = this.zzb;
        this.zzc[v1] = v;
        this.zzd[v1] = object0;
        this.zzb = v1 + 1;
    }

    final void zzk(zzhaw zzhaw0) throws IOException {
        for(int v = 0; v < this.zzb; ++v) {
            zzhaw0.zzw(this.zzc[v] >>> 3, this.zzd[v]);
        }
    }

    public final void zzl(zzhaw zzhaw0) throws IOException {
        if(this.zzb != 0) {
            for(int v = 0; v < this.zzb; ++v) {
                int v1 = this.zzc[v];
                Object object0 = this.zzd[v];
                int v2 = v1 & 7;
                int v3 = v1 >>> 3;
                switch(v2) {
                    case 0: {
                        zzhaw0.zzt(v3, ((long)(((Long)object0))));
                        break;
                    }
                    case 1: {
                        zzhaw0.zzm(v3, ((long)(((Long)object0))));
                        break;
                    }
                    case 2: {
                        zzhaw0.zzd(v3, ((zzgwj)object0));
                        break;
                    }
                    case 3: {
                        zzhaw0.zzF(v3);
                        ((zzhai)object0).zzl(zzhaw0);
                        zzhaw0.zzh(v3);
                        break;
                    }
                    default: {
                        if(v2 != 5) {
                            throw new RuntimeException(new zzgyf("Protocol message tag had invalid wire type."));
                        }
                        zzhaw0.zzk(v3, ((int)(((Integer)object0))));
                        break;
                    }
                }
            }
        }
    }

    final boolean zzm(int v, zzgwp zzgwp0) throws IOException {
        this.zzg();
        switch(v & 7) {
            case 0: {
                this.zzj(v, zzgwp0.zzo());
                return true;
            }
            case 1: {
                this.zzj(v, zzgwp0.zzn());
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            zzhai zzhai0 = new zzhai();
                            do {
                                int v1 = zzgwp0.zzl();
                            }
                            while(v1 != 0 && zzhai0.zzm(v1, zzgwp0));
                            zzgwp0.zzy(4 | v >>> 3 << 3);
                            this.zzj(v, zzhai0);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw new zzgyf("Protocol message tag had invalid wire type.");
                            }
                            this.zzj(v, zzgwp0.zzf());
                            return true;
                        }
                    }
                }
                this.zzj(v, zzgwp0.zzv());
                return true;
            }
        }
    }

    private final void zzn(int v) {
        int[] arr_v = this.zzc;
        if(v > arr_v.length) {
            int v1 = this.zzb + this.zzb / 2;
            if(v1 >= v) {
                v = v1;
            }
            if(v < 8) {
                v = 8;
            }
            this.zzc = Arrays.copyOf(arr_v, v);
            this.zzd = Arrays.copyOf(this.zzd, v);
        }
    }
}

