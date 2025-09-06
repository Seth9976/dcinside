package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class KM extends Handler {
    public interface PjT {
        void PjT(Message arg1);
    }

    protected WeakReference PjT;

    public KM(Looper looper0, PjT kM$PjT0) {
        super(looper0);
        if(kM$PjT0 != null) {
            this.PjT = new WeakReference(kM$PjT0);
        }
    }

    public KM(PjT kM$PjT0) {
        if(kM$PjT0 != null) {
            this.PjT = new WeakReference(kM$PjT0);
        }
    }

    @Override  // android.os.Handler
    public void handleMessage(Message message0) {
        WeakReference weakReference0 = this.PjT;
        if(weakReference0 == null) {
            return;
        }
        PjT kM$PjT0 = (PjT)weakReference0.get();
        if(kM$PjT0 != null && message0 != null) {
            kM$PjT0.PjT(message0);
        }
    }
}

