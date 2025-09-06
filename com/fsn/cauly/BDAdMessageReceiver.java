package com.fsn.cauly;

import java.lang.ref.WeakReference;

public class BDAdMessageReceiver {
    public interface BDAdMessageReceiverListener {
        void onReceiveAdMessage(int arg1, Object arg2, Object arg3);
    }

    WeakReference a;

    public BDAdMessageReceiver(BDAdMessageReceiverListener bDAdMessageReceiver$BDAdMessageReceiverListener0) {
        this.a = new WeakReference(bDAdMessageReceiver$BDAdMessageReceiverListener0);
    }

    public void receiveMessage(int v, Object object0, Object object1) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        BDAdMessageReceiverListener bDAdMessageReceiver$BDAdMessageReceiverListener0 = (BDAdMessageReceiverListener)weakReference0.get();
        if(bDAdMessageReceiver$BDAdMessageReceiverListener0 == null) {
            return;
        }
        bDAdMessageReceiver$BDAdMessageReceiverListener0.onReceiveAdMessage(v, object0, object1);
    }
}

