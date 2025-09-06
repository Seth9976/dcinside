package io.reactivex.internal.util;

import androidx.compose.animation.core.d;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.e;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;

public final class i {
    private i() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String s) {
        return "It is not allowed to subscribe with a(n) " + s + " multiple times. Please create a fresh instance of " + s + " and subscribe that to the target source instead.";
    }

    public static void b(Class class0) {
        a.Y(new e(i.a(class0.getName())));
    }

    public static boolean c(AtomicReference atomicReference0, c c0, Class class0) {
        b.g(c0, "next is null");
        if(!d.a(atomicReference0, null, c0)) {
            c0.dispose();
            if(atomicReference0.get() != io.reactivex.internal.disposables.d.a) {
                i.b(class0);
            }
            return false;
        }
        return true;
    }

    public static boolean d(AtomicReference atomicReference0, org.reactivestreams.e e0, Class class0) {
        b.g(e0, "next is null");
        if(!d.a(atomicReference0, null, e0)) {
            e0.cancel();
            if(atomicReference0.get() != j.a) {
                i.b(class0);
            }
            return false;
        }
        return true;
    }

    public static boolean e(c c0, c c1, Class class0) {
        b.g(c1, "next is null");
        if(c0 != null) {
            c1.dispose();
            if(c0 != io.reactivex.internal.disposables.d.a) {
                i.b(class0);
            }
            return false;
        }
        return true;
    }

    public static boolean f(org.reactivestreams.e e0, org.reactivestreams.e e1, Class class0) {
        b.g(e1, "next is null");
        if(e0 != null) {
            e1.cancel();
            if(e0 != j.a) {
                i.b(class0);
            }
            return false;
        }
        return true;
    }
}

