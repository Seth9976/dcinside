package com.google.android.gms.internal.ads;

import j..util.List.-CC;
import j..util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import o3.a;

public abstract class zzfxn extends zzfxi implements List, java.util.List, RandomAccess {
    private static final zzfzu zza;
    public static final int zzd;

    static {
        zzfxn.zza = new zzfxl(zzfyz.zza, 0);
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

    @Override  // com.google.android.gms.internal.ads.zzfxi
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
                            if(!zzfuk.zza(this.get(v1), ((java.util.List)object0).get(v1))) {
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
                            if(zzfuk.zza(object1, object2)) {
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

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final Iterator iterator() {
        return this.zzu(0);
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
        return this.zzu(0);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return this.zzu(v);
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

    @Override  // com.google.android.gms.internal.ads.zzfxi
    int zza(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v + v2] = this.get(v2);
        }
        return v + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    @Deprecated
    public final zzfxn zzd() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public final zzfzt zze() {
        return this.zzu(0);
    }

    public zzfxn zzh(int v, int v1) {
        zzfun.zzk(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? zzfyz.zza : new zzfxm(this, v, v2);
    }

    public static zzfxk zzi(int v) {
        zzfwk.zza(v, "expectedSize");
        return new zzfxk(v);
    }

    static zzfxn zzj(Object[] arr_object, int v) {
        return v == 0 ? zzfyz.zza : new zzfyz(arr_object, v);
    }

    public static zzfxn zzk(Iterable iterable0) {
        iterable0.getClass();
        return zzfxn.zzl(((Collection)iterable0));
    }

    public static zzfxn zzl(Collection collection0) {
        if(collection0 instanceof zzfxi) {
            zzfxn zzfxn0 = ((zzfxi)collection0).zzd();
            if(zzfxn0.zzf()) {
                Object[] arr_object = zzfxn0.toArray();
                return zzfxn.zzj(arr_object, arr_object.length);
            }
            return zzfxn0;
        }
        Object[] arr_object1 = collection0.toArray();
        zzfyx.zzb(arr_object1, arr_object1.length);
        return zzfxn.zzj(arr_object1, arr_object1.length);
    }

    public static zzfxn zzm(Object[] arr_object) {
        if(arr_object.length == 0) {
            return zzfyz.zza;
        }
        Object[] arr_object1 = (Object[])arr_object.clone();
        zzfyx.zzb(arr_object1, arr_object1.length);
        return zzfxn.zzj(arr_object1, arr_object1.length);
    }

    public static zzfxn zzn() {
        return zzfyz.zza;
    }

    public static zzfxn zzo(Object object0) {
        Object[] arr_object = {object0};
        zzfyx.zzb(arr_object, 1);
        return zzfxn.zzj(arr_object, 1);
    }

    public static zzfxn zzp(Object object0, Object object1) {
        Object[] arr_object = {object0, object1};
        zzfyx.zzb(arr_object, 2);
        return zzfxn.zzj(arr_object, 2);
    }

    public static zzfxn zzq(Object object0, Object object1, Object object2) {
        Object[] arr_object = {object0, object1, object2};
        zzfyx.zzb(arr_object, 3);
        return zzfxn.zzj(arr_object, 3);
    }

    public static zzfxn zzr(Object object0, Object object1, Object object2, Object object3, Object object4) {
        Object[] arr_object = {object0, object1, object2, object3, object4};
        zzfyx.zzb(arr_object, 5);
        return zzfxn.zzj(arr_object, 5);
    }

    public static zzfxn zzs(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        Object[] arr_object = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfyx.zzb(arr_object, 6);
        return zzfxn.zzj(arr_object, 6);
    }

    @SafeVarargs
    public static zzfxn zzt(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object[] arr_object) {
        Object[] arr_object1 = new Object[arr_object.length + 12];
        arr_object1[0] = object0;
        arr_object1[1] = object1;
        arr_object1[2] = object2;
        arr_object1[3] = object3;
        arr_object1[4] = object4;
        arr_object1[5] = object5;
        arr_object1[6] = object6;
        arr_object1[7] = object7;
        arr_object1[8] = object8;
        arr_object1[9] = object9;
        arr_object1[10] = object10;
        arr_object1[11] = object11;
        System.arraycopy(arr_object, 0, arr_object1, 12, arr_object.length);
        zzfyx.zzb(arr_object1, arr_object.length + 12);
        return zzfxn.zzj(arr_object1, arr_object.length + 12);
    }

    public final zzfzu zzu(int v) {
        zzfun.zzb(v, this.size(), "index");
        return this.isEmpty() ? zzfxn.zza : new zzfxl(this, v);
    }
}

