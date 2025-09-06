package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzrp extends Handler {
    final zzrr zza;

    zzrp(zzrr zzrr0, Looper looper0) {
        this.zza = zzrr0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        zzrr.zza(this.zza, message0);
    }
}

