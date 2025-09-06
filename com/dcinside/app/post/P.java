package com.dcinside.app.post;

import com.dcinside.app.util.jl;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

public final class p {
    @l
    @f
    public String a;
    @f
    public boolean b;
    @l
    private final D c;

    public p() {
        this(null, false, 3, null);
    }

    public p(@l String s, boolean z) {
        static final class a extends N implements A3.a {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(0);
            }

            @l
            public final Long invoke() {
                return jl.a.j0();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        }

        L.p(s, "galleryId");
        super();
        this.a = s;
        this.b = z;
        this.c = E.a(a.e);
    }

    public p(String s, boolean z, int v, w w0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            z = false;
        }
        this(s, z);
    }

    public final long a() {
        return ((Number)this.c.getValue()).longValue();
    }
}

