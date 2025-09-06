package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class j extends f {
    @h
    private static j b;

    static {
    }

    private j() {
        super(new Handler(Looper.getMainLooper()));
    }

    @Override  // com.facebook.common.executors.f
    public void execute(Runnable runnable0) {
        if(this.r3()) {
            runnable0.run();
            return;
        }
        super.execute(runnable0);
    }

    public static j f() {
        if(j.b == null) {
            j.b = new j();
        }
        return j.b;
    }
}

