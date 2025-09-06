package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class zzcxn extends zzdbj implements zzbif {
    private final Bundle zzb;

    zzcxn(Set set0) {
        super(set0);
        this.zzb = new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbif
    public final void zza(String s, Bundle bundle0) {
        synchronized(this) {
            this.zzb.putAll(bundle0);
            this.zzq(new zzcxm());
        }
    }

    public final Bundle zzb() {
        synchronized(this) {
            return new Bundle(this.zzb);
        }
    }
}

