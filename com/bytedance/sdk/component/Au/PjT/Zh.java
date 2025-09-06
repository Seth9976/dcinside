package com.bytedance.sdk.component.Au.PjT;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import java.lang.ref.WeakReference;

public class Zh extends KM implements ReZ {
    private final HandlerThread Zh;

    Zh(HandlerThread handlerThread0, PjT kM$PjT0) {
        super(handlerThread0.getLooper(), kM$PjT0);
        this.Zh = handlerThread0;
    }

    @Override  // com.bytedance.sdk.component.Au.PjT.ReZ
    public void PjT() {
        this.removeCallbacksAndMessages(null);
        WeakReference weakReference0 = this.PjT;
        if(weakReference0 != null) {
            weakReference0.clear();
            this.PjT = null;
        }
    }

    public void PjT(PjT kM$PjT0) {
        this.PjT = new WeakReference(kM$PjT0);
    }

    public void Zh() {
        HandlerThread handlerThread0 = this.Zh;
        if(handlerThread0 != null) {
            handlerThread0.quit();
        }
    }
}

