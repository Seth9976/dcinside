package com.google.android.gms.internal.vision;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzes extends zzef {
    static final zzef zza;
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    static {
        zzes.zza = new zzes(null, new Object[0], 0);
    }

    private zzes(Object object0, Object[] arr_object, int v) {
        this.zzb = object0;
        this.zzc = arr_object;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.vision.zzef
    @NullableDecl
    public final Object get(@NullableDecl Object object0) {
        Object object1 = this.zzb;
        Object[] arr_object = this.zzc;
        int v = this.zzd;
        if(object0 == null) {
            return null;
        }
        if(v == 1) {
            return arr_object[0].equals(object0) ? arr_object[1] : null;
        }
        if(object1 == null) {
            return null;
        }
        if(object1 instanceof byte[]) {
            int v1 = ((byte[])object1).length - 1;
            for(int v2 = zzec.zza(object0.hashCode()); true; v2 = v3 + 1) {
                int v3 = v2 & v1;
                int v4 = ((byte[])object1)[v3] & 0xFF;
                if(v4 == 0xFF) {
                    return null;
                }
                if(arr_object[v4].equals(object0)) {
                    return arr_object[v4 ^ 1];
                }
            }
        }
        if(object1 instanceof short[]) {
            int v5 = ((short[])object1).length - 1;
            for(int v6 = zzec.zza(object0.hashCode()); true; v6 = v7 + 1) {
                int v7 = v6 & v5;
                int v8 = ((short[])object1)[v7] & 0xFFFF;
                if(v8 == 0xFFFF) {
                    return null;
                }
                if(arr_object[v8].equals(object0)) {
                    return arr_object[v8 ^ 1];
                }
            }
        }
        int v9 = ((int[])object1).length - 1;
        for(int v10 = zzec.zza(object0.hashCode()); true; v10 = v11 + 1) {
            int v11 = v10 & v9;
            int v12 = ((int[])object1)[v11];
            if(v12 == -1) {
                return null;
            }
            if(arr_object[v12].equals(object0)) {
                return arr_object[v12 ^ 1];
            }
        }
    }

    @Override
    public final int size() {
        return this.zzd;
    }

    static zzes zza(int v, Object[] arr_object) {
        byte[] arr_b;
        int v1 = 0;
        if(v == 0) {
            return (zzes)zzes.zza;
        }
        if(v == 1) {
            zzdq.zza(arr_object[0], arr_object[1]);
            return new zzes(null, arr_object, 1);
        }
        zzde.zzb(v, arr_object.length >> 1);
        int v2 = zzej.zza(v);
        if(v2 <= 0x80) {
            arr_b = new byte[v2];
            Arrays.fill(arr_b, -1);
            while(v1 < v) {
                Object object0 = arr_object[v1 * 2];
                Object object1 = arr_object[v1 * 2 ^ 1];
                zzdq.zza(object0, object1);
                int v3 = zzec.zza(object0.hashCode());
            label_16:
                int v4 = v3 & v2 - 1;
                int v5 = arr_b[v4] & 0xFF;
                if(v5 == 0xFF) {
                    arr_b[v4] = (byte)(v1 * 2);
                    ++v1;
                    continue;
                }
                if(arr_object[v5].equals(object0)) {
                    throw zzes.zza(object0, object1, arr_object, v5);
                }
                v3 = v4 + 1;
                goto label_16;
            }
        }
        else if(v2 <= 0x8000) {
            arr_b = new short[v2];
            Arrays.fill(((short[])arr_b), -1);
            while(v1 < v) {
                Object object2 = arr_object[v1 * 2];
                Object object3 = arr_object[v1 * 2 ^ 1];
                zzdq.zza(object2, object3);
                int v6 = zzec.zza(object2.hashCode());
            label_34:
                int v7 = v6 & v2 - 1;
                int v8 = arr_b[v7] & 0xFFFF;
                if(v8 == 0xFFFF) {
                    arr_b[v7] = (short)(v1 * 2);
                    ++v1;
                    continue;
                }
                if(arr_object[v8].equals(object2)) {
                    throw zzes.zza(object2, object3, arr_object, v8);
                }
                v6 = v7 + 1;
                goto label_34;
            }
        }
        else {
            arr_b = new int[v2];
            Arrays.fill(((int[])arr_b), -1);
            while(v1 < v) {
                Object object4 = arr_object[v1 * 2];
                Object object5 = arr_object[v1 * 2 ^ 1];
                zzdq.zza(object4, object5);
                int v9 = zzec.zza(object4.hashCode());
            label_51:
                int v10 = v9 & v2 - 1;
                int v11 = arr_b[v10];
                if(v11 == -1) {
                    arr_b[v10] = v1 * 2;
                    ++v1;
                    continue;
                }
                if(arr_object[v11].equals(object4)) {
                    throw zzes.zza(object4, object5, arr_object, v11);
                }
                v9 = v10 + 1;
                goto label_51;
            }
        }
        return new zzes(arr_b, arr_object, v);
    }

    private static IllegalArgumentException zza(Object object0, Object object1, Object[] arr_object, int v) {
        return new IllegalArgumentException("Multiple entries with same key: " + object0 + "=" + object1 + " and " + arr_object[v] + "=" + arr_object[v ^ 1]);
    }

    @Override  // com.google.android.gms.internal.vision.zzef
    final zzej zza() {
        return new zzer(this, this.zzc, 0, this.zzd);
    }

    @Override  // com.google.android.gms.internal.vision.zzef
    final zzej zzb() {
        return new zzet(this, new zzew(this.zzc, 0, this.zzd));
    }

    @Override  // com.google.android.gms.internal.vision.zzef
    final zzeb zzc() {
        return new zzew(this.zzc, 1, this.zzd);
    }
}

