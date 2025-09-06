package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzeb extends AbstractCollection implements Serializable {
    private static final Object[] zza;

    static {
        zzeb.zza = new Object[0];
    }

    @Override
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(@NullableDecl Object arg1);

    @Override
    public Iterator iterator() {
        return this.zza();
    }

    @Override
    @Deprecated
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(zzeb.zza);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        zzde.zza(arr_object);
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.zzb();
            if(arr_object1 != null) {
                return Arrays.copyOfRange(arr_object1, this.zzc(), this.zzd(), arr_object.getClass());
            }
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.zza(arr_object, 0);
        return arr_object;
    }

    int zza(Object[] arr_object, int v) {
        zzfa zzfa0 = (zzfa)this.iterator();
        while(zzfa0.hasNext()) {
            Object object0 = zzfa0.next();
            arr_object[v] = object0;
            ++v;
        }
        return v;
    }

    public abstract zzfa zza();

    @NullableDecl
    Object[] zzb() {
        return null;
    }

    int zzc() {
        throw new UnsupportedOperationException();
    }

    int zzd() {
        throw new UnsupportedOperationException();
    }

    // 去混淆评级： 低(20)
    public zzee zze() {
        return this.isEmpty() ? zzee.zzg() : zzee.zza(this.toArray());
    }

    abstract boolean zzf();
}

