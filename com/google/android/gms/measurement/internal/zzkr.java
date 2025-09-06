package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzkr implements zzor {
    private final zzjq zza;

    zzkr(zzjq zzjq0) {
        this.zza = zzjq0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zzor
    public final void zza(String s, String s1, Bundle bundle0) {
        if(!TextUtils.isEmpty(s)) {
            this.zza.zza("auto", s1, bundle0, s);
            return;
        }
        this.zza.zzb("auto", s1, bundle0);
    }
}

