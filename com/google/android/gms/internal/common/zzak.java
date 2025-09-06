package com.google.android.gms.internal.common;

import j..util.List.-CC;
import j..util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import o3.a;
import z4.b;

@b
public abstract class zzak extends zzag implements List, java.util.List, RandomAccess {
    private static final zzao zza;

    static {
        zzak.zza = new zzai(zzam.zza, 0);
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
                            if(!zzu.zza(this.get(v1), ((java.util.List)object0).get(v1))) {
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
                            if(zzu.zza(object1, object2)) {
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

    @Override  // com.google.android.gms.internal.common.zzag
    public final Iterator iterator() {
        return this.zzo(0);
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
        return this.zzo(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzo(v);
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
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.common.zzag
    int zza(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.get(v2);
        }
        return v1;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    @Deprecated
    public final zzak zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final zzan zze() {
        return this.zzo(0);
    }

    public zzak zzh(int v, int v1) {
        zzv.zzc(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? zzam.zza : new zzaj(this, v, v2);
    }

    static zzak zzi(Object[] arr_object, int v) {
        return v == 0 ? zzam.zza : new zzam(arr_object, v);
    }

    public static zzak zzj(Iterable iterable0) {
        iterable0.getClass();
        if(iterable0 instanceof Collection) {
            return zzak.zzk(((Collection)iterable0));
        }
        Iterator iterator0 = iterable0.iterator();
        if(!iterator0.hasNext()) {
            return zzam.zza;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return zzak.zzm(object0);
        }
        zzah zzah0 = new zzah(4);
        zzah0.zzb(object0);
        zzah0.zzc(iterator0);
        zzah0.zzc = true;
        return zzak.zzi(zzah0.zza, zzah0.zzb);
    }

    public static zzak zzk(Collection collection0) {
        if(collection0 instanceof zzag) {
            zzak zzak0 = ((zzag)collection0).zzd();
            if(zzak0.zzf()) {
                Object[] arr_object = zzak0.toArray();
                return zzak.zzi(arr_object, arr_object.length);
            }
            return zzak0;
        }
        Object[] arr_object1 = collection0.toArray();
        zzal.zza(arr_object1, arr_object1.length);
        return zzak.zzi(arr_object1, arr_object1.length);
    }

    public static zzak zzl() {
        return zzam.zza;
    }

    public static zzak zzm(Object object0) {
        Object[] arr_object = {object0};
        zzal.zza(arr_object, 1);
        return zzak.zzi(arr_object, 1);
    }

    public static zzak zzn(Object object0, Object object1) {
        Object[] arr_object = {object0, object1};
        zzal.zza(arr_object, 2);
        return zzak.zzi(arr_object, 2);
    }

    public final zzao zzo(int v) {
        zzv.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzak.zza : new zzai(this, v);
    }
}

