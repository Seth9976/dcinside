package com.google.android.gms.internal.consent_sdk;

import j..util.List.-CC;
import j..util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import o3.a;

public abstract class zzdd extends zzda implements List, java.util.List, RandomAccess {
    private static final zzdk zza;
    public static final int zzd;

    static {
        zzdd.zza = new zzdb(zzdg.zza, 0);
    }

    @Override
    @Deprecated
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(@a Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 != this) {
            if(object0 instanceof java.util.List) {
                int v = this.size();
                if(v == ((java.util.List)object0).size()) {
                    if(((java.util.List)object0) instanceof RandomAccess) {
                        for(int v1 = 0; v1 < v; ++v1) {
                            if(!zzcv.zza(this.get(v1), ((java.util.List)object0).get(v1))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    else {
                        Iterator iterator0 = this.iterator();
                        Iterator iterator1 = ((java.util.List)object0).iterator();
                        while(iterator0.hasNext()) {
                            if(!iterator1.hasNext()) {
                                return false;
                            }
                            Object object1 = iterator0.next();
                            Object object2 = iterator1.next();
                            if(zzcv.zza(object1, object2)) {
                                continue;
                            }
                            return false;
                        }
                        return !iterator1.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int v = this.size();
        int v2 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 * 0x1F + this.get(v1).hashCode();
        }
        return v2;
    }

    @Override
    public final int indexOf(@a Object object0) {
        if(object0 == null) {
            return -1;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(object0.equals(this.get(v1))) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    public final Iterator iterator() {
        return this.zzh(0);
    }

    @Override
    public final int lastIndexOf(@a Object object0) {
        if(object0 == null) {
            return -1;
        }
        for(int v = this.size() - 1; v >= 0; --v) {
            if(object0.equals(this.get(v))) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return this.zzh(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzh(v);
    }

    @Override
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.List
    public void replaceAll(UnaryOperator unaryOperator0) {
        List.-CC.$default$replaceAll(this, unaryOperator0);
    }

    @Override
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.List
    public void sort(Comparator comparator0) {
        List.-CC.$default$sort(this, comparator0);
    }

    @Override
    public java.util.List subList(int v, int v1) {
        return this.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    int zza(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.get(v2);
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    public final zzdj zzd() {
        return this.zzh(0);
    }

    public zzdd zzf(int v, int v1) {
        zzcw.zzc(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? zzdg.zza : new zzdc(this, v, v2);
    }

    static zzdd zzg(Object[] arr_object, int v) {
        return v == 0 ? zzdg.zza : new zzdg(arr_object, v);
    }

    public final zzdk zzh(int v) {
        zzcw.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzdd.zza : new zzdb(this, v);
    }
}

