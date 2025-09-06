package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzebq implements DialogInterface.OnCancelListener {
    public final zzebv zza;
    public final zzm zzb;

    public zzebq(zzebv zzebv0, zzm zzm0) {
        this.zza = zzebv0;
        this.zzb = zzm0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.zza.zzm(this.zzb, dialogInterface0);
    }
}

