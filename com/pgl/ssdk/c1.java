package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class c1 extends Handler {
    public interface a {
        void a(Message arg1);
    }

    protected WeakReference a;

    public c1(Looper looper0, a c1$a0) {
        super(looper0);
        if(c1$a0 != null) {
            this.a = new WeakReference(c1$a0);
        }
    }

    @Override  // android.os.Handler
    public void handleMessage(Message message0) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return;
        }
        a c1$a0 = (a)weakReference0.get();
        if(c1$a0 != null && message0 != null) {
            c1$a0.a(message0);
        }
    }
}

