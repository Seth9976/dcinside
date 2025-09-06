package com.google.android.gms.internal.clearcut;

import java.util.Map.Entry;

final class zzep implements Comparable, Map.Entry {
    private Object value;
    private final zzei zzos;
    private final Comparable zzov;

    zzep(zzei zzei0, Comparable comparable0, Object object0) {
        this.zzos = zzei0;
        super();
        this.zzov = comparable0;
        this.value = object0;
    }

    zzep(zzei zzei0, Map.Entry map$Entry0) {
        this(zzei0, ((Comparable)map$Entry0.getKey()), map$Entry0.getValue());
    }

    @Override
    public final int compareTo(Object object0) {
        return ((Comparable)this.getKey()).compareTo(((Comparable)((zzep)object0).getKey()));
    }

    private static boolean equals(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
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
        return zzep.equals(this.zzov, object1) && zzep.equals(this.value, ((Map.Entry)object0).getValue());
    }

    @Override
    public final Object getKey() {
        return this.zzov;
    }

    @Override
    public final Object getValue() {
        return this.value;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zzov == null ? 0 : this.zzov.hashCode();
        Object object0 = this.value;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final Object setValue(Object object0) {
        this.zzos.zzdu();
        Object object1 = this.value;
        this.value = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.zzov + "=" + this.value;
    }
}

