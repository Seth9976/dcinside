package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzat implements zzaq {
    private final String zza;
    private final ArrayList zzb;

    public zzat(String s, List list0) {
        this.zza = s;
        ArrayList arrayList0 = new ArrayList();
        this.zzb = arrayList0;
        arrayList0.addAll(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzat)) {
            return false;
        }
        String s = this.zza;
        if(s != null) {
            if(!s.equals(((zzat)object0).zza)) {
                return false;
            }
        }
        else if(((zzat)object0).zza != null) {
            return false;
        }
        ArrayList arrayList0 = ((zzat)object0).zzb;
        return this.zzb == null ? arrayList0 == null : this.zzb.equals(arrayList0);
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        ArrayList arrayList0 = this.zzb;
        if(arrayList0 != null) {
            v = arrayList0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return null;
    }
}

