package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o3.a;

class zzfwl extends AbstractCollection {
    final Collection zza;
    final zzfuo zzb;

    zzfwl(Collection collection0, zzfuo zzfuo0) {
        this.zza = collection0;
        this.zzb = zzfuo0;
    }

    @Override
    public final boolean add(Object object0) {
        zzfun.zze(this.zzb.zza(object0));
        return this.zza.add(object0);
    }

    @Override
    public final boolean addAll(Collection collection0) {
        for(Object object0: collection0) {
            zzfun.zze(this.zzb.zza(object0));
        }
        return this.zza.addAll(collection0);
    }

    @Override
    public final void clear() {
        zzfxt.zzb(this.zza, this.zzb);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean contains(@a Object object0) {
        return zzfwm.zza(this.zza, object0) ? this.zzb.zza(object0) : false;
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        zzfuo zzfuo0 = this.zzb;
        Iterator iterator0 = this.zza.iterator();
        zzfun.zzc(zzfuo0, "predicate");
        for(int v = 0; iterator0.hasNext(); ++v) {
            Object object0 = iterator0.next();
            if(zzfuo0.zza(object0)) {
                return v == -1;
            }
        }
        return true;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = this.zza.iterator();
        iterator0.getClass();
        this.zzb.getClass();
        return new zzfxu(iterator0, this.zzb);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean remove(@a Object object0) {
        return this.contains(object0) && this.zza.remove(object0);
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        boolean z = false;
        Iterator iterator0 = this.zza.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(this.zzb.zza(object0) && collection0.contains(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        boolean z = false;
        Iterator iterator0 = this.zza.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(this.zzb.zza(object0) && !collection0.contains(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final int size() {
        int v = 0;
        for(Object object0: this.zza) {
            if(this.zzb.zza(object0)) {
                ++v;
            }
        }
        return v;
    }

    @Override
    public final Object[] toArray() {
        Iterator iterator0 = this.iterator();
        ArrayList arrayList0 = new ArrayList();
        zzfxx.zzc(arrayList0, iterator0);
        return arrayList0.toArray();
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        Iterator iterator0 = this.iterator();
        ArrayList arrayList0 = new ArrayList();
        zzfxx.zzc(arrayList0, iterator0);
        return arrayList0.toArray(arr_object);
    }
}

