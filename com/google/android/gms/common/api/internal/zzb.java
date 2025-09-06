package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzb implements Runnable {
    final LifecycleCallback zza;
    final String zzb;
    final zzc zzc;

    zzb(zzc zzc0, LifecycleCallback lifecycleCallback0, String s) {
        this.zza = lifecycleCallback0;
        this.zzb = s;
        this.zzc = zzc0;
        super();
    }

    @Override
    public final void run() {
        zzc zzc0 = this.zzc;
        if(zzc0.zzb > 0) {
            Bundle bundle0 = zzc0.zzc == null ? null : zzc0.zzc.getBundle(this.zzb);
            this.zza.onCreate(bundle0);
        }
        if(this.zzc.zzb >= 2) {
            this.zza.onStart();
        }
        if(this.zzc.zzb >= 3) {
            this.zza.onResume();
        }
        if(this.zzc.zzb >= 4) {
            this.zza.onStop();
        }
        if(this.zzc.zzb >= 5) {
            this.zza.onDestroy();
        }
    }
}

