package com.facebook.drawee.components;

import android.os.Looper;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class com.facebook.drawee.components.a {
    public interface com.facebook.drawee.components.a.a {
        void release();
    }

    @h
    private static com.facebook.drawee.components.a a;

    static {
    }

    public abstract void a(com.facebook.drawee.components.a.a arg1);

    public static com.facebook.drawee.components.a b() {
        synchronized(com.facebook.drawee.components.a.class) {
            if(com.facebook.drawee.components.a.a == null) {
                com.facebook.drawee.components.a.a = new b();
            }
            return com.facebook.drawee.components.a.a;
        }
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void d(com.facebook.drawee.components.a.a arg1);
}

