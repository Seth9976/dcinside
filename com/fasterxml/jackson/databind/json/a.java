package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.json.e;
import com.fasterxml.jackson.core.json.g;
import com.fasterxml.jackson.core.k.b;
import com.fasterxml.jackson.databind.cfg.s;
import com.fasterxml.jackson.databind.x;

public class a extends x {
    public static class com.fasterxml.jackson.databind.json.a.a extends s {
        public com.fasterxml.jackson.databind.json.a.a(a a0) {
            super(a0);
        }

        public com.fasterxml.jackson.databind.json.a.a E0(e e0, boolean z) {
            if(z) {
                ((a)this.a).e1(new com.fasterxml.jackson.core.n.a[]{e0.f()});
                return this;
            }
            ((a)this.a).V0(new com.fasterxml.jackson.core.n.a[]{e0.f()});
            return this;
        }

        public com.fasterxml.jackson.databind.json.a.a F0(g g0, boolean z) {
            if(z) {
                ((a)this.a).d1(new b[]{g0.f()});
                return this;
            }
            ((a)this.a).U0(new b[]{g0.f()});
            return this;
        }

        public com.fasterxml.jackson.databind.json.a.a G0(e[] arr_e) {
            for(int v = 0; v < arr_e.length; ++v) {
                ((a)this.a).V0(new com.fasterxml.jackson.core.n.a[]{arr_e[v].f()});
            }
            return this;
        }

        public com.fasterxml.jackson.databind.json.a.a H0(g[] arr_g) {
            for(int v = 0; v < arr_g.length; ++v) {
                ((a)this.a).U0(new b[]{arr_g[v].f()});
            }
            return this;
        }

        public com.fasterxml.jackson.databind.json.a.a I0(e[] arr_e) {
            for(int v = 0; v < arr_e.length; ++v) {
                ((a)this.a).e1(new com.fasterxml.jackson.core.n.a[]{arr_e[v].f()});
            }
            return this;
        }

        public com.fasterxml.jackson.databind.json.a.a J0(g[] arr_g) {
            for(int v = 0; v < arr_g.length; ++v) {
                ((a)this.a).d1(new b[]{arr_g[v].f()});
            }
            return this;
        }
    }

    private static final long r = 1L;

    public a() {
        this(new h());
    }

    public a(h h0) {
        super(h0);
    }

    protected a(a a0) {
        super(a0);
    }

    public boolean A4(e e0) {
        return this.G1(e0.f());
    }

    public boolean B4(g g0) {
        return this.F1(g0.f());
    }

    public com.fasterxml.jackson.databind.json.a.a C4() {
        return new com.fasterxml.jackson.databind.json.a.a(this.z4());
    }

    @Override  // com.fasterxml.jackson.databind.x
    public h h() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.x
    public x t0() {
        return this.z4();
    }

    @Override  // com.fasterxml.jackson.databind.x
    public H version() {
        return com.fasterxml.jackson.databind.cfg.x.a;
    }

    public static com.fasterxml.jackson.databind.json.a.a x4() {
        return new com.fasterxml.jackson.databind.json.a.a(new a());
    }

    public static com.fasterxml.jackson.databind.json.a.a y4(h h0) {
        return new com.fasterxml.jackson.databind.json.a.a(new a(h0));
    }

    public a z4() {
        this.s(a.class);
        return new a(this);
    }
}

