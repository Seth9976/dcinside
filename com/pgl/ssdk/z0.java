package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

public class z0 extends c1 implements a1 {
    private final HandlerThread b;

    z0(HandlerThread handlerThread0, a c1$a0) {
        super(handlerThread0.getLooper(), c1$a0);
        this.b = handlerThread0;
    }

    public void a(a c1$a0) {
        this.a = new WeakReference(c1$a0);
    }

    public void a(String s) {
        HandlerThread handlerThread0 = this.b;
        if(handlerThread0 != null) {
            handlerThread0.setName(s);
        }
    }
}

