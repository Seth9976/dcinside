package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzee extends zzeb implements List, RandomAccess {
    private static final zzez zza;

    static {
        zzee.zza = new zzed(zzep.zza, 0);
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

    @Override  // com.google.android.gms.internal.vision.zzeb
    public boolean contains(@NullableDecl Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean equals(@NullableDecl Object object0) {
        if(object0 == zzde.zza(this)) {
            return true;
        }
        if(object0 instanceof List) {
            int v = this.size();
            if(v == ((List)object0).size()) {
                if(((List)object0) instanceof RandomAccess) {
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(!zzcz.zza(this.get(v1), ((List)object0).get(v1))) {
                            return false;
                        }
                    }
                    return true;
                }
                else {
                    int v2 = this.size();
                    Iterator iterator0 = ((List)object0).iterator();
                    int v3 = 0;
                    while(v3 < v2) {
                        if(!iterator0.hasNext()) {
                            return false;
                        }
                        Object object1 = this.get(v3);
                        ++v3;
                        Object object2 = iterator0.next();
                        if(!zzcz.zza(object1, object2)) {
                            return false;
                        }
                    }
                    return !iterator0.hasNext();
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.size();
        int v1 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + this.get(v2).hashCode();
        }
        return v1;
    }

    @Override
    public int indexOf(@NullableDecl Object object0) {
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

    @Override  // com.google.android.gms.internal.vision.zzeb
    public Iterator iterator() {
        return this.zza();
    }

    @Override
    public int lastIndexOf(@NullableDecl Object object0) {
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
    public ListIterator listIterator() {
        return (zzez)this.listIterator(0);
    }

    @Override
    public ListIterator listIterator(int v) {
        zzde.zzb(v, this.size());
        return this.isEmpty() ? zzee.zza : new zzed(this, v);
    }

    @Override
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int v, int v1) {
        return this.zza(v, v1);
    }

    public static zzee zza(Object object0) {
        Object[] arr_object = {object0};
        for(int v = 0; v <= 0; ++v) {
            zzeq.zza(arr_object[0], 0);
        }
        return zzee.zzb(arr_object, 1);
    }

    static zzee zza(Object[] arr_object) {
        return zzee.zzb(arr_object, arr_object.length);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    int zza(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v + v2] = this.get(v2);
        }
        return v + v1;
    }

    public zzee zza(int v, int v1) {
        zzde.zza(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? zzep.zza : new zzeg(this, v, v2);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final zzfa zza() {
        return (zzez)this.listIterator();
    }

    static zzee zzb(Object[] arr_object, int v) {
        return v == 0 ? zzep.zza : new zzep(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final zzee zze() {
        return this;
    }

    public static zzee zzg() {
        return zzep.zza;
    }
}

