package com.dcinside.app.ad.util;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class a {
    @m
    private WeakReference a;
    private boolean b;

    public boolean a() {
        return this.b;
    }

    public final void b(@l Function1 function10) {
        L.p(function10, "onFailed");
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.a = new WeakReference(function10);
        this.f();
    }

    public final void c(@m String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            Function1 function10 = (Function1)weakReference0.get();
            if(function10 != null) {
                function10.invoke(s);
            }
        }
    }

    public static void d(a a0, String s, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFailed");
        }
        if((v & 1) != 0) {
            s = null;
        }
        a0.c(s);
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public void i(boolean z) {
        this.b = z;
    }
}

