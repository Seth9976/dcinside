package com.google.android.gms.internal.vision;

import j..util.Map.-CC;
import j..util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzef implements Map, Serializable, java.util.Map {
    private static final Map.Entry[] zza;
    private transient zzej zzb;
    private transient zzej zzc;
    private transient zzeb zzd;

    static {
        zzef.zza = new Map.Entry[0];
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public Object compute(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$compute(this, object0, biFunction0);
    }

    @Override  // j$.util.Map
    public Object computeIfAbsent(Object object0, Function function0) {
        return Map.-CC.$default$computeIfAbsent(this, object0, function0);
    }

    @Override  // j$.util.Map
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        return Map.-CC.$default$computeIfPresent(this, object0, biFunction0);
    }

    @Override
    public boolean containsKey(@NullableDecl Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public boolean containsValue(@NullableDecl Object object0) {
        return ((zzeb)this.values()).contains(object0);
    }

    @Override
    public Set entrySet() {
        zzej zzej0 = this.zzb;
        if(zzej0 == null) {
            zzej0 = this.zza();
            this.zzb = zzej0;
        }
        return zzej0;
    }

    @Override
    public boolean equals(@NullableDecl Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof java.util.Map ? this.entrySet().equals(((java.util.Map)object0).entrySet()) : false;
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    public abstract Object get(@NullableDecl Object arg1);

    @Override  // j$.util.Map
    public final Object getOrDefault(@NullableDecl Object object0, @NullableDecl Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    @Override
    public int hashCode() {
        return zzey.zza(((zzej)this.entrySet()));
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Set keySet() {
        zzej zzej0 = this.zzc;
        if(zzej0 == null) {
            zzej0 = this.zzb();
            this.zzc = zzej0;
        }
        return zzej0;
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override
    @Deprecated
    public final Object put(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(java.util.Map map0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return Map.-CC.$default$putIfAbsent(this, object0, object1);
    }

    @Override
    @Deprecated
    public final Object remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        return Map.-CC.$default$remove(this, object0, object1);
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        return Map.-CC.$default$replace(this, object0, object1);
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        return Map.-CC.$default$replace(this, object0, object1, object2);
    }

    @Override  // j$.util.Map
    public void replaceAll(BiFunction biFunction0) {
        Map.-CC.$default$replaceAll(this, biFunction0);
    }

    @Override
    public String toString() {
        int v = this.size();
        if(v < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + v);
        }
        StringBuilder stringBuilder0 = new StringBuilder(((int)Math.min(((long)v) << 3, 0x40000000L)));
        stringBuilder0.append('{');
        boolean z = true;
        for(Object object0: this.entrySet()) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('=');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            z = false;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    @Override
    public Collection values() {
        zzeb zzeb0 = this.zzd;
        if(zzeb0 == null) {
            zzeb0 = this.zzc();
            this.zzd = zzeb0;
        }
        return zzeb0;
    }

    abstract zzej zza();

    abstract zzej zzb();

    abstract zzeb zzc();
}

