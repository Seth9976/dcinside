package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzlz implements Comparable, Map.Entry {
    private final Comparable zza;
    private Object zzb;
    private final zzlv zzc;

    zzlz(zzlv zzlv0, Comparable comparable0, Object object0) {
        this.zzc = zzlv0;
        super();
        this.zza = comparable0;
        this.zzb = object0;
    }

    zzlz(zzlv zzlv0, Map.Entry map$Entry0) {
        this(zzlv0, ((Comparable)map$Entry0.getKey()), map$Entry0.getValue());
    }

    @Override
    public final int compareTo(Object object0) {
        return ((Comparable)this.getKey()).compareTo(((Comparable)((zzlz)object0).getKey()));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        Object object1 = ((Map.Entry)object0).getKey();
        return zzlz.zza(this.zza, object1) && zzlz.zza(this.zzb, ((Map.Entry)object0).getValue());
    }

    @Override
    public final Object getKey() {
        return this.zza;
    }

    @Override
    public final Object getValue() {
        return this.zzb;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        Object object0 = this.zzb;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final Object setValue(Object object0) {
        this.zzc.zzg();
        Object object1 = this.zzb;
        this.zzb = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.zza + "=" + this.zzb;
    }

    private static boolean zza(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }
}

