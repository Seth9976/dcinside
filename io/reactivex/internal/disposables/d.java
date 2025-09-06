package io.reactivex.internal.disposables;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.e;
import io.reactivex.internal.functions.b;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public enum d implements c {
    DISPOSED;

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return true;
    }

    public static boolean b(AtomicReference atomicReference0) {
        c c0 = (c)atomicReference0.get();
        d d0 = d.a;
        if(c0 != d0) {
            c c1 = (c)atomicReference0.getAndSet(d0);
            if(c1 != d0) {
                if(c1 != null) {
                    c1.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean c(c c0) {
        return c0 == d.a;
    }

    public static boolean d(AtomicReference atomicReference0, c c0) {
        do {
            c c1 = (c)atomicReference0.get();
            if(c1 == d.a) {
                if(c0 != null) {
                    c0.dispose();
                }
                return false;
            }
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, c1, c0));
        return true;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
    }

    public static void e() {
        a.Y(new e("Disposable already set!"));
    }

    public static boolean f(AtomicReference atomicReference0, c c0) {
        c c1;
        do {
            c1 = (c)atomicReference0.get();
            if(c1 == d.a) {
                if(c0 != null) {
                    c0.dispose();
                }
                return false;
            }
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, c1, c0));
        if(c1 != null) {
            c1.dispose();
        }
        return true;
    }

    public static boolean g(AtomicReference atomicReference0, c c0) {
        b.g(c0, "d is null");
        if(!androidx.compose.animation.core.d.a(atomicReference0, null, c0)) {
            c0.dispose();
            if(atomicReference0.get() != d.a) {
                d.e();
            }
            return false;
        }
        return true;
    }

    public static boolean h(AtomicReference atomicReference0, c c0) {
        if(!androidx.compose.animation.core.d.a(atomicReference0, null, c0)) {
            if(atomicReference0.get() == d.a) {
                c0.dispose();
            }
            return false;
        }
        return true;
    }

    public static boolean i(c c0, c c1) {
        if(c1 == null) {
            a.Y(new NullPointerException("next is null"));
            return false;
        }
        if(c0 != null) {
            c1.dispose();
            d.e();
            return false;
        }
        return true;
    }
}

