package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

final class zzeb extends zzav {
    private final List zzls;
    private static final zzeb zznf;

    static {
        zzeb zzeb0 = new zzeb();
        zzeb.zznf = zzeb0;
        zzeb0.zzv();
    }

    zzeb() {
        this(new ArrayList(10));
    }

    private zzeb(List list0) {
        this.zzls = list0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final void add(int v, Object object0) {
        this.zzw();
        this.zzls.add(v, object0);
        ++this.modCount;
    }

    @Override
    public final Object get(int v) {
        return this.zzls.get(v);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object remove(int v) {
        this.zzw();
        Object object0 = this.zzls.remove(v);
        ++this.modCount;
        return object0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzav
    public final Object set(int v, Object object0) {
        this.zzw();
        Object object1 = this.zzls.set(v, object0);
        ++this.modCount;
        return object1;
    }

    @Override
    public final int size() {
        return this.zzls.size();
    }

    public static zzeb zzcn() {
        return zzeb.zznf;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcn
    public final zzcn zzi(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.zzls);
        return new zzeb(arrayList0);
    }
}

