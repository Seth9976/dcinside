package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzccx implements Iterable {
    private final List zza;

    public zzccx() {
        this.zza = new ArrayList();
    }

    @Override
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    @Nullable
    final zzccw zza(zzcbs zzcbs0) {
        for(Object object0: this) {
            zzccw zzccw0 = (zzccw)object0;
            if(zzccw0.zza == zzcbs0) {
                return zzccw0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void zzb(zzccw zzccw0) {
        this.zza.add(zzccw0);
    }

    public final void zzc(zzccw zzccw0) {
        this.zza.remove(zzccw0);
    }

    public final boolean zzd(zzcbs zzcbs0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this) {
            zzccw zzccw0 = (zzccw)object0;
            if(zzccw0.zza == zzcbs0) {
                arrayList0.add(zzccw0);
            }
        }
        if(arrayList0.isEmpty()) {
            return false;
        }
        for(Object object1: arrayList0) {
            ((zzccw)object1).zzb.zzf();
        }
        return true;
    }
}

