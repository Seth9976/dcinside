package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Message;

public final class zzdi implements Handler.Callback {
    public final zzdn zza;

    public zzdi(zzdn zzdn0) {
        this.zza = zzdn0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        zzdn.zzg(this.zza, message0);
        return true;
    }
}

