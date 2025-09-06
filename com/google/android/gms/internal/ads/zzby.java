package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

public final class zzby {
    public static final zzby zza;
    private final zzfxn zzb;

    static {
        zzby.zza = new zzby(zzfxn.zzn());
    }

    public zzby(List list0) {
        this.zzb = zzfxn.zzl(list0);
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzby.class == class0 ? this.zzb.equals(((zzby)object0).zzb) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfxn zza() {
        return this.zzb;
    }

    public final boolean zzb(int v) {
        for(int v1 = 0; v1 < this.zzb.size(); ++v1) {
            zzbx zzbx0 = (zzbx)this.zzb.get(v1);
            if(zzbx0.zzc() && zzbx0.zza() == v) {
                return true;
            }
        }
        return false;
    }
}

