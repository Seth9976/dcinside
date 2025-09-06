package com.bytedance.adsdk.ugeno.XX;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class SM extends Handler {
    public interface PjT {
        void PjT(Message arg1);
    }

    private final WeakReference PjT;

    public SM(Looper looper0, PjT sM$PjT0) {
        super(looper0);
        this.PjT = new WeakReference(sM$PjT0);
    }

    @Override  // android.os.Handler
    public void handleMessage(Message message0) {
        PjT sM$PjT0 = (PjT)this.PjT.get();
        if(sM$PjT0 != null && message0 != null) {
            sM$PjT0.PjT(message0);
        }
    }
}

