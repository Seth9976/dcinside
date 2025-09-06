package com.dcinside.app.rx.bus;

import android.content.Context;
import kotlin.jvm.internal.L;
import rx.g;
import y4.l;

public final class c {
    public static final void a(@l Context context0, @l Object object0) {
        L.p(context0, "<this>");
        L.p(object0, "event");
        if(context0 instanceof a) {
            ((a)context0).k(object0);
        }
    }

    public static final g b(Context context0) {
        L.p(context0, "<this>");
        L.y(4, "T");
        return c.c(context0, Object.class);
    }

    @l
    public static final g c(@l Context context0, @l Class class0) {
        L.p(context0, "context");
        L.p(class0, "eventType");
        if(context0 instanceof a) {
            return ((a)context0).e(class0);
        }
        g g0 = g.W1();
        L.o(g0, "empty(...)");
        return g0;
    }
}

