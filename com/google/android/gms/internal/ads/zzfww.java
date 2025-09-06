package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o3.a;

final class zzfww extends AbstractMap implements Serializable {
    @a
    transient int[] zza;
    @a
    transient Object[] zzb;
    @a
    transient Object[] zzc;
    private static final Object zzd;
    @a
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    @a
    private transient Set zzh;
    @a
    private transient Set zzi;
    @a
    private transient Collection zzj;

    static {
        zzfww.zzd = new Object();
    }

    zzfww() {
        this.zzp(3);
    }

    zzfww(int v) {
        this.zzp(8);
    }

    @Override
    public final void clear() {
        if(this.zzr()) {
            return;
        }
        this.zzo();
        Map map0 = this.zzl();
        if(map0 != null) {
            this.zzf = zzgaq.zzc(this.size(), 3, 0x3FFFFFFF);
            map0.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(this.zzB(), 0, this.zzg, null);
        Arrays.fill(this.zzC(), 0, this.zzg, null);
        Object object0 = this.zze;
        Objects.requireNonNull(object0);
        if(object0 instanceof byte[]) {
            Arrays.fill(((byte[])object0), 0);
        }
        else if(object0 instanceof short[]) {
            Arrays.fill(((short[])object0), 0);
        }
        else {
            Arrays.fill(((int[])object0), 0);
        }
        Arrays.fill(this.zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override
    public final boolean containsKey(@a Object object0) {
        Map map0 = this.zzl();
        return map0 == null ? this.zzw(object0) != -1 : map0.containsKey(object0);
    }

    @Override
    public final boolean containsValue(@a Object object0) {
        Map map0 = this.zzl();
        if(map0 == null) {
            for(int v = 0; v < this.zzg; ++v) {
                if(zzfuk.zza(object0, this.zzC()[v])) {
                    return true;
                }
            }
            return false;
        }
        return map0.containsValue(object0);
    }

    @Override
    public final Set entrySet() {
        Set set0 = this.zzi;
        if(set0 == null) {
            set0 = new zzfwq(this);
            this.zzi = set0;
        }
        return set0;
    }

    @Override
    @a
    public final Object get(@a Object object0) {
        Map map0 = this.zzl();
        if(map0 != null) {
            return map0.get(object0);
        }
        int v = this.zzw(object0);
        return v == -1 ? null : this.zzC()[v];
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        Set set0 = this.zzh;
        if(set0 == null) {
            set0 = new zzfws(this);
            this.zzh = set0;
        }
        return set0;
    }

    @Override
    @a
    public final Object put(Object object0, Object object1) {
        if(this.zzr()) {
            zzfun.zzm(this.zzr(), "Arrays already allocated");
            int v = this.zzf;
            int v1 = Math.max(v + 1, 2);
            int v2 = Integer.highestOneBit(v1);
            if(v1 > ((int)(((double)v2)))) {
                v2 += v2;
                if(v2 <= 0) {
                    v2 = 0x40000000;
                }
            }
            int v3 = Math.max(4, v2);
            this.zze = zzfwx.zzd(v3);
            this.zzz(v3 - 1);
            this.zza = new int[v];
            this.zzb = new Object[v];
            this.zzc = new Object[v];
        }
        Map map0 = this.zzl();
        if(map0 != null) {
            return map0.put(object0, object1);
        }
        int[] arr_v = this.zzA();
        Object[] arr_object = this.zzB();
        Object[] arr_object1 = this.zzC();
        int v4 = this.zzg;
        int v5 = zzfxf.zzb(object0);
        int v6 = this.zzv();
        int v7 = v5 & v6;
        Object object2 = this.zze;
        Objects.requireNonNull(object2);
        int v8 = zzfwx.zzc(object2, v7);
        if(v8 == 0) {
            if(v4 + 1 > v6) {
                v6 = this.zzx(v6, zzfwx.zza(v6), v5, v4);
                goto label_64;
            }
            Object object3 = this.zze;
            Objects.requireNonNull(object3);
            zzfwx.zze(object3, v7, v4 + 1);
            goto label_64;
        }
        int v9 = ~v6;
        int v10 = 0;
        while(true) {
            int v11 = arr_v[v8 - 1];
            int v12 = v11 & v9;
            if(v12 == (v5 & v9) && zzfuk.zza(object0, arr_object[v8 - 1])) {
                Object object4 = arr_object1[v8 - 1];
                arr_object1[v8 - 1] = object1;
                return object4;
            }
            int v13 = v11 & v6;
            ++v10;
            if(v13 == 0) {
                if(v10 >= 9) {
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap(this.zzv() + 1, 1.0f);
                    for(int v14 = this.zze(); v14 >= 0; v14 = this.zzf(v14)) {
                        linkedHashMap0.put(this.zzB()[v14], this.zzC()[v14]);
                    }
                    this.zze = linkedHashMap0;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    this.zzo();
                    return linkedHashMap0.put(object0, object1);
                }
                if(v4 + 1 > v6) {
                    v6 = this.zzx(v6, zzfwx.zza(v6), v5, v4);
                }
                else {
                    arr_v[v8 - 1] = v4 + 1 & v6 | v12;
                }
            label_64:
                int[] arr_v1 = this.zzA();
                if(v4 + 1 > arr_v1.length) {
                    int v15 = Math.min(0x3FFFFFFF, Math.max(1, arr_v1.length >>> 1) + arr_v1.length | 1);
                    if(v15 != arr_v1.length) {
                        this.zza = Arrays.copyOf(this.zzA(), v15);
                        this.zzb = Arrays.copyOf(this.zzB(), v15);
                        this.zzc = Arrays.copyOf(this.zzC(), v15);
                    }
                }
                this.zzA()[v4] = ~v6 & v5;
                this.zzB()[v4] = object0;
                this.zzC()[v4] = object1;
                this.zzg = v4 + 1;
                this.zzo();
                return null;
            }
            v8 = v13;
        }
    }

    @Override
    @a
    public final Object remove(@a Object object0) {
        Map map0 = this.zzl();
        if(map0 != null) {
            return map0.remove(object0);
        }
        Object object1 = this.zzy(object0);
        return object1 == zzfww.zzd ? null : object1;
    }

    @Override
    public final int size() {
        Map map0 = this.zzl();
        return map0 == null ? this.zzg : map0.size();
    }

    @Override
    public final Collection values() {
        Collection collection0 = this.zzj;
        if(collection0 == null) {
            collection0 = new zzfwu(this);
            this.zzj = collection0;
        }
        return collection0;
    }

    private final int[] zzA() {
        int[] arr_v = this.zza;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    private final Object[] zzB() {
        Object[] arr_object = this.zzb;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    private final Object[] zzC() {
        Object[] arr_object = this.zzc;
        Objects.requireNonNull(arr_object);
        return arr_object;
    }

    // 去混淆评级： 低(20)
    final int zze() {
        return this.isEmpty() ? -1 : 0;
    }

    final int zzf(int v) {
        return v + 1 >= this.zzg ? -1 : v + 1;
    }

    static Object zzg(zzfww zzfww0, int v) {
        return zzfww0.zzB()[v];
    }

    static Object zzi(zzfww zzfww0) {
        Object object0 = zzfww0.zze;
        Objects.requireNonNull(object0);
        return object0;
    }

    static Object zzj(zzfww zzfww0, int v) {
        return zzfww0.zzC()[v];
    }

    // 去混淆评级： 低(20)
    @a
    final Map zzl() {
        return this.zze instanceof Map ? ((Map)this.zze) : null;
    }

    static void zzn(zzfww zzfww0, int v, Object object0) {
        zzfww0.zzC()[v] = object0;
    }

    final void zzo() {
        this.zzf += 0x20;
    }

    final void zzp(int v) {
        this.zzf = zzgaq.zzc(v, 1, 0x3FFFFFFF);
    }

    final void zzq(int v, int v1) {
        int v5;
        Object object0 = this.zze;
        Objects.requireNonNull(object0);
        int[] arr_v = this.zzA();
        Object[] arr_object = this.zzB();
        Object[] arr_object1 = this.zzC();
        int v2 = this.size();
        if(v < v2 - 1) {
            Object object1 = arr_object[v2 - 1];
            arr_object[v] = object1;
            arr_object1[v] = arr_object1[v2 - 1];
            arr_object[v2 - 1] = null;
            arr_object1[v2 - 1] = null;
            arr_v[v] = arr_v[v2 - 1];
            arr_v[v2 - 1] = 0;
            int v3 = zzfxf.zzb(object1) & v1;
            int v4 = zzfwx.zzc(object0, v3);
            if(v4 != v2) {
                while(true) {
                    v5 = arr_v[v4 - 1];
                    int v6 = v5 & v1;
                    if(v6 == v2) {
                        break;
                    }
                    v4 = v6;
                }
                arr_v[v4 - 1] = v5 & ~v1 | v1 & v + 1;
                return;
            }
            zzfwx.zze(object0, v3, v + 1);
            return;
        }
        arr_object[v] = null;
        arr_object1[v] = null;
        arr_v[v] = 0;
    }

    final boolean zzr() {
        return this.zze == null;
    }

    private final int zzv() {
        return (1 << (this.zzf & 0x1F)) - 1;
    }

    private final int zzw(@a Object object0) {
        if(this.zzr()) {
            return -1;
        }
        int v = zzfxf.zzb(object0);
        int v1 = this.zzv();
        Object object1 = this.zze;
        Objects.requireNonNull(object1);
        int v2 = zzfwx.zzc(object1, v & v1);
        if(v2 != 0) {
            while(true) {
                int v3 = this.zzA()[v2 - 1];
                if((v3 & ~v1) == (v & ~v1) && zzfuk.zza(object0, this.zzB()[v2 - 1])) {
                    return v2 - 1;
                }
                v2 = v3 & v1;
                if(v2 == 0) {
                    break;
                }
            }
        }
        return -1;
    }

    private final int zzx(int v, int v1, int v2, int v3) {
        Object object0 = zzfwx.zzd(v1);
        if(v3 != 0) {
            zzfwx.zze(object0, v2 & v1 - 1, v3 + 1);
        }
        Object object1 = this.zze;
        Objects.requireNonNull(object1);
        int[] arr_v = this.zzA();
        for(int v4 = 0; v4 <= v; ++v4) {
            for(int v5 = zzfwx.zzc(object1, v4); v5 != 0; v5 = v6 & v) {
                int v6 = arr_v[v5 - 1];
                int v7 = ~v & v6 | v4;
                int v8 = v7 & v1 - 1;
                int v9 = zzfwx.zzc(object0, v8);
                zzfwx.zze(object0, v8, v5);
                arr_v[v5 - 1] = ~(v1 - 1) & v7 | v9 & v1 - 1;
            }
        }
        this.zze = object0;
        this.zzz(v1 - 1);
        return v1 - 1;
    }

    private final Object zzy(@a Object object0) {
        if(!this.zzr()) {
            int v = this.zzv();
            Object object1 = this.zze;
            Objects.requireNonNull(object1);
            int v1 = zzfwx.zzb(object0, null, v, object1, this.zzA(), this.zzB(), null);
            if(v1 != -1) {
                Object object2 = this.zzC()[v1];
                this.zzq(v1, v);
                --this.zzg;
                this.zzo();
                return object2;
            }
        }
        return zzfww.zzd;
    }

    private final void zzz(int v) {
        this.zzf = 0x20 - Integer.numberOfLeadingZeros(v) & 0x1F | this.zzf & 0xFFFFFFE0;
    }
}

