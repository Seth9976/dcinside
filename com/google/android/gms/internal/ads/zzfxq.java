package com.google.android.gms.internal.ads;

import j..util.Map.-CC;
import j..util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import o3.a;

public abstract class zzfxq implements Map, Serializable, java.util.Map {
    @a
    private transient zzfxs zza;
    @a
    private transient zzfxs zzb;
    @a
    private transient zzfxi zzc;

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
    public final boolean containsKey(@a Object object0) {
        return this.get(object0) != null;
    }

    @Override
    public final boolean containsValue(@a Object object0) {
        return this.zzb().contains(object0);
    }

    @Override
    public final Set entrySet() {
        return this.zzh();
    }

    @Override
    public final boolean equals(@a Object object0) {
        return zzfyk.zzb(this, object0);
    }

    @Override  // j$.util.Map
    public void forEach(BiConsumer biConsumer0) {
        Map.-CC.$default$forEach(this, biConsumer0);
    }

    @Override
    @a
    public abstract Object get(@a Object arg1);

    @Override  // j$.util.Map
    @a
    public final Object getOrDefault(@a Object object0, @a Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    @Override
    public final int hashCode() {
        return zzfzp.zza(this.zzh());
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Set keySet() {
        return this.zzi();
    }

    @Override  // j$.util.Map
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return Map.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override
    @Deprecated
    @a
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
    @a
    public final Object remove(@a Object object0) {
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
    public final String toString() {
        int v = this.size();
        zzfwk.zza(v, "size");
        StringBuilder stringBuilder0 = new StringBuilder(((int)Math.min(((long)v) * 8L, 0x40000000L)));
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
    public final Collection values() {
        return this.zzb();
    }

    abstract zzfxi zza();

    public final zzfxi zzb() {
        zzfxi zzfxi0 = this.zzc;
        if(zzfxi0 == null) {
            zzfxi0 = this.zza();
            this.zzc = zzfxi0;
        }
        return zzfxi0;
    }

    public static zzfxq zzc(java.util.Map map0) {
        Set set0 = map0.entrySet();
        zzfxp zzfxp0 = new zzfxp((set0 instanceof Collection ? set0.size() : 4));
        zzfxp0.zzb(set0);
        return zzfxp0.zzc();
    }

    public static zzfxq zzd() {
        return zzfze.zza;
    }

    public static zzfxq zze(Object object0, Object object1) {
        zzfwk.zzb("dialog_not_shown_reason", object1);
        return zzfze.zzj(1, new Object[]{"dialog_not_shown_reason", object1}, null);
    }

    abstract zzfxs zzf();

    abstract zzfxs zzg();

    public final zzfxs zzh() {
        zzfxs zzfxs0 = this.zza;
        if(zzfxs0 == null) {
            zzfxs0 = this.zzf();
            this.zza = zzfxs0;
        }
        return zzfxs0;
    }

    public final zzfxs zzi() {
        zzfxs zzfxs0 = this.zzb;
        if(zzfxs0 == null) {
            zzfxs0 = this.zzg();
            this.zzb = zzfxs0;
        }
        return zzfxs0;
    }
}

