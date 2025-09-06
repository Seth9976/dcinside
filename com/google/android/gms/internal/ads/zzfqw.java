package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

public class zzfqw extends Handler {
    public zzfqw() {
        Looper.getMainLooper();
    }

    public zzfqw(Looper looper0) {
        super(looper0);
        Looper.getMainLooper();
    }

    @Override  // android.os.Handler
    public final void dispatchMessage(Message message0) {
        this.zza(message0);
    }

    @CallSuper
    protected void zza(Message message0) {
        super.dispatchMessage(message0);
    }
}

