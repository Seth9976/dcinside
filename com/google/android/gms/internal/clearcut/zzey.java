package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class zzey {
    private int count;
    private boolean zzfa;
    private int zzjq;
    private Object[] zzmj;
    private static final zzey zzoz;
    private int[] zzpa;

    static {
        zzey.zzoz = new zzey(0, new int[0], new Object[0], false);
    }

    private zzey() {
        this(0, new int[8], new Object[8], true);
    }

    private zzey(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.zzjq = -1;
        this.count = v;
        this.zzpa = arr_v;
        this.zzmj = arr_object;
        this.zzfa = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzey)) {
            return false;
        }
        int v = this.count;
        if(v == ((zzey)object0).count) {
            int[] arr_v = this.zzpa;
            int[] arr_v1 = ((zzey)object0).zzpa;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.zzmj;
            Object[] arr_object1 = ((zzey)object0).zzmj;
            int v2 = this.count;
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
        int v = this.count;
        int[] arr_v = this.zzpa;
        int v1 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.zzmj;
        int v5 = this.count;
        for(int v2 = 0; v2 < v5; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v1;
    }

    static zzey zza(zzey zzey0, zzey zzey1) {
        int v = zzey0.count + zzey1.count;
        int[] arr_v = Arrays.copyOf(zzey0.zzpa, v);
        System.arraycopy(zzey1.zzpa, 0, arr_v, zzey0.count, zzey1.count);
        Object[] arr_object = Arrays.copyOf(zzey0.zzmj, v);
        System.arraycopy(zzey1.zzmj, 0, arr_object, zzey0.count, zzey1.count);
        return new zzey(v, arr_v, arr_object, true);
    }

    final void zza(zzfr zzfr0) throws IOException {
        if(zzfr0.zzaj() == zzg.zzkp) {
            for(int v = this.count - 1; v >= 0; --v) {
                zzfr0.zza(this.zzpa[v] >>> 3, this.zzmj[v]);
            }
            return;
        }
        for(int v1 = 0; v1 < this.count; ++v1) {
            zzfr0.zza(this.zzpa[v1] >>> 3, this.zzmj[v1]);
        }
    }

    final void zza(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < this.count; ++v1) {
            zzdr.zza(stringBuilder0, v, String.valueOf(this.zzpa[v1] >>> 3), this.zzmj[v1]);
        }
    }

    public final int zzas() {
        int v5;
        int v = this.zzjq;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.count; ++v1) {
            int v3 = this.zzpa[v1];
            int v4 = v3 >>> 3;
            switch(v3 & 7) {
                case 0: {
                    v5 = zzbn.zze(v4, ((long)(((Long)this.zzmj[v1]))));
                    break;
                }
                case 1: {
                    v5 = zzbn.zzg(v4, ((long)(((Long)this.zzmj[v1]))));
                    break;
                }
                case 2: {
                    v5 = zzbn.zzc(v4, ((zzbb)this.zzmj[v1]));
                    break;
                }
                case 3: {
                    v5 = (zzbn.zzr(v4) << 1) + ((zzey)this.zzmj[v1]).zzas();
                    break;
                }
                case 5: {
                    v5 = zzbn.zzj(v4, ((int)(((Integer)this.zzmj[v1]))));
                    break;
                }
                default: {
                    throw new IllegalStateException(zzco.zzbn());
                }
            }
            v2 += v5;
        }
        this.zzjq = v2;
        return v2;
    }

    private static void zzb(int v, Object object0, zzfr zzfr0) throws IOException {
        switch(v & 7) {
            case 0: {
                zzfr0.zzi(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 1: {
                zzfr0.zzc(v >>> 3, ((long)(((Long)object0))));
                return;
            }
            case 2: {
                zzfr0.zza(v >>> 3, ((zzbb)object0));
                return;
            }
            case 3: {
                if(zzfr0.zzaj() == zzg.zzko) {
                    zzfr0.zzaa(v >>> 3);
                    ((zzey)object0).zzb(zzfr0);
                    zzfr0.zzab(v >>> 3);
                    return;
                }
                zzfr0.zzab(v >>> 3);
                ((zzey)object0).zzb(zzfr0);
                zzfr0.zzaa(v >>> 3);
                return;
            }
            case 5: {
                zzfr0.zzf(v >>> 3, ((int)(((Integer)object0))));
                return;
            }
            default: {
                throw new RuntimeException(zzco.zzbn());
            }
        }
    }

    final void zzb(int v, Object object0) {
        if(!this.zzfa) {
            throw new UnsupportedOperationException();
        }
        int v1 = this.count;
        int[] arr_v = this.zzpa;
        if(v1 == arr_v.length) {
            int v2 = v1 + (v1 >= 4 ? v1 >> 1 : 8);
            this.zzpa = Arrays.copyOf(arr_v, v2);
            this.zzmj = Arrays.copyOf(this.zzmj, v2);
        }
        int v3 = this.count;
        this.zzpa[v3] = v;
        this.zzmj[v3] = object0;
        this.count = v3 + 1;
    }

    public final void zzb(zzfr zzfr0) throws IOException {
        if(this.count == 0) {
            return;
        }
        if(zzfr0.zzaj() == zzg.zzko) {
            for(int v = 0; v < this.count; ++v) {
                zzey.zzb(this.zzpa[v], this.zzmj[v], zzfr0);
            }
            return;
        }
        for(int v1 = this.count - 1; v1 >= 0; --v1) {
            zzey.zzb(this.zzpa[v1], this.zzmj[v1], zzfr0);
        }
    }

    public static zzey zzea() {
        return zzey.zzoz;
    }

    static zzey zzeb() {
        return new zzey();
    }

    public final int zzec() {
        int v = this.zzjq;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.count; ++v1) {
            v2 += zzbn.zzd(this.zzpa[v1] >>> 3, ((zzbb)this.zzmj[v1]));
        }
        this.zzjq = v2;
        return v2;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}

