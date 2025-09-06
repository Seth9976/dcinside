package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import java.util.Collection;

public class a extends g {
    private static final long o = 1L;

    public a(n n0, String s, l l0, Class class0, String s1, Collection collection0) {
        super(n0, s, l0, class0, s1, collection0);
    }

    @Deprecated
    public a(String s, l l0, Class class0, String s1, Collection collection0) {
        super(s, l0, class0, s1, collection0);
    }

    public static a M(n n0, Object object0, String s, Collection collection0) {
        Class class0 = object0 instanceof Class ? ((Class)object0) : object0.getClass();
        a a0 = new a(n0, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", s, class0.getName()), n0.b1(), class0, s, collection0);
        a0.g(object0, s);
        return a0;
    }
}

