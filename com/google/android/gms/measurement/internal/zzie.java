package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzie implements Runnable {
    private zzic zza;
    private Bundle zzb;
    private String zzc;

    public zzie(zzic zzic0, Bundle bundle0, String s) {
        this.zza = zzic0;
        this.zzb = bundle0;
        this.zzc = s;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}

