package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzjm {
    final zzlv zza;
    private static final zzjm zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzjm.zzb = new zzjm(true);
    }

    private zzjm() {
        this.zza = new zzly();
    }

    private zzjm(zzlv zzlv0) {
        this.zza = zzlv0;
        this.zze();
    }

    private zzjm(boolean z) {
        this(new zzly());
        this.zze();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        zzjm zzjm0 = new zzjm();
        int v = this.zza.zza();
        for(int v1 = 0; v1 < v; ++v1) {
            Map.Entry map$Entry0 = this.zza.zza(v1);
            zzjm0.zzb(((zzjo)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.zza.zzb()) {
            zzjm0.zzb(((zzjo)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        zzjm0.zzd = this.zzd;
        return zzjm0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzjm ? this.zza.equals(((zzjm)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static int zza(zzjo zzjo0, Object object0) {
        zzms zzms0 = zzjo0.zzb();
        int v = zzjo0.zza();
        if(zzjo0.zze()) {
            int v1 = ((List)object0).size();
            int v2 = 0;
            if(zzjo0.zzd()) {
                if(((List)object0).isEmpty()) {
                    return 0;
                }
                int v3 = 0;
                while(v2 < v1) {
                    v3 += zzjm.zza(zzms0, ((List)object0).get(v2));
                    ++v2;
                }
                return zzjc.zzi(v) + v3 + zzjc.zzj(v3);
            }
            int v4 = 0;
            while(v2 < v1) {
                v4 += zzjm.zza(zzms0, v, ((List)object0).get(v2));
                ++v2;
            }
            return v4;
        }
        return zzjm.zza(zzms0, v, object0);
    }

    static int zza(zzms zzms0, int v, Object object0) {
        return (zzms0 == zzms.zzj ? zzjc.zzi(v) << 1 : zzjc.zzi(v)) + zzjm.zza(zzms0, object0);
    }

    private static int zza(zzms zzms0, Object object0) {
        switch(zzms0) {
            case 1: {
                return zzjc.zza(((double)(((Double)object0))));
            }
            case 2: {
                return zzjc.zza(((float)(((Float)object0))));
            }
            case 3: {
                return zzjc.zzd(((long)(((Long)object0))));
            }
            case 4: {
                return zzjc.zzg(((long)(((Long)object0))));
            }
            case 5: {
                return zzjc.zzf(((int)(((Integer)object0))));
            }
            case 6: {
                return zzjc.zzc(((long)(((Long)object0))));
            }
            case 7: {
                return zzjc.zze(((int)(((Integer)object0))));
            }
            case 8: {
                return zzjc.zza(((Boolean)object0).booleanValue());
            }
            case 9: {
                return zzjc.zzb(((zzlc)object0));
            }
            case 10: {
                return object0 instanceof zzkg ? zzjc.zza(((zzkg)object0)) : zzjc.zzc(((zzlc)object0));
            }
            case 11: {
                return object0 instanceof zzik ? zzjc.zzb(((zzik)object0)) : zzjc.zzb(((String)object0));
            }
            case 12: {
                return object0 instanceof zzik ? zzjc.zzb(((zzik)object0)) : zzjc.zza(((byte[])object0));
            }
            case 13: {
                return zzjc.zzj(((int)(((Integer)object0))));
            }
            case 14: {
                return zzjc.zzg(((int)(((Integer)object0))));
            }
            case 15: {
                return zzjc.zze(((long)(((Long)object0))));
            }
            case 16: {
                return zzjc.zzh(((int)(((Integer)object0))));
            }
            case 17: {
                return zzjc.zzf(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof zzjy ? zzjc.zzd(((zzjy)object0).zza()) : zzjc.zzd(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    private static int zza(Map.Entry map$Entry0) {
        zzjo zzjo0 = (zzjo)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zzjo0.zzc() == zzmz.zzi && !zzjo0.zze() && !zzjo0.zzd()) {
            return object0 instanceof zzkg ? zzjc.zza(((zzjo)map$Entry0.getKey()).zza(), ((zzkg)object0)) : zzjc.zzb(((zzjo)map$Entry0.getKey()).zza(), ((zzlc)object0));
        }
        return zzjm.zza(zzjo0, object0);
    }

    private final Object zza(zzjo zzjo0) {
        Object object0 = this.zza.get(zzjo0);
        if(object0 instanceof zzkg) {
            throw new NoSuchMethodError();
        }
        return object0;
    }

    private static Object zza(Object object0) {
        if(object0 instanceof zzlh) {
            return ((zzlh)object0).zza();
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    static void zza(zzjc zzjc0, zzms zzms0, int v, Object object0) throws IOException {
        if(zzms0 == zzms.zzj) {
            zzjc0.zzc(v, 3);
            ((zzlc)object0).zza(zzjc0);
            zzjc0.zzc(v, 4);
            return;
        }
        zzjc0.zzc(v, zzms0.zza());
        switch(zzms0) {
            case 1: {
                zzjc0.zzb(((double)(((Double)object0))));
                return;
            }
            case 2: {
                zzjc0.zzb(((float)(((Float)object0))));
                return;
            }
            case 3: {
                zzjc0.zzb(((long)(((Long)object0))));
                return;
            }
            case 4: {
                zzjc0.zzb(((long)(((Long)object0))));
                return;
            }
            case 5: {
                zzjc0.zzb(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                zzjc0.zza(((long)(((Long)object0))));
                return;
            }
            case 7: {
                zzjc0.zza(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                zzjc0.zzb(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                ((zzlc)object0).zza(zzjc0);
                return;
            }
            case 10: {
                zzjc0.zza(((zzlc)object0));
                return;
            }
            case 11: {
                if(object0 instanceof zzik) {
                    zzjc0.zza(((zzik)object0));
                    return;
                }
                zzjc0.zza(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof zzik) {
                    zzjc0.zza(((zzik)object0));
                    return;
                }
                zzjc0.zzb(((byte[])object0), 0, ((byte[])object0).length);
                return;
            }
            case 13: {
                zzjc0.zzc(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                zzjc0.zza(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                zzjc0.zza(((long)(((Long)object0))));
                return;
            }
            case 16: {
                zzjc0.zzk(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                zzjc0.zzh(((long)(((Long)object0))));
                return;
            }
            case 18: {
                if(object0 instanceof zzjy) {
                    zzjc0.zzb(((zzjy)object0).zza());
                    return;
                }
                zzjc0.zzb(((int)(((Integer)object0))));
            }
        }
    }

    public final int zza() {
        int v = this.zza.zza();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += zzjm.zza(this.zza.zza(v1));
        }
        for(Object object0: this.zza.zzb()) {
            v2 += zzjm.zza(((Map.Entry)object0));
        }
        return v2;
    }

    public final void zza(zzjm zzjm0) {
        int v = zzjm0.zza.zza();
        for(int v1 = 0; v1 < v; ++v1) {
            this.zzb(zzjm0.zza.zza(v1));
        }
        for(Object object0: zzjm0.zza.zzb()) {
            this.zzb(((Map.Entry)object0));
        }
    }

    public static zzjm zzb() {
        return zzjm.zzb;
    }

    private final void zzb(zzjo zzjo0, Object object0) {
        if(zzjo0.zze()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list0 = (List)object0;
            int v = list0.size();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = list0.get(v1);
                zzjm.zzc(zzjo0, object1);
                arrayList0.add(object1);
            }
            object0 = arrayList0;
        }
        else {
            zzjm.zzc(zzjo0, object0);
        }
        if(object0 instanceof zzkg) {
            this.zzd = true;
        }
        this.zza.zza(zzjo0, object0);
    }

    private final void zzb(Map.Entry map$Entry0) {
        zzjo zzjo0 = (zzjo)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zzjo0.zze()) {
            if(object0 instanceof zzkg) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            ArrayList arrayList0 = this.zza(zzjo0);
            int v = ((List)object0).size();
            if(arrayList0 == null) {
                arrayList0 = new ArrayList(v);
            }
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(zzjm.zza(((List)object0).get(v1)));
            }
            this.zza.zza(zzjo0, arrayList0);
            return;
        }
        if(zzjo0.zzc() == zzmz.zzi) {
            Object object1 = this.zza(zzjo0);
            if(object1 == null) {
                Object object2 = zzjm.zza(object0);
                this.zza.zza(zzjo0, object2);
                if(!(object0 instanceof zzkg)) {
                    return;
                }
                this.zzd = true;
                return;
            }
            if(object0 instanceof zzkg) {
                throw new NoSuchMethodError();
            }
            zzlc zzlc0 = object1 instanceof zzlh ? zzjo0.zza(((zzlh)object1), ((zzlh)object0)) : zzjo0.zza(((zzlc)object1).zzcj(), ((zzlc)object0)).zzai();
            this.zza.zza(zzjo0, zzlc0);
            return;
        }
        if(object0 instanceof zzkg) {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object object3 = zzjm.zza(object0);
        this.zza.zza(zzjo0, object3);
    }

    private static boolean zzb(Object object0) {
        if(object0 instanceof zzle) {
            return ((zzle)object0).zzcn();
        }
        if(!(object0 instanceof zzkg)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    private static void zzc(zzjo zzjo0, Object object0) {
        boolean z;
        zzms zzms0 = zzjo0.zzb();
        zzjv.zza(object0);
        switch(zzms0.zzb()) {
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
                z = !(object0 instanceof zzik) && !(object0 instanceof byte[]) ? false : true;
                break;
            }
            case 8: {
                z = !(object0 instanceof Integer) && !(object0 instanceof zzjy) ? false : true;
                break;
            }
            case 9: {
                z = object0 instanceof zzlc || object0 instanceof zzkg;
                break;
            }
            default: {
                z = false;
            }
        }
        if(!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzjo0.zza(), zzjo0.zzb().zzb(), object0.getClass().getName()));
        }
    }

    private static boolean zzc(Map.Entry map$Entry0) {
        zzjo zzjo0 = (zzjo)map$Entry0.getKey();
        if(zzjo0.zzc() == zzmz.zzi) {
            if(zzjo0.zze()) {
                List list0 = (List)map$Entry0.getValue();
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(!zzjm.zzb(list0.get(v1))) {
                        return false;
                    }
                }
                return true;
            }
            return zzjm.zzb(map$Entry0.getValue());
        }
        return true;
    }

    final Iterator zzc() {
        if(this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzki(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator zzd() {
        if(this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzki(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if(this.zzc) {
            return;
        }
        int v = this.zza.zza();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.zza.zza(v1).getValue();
            if(object0 instanceof zzjt) {
                ((zzjt)object0).zzcl();
            }
        }
        for(Object object1: this.zza.zzb()) {
            Object object2 = ((Map.Entry)object1).getValue();
            if(object2 instanceof zzjt) {
                ((zzjt)object2).zzcl();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int v = this.zza.zza();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!zzjm.zzc(this.zza.zza(v1))) {
                return false;
            }
        }
        for(Object object0: this.zza.zzb()) {
            if(!zzjm.zzc(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }
}

