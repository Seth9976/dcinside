package com.google.android.gms.internal.ads;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;

final class zzcfc implements View.OnAttachStateChangeListener {
    final zzbxu zza;
    final zzcff zzb;

    zzcfc(zzcff zzcff0, zzbxu zzbxu0) {
        this.zza = zzbxu0;
        this.zzb = zzcff0;
        super();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        zzcff.zzg(this.zzb, view0, this.zza, 10);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

