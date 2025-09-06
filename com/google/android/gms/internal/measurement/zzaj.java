package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzaj implements zzaq {
    private final zzaq zza;
    private final String zzb;

    public zzaj() {
        this.zza = zzaq.zzc;
        this.zzb = "return";
    }

    public zzaj(String s) {
        this.zza = zzaq.zzc;
        this.zzb = s;
    }

    public zzaj(String s, zzaq zzaq0) {
        this.zza = zzaq0;
        this.zzb = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzaj ? this.zzb.equals(((zzaj)object0).zzb) && this.zza.equals(((zzaj)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzb.hashCode() * 0x1F + this.zza.hashCode();
    }

    public final zzaq zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzb() [...] // 潜在的解密器

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzaq zzaq0 = this.zza.zzc();
        return new zzaj(this.zzb, zzaq0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return null;
    }
}

