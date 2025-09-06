package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzebn implements DialogInterface.OnCancelListener {
    public final zzm zza;

    public zzebn(zzm zzm0) {
        this.zza = zzm0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        zzm zzm0 = this.zza;
        if(zzm0 != null) {
            zzm0.zzb();
        }
    }
}

