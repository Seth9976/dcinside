package k;

import codes.side.andcolorpicker.model.b;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import y4.l;

public final class d {
    private static final HashMap a;
    @l
    public static final d b;

    static {
        d d0 = new d();
        d.b = d0;
        d.a = new HashMap();
        g g0 = new g();
        d0.b(b.a, g0);
        f f0 = new f();
        d0.b(b.c, f0);
        i i0 = new i();
        d0.b(b.b, i0);
        h h0 = new h();
        d0.b(b.d, h0);
    }

    @l
    public final a a(@l b b0) {
        L.p(b0, "key");
        Object object0 = d.a.get(b0);
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return (a)object0;
    }

    public final void b(@l b b0, @l a a0) {
        L.p(b0, "key");
        L.p(a0, "converter");
        d.a.put(b0, a0);
    }
}

