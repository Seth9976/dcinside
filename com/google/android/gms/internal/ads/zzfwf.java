package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import o3.a;

class zzfwf extends zzfwd implements List {
    final zzfwg zzf;

    zzfwf(zzfwg zzfwg0, Object object0, @a List list0, zzfwd zzfwd0) {
        this.zzf = zzfwg0;
        super(zzfwg0, object0, list0, zzfwd0);
    }

    @Override
    public final void add(int v, Object object0) {
        this.zzb();
        boolean z = this.zzb.isEmpty();
        ((List)this.zzb).add(v, object0);
        ++this.zzf.zzb;
        if(z) {
            this.zza();
        }
    }

    @Override
    public final boolean addAll(int v, Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        int v1 = this.size();
        boolean z = ((List)this.zzb).addAll(v, collection0);
        if(z) {
            this.zzf.zzb += this.zzb.size() - v1;
            if(v1 == 0) {
                this.zza();
                return true;
            }
        }
        return z;
    }

    @Override
    public final Object get(int v) {
        this.zzb();
        return ((List)this.zzb).get(v);
    }

    @Override
    public final int indexOf(@a Object object0) {
        this.zzb();
        return ((List)this.zzb).indexOf(object0);
    }

    @Override
    public final int lastIndexOf(@a Object object0) {
        this.zzb();
        return ((List)this.zzb).lastIndexOf(object0);
    }

    @Override
    public final ListIterator listIterator() {
        this.zzb();
        return new zzfwe(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        this.zzb();
        return new zzfwe(this, v);
    }

    @Override
    public final Object remove(int v) {
        this.zzb();
        Object object0 = ((List)this.zzb).remove(v);
        --this.zzf.zzb;
        this.zzc();
        return object0;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.zzb();
        return ((List)this.zzb).set(v, object0);
    }

    @Override
    public final List subList(int v, int v1) {
        this.zzb();
        List list0 = ((List)this.zzb).subList(v, v1);
        zzfwd zzfwd0 = this.zzc;
        if(zzfwd0 == null) {
            zzfwd0 = this;
        }
        return this.zzf.zzh(this.zza, list0, zzfwd0);
    }
}

