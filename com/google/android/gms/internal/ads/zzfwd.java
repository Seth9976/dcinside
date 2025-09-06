package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import o3.a;

class zzfwd extends AbstractCollection {
    final Object zza;
    Collection zzb;
    @a
    final zzfwd zzc;
    @a
    final Collection zzd;
    final zzfwg zze;

    zzfwd(zzfwg zzfwg0, Object object0, @a Collection collection0, zzfwd zzfwd0) {
        this.zze = zzfwg0;
        super();
        this.zza = object0;
        this.zzb = collection0;
        this.zzc = zzfwd0;
        this.zzd = zzfwd0 == null ? null : zzfwd0.zzb;
    }

    @Override
    public final boolean add(Object object0) {
        this.zzb();
        boolean z = this.zzb.isEmpty();
        boolean z1 = this.zzb.add(object0);
        if(z1) {
            ++this.zze.zzb;
            if(z) {
                this.zza();
                return true;
            }
        }
        return z1;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.size();
        boolean z = this.zzb.addAll(collection0);
        if(z) {
            this.zze.zzb += this.zzb.size() - v;
            if(v == 0) {
                this.zza();
                return true;
            }
        }
        return z;
    }

    @Override
    public final void clear() {
        int v = this.size();
        if(v == 0) {
            return;
        }
        this.zzb.clear();
        this.zze.zzb -= v;
        this.zzc();
    }

    @Override
    public final boolean contains(@a Object object0) {
        this.zzb();
        return this.zzb.contains(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        this.zzb();
        return this.zzb.containsAll(collection0);
    }

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        this.zzb();
        return this.zzb.equals(object0);
    }

    @Override
    public final int hashCode() {
        this.zzb();
        return this.zzb.hashCode();
    }

    @Override
    public final Iterator iterator() {
        this.zzb();
        return new zzfwc(this);
    }

    @Override
    public final boolean remove(@a Object object0) {
        this.zzb();
        boolean z = this.zzb.remove(object0);
        if(z) {
            --this.zze.zzb;
            this.zzc();
        }
        return z;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.size();
        boolean z = this.zzb.removeAll(collection0);
        if(z) {
            this.zze.zzb += this.zzb.size() - v;
            this.zzc();
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        collection0.getClass();
        int v = this.size();
        boolean z = this.zzb.retainAll(collection0);
        if(z) {
            this.zze.zzb += this.zzb.size() - v;
            this.zzc();
        }
        return z;
    }

    @Override
    public final int size() {
        this.zzb();
        return this.zzb.size();
    }

    @Override
    public final String toString() {
        this.zzb();
        return this.zzb.toString();
    }

    final void zza() {
        zzfwd zzfwd0 = this.zzc;
        if(zzfwd0 != null) {
            zzfwd0.zza();
            return;
        }
        this.zze.zza.put(this.zza, this.zzb);
    }

    final void zzb() {
        zzfwd zzfwd0 = this.zzc;
        if(zzfwd0 != null) {
            zzfwd0.zzb();
            if(this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        }
        else if(this.zzb.isEmpty()) {
            Collection collection0 = (Collection)this.zze.zza.get(this.zza);
            if(collection0 != null) {
                this.zzb = collection0;
            }
        }
    }

    final void zzc() {
        zzfwd zzfwd0 = this.zzc;
        if(zzfwd0 != null) {
            zzfwd0.zzc();
            return;
        }
        if(this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }
}

