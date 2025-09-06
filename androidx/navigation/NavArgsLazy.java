package androidx.navigation;

import A3.a;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.D;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.b;

public final class NavArgsLazy implements D {
    @l
    private final d a;
    @l
    private final a b;
    @m
    private NavArgs c;

    public NavArgsLazy(@l d d0, @l a a0) {
        L.p(d0, "navArgsClass");
        L.p(a0, "argumentProducer");
        super();
        this.a = d0;
        this.b = a0;
    }

    @l
    public NavArgs a() {
        NavArgs navArgs0 = this.c;
        if(navArgs0 == null) {
            Bundle bundle0 = (Bundle)this.b.invoke();
            Method method0 = (Method)NavArgsLazyKt.a().get(this.a);
            if(method0 == null) {
                Class[] arr_class = NavArgsLazyKt.b();
                method0 = b.e(this.a).getMethod("fromBundle", ((Class[])Arrays.copyOf(arr_class, arr_class.length)));
                NavArgsLazyKt.a().put(this.a, method0);
                L.o(method0, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object object0 = method0.invoke(null, bundle0);
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            }
            this.c = (NavArgs)object0;
            return (NavArgs)object0;
        }
        return navArgs0;
    }

    @Override  // kotlin.D
    public Object getValue() {
        return this.a();
    }

    @Override  // kotlin.D
    public boolean isInitialized() {
        return this.c != null;
    }
}

