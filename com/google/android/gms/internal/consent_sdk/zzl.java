package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.a;
import com.google.android.ump.d;

final class zzl {
    private final Application zza;
    private final zzap zzb;

    zzl(Application application0, zzap zzap0) {
        this.zza = application0;
        this.zzb = zzap0;
    }

    final zzci zzc(Activity activity0, d d0) throws zzg {
        a a0 = d0.a();
        if(a0 == null) {
            a0 = new com.google.android.ump.a.a(this.zza).b();
        }
        return zzn.zza(new zzn(this, activity0, a0, d0, null));
    }
}

