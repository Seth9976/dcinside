package com.google.android.gms.internal.clearcut;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class zzcw extends zzav implements zzcx, RandomAccess {
    private static final zzcw zzlq;
    private static final zzcx zzlr;
    private final List zzls;

    static {
        zzcw zzcw0 = new zzcw();
        zzcw.zzlq = zzcw0;
        zzcw0.zzv();
        zzcw.zzlr = zzcw0;
    }

    public zzcw() {
        this(10);
    }

    public zzcw(int v) {
        this(new ArrayList(v));
    }

    private zzcw(ArrayList arrayList0) {
        this.zzls = arrayList0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void add(int v, Object object0) {
        this.zzw();
        this.zzls.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean addAll(int v, Collection collection0) {
        this.zzw();
        if(collection0 instanceof zzcx) {
            collection0 = ((zzcx)collection0).zzbt();
        }
        boolean z = this.zzls.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void clear() {
        this.zzw();
        this.zzls.clear();
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.zzls.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzbb) {
            String s = ((zzbb)object0).zzz();
            if(((zzbb)object0).zzaa()) {
                this.zzls.set(v, s);
            }
            return s;
        }
        String s1 = zzci.zzf(((byte[])object0));
        if(zzci.zze(((byte[])object0))) {
            this.zzls.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcx
    public final Object getRaw(int v) {
        return this.zzls.get(v);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object remove(int v) {
        this.zzw();
        Object object0 = this.zzls.remove(v);
        ++this.modCount;
        return zzcw.zze(object0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object set(int v, Object object0) {
        this.zzw();
        return zzcw.zze(this.zzls.set(v, ((String)object0)));
    }

    @Override
    public final int size() {
        return this.zzls.size();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcx
    public final List zzbt() {
        return DesugarCollections.unmodifiableList(this.zzls);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcx
    public final zzcx zzbu() {
        return this.zzu() ? new zzfa(this) : this;
    }

    private static String zze(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzbb ? ((zzbb)object0).zzz() : zzci.zzf(((byte[])object0));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcn
    public final zzcn zzi(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.zzls);
        return new zzcw(arrayList0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final boolean zzu() {
        return super.zzu();
    }
}

