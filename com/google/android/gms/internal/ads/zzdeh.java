package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.util.Set;

public final class zzdeh extends zzdbj {
    zzdeh(Set set0) {
        super(set0);
    }

    public final void zza(@Nullable zzbk zzbk0) {
        synchronized(this) {
            this.zzq(new zzdef(zzbk0));
        }
    }

    public final void zzb(@Nullable String s) {
        synchronized(this) {
            this.zzq(new zzdeg(s));
        }
    }
}

