package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

public final class zzmj {
    private static final zzmj zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzmj.zza = new zzmj(0, new int[0], new Object[0], false);
    }

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmj(int v, int[] arr_v, Object[] arr_object, boolean z) {
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
        if(!(object0 instanceof zzmj)) {
            return false;
        }
        int v = this.zzb;
        if(v == ((zzmj)object0).zzb) {
            int[] arr_v = this.zzc;
            int[] arr_v1 = ((zzmj)object0).zzc;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.zzd;
            Object[] arr_object1 = ((zzmj)object0).zzd;
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
        int v1 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.zzd;
        int v5 = this.zzb;
        for(int v2 = 0; v2 < v5; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v1;
    }

    static zzmj zza(zzmj zzmj0, zzmj zzmj1) {
        int v = zzmj0.zzb + zzmj1.zzb;
        int[] arr_v = Arrays.copyOf(zzmj0.zzc, v);
        System.arraycopy(zzmj1.zzc, 0, arr_v, zzmj0.zzb, zzmj1.zzb);
        Object[] arr_object = Arrays.copyOf(zzmj0.zzd, v);
        System.arraycopy(zzmj1.zzd, 0, arr_object, zzmj0.zzb, zzmj1.zzb);
        return new zzmj(v, arr_v, arr_object, true);
    }

    private final void zza(int v) {
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

    private static void zza(int v, Object object0, zznb zznb0) throws IOException {
        switch(v & 7) {
            case 0: {
                zznb0.zzb(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                zznb0.zza(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                zznb0.zza(v >>> 3, ((zzik)object0));
                return;
            }
            case 3: {
                if(zznb0.zza() == 1) {
                    zznb0.zzb(v >>> 3);
                    ((zzmj)object0).zzb(zznb0);
                    zznb0.zza(v >>> 3);
                    return;
                }
                zznb0.zza(v >>> 3);
                ((zzmj)object0).zzb(zznb0);
                zznb0.zzb(v >>> 3);
                return;
            }
            case 5: {
                zznb0.zzb(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(zzkb.zza());
            }
        }
    }

    public final int zza() {
        int v5;
        int v = this.zze;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            int v3 = this.zzc[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v5 = zzjc.zzg(v4, ((long)(((Long)this.zzd[v1]))));
                    break;
                }
                case 1: {
                    v5 = zzjc.zzc(v4, ((long)(((Long)this.zzd[v1]))));
                    break;
                }
                case 2: {
                    v5 = zzjc.zzc(v4, ((zzik)this.zzd[v1]));
                    break;
                }
                case 3: {
                    v5 = (zzjc.zzi(v4) << 1) + ((zzmj)this.zzd[v1]).zza();
                    break;
                }
                case 5: {
                    v5 = zzjc.zzf(v4, ((int)(((Integer)this.zzd[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(zzkb.zza());
                }
            }
            v2 += v5;
        }
        this.zze = v2;
        return v2;
    }

    final zzmj zza(zzmj zzmj0) {
        if(zzmj0.equals(zzmj.zza)) {
            return this;
        }
        this.zzf();
        int v = this.zzb + zzmj0.zzb;
        this.zza(v);
        System.arraycopy(zzmj0.zzc, 0, this.zzc, this.zzb, zzmj0.zzb);
        System.arraycopy(zzmj0.zzd, 0, this.zzd, this.zzb, zzmj0.zzb);
        this.zzb = v;
        return this;
    }

    final void zza(int v, Object object0) {
        this.zzf();
        this.zza(this.zzb + 1);
        int v1 = this.zzb;
        this.zzc[v1] = v;
        this.zzd[v1] = object0;
        this.zzb = v1 + 1;
    }

    final void zza(zznb zznb0) throws IOException {
        if(zznb0.zza() == 2) {
            for(int v = this.zzb - 1; v >= 0; --v) {
                zznb0.zza(this.zzc[v] >>> 3, this.zzd[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zznb0.zza(this.zzc[v1] >>> 3, this.zzd[v1]);
        }
    }

    final void zza(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzld.zza(stringBuilder0, v, String.valueOf(this.zzc[v1] >>> 3), this.zzd[v1]);
        }
    }

    public final int zzb() {
        int v = this.zze;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            v2 += zzjc.zzd(this.zzc[v1] >>> 3, ((zzik)this.zzd[v1]));
        }
        this.zze = v2;
        return v2;
    }

    public final void zzb(zznb zznb0) throws IOException {
        if(this.zzb == 0) {
            return;
        }
        if(zznb0.zza() == 1) {
            for(int v = 0; v < this.zzb; ++v) {
                zzmj.zza(this.zzc[v], this.zzd[v], zznb0);
            }
            return;
        }
        for(int v1 = this.zzb - 1; v1 >= 0; --v1) {
            zzmj.zza(this.zzc[v1], this.zzd[v1], zznb0);
        }
    }

    public static zzmj zzc() {
        return zzmj.zza;
    }

    static zzmj zzd() {
        return new zzmj();
    }

    public final void zze() {
        if(this.zzf) {
            this.zzf = false;
        }
    }

    private final void zzf() {
        if(!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }
}

