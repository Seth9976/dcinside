package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

final class zabh extends zau {
    final zabi zaa;

    zabh(zabi zabi0, Looper looper0) {
        this.zaa = zabi0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v = message0.what;
        switch(v) {
            case 1: {
                ((zabg)message0.obj).zab(this.zaa);
                return;
            }
            case 2: {
                throw (RuntimeException)message0.obj;
            }
            default: {
                Log.w("GACStateManager", "Unknown message id: " + v);
            }
        }
    }
}

