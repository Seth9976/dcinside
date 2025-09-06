package com.google.android.gms.ads.internal.overlay;

import android.view.View.OnClickListener;
import android.view.View;

final class zzf implements View.OnClickListener {
    final zzm zza;

    zzf(zzm zzm0) {
        this.zza = zzm0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.zza.zzn = 2;
        this.zza.zzb.finish();
    }
}

