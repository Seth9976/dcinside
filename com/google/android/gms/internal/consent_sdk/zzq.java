package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.c.b;
import com.google.android.ump.c.c;
import com.google.android.ump.d;

public final class zzq implements Runnable {
    public final zzu zza;
    public final Activity zzb;
    public final d zzc;
    public final c zzd;
    public final b zze;

    public zzq(zzu zzu0, Activity activity0, d d0, c c$c0, b c$b0) {
        this.zza = zzu0;
        this.zzb = activity0;
        this.zzc = d0;
        this.zzd = c$c0;
        this.zze = c$b0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

