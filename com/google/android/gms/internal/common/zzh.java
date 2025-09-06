package com.google.android.gms.internal.common;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;

public class zzh extends Handler {
    private final Looper zza;

    public zzh() {
        this.zza = Looper.getMainLooper();
    }

    public zzh(Looper looper0) {
        super(looper0);
        this.zza = Looper.getMainLooper();
    }

    public zzh(Looper looper0, Handler.Callback handler$Callback0) {
        super(looper0, handler$Callback0);
        this.zza = Looper.getMainLooper();
    }
}

