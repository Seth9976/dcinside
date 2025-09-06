package com.google.android.gms.internal.common;

import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.Collection;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.Spliterators;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import o3.a;
import z4.b;

@b
public abstract class zzag extends AbstractCollection implements Collection, Serializable {
    private static final Object[] zza;

    static {
        zzag.zza = new Object[0];
    }

    @Override
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    @Override
    public Iterator iterator() {
        return this.zze();
    }

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    @Override
    @Deprecated
    public final boolean remove(@a Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Collection
    public boolean removeIf(Predicate predicate0) {
        return Collection.-CC.$default$removeIf(this, predicate0);
    }

    @Override
    @Deprecated
    public final boolean retainAll(java.util.Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Collection
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 0x510);
    }

    @Override
    public java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }

    @Override  // j$.util.Collection
    public Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(this.stream());
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(zzag.zza);
    }

    @Override  // j$.util.Collection
    public Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        arr_object.getClass();
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.zzg();
            if(arr_object1 == null) {
                if(arr_object.length != 0) {
                    arr_object = Arrays.copyOf(arr_object, 0);
                }
                arr_object = Arrays.copyOf(arr_object, v);
                this.zza(arr_object, 0);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.zzc(), this.zzb(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.zza(arr_object, 0);
        return arr_object;
    }

    int zza(Object[] arr_object, int v) {
        throw null;
    }

    int zzb() {
        throw null;
    }

    int zzc() {
        throw null;
    }

    public zzak zzd() {
        throw null;
    }

    public abstract zzan zze();

    abstract boolean zzf();

    @a
    Object[] zzg() {
        throw null;
    }
}

