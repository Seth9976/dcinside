package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzape {
    private final String zza;
    private final String zzb;

    public zzape(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzape.class == class0 && TextUtils.equals(this.zza, ((zzape)object0).zza) && TextUtils.equals(this.zzb, ((zzape)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + "]";
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

