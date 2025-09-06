package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.introspect.b;
import com.fasterxml.jackson.databind.introspect.o;
import com.fasterxml.jackson.databind.util.n;

public abstract class h {
    private static final h a;

    static {
        h h0;
        try {
            h0 = (h)com.fasterxml.jackson.databind.util.h.n(i.class, false);
            h.a = h0;
            return;
        }
        catch(IllegalAccessError throwable0) {
            n.c(throwable0);
        }
        catch(Throwable unused_ex) {
        }
        h0 = null;
        h.a = h0;
    }

    public abstract B a(o arg1);

    public abstract Boolean b(b arg1);

    public abstract Boolean c(b arg1);

    public static h d() {
        return h.a;
    }
}

