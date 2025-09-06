package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzgxg {
    final zzhad zza;
    private static final zzgxg zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzgxg.zzb = new zzgxg(true);
    }

    private zzgxg() {
        this.zza = new zzgzy();
    }

    private zzgxg(boolean z) {
        zzgzy zzgzy0 = new zzgzy();
        super();
        this.zza = zzgzy0;
        this.zzg();
        this.zzg();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        zzgxg zzgxg0 = new zzgxg();
        int v = this.zza.zzc();
        for(int v1 = 0; v1 < v; ++v1) {
            Map.Entry map$Entry0 = this.zza.zzg(v1);
            zzgxg0.zzh(((zzgxf)((zzgzz)map$Entry0).zza()), map$Entry0.getValue());
        }
        for(Object object0: this.zza.zzd()) {
            zzgxg0.zzh(((zzgxf)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        zzgxg0.zzd = this.zzd;
        return zzgxg0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzgxg ? this.zza.equals(((zzgxg)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    static int zza(zzhau zzhau0, int v, Object object0) {
        int v1 = zzgww.zzD(v << 3);
        if(zzhau0 == zzhau.zzj) {
            if(((zzgzc)object0) instanceof zzgvt) {
                throw null;
            }
            return v1 + v1 + zzgxg.zzb(zzhau0, object0);
        }
        return v1 + zzgxg.zzb(zzhau0, object0);
    }

    static int zzb(zzhau zzhau0, Object object0) {
        int v;
        switch(zzhau0.ordinal()) {
            case 0: {
                ((Double)object0).doubleValue();
                return 8;
            }
            case 1: {
                ((Float)object0).floatValue();
                return 4;
            }
            case 2: {
                return zzgww.zzE(((long)(((Long)object0))));
            }
            case 3: {
                return zzgww.zzE(((long)(((Long)object0))));
            }
            case 4: {
                return zzgww.zzE(((int)(((Integer)object0))));
            }
            case 5: {
                ((Long)object0).longValue();
                return 8;
            }
            case 6: {
                ((Integer)object0).intValue();
                return 4;
            }
            case 7: {
                ((Boolean)object0).booleanValue();
                return 1;
            }
            case 8: {
                if(object0 instanceof zzgwj) {
                    v = ((zzgwj)object0).zzd();
                    return zzgww.zzD(v) + v;
                }
                return zzgww.zzC(((String)object0));
            }
            case 9: {
                return ((zzgzc)object0).zzaY();
            }
            case 10: {
                if(object0 instanceof zzgym) {
                    v = ((zzgym)object0).zza();
                    return zzgww.zzD(v) + v;
                }
                return zzgww.zzz(((zzgzc)object0));
            }
            case 11: {
                if(object0 instanceof zzgwj) {
                    v = ((zzgwj)object0).zzd();
                    return zzgww.zzD(v) + v;
                }
                return zzgww.zzD(((byte[])object0).length) + ((byte[])object0).length;
            }
            case 12: {
                return zzgww.zzD(((int)(((Integer)object0))));
            }
            case 13: {
                return object0 instanceof zzgxv ? zzgww.zzE(((zzgxv)object0).zza()) : zzgww.zzE(((int)(((Integer)object0))));
            }
            case 14: {
                ((Integer)object0).intValue();
                return 4;
            }
            case 15: {
                ((Long)object0).longValue();
                return 8;
            }
            case 16: {
                int v1 = (int)(((Integer)object0));
                return zzgww.zzD(v1 >> 0x1F ^ v1 + v1);
            }
            case 17: {
                long v2 = (long)(((Long)object0));
                return zzgww.zzE(v2 >> 0x3F ^ v2 + v2);
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public static int zzc(zzgxf zzgxf0, Object object0) {
        zzhau zzhau0 = zzgxf0.zzb();
        int v = zzgxf0.zza();
        if(zzgxf0.zze()) {
            int v1 = ((List)object0).size();
            int v2 = 0;
            if(zzgxf0.zzd()) {
                if(!((List)object0).isEmpty()) {
                    int v3 = 0;
                    while(v2 < v1) {
                        v3 += zzgxg.zzb(zzhau0, ((List)object0).get(v2));
                        ++v2;
                    }
                    return zzgww.zzD(v << 3) + v3 + zzgww.zzD(v3);
                }
                return 0;
            }
            int v4 = 0;
            while(v2 < v1) {
                v4 += zzgxg.zza(zzhau0, v, ((List)object0).get(v2));
                ++v2;
            }
            return v4;
        }
        return zzgxg.zza(zzhau0, v, object0);
    }

    public final int zzd() {
        int v = this.zza.zzc();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += zzgxg.zzl(this.zza.zzg(v1));
        }
        for(Object object0: this.zza.zzd()) {
            v2 += zzgxg.zzl(((Map.Entry)object0));
        }
        return v2;
    }

    public static zzgxg zze() {
        return zzgxg.zzb;
    }

    public final Iterator zzf() {
        if(this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzgyk(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if(this.zzc) {
            return;
        }
        int v = this.zza.zzc();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.zza.zzg(v1).getValue();
            if(object0 instanceof zzgxr) {
                ((zzgxr)object0).zzbU();
            }
        }
        for(Object object1: this.zza.zzd()) {
            Object object2 = ((Map.Entry)object1).getValue();
            if(object2 instanceof zzgxr) {
                ((zzgxr)object2).zzbU();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgxf zzgxf0, Object object0) {
        if(zzgxf0.zze()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list0 = (List)object0;
            int v = list0.size();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = list0.get(v1);
                zzgxg.zzm(zzgxf0, object1);
                arrayList0.add(object1);
            }
            object0 = arrayList0;
        }
        else {
            zzgxg.zzm(zzgxf0, object0);
        }
        if(object0 instanceof zzgym) {
            this.zzd = true;
        }
        this.zza.zzf(zzgxf0, object0);
    }

    public final boolean zzi() {
        int v = this.zza.zzc();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!zzgxg.zzj(this.zza.zzg(v1))) {
                return false;
            }
        }
        for(Object object0: this.zza.zzd()) {
            if(!zzgxg.zzj(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static boolean zzj(Map.Entry map$Entry0) {
        zzgxf zzgxf0 = (zzgxf)map$Entry0.getKey();
        if(zzgxf0.zzc() == zzhav.zzi) {
            if(zzgxf0.zze()) {
                List list0 = (List)map$Entry0.getValue();
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!zzgxg.zzk(list0.get(v1))) {
                        return false;
                    }
                }
                return true;
            }
            return zzgxg.zzk(map$Entry0.getValue());
        }
        return true;
    }

    private static boolean zzk(Object object0) {
        if(object0 instanceof zzgzd) {
            return ((zzgzd)object0).zzbw();
        }
        if(!(object0 instanceof zzgym)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    private static final int zzl(Map.Entry map$Entry0) {
        zzgxf zzgxf0 = (zzgxf)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zzgxf0.zzc() == zzhav.zzi && !zzgxf0.zze() && !zzgxf0.zzd()) {
            if(object0 instanceof zzgym) {
                int v = zzgww.zzD(((zzgxf)map$Entry0.getKey()).zza()) + 1;
                int v1 = ((zzgym)object0).zza();
                return zzgww.zzD(v1) + 3 + v + v1;
            }
            return zzgww.zzD(((zzgxf)map$Entry0.getKey()).zza()) + 3 + (zzgww.zzz(((zzgzc)object0)) + 1);
        }
        return zzgxg.zzc(zzgxf0, object0);
    }

    private static final void zzm(zzgxf zzgxf0, Object object0) {
        boolean z;
        zzhau zzhau0 = zzgxf0.zzb();
        object0.getClass();
        switch(zzhau0.zza().ordinal()) {
            case 0: {
                z = object0 instanceof Integer;
                goto label_15;
            }
            case 1: {
                z = object0 instanceof Long;
                goto label_15;
            }
            case 2: {
                z = object0 instanceof Float;
                goto label_15;
            }
            case 3: {
                z = object0 instanceof Double;
                goto label_15;
            }
            case 4: {
                z = object0 instanceof Boolean;
                goto label_15;
            }
            case 5: {
                z = object0 instanceof String;
            label_15:
                if(z) {
                    return;
                }
                break;
            }
            case 6: {
                if(object0 instanceof zzgwj || object0 instanceof byte[]) {
                    return;
                }
                break;
            }
            case 7: {
                if(object0 instanceof Integer || object0 instanceof zzgxv) {
                    return;
                }
                break;
            }
            case 8: {
                if(object0 instanceof zzgzc || object0 instanceof zzgym) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzgxf0.zza(), zzgxf0.zzb().zza(), object0.getClass().getName()));
    }
}

