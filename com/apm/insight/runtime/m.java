package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

public class m {
    private static volatile p a;
    private static volatile Handler b;

    static {
    }

    public static p a() {
        if(m.a == null) {
            m.b();
        }
        return m.a;
    }

    private static HandlerThread b() {
        if(m.a == null) {
            Class class0 = m.class;
            synchronized(class0) {
                if(m.a == null) {
                    p p0 = new p("default_npth_thread");
                    m.a = p0;
                    p0.b();
                }
            }
        }
        return m.a.c();
    }
}

