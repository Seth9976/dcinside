package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdp extends AbstractMap implements Serializable {
    @NullableDecl
    transient int[] zza;
    @NullableDecl
    transient Object[] zzb;
    @NullableDecl
    transient Object[] zzc;
    private static final Object zzd;
    @NullableDecl
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    @NullableDecl
    private transient Set zzh;
    @NullableDecl
    private transient Set zzi;
    @NullableDecl
    private transient Collection zzj;

    static {
        zzdp.zzd = new Object();
    }

    zzdp() {
        zzde.zza(true, "Expected size must be >= 0");
        this.zzf = 3;
    }

    @Override
    public final void clear() {
        if(this.zza()) {
            return;
        }
        this.zzc();
        Map map0 = this.zzb();
        if(map0 != null) {
            this.zzf = zzfc.zza(this.size(), 3, 0x3FFFFFFF);
            map0.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(this.zzb, 0, this.zzg, null);
        Arrays.fill(this.zzc, 0, this.zzg, null);
        Object object0 = this.zze;
        if(object0 instanceof byte[]) {
            Arrays.fill(((byte[])object0), 0);
        }
        else if(object0 instanceof short[]) {
            Arrays.fill(((short[])object0), 0);
        }
        else {
            Arrays.fill(((int[])object0), 0);
        }
        Arrays.fill(this.zza, 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override
    public final boolean containsKey(@NullableDecl Object object0) {
        Map map0 = this.zzb();
        return map0 == null ? this.zza(object0) != -1 : map0.containsKey(object0);
    }

    @Override
    public final boolean containsValue(@NullableDecl Object object0) {
        Map map0 = this.zzb();
        if(map0 != null) {
            return map0.containsValue(object0);
        }
        for(int v = 0; v < this.zzg; ++v) {
            if(zzcz.zza(object0, this.zzc[v])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        Set set0 = this.zzi;
        if(set0 == null) {
            set0 = new zzdt(this);
            this.zzi = set0;
        }
        return set0;
    }

    @Override
    public final Object get(@NullableDecl Object object0) {
        Map map0 = this.zzb();
        if(map0 != null) {
            return map0.get(object0);
        }
        int v = this.zza(object0);
        return v == -1 ? null : this.zzc[v];
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        Set set0 = this.zzh;
        if(set0 == null) {
            set0 = new zzdv(this);
            this.zzh = set0;
        }
        return set0;
    }

    @Override
    @NullableDecl
    public final Object put(@NullableDecl Object object0, @NullableDecl Object object1) {
        int v3;
        if(this.zza()) {
            zzde.zzb(this.zza(), "Arrays already allocated");
            int v = this.zzf;
            int v1 = Math.max(v + 1, 2);
            int v2 = Integer.highestOneBit(v1);
            if(v1 <= ((int)(((double)v2) * 1.0))) {
                v3 = v2;
            }
            else if(v2 << 1 <= 0) {
                v3 = 0x40000000;
            }
            else {
                v3 = v2 << 1;
            }
            int v4 = Math.max(4, v3);
            this.zze = zzea.zza(v4);
            this.zzb(v4 - 1);
            this.zza = new int[v];
            this.zzb = new Object[v];
            this.zzc = new Object[v];
        }
        Map map0 = this.zzb();
        if(map0 != null) {
            return map0.put(object0, object1);
        }
        int[] arr_v = this.zza;
        Object[] arr_object = this.zzb;
        Object[] arr_object1 = this.zzc;
        int v5 = this.zzg;
        int v6 = zzec.zza(object0);
        int v7 = this.zzi();
        int v8 = v6 & v7;
        int v9 = zzea.zza(this.zze, v8);
        if(v9 == 0) {
            if(v5 + 1 > v7) {
                v7 = this.zza(v7, zzea.zzb(v7), v6, v5);
                goto label_61;
            }
            zzea.zza(this.zze, v8, v5 + 1);
            goto label_61;
        }
        int v10 = ~v7;
        int v11 = 0;
        while(true) {
            int v12 = arr_v[v9 - 1];
            if((v12 & v10) == (v6 & v10) && zzcz.zza(object0, arr_object[v9 - 1])) {
                Object object2 = arr_object1[v9 - 1];
                arr_object1[v9 - 1] = object1;
                return object2;
            }
            int v13 = v12 & v7;
            if(v13 == 0) {
                if(v11 + 1 >= 9) {
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap(this.zzi() + 1, 1.0f);
                    for(int v14 = this.zzd(); v14 >= 0; v14 = this.zza(v14)) {
                        linkedHashMap0.put(this.zzb[v14], this.zzc[v14]);
                    }
                    this.zze = linkedHashMap0;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    this.zzc();
                    return linkedHashMap0.put(object0, object1);
                }
                if(v5 + 1 > v7) {
                    v7 = this.zza(v7, zzea.zzb(v7), v6, v5);
                }
                else {
                    arr_v[v9 - 1] = v12 & ~v7 | v5 + 1 & v7;
                }
            label_61:
                int v15 = this.zza.length;
                if(v5 + 1 > v15) {
                    int v16 = Math.min(0x3FFFFFFF, 1 | Math.max(1, v15 >>> 1) + v15);
                    if(v16 != v15) {
                        this.zza = Arrays.copyOf(this.zza, v16);
                        this.zzb = Arrays.copyOf(this.zzb, v16);
                        this.zzc = Arrays.copyOf(this.zzc, v16);
                    }
                }
                this.zza[v5] = v6 & ~v7;
                this.zzb[v5] = object0;
                this.zzc[v5] = object1;
                this.zzg = v5 + 1;
                this.zzc();
                return null;
            }
            ++v11;
            v9 = v13;
        }
    }

    @Override
    @NullableDecl
    public final Object remove(@NullableDecl Object object0) {
        Map map0 = this.zzb();
        if(map0 != null) {
            return map0.remove(object0);
        }
        Object object1 = this.zzb(object0);
        return object1 == zzdp.zzd ? null : object1;
    }

    @Override
    public final int size() {
        Map map0 = this.zzb();
        return map0 == null ? this.zzg : map0.size();
    }

    @Override
    public final Collection values() {
        Collection collection0 = this.zzj;
        if(collection0 == null) {
            collection0 = new zzdx(this);
            this.zzj = collection0;
        }
        return collection0;
    }

    private final int zza(int v, int v1, int v2, int v3) {
        Object object0 = zzea.zza(v1);
        if(v3 != 0) {
            zzea.zza(object0, v2 & v1 - 1, v3 + 1);
        }
        Object object1 = this.zze;
        int[] arr_v = this.zza;
        for(int v4 = 0; v4 <= v; ++v4) {
            for(int v5 = zzea.zza(object1, v4); v5 != 0; v5 = v6 & v) {
                int v6 = arr_v[v5 - 1];
                int v7 = ~v & v6 | v4;
                int v8 = v7 & v1 - 1;
                int v9 = zzea.zza(object0, v8);
                zzea.zza(object0, v8, v5);
                arr_v[v5 - 1] = v7 & ~(v1 - 1) | v9 & v1 - 1;
            }
        }
        this.zze = object0;
        this.zzb(v1 - 1);
        return v1 - 1;
    }

    private final int zza(@NullableDecl Object object0) {
        if(this.zza()) {
            return -1;
        }
        int v = zzec.zza(object0);
        int v1 = this.zzi();
        int v2 = zzea.zza(this.zze, v & v1);
        if(v2 == 0) {
            return -1;
        }
        do {
            int v3 = this.zza[v2 - 1];
            if((v3 & ~v1) == (v & ~v1) && zzcz.zza(object0, this.zzb[v2 - 1])) {
                return v2 - 1;
            }
            v2 = v3 & v1;
        }
        while(v2 != 0);
        return -1;
    }

    final int zza(int v) {
        return v + 1 >= this.zzg ? -1 : v + 1;
    }

    final void zza(int v, int v1) {
        int v5;
        int[] arr_v1;
        int v2 = this.size();
        if(v < v2 - 1) {
            Object[] arr_object = this.zzb;
            Object object0 = arr_object[v2 - 1];
            arr_object[v] = object0;
            Object[] arr_object1 = this.zzc;
            arr_object1[v] = arr_object1[v2 - 1];
            arr_object[v2 - 1] = null;
            arr_object1[v2 - 1] = null;
            int[] arr_v = this.zza;
            arr_v[v] = arr_v[v2 - 1];
            arr_v[v2 - 1] = 0;
            int v3 = zzec.zza(object0) & v1;
            int v4 = zzea.zza(this.zze, v3);
            if(v4 == v2) {
                zzea.zza(this.zze, v3, v + 1);
                return;
            }
            while(true) {
                arr_v1 = this.zza;
                v5 = arr_v1[v4 - 1];
                int v6 = v5 & v1;
                if(v6 == v2) {
                    break;
                }
                v4 = v6;
            }
            arr_v1[v4 - 1] = v5 & ~v1 | v + 1 & v1;
            return;
        }
        this.zzb[v] = null;
        this.zzc[v] = null;
        this.zza[v] = 0;
    }

    final boolean zza() {
        return this.zze == null;
    }

    static int zzb(int v, int v1) [...] // Inlined contents

    @NullableDecl
    private final Object zzb(@NullableDecl Object object0) {
        if(this.zza()) {
            return zzdp.zzd;
        }
        int v = this.zzi();
        int v1 = zzea.zza(object0, null, v, this.zze, this.zza, this.zzb, null);
        if(v1 == -1) {
            return zzdp.zzd;
        }
        Object object1 = this.zzc[v1];
        this.zza(v1, v);
        --this.zzg;
        this.zzc();
        return object1;
    }

    private final void zzb(int v) {
        this.zzf = this.zzf & 0xFFFFFFE0 | 0x20 - Integer.numberOfLeadingZeros(v) & 0x1F;
    }

    // 去混淆评级： 低(20)
    @NullableDecl
    final Map zzb() {
        return this.zze instanceof Map ? ((Map)this.zze) : null;
    }

    final void zzc() {
        this.zzf += 0x20;
    }

    static int zzd(zzdp zzdp0) {
        int v = zzdp0.zzg;
        zzdp0.zzg = v - 1;
        return v;
    }

    // 去混淆评级： 低(20)
    final int zzd() {
        return this.isEmpty() ? -1 : 0;
    }

    final Iterator zze() {
        Map map0 = this.zzb();
        return map0 != null ? map0.keySet().iterator() : new zzds(this);
    }

    final Iterator zzf() {
        Map map0 = this.zzb();
        return map0 != null ? map0.entrySet().iterator() : new zzdr(this);
    }

    final Iterator zzg() {
        Map map0 = this.zzb();
        return map0 != null ? map0.values().iterator() : new zzdu(this);
    }

    private final int zzi() {
        return (1 << (this.zzf & 0x1F)) - 1;
    }
}

