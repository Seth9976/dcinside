package com.dcinside.app.post;

import com.dcinside.app.type.o;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface n {
    public static final class a {
        static final a a;

        static {
            a.a = new a();
        }

        @l
        public final o a(@l Object object0) {
            L.p(object0, "any");
            if(object0 instanceof n) {
                o o0 = ((n)object0).x();
                return o0 == null ? o.b : o0;
            }
            return o.b;
        }
    }

    @l
    public static final a y1;

    static {
        n.y1 = a.a;
    }

    @m
    o x();
}

