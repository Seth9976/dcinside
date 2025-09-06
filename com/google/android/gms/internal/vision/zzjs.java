package com.google.android.gms.internal.vision;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class zzjs extends zzhj implements zzjv, RandomAccess {
    private static final zzjs zza;
    private static final zzjv zzb;
    private final List zzc;

    static {
        zzjs zzjs0 = new zzjs();
        zzjs.zza = zzjs0;
        zzjs0.zzb();
        zzjs.zzb = zzjs0;
    }

    public zzjs() {
        this(10);
    }

    public zzjs(int v) {
        this(new ArrayList(v));
    }

    private zzjs(ArrayList arrayList0) {
        this.zzc = arrayList0;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final void add(int v, Object object0) {
        this.zzc();
        this.zzc.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean add(Object object0) {
        return super.add(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean addAll(int v, Collection collection0) {
        this.zzc();
        if(collection0 instanceof zzjv) {
            collection0 = ((zzjv)collection0).zzd();
        }
        boolean z = this.zzc.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final void clear() {
        this.zzc();
        this.zzc.clear();
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.zzc.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzht) {
            String s = ((zzht)object0).zzb();
            if(((zzht)object0).zzc()) {
                this.zzc.set(v, s);
            }
            return s;
        }
        String s1 = zzjf.zzb(((byte[])object0));
        if(zzjf.zza(((byte[])object0))) {
            this.zzc.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final Object remove(int v) {
        this.zzc();
        Object object0 = this.zzc.remove(v);
        ++this.modCount;
        return zzjs.zza(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final Object set(int v, Object object0) {
        this.zzc();
        return zzjs.zza(this.zzc.set(v, ((String)object0)));
    }

    @Override
    public final int size() {
        return this.zzc.size();
    }

    private static String zza(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzht ? ((zzht)object0).zzb() : zzjf.zzb(((byte[])object0));
    }

    @Override  // com.google.android.gms.internal.vision.zzjl
    public final zzjl zza(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.zzc);
        return new zzjs(arrayList0);
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final void zza(zzht zzht0) {
        this.zzc();
        this.zzc.add(zzht0);
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.vision.zzhj
    public final boolean zza() {
        return super.zza();
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final Object zzb(int v) {
        return this.zzc.get(v);
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.zzc);
    }

    @Override  // com.google.android.gms.internal.vision.zzjv
    public final zzjv zze() {
        return this.zza() ? new zzlz(this) : this;
    }
}

