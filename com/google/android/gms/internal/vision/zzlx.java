package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

public final class zzlx {
    private static final zzlx zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlx.zza = new zzlx(0, new int[0], new Object[0], false);
    }

    private zzlx() {
        this(0, new int[8], new Object[8], true);
    }

    private zzlx(int v, int[] arr_v, Object[] arr_object, boolean z) {
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
        if(!(object0 instanceof zzlx)) {
            return false;
        }
        int v = this.zzb;
        if(v == ((zzlx)object0).zzb) {
            int[] arr_v = this.zzc;
            int[] arr_v1 = ((zzlx)object0).zzc;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.zzd;
            Object[] arr_object1 = ((zzlx)object0).zzd;
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

    public static zzlx zza() {
        return zzlx.zza;
    }

    static zzlx zza(zzlx zzlx0, zzlx zzlx1) {
        int v = zzlx0.zzb + zzlx1.zzb;
        int[] arr_v = Arrays.copyOf(zzlx0.zzc, v);
        System.arraycopy(zzlx1.zzc, 0, arr_v, zzlx0.zzb, zzlx1.zzb);
        Object[] arr_object = Arrays.copyOf(zzlx0.zzd, v);
        System.arraycopy(zzlx1.zzd, 0, arr_object, zzlx0.zzb, zzlx1.zzb);
        return new zzlx(v, arr_v, arr_object, true);
    }

    private static void zza(int v, Object object0, zzmr zzmr0) throws IOException {
        switch(v & 7) {
            case 0: {
                zzmr0.zza(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                zzmr0.zzd(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                zzmr0.zza(v >>> 3, ((zzht)object0));
                return;
            }
            case 3: {
                if(zzmr0.zza() == zzmq.zza) {
                    zzmr0.zza(v >>> 3);
                    ((zzlx)object0).zzb(zzmr0);
                    zzmr0.zzb(v >>> 3);
                    return;
                }
                zzmr0.zzb(v >>> 3);
                ((zzlx)object0).zzb(zzmr0);
                zzmr0.zza(v >>> 3);
                return;
            }
            case 5: {
                zzmr0.zzd(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(zzjk.zzf());
            }
        }
    }

    final void zza(int v, Object object0) {
        if(!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int v1 = this.zzb;
        int[] arr_v = this.zzc;
        if(v1 == arr_v.length) {
            int v2 = v1 + (v1 >= 4 ? v1 >> 1 : 8);
            this.zzc = Arrays.copyOf(arr_v, v2);
            this.zzd = Arrays.copyOf(this.zzd, v2);
        }
        int v3 = this.zzb;
        this.zzc[v3] = v;
        this.zzd[v3] = object0;
        this.zzb = v3 + 1;
    }

    final void zza(zzmr zzmr0) throws IOException {
        if(zzmr0.zza() == zzmq.zzb) {
            for(int v = this.zzb - 1; v >= 0; --v) {
                zzmr0.zza(this.zzc[v] >>> 3, this.zzd[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzmr0.zza(this.zzc[v1] >>> 3, this.zzd[v1]);
        }
    }

    final void zza(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            zzkp.zza(stringBuilder0, v, String.valueOf(this.zzc[v1] >>> 3), this.zzd[v1]);
        }
    }

    static zzlx zzb() {
        return new zzlx();
    }

    public final void zzb(zzmr zzmr0) throws IOException {
        if(this.zzb == 0) {
            return;
        }
        if(zzmr0.zza() == zzmq.zza) {
            for(int v = 0; v < this.zzb; ++v) {
                zzlx.zza(this.zzc[v], this.zzd[v], zzmr0);
            }
            return;
        }
        for(int v1 = this.zzb - 1; v1 >= 0; --v1) {
            zzlx.zza(this.zzc[v1], this.zzd[v1], zzmr0);
        }
    }

    public final void zzc() {
        this.zzf = false;
    }

    public final int zzd() {
        int v = this.zze;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            v2 += zzii.zzd(this.zzc[v1] >>> 3, ((zzht)this.zzd[v1]));
        }
        this.zze = v2;
        return v2;
    }

    public final int zze() {
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
                    v5 = zzii.zze(v4, ((long)(((Long)this.zzd[v1]))));
                    break;
                }
                case 1: {
                    v5 = zzii.zzg(v4, ((long)(((Long)this.zzd[v1]))));
                    break;
                }
                case 2: {
                    v5 = zzii.zzc(v4, ((zzht)this.zzd[v1]));
                    break;
                }
                case 3: {
                    v5 = (zzii.zze(v4) << 1) + ((zzlx)this.zzd[v1]).zze();
                    break;
                }
                case 5: {
                    v5 = zzii.zzi(v4, ((int)(((Integer)this.zzd[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(zzjk.zzf());
                }
            }
            v2 += v5;
        }
        this.zze = v2;
        return v2;
    }
}

