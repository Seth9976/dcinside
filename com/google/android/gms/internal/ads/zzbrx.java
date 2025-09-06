package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;

final class zzbrx implements DialogInterface.OnClickListener {
    final zzbrz zza;

    zzbrx(zzbrz zzbrz0) {
        this.zza = zzbrz0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Intent intent0 = this.zza.zzb();
        zzs.zzT(this.zza.zzb, intent0);
    }
}

