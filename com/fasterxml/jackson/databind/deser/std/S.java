package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.io.e;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.deser.B.a;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;

public class s extends a {
    private static final long c = 1L;

    public s() {
        super(l.class);
    }

    @Override  // com.fasterxml.jackson.databind.deser.B
    public y[] I(g g0) {
        m m0 = g0.h(Integer.TYPE);
        m m1 = g0.h(Long.TYPE);
        return new y[]{s.O("sourceRef", g0.h(Object.class), 0), s.O("byteOffset", m1, 1), s.O("charOffset", m1, 2), s.O("lineNr", m0, 3), s.O("columnNr", m0, 4)};
    }

    private static final int M(Object object0) {
        return object0 == null ? 0 : ((Number)object0).intValue();
    }

    private static final long N(Object object0) {
        return object0 == null ? 0L : ((Number)object0).longValue();
    }

    private static com.fasterxml.jackson.databind.deser.l O(String s, m m0, int v) {
        return com.fasterxml.jackson.databind.deser.l.Y(B.a(s), m0, null, null, null, null, v, null, A.i);
    }

    @Override  // com.fasterxml.jackson.databind.deser.B
    public boolean h() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.deser.B
    public Object x(h h0, Object[] arr_object) {
        return new l(e.r(arr_object[0]), s.N(arr_object[1]), s.N(arr_object[2]), s.M(arr_object[3]), s.M(arr_object[4]));
    }
}

