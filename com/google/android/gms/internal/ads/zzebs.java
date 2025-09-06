package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzebs implements DialogInterface.OnClickListener {
    public final zzebv zza;
    public final zzm zzb;

    public zzebs(zzebv zzebv0, zzm zzm0) {
        this.zza = zzebv0;
        this.zzb = zzm0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzo(this.zzb, dialogInterface0, v);
    }
}

