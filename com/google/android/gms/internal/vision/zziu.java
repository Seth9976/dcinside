package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zziu {
    final zzlh zza;
    private boolean zzb;
    private boolean zzc;
    private static final zziu zzd;

    static {
        zziu.zzd = new zziu(true);
    }

    private zziu() {
        this.zza = zzlh.zza(16);
    }

    private zziu(zzlh zzlh0) {
        this.zza = zzlh0;
        this.zzb();
    }

    private zziu(boolean z) {
        this(zzlh.zza(0));
        this.zzb();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        zziu zziu0 = new zziu();
        for(int v = 0; v < this.zza.zzc(); ++v) {
            Map.Entry map$Entry0 = this.zza.zzb(v);
            zziu0.zza(((zziw)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.zza.zzd()) {
            zziu0.zza(((zziw)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        zziu0.zzc = this.zzc;
        return zziu0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zziu ? this.zza.equals(((zziu)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    static int zza(zzml zzml0, int v, Object object0) {
        return (zzml0 == zzml.zzj ? zzii.zze(v) << 1 : zzii.zze(v)) + zziu.zza(zzml0, object0);
    }

    private static int zza(zzml zzml0, Object object0) {
        switch(zzml0) {
            case 1: {
                return zzii.zzb(((double)(((Double)object0))));
            }
            case 2: {
                return zzii.zzb(((float)(((Float)object0))));
            }
            case 3: {
                return zzii.zzd(((long)(((Long)object0))));
            }
            case 4: {
                return zzii.zze(((long)(((Long)object0))));
            }
            case 5: {
                return zzii.zzf(((int)(((Integer)object0))));
            }
            case 6: {
                return zzii.zzg(((long)(((Long)object0))));
            }
            case 7: {
                return zzii.zzi(((int)(((Integer)object0))));
            }
            case 8: {
                return zzii.zzb(((Boolean)object0).booleanValue());
            }
            case 9: {
                return zzii.zzc(((zzkk)object0));
            }
            case 10: {
                return object0 instanceof zzjp ? zzii.zza(((zzjp)object0)) : zzii.zzb(((zzkk)object0));
            }
            case 11: {
                return object0 instanceof zzht ? zzii.zzb(((zzht)object0)) : zzii.zzb(((String)object0));
            }
            case 12: {
                return object0 instanceof zzht ? zzii.zzb(((zzht)object0)) : zzii.zzb(((byte[])object0));
            }
            case 13: {
                return zzii.zzg(((int)(((Integer)object0))));
            }
            case 14: {
                return zzii.zzj(((int)(((Integer)object0))));
            }
            case 15: {
                return zzii.zzh(((long)(((Long)object0))));
            }
            case 16: {
                return zzii.zzh(((int)(((Integer)object0))));
            }
            case 17: {
                return zzii.zzf(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof zzje ? zzii.zzk(((zzje)object0).zza()) : zzii.zzk(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public static zziu zza() {
        return zziu.zzd;
    }

    private static Object zza(Object object0) {
        if(object0 instanceof zzkt) {
            return ((zzkt)object0).zza();
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    static void zza(zzii zzii0, zzml zzml0, int v, Object object0) throws IOException {
        if(zzml0 == zzml.zzj) {
            zzii0.zza(v, 3);
            ((zzkk)object0).zza(zzii0);
            zzii0.zza(v, 4);
            return;
        }
        zzii0.zza(v, zzml0.zzb());
        switch(zzml0) {
            case 1: {
                zzii0.zza(((double)(((Double)object0))));
                return;
            }
            case 2: {
                zzii0.zza(((float)(((Float)object0))));
                return;
            }
            case 3: {
                zzii0.zza(((long)(((Long)object0))));
                return;
            }
            case 4: {
                zzii0.zza(((long)(((Long)object0))));
                return;
            }
            case 5: {
                zzii0.zza(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                zzii0.zzc(((long)(((Long)object0))));
                return;
            }
            case 7: {
                zzii0.zzd(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                zzii0.zza(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                ((zzkk)object0).zza(zzii0);
                return;
            }
            case 10: {
                zzii0.zza(((zzkk)object0));
                return;
            }
            case 11: {
                if(object0 instanceof zzht) {
                    zzii0.zza(((zzht)object0));
                    return;
                }
                zzii0.zza(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof zzht) {
                    zzii0.zza(((zzht)object0));
                    return;
                }
                zzii0.zzb(((byte[])object0), 0, ((byte[])object0).length);
                return;
            }
            case 13: {
                zzii0.zzb(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                zzii0.zzd(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                zzii0.zzc(((long)(((Long)object0))));
                return;
            }
            case 16: {
                zzii0.zzc(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                zzii0.zzb(((long)(((Long)object0))));
                return;
            }
            case 18: {
                if(object0 instanceof zzje) {
                    zzii0.zza(((zzje)object0).zza());
                    return;
                }
                zzii0.zza(((int)(((Integer)object0))));
            }
        }
    }

    private static boolean zza(Map.Entry map$Entry0) {
        zziw zziw0 = (zziw)map$Entry0.getKey();
        if(zziw0.zzc() == zzmo.zzi) {
            if(zziw0.zzd()) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(((zzkk)object0).zzk()) {
                        continue;
                    }
                    return false;
                }
            }
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof zzkk) {
                return ((zzkk)object1).zzk();
            }
            if(!(object1 instanceof zzjp)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    public final Object zza(zziw zziw0) {
        zzkk zzkk0 = this.zza.get(zziw0);
        return zzkk0 instanceof zzjp ? zzjp.zza() : zzkk0;
    }

    public final void zza(zziu zziu0) {
        for(int v = 0; v < zziu0.zza.zzc(); ++v) {
            this.zzb(zziu0.zza.zzb(v));
        }
        for(Object object0: zziu0.zza.zzd()) {
            this.zzb(((Map.Entry)object0));
        }
    }

    public final void zza(zziw zziw0, Object object0) {
        if(zziw0.zzd()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object1 = arrayList0.get(v1);
                ++v1;
                zziu.zzd(zziw0, object1);
            }
            object0 = arrayList0;
        }
        else {
            zziu.zzd(zziw0, object0);
        }
        if(object0 instanceof zzjp) {
            this.zzc = true;
        }
        this.zza.zza(zziw0, object0);
    }

    private final void zzb(Map.Entry map$Entry0) {
        zziw zziw0 = (zziw)map$Entry0.getKey();
        zzkk zzkk0 = map$Entry0.getValue();
        if(zzkk0 instanceof zzjp) {
            zzkk0 = zzjp.zza();
        }
        if(zziw0.zzd()) {
            ArrayList arrayList0 = this.zza(zziw0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(Object object0: ((List)zzkk0)) {
                arrayList0.add(zziu.zza(object0));
            }
            this.zza.zza(zziw0, arrayList0);
            return;
        }
        if(zziw0.zzc() == zzmo.zzi) {
            Object object1 = this.zza(zziw0);
            if(object1 == null) {
                Object object2 = zziu.zza(zzkk0);
                this.zza.zza(zziw0, object2);
                return;
            }
            zzkk zzkk1 = object1 instanceof zzkt ? zziw0.zza(((zzkt)object1), ((zzkt)zzkk0)) : zziw0.zza(((zzkk)object1).zzp(), zzkk0).zzf();
            this.zza.zza(zziw0, zzkk1);
            return;
        }
        Object object3 = zziu.zza(zzkk0);
        this.zza.zza(zziw0, object3);
    }

    public final void zzb() {
        if(this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final void zzb(zziw zziw0, Object object0) {
        List list0;
        if(!zziw0.zzd()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zziu.zzd(zziw0, object0);
        Object object1 = this.zza(zziw0);
        if(object1 == null) {
            list0 = new ArrayList();
            this.zza.zza(zziw0, list0);
        }
        else {
            list0 = (List)object1;
        }
        list0.add(object0);
    }

    public static int zzc(zziw zziw0, Object object0) {
        int v = 0;
        zzml zzml0 = zziw0.zzb();
        int v1 = zziw0.zza();
        if(zziw0.zzd()) {
            if(zziw0.zze()) {
                for(Object object1: ((List)object0)) {
                    v += zziu.zza(zzml0, object1);
                }
                return zzii.zze(v1) + v + zzii.zzl(v);
            }
            for(Object object2: ((List)object0)) {
                v += zziu.zza(zzml0, v1, object2);
            }
            return v;
        }
        return zziu.zza(zzml0, v1, object0);
    }

    private static int zzc(Map.Entry map$Entry0) {
        zziw zziw0 = (zziw)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zziw0.zzc() == zzmo.zzi && !zziw0.zzd() && !zziw0.zze()) {
            return object0 instanceof zzjp ? zzii.zzb(((zziw)map$Entry0.getKey()).zza(), ((zzjp)object0)) : zzii.zzb(((zziw)map$Entry0.getKey()).zza(), ((zzkk)object0));
        }
        return zziu.zzc(zziw0, object0);
    }

    public final boolean zzc() {
        return this.zzb;
    }

    private static void zzd(zziw zziw0, Object object0) {
        boolean z;
        zzml zzml0 = zziw0.zzb();
        zzjf.zza(object0);
        switch(zzml0.zza()) {
            case 1: {
                z = object0 instanceof Integer;
                break;
            }
            case 2: {
                z = object0 instanceof Long;
                break;
            }
            case 3: {
                z = object0 instanceof Float;
                break;
            }
            case 4: {
                z = object0 instanceof Double;
                break;
            }
            case 5: {
                z = object0 instanceof Boolean;
                break;
            }
            case 6: {
                z = object0 instanceof String;
                break;
            }
            case 7: {
                z = !(object0 instanceof zzht) && !(object0 instanceof byte[]) ? false : true;
                break;
            }
            case 8: {
                z = !(object0 instanceof Integer) && !(object0 instanceof zzje) ? false : true;
                break;
            }
            case 9: {
                z = object0 instanceof zzkk || object0 instanceof zzjp;
                break;
            }
            default: {
                z = false;
            }
        }
        if(!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zziw0.zza(), zziw0.zzb().zza(), object0.getClass().getName()));
        }
    }

    public final Iterator zzd() {
        return this.zzc ? new zzjq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    final Iterator zze() {
        return this.zzc ? new zzjq(this.zza.zze().iterator()) : this.zza.zze().iterator();
    }

    public final boolean zzf() {
        for(int v = 0; v < this.zza.zzc(); ++v) {
            if(!zziu.zza(this.zza.zzb(v))) {
                return false;
            }
        }
        for(Object object0: this.zza.zzd()) {
            if(!zziu.zza(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final int zzg() {
        int v1 = 0;
        for(int v = 0; v < this.zza.zzc(); ++v) {
            v1 += zziu.zzc(this.zza.zzb(v));
        }
        for(Object object0: this.zza.zzd()) {
            v1 += zziu.zzc(((Map.Entry)object0));
        }
        return v1;
    }
}

