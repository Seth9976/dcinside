package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzag implements zzaq {
    private final boolean zza;

    public zzag(Boolean boolean0) {
        if(boolean0 == null) {
            this.zza = false;
            return;
        }
        this.zza = boolean0.booleanValue();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzag ? this.zza == ((zzag)object0).zza : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.zza).hashCode();
    }

    @Override
    public final String toString() {
        return String.valueOf(this.zza);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        if(!"toString".equals(s)) {
            throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.zza), s));
        }
        return new zzas(Boolean.toString(this.zza));
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzag(Boolean.valueOf(this.zza));
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(this.zza);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return this.zza ? 1.0 : 0.0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return Boolean.toString(this.zza);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return null;
    }
}

