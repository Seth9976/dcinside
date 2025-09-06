package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzan implements DialogInterface.OnClickListener {
    public final AtomicInteger zza;

    public zzan(AtomicInteger atomicInteger0) {
        this.zza = atomicInteger0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.set(v);
    }
}

