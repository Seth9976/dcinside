package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzfqw;

public final class zzf extends zzfqw {
    public zzf(Looper looper0) {
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            super.handleMessage(message0);
        }
        catch(Exception exception0) {
            zzv.zzp().zzw(exception0, "AdMobHandler.handleMessage");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    protected final void zza(Message message0) {
        try {
            super.zza(message0);
        }
        catch(Throwable throwable0) {
            zzs.zzN(zzv.zzp().zzd(), throwable0);
            throw throwable0;
        }
    }
}

