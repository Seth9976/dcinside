package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzebo implements DialogInterface.OnClickListener {
    public final zzebv zza;
    public final Activity zzb;
    public final zzm zzc;

    public zzebo(zzebv zzebv0, Activity activity0, zzm zzm0) {
        this.zza = zzebv0;
        this.zzb = activity0;
        this.zzc = zzm0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzk(this.zzb, this.zzc, dialogInterface0, v);
    }
}

