package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class zzax implements Runnable {
    final Context zza;
    final String zzb;
    final boolean zzc;
    final boolean zzd;

    zzax(zzay zzay0, Context context0, String s, boolean z, boolean z1) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = z;
        this.zzd = z1;
        super();
    }

    @Override
    public final void run() {
        AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zza);
        alertDialog$Builder0.setMessage(this.zzb);
        if(this.zzc) {
            alertDialog$Builder0.setTitle("Error");
        }
        else {
            alertDialog$Builder0.setTitle("Info");
        }
        if(this.zzd) {
            alertDialog$Builder0.setNeutralButton("Dismiss", null);
        }
        else {
            alertDialog$Builder0.setPositiveButton("Learn More", new zzaw(this, this.zza));
            alertDialog$Builder0.setNegativeButton("Dismiss", null);
        }
        alertDialog$Builder0.create().show();
    }
}

