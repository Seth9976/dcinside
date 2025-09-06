package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class zzaq implements DialogInterface.OnCancelListener {
    public final zzau zza;

    public zzaq(zzau zzau0) {
        this.zza = zzau0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.zza.zzr();
    }
}

