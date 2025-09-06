package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzby {
    private final zzei zzgt;
    private boolean zzgu;
    private boolean zzgv;
    private static final zzby zzgw;

    static {
        zzby.zzgw = new zzby(true);
    }

    private zzby() {
        this.zzgv = false;
        this.zzgt = zzei.zzaj(16);
    }

    private zzby(boolean z) {
        this.zzgv = false;
        this.zzgt = zzei.zzaj(0);
        this.zzv();
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        zzby zzby0 = new zzby();
        for(int v = 0; v < this.zzgt.zzdr(); ++v) {
            Map.Entry map$Entry0 = this.zzgt.zzak(v);
            zzby0.zza(((zzca)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.zzgt.zzds()) {
            zzby0.zza(((zzca)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        zzby0.zzgv = this.zzgv;
        return zzby0;
    }

    final Iterator descendingIterator() {
        return this.zzgv ? new zzcu(this.zzgt.zzdt().iterator()) : this.zzgt.zzdt().iterator();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzby ? this.zzgt.equals(((zzby)object0).zzgt) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzgt.hashCode();
    }

    final boolean isEmpty() {
        return this.zzgt.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    public final boolean isInitialized() {
        for(int v = 0; v < this.zzgt.zzdr(); ++v) {
            if(!zzby.zzb(this.zzgt.zzak(v))) {
                return false;
            }
        }
        for(Object object0: this.zzgt.zzds()) {
            if(!zzby.zzb(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        return this.zzgv ? new zzcu(this.zzgt.entrySet().iterator()) : this.zzgt.entrySet().iterator();
    }

    static int zza(zzfl zzfl0, int v, Object object0) {
        int v1 = zzbn.zzr(v);
        if(zzfl0 == zzfl.zzql) {
            zzdo zzdo0 = (zzdo)object0;
            v1 <<= 1;
        }
        return v1 + zzby.zzb(zzfl0, object0);
    }

    private final Object zza(zzca zzca0) {
        zzdo zzdo0 = this.zzgt.get(zzca0);
        return zzdo0 instanceof zzcr ? zzcr.zzbr() : zzdo0;
    }

    static void zza(zzbn zzbn0, zzfl zzfl0, int v, Object object0) throws IOException {
        if(zzfl0 == zzfl.zzql) {
            zzbn0.zzb(v, 3);
            ((zzdo)object0).zzb(zzbn0);
            zzbn0.zzb(v, 4);
            return;
        }
        zzbn0.zzb(v, zzfl0.zzel());
        switch(zzfl0) {
            case 1: {
                zzbn0.zza(((double)(((Double)object0))));
                return;
            }
            case 2: {
                zzbn0.zza(((float)(((Float)object0))));
                return;
            }
            case 3: {
                zzbn0.zzb(((long)(((Long)object0))));
                return;
            }
            case 4: {
                zzbn0.zzb(((long)(((Long)object0))));
                return;
            }
            case 5: {
                zzbn0.zzn(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                zzbn0.zzd(((long)(((Long)object0))));
                return;
            }
            case 7: {
                zzbn0.zzq(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                zzbn0.zza(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                ((zzdo)object0).zzb(zzbn0);
                return;
            }
            case 10: {
                zzbn0.zzb(((zzdo)object0));
                return;
            }
            case 11: {
                if(object0 instanceof zzbb) {
                    zzbn0.zza(((zzbb)object0));
                    return;
                }
                zzbn0.zzg(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof zzbb) {
                    zzbn0.zza(((zzbb)object0));
                    return;
                }
                zzbn0.zzd(((byte[])object0), 0, ((byte[])object0).length);
                return;
            }
            case 13: {
                zzbn0.zzo(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                zzbn0.zzq(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                zzbn0.zzd(((long)(((Long)object0))));
                return;
            }
            case 16: {
                zzbn0.zzp(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                zzbn0.zzc(((long)(((Long)object0))));
                return;
            }
            case 18: {
                if(object0 instanceof zzcj) {
                    zzbn0.zzn(((zzcj)object0).zzc());
                    return;
                }
                zzbn0.zzn(((int)(((Integer)object0))));
            }
        }
    }

    private final void zza(zzca zzca0, Object object0) {
        if(zzca0.zzaw()) {
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
                zzby.zza(zzca0.zzau(), object1);
            }
            object0 = arrayList0;
        }
        else {
            zzby.zza(zzca0.zzau(), object0);
        }
        if(object0 instanceof zzcr) {
            this.zzgv = true;
        }
        this.zzgt.zza(zzca0, object0);
    }

    private static void zza(zzfl zzfl0, Object object0) {
        zzci.checkNotNull(object0);
        boolean z = true;
        boolean z1 = false;
        switch(zzbz.zzgx[zzfl0.zzek().ordinal()]) {
            case 1: {
                z1 = object0 instanceof Integer;
                break;
            }
            case 2: {
                z1 = object0 instanceof Long;
                break;
            }
            case 3: {
                z1 = object0 instanceof Float;
                break;
            }
            case 4: {
                z1 = object0 instanceof Double;
                break;
            }
            case 5: {
                z1 = object0 instanceof Boolean;
                break;
            }
            case 6: {
                z1 = object0 instanceof String;
                break;
            }
            case 7: {
                if(!(object0 instanceof zzbb) && !(object0 instanceof byte[])) {
                    z = false;
                }
                z1 = z;
                break;
            }
            case 8: {
                if(!(object0 instanceof Integer) && !(object0 instanceof zzcj)) {
                    z = false;
                }
                z1 = z;
                break;
            }
            case 9: {
                if(!(object0 instanceof zzdo) && !(object0 instanceof zzcr)) {
                    z = false;
                }
                z1 = z;
            }
        }
        if(!z1) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final void zza(zzby zzby0) {
        for(int v = 0; v < zzby0.zzgt.zzdr(); ++v) {
            this.zzc(zzby0.zzgt.zzak(v));
        }
        for(Object object0: zzby0.zzgt.zzds()) {
            this.zzc(((Map.Entry)object0));
        }
    }

    public static zzby zzar() {
        return zzby.zzgw;
    }

    public final int zzas() {
        int v1 = 0;
        for(int v = 0; v < this.zzgt.zzdr(); ++v) {
            Map.Entry map$Entry0 = this.zzgt.zzak(v);
            v1 += zzby.zzb(((zzca)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.zzgt.zzds()) {
            v1 += zzby.zzb(((zzca)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return v1;
    }

    public final int zzat() {
        int v1 = 0;
        for(int v = 0; v < this.zzgt.zzdr(); ++v) {
            v1 += zzby.zzd(this.zzgt.zzak(v));
        }
        for(Object object0: this.zzgt.zzds()) {
            v1 += zzby.zzd(((Map.Entry)object0));
        }
        return v1;
    }

    private static int zzb(zzca zzca0, Object object0) {
        int v = 0;
        zzfl zzfl0 = zzca0.zzau();
        int v1 = zzca0.zzc();
        if(zzca0.zzaw()) {
            if(zzca0.zzax()) {
                for(Object object1: ((List)object0)) {
                    v += zzby.zzb(zzfl0, object1);
                }
                return zzbn.zzr(v1) + v + zzbn.zzz(v);
            }
            for(Object object2: ((List)object0)) {
                v += zzby.zza(zzfl0, v1, object2);
            }
            return v;
        }
        return zzby.zza(zzfl0, v1, object0);
    }

    private static int zzb(zzfl zzfl0, Object object0) {
        switch(zzfl0) {
            case 1: {
                return zzbn.zzb(((double)(((Double)object0))));
            }
            case 2: {
                return zzbn.zzb(((float)(((Float)object0))));
            }
            case 3: {
                return zzbn.zze(((long)(((Long)object0))));
            }
            case 4: {
                return zzbn.zzf(((long)(((Long)object0))));
            }
            case 5: {
                return zzbn.zzs(((int)(((Integer)object0))));
            }
            case 6: {
                return zzbn.zzh(((long)(((Long)object0))));
            }
            case 7: {
                return zzbn.zzv(((int)(((Integer)object0))));
            }
            case 8: {
                return zzbn.zzb(((Boolean)object0).booleanValue());
            }
            case 9: {
                return zzbn.zzd(((zzdo)object0));
            }
            case 10: {
                return object0 instanceof zzcr ? zzbn.zza(((zzcr)object0)) : zzbn.zzc(((zzdo)object0));
            }
            case 11: {
                return object0 instanceof zzbb ? zzbn.zzb(((zzbb)object0)) : zzbn.zzh(((String)object0));
            }
            case 12: {
                return object0 instanceof zzbb ? zzbn.zzb(((zzbb)object0)) : zzbn.zzd(((byte[])object0));
            }
            case 13: {
                return zzbn.zzt(((int)(((Integer)object0))));
            }
            case 14: {
                return zzbn.zzw(((int)(((Integer)object0))));
            }
            case 15: {
                return zzbn.zzi(((long)(((Long)object0))));
            }
            case 16: {
                return zzbn.zzu(((int)(((Integer)object0))));
            }
            case 17: {
                return zzbn.zzg(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof zzcj ? zzbn.zzx(((zzcj)object0).zzc()) : zzbn.zzx(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    private static boolean zzb(Map.Entry map$Entry0) {
        zzca zzca0 = (zzca)map$Entry0.getKey();
        if(zzca0.zzav() == zzfq.zzrf) {
            boolean z = zzca0.zzaw();
            Object object0 = map$Entry0.getValue();
            if(z) {
                Iterator iterator0 = ((List)object0).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object1 = iterator0.next();
                    if(((zzdo)object1).isInitialized()) {
                        continue;
                    }
                    return false;
                }
            }
            if(object0 instanceof zzdo) {
                return ((zzdo)object0).isInitialized();
            }
            if(!(object0 instanceof zzcr)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return true;
        }
        return true;
    }

    private final void zzc(Map.Entry map$Entry0) {
        zzca zzca0 = (zzca)map$Entry0.getKey();
        zzdo zzdo0 = map$Entry0.getValue();
        if(zzdo0 instanceof zzcr) {
            zzdo0 = zzcr.zzbr();
        }
        if(zzca0.zzaw()) {
            ArrayList arrayList0 = this.zza(zzca0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(Object object0: ((List)zzdo0)) {
                arrayList0.add(zzby.zzd(object0));
            }
            this.zzgt.zza(zzca0, arrayList0);
            return;
        }
        if(zzca0.zzav() == zzfq.zzrf) {
            Object object1 = this.zza(zzca0);
            if(object1 == null) {
                Object object2 = zzby.zzd(zzdo0);
                this.zzgt.zza(zzca0, object2);
                return;
            }
            zzdo zzdo1 = object1 instanceof zzdv ? zzca0.zza(((zzdv)object1), ((zzdv)zzdo0)) : zzca0.zza(((zzdo)object1).zzbc(), zzdo0).zzbj();
            this.zzgt.zza(zzca0, zzdo1);
            return;
        }
        Object object3 = zzby.zzd(zzdo0);
        this.zzgt.zza(zzca0, object3);
    }

    private static int zzd(Map.Entry map$Entry0) {
        zzca zzca0 = (zzca)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(zzca0.zzav() == zzfq.zzrf && !zzca0.zzaw() && !zzca0.zzax()) {
            int v = ((zzca)map$Entry0.getKey()).zzc();
            return object0 instanceof zzcr ? zzbn.zzb(v, ((zzcr)object0)) : zzbn.zzd(v, ((zzdo)object0));
        }
        return zzby.zzb(zzca0, object0);
    }

    private static Object zzd(Object object0) {
        if(object0 instanceof zzdv) {
            return ((zzdv)object0).zzci();
        }
        if(object0 instanceof byte[]) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    public final void zzv() {
        if(this.zzgu) {
            return;
        }
        this.zzgt.zzv();
        this.zzgu = true;
    }
}

