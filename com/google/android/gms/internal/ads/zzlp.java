package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzlp {
    public static final zzlp zza;
    public static final zzlp zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlp zzlp0 = new zzlp(0L, 0L);
        zzlp.zza = zzlp0;
        new zzlp(0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFFFFFFFFFFL);
        new zzlp(0x7FFFFFFFFFFFFFFFL, 0L);
        new zzlp(0L, 0x7FFFFFFFFFFFFFFFL);
        zzlp.zzb = zzlp0;
    }

    public zzlp(long v, long v1) {
        boolean z = false;
        zzcw.zzd(v >= 0L);
        if(v1 >= 0L) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzlp.class == class0 && this.zzc == ((zzlp)object0).zzc && this.zzd == ((zzlp)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zzc) * 0x1F + ((int)this.zzd);
    }
}

