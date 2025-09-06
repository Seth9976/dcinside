package com.kakao.adfit.i;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final c a(JSONObject jSONObject0) {
            k k0;
            com.kakao.adfit.i.a a0;
            L.p(jSONObject0, "json");
            JSONObject jSONObject1 = jSONObject0.optJSONObject("app");
            g g0 = null;
            if(jSONObject1 == null) {
                a0 = null;
            }
            else {
                L.o(jSONObject1, "optJSONObject(key)");
                a0 = com.kakao.adfit.i.a.f.a(jSONObject1);
            }
            JSONObject jSONObject2 = jSONObject0.optJSONObject("os");
            if(jSONObject2 == null) {
                k0 = null;
            }
            else {
                L.o(jSONObject2, "optJSONObject(key)");
                k0 = k.f.a(jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject0.optJSONObject("device");
            if(jSONObject3 != null) {
                L.o(jSONObject3, "optJSONObject(key)");
                g0 = g.B.a(jSONObject3);
            }
            return new c(a0, k0, g0);
        }
    }

    private com.kakao.adfit.i.a a;
    private k b;
    private g c;
    public static final a d;

    static {
        c.d = new a(null);
    }

    public c(com.kakao.adfit.i.a a0, k k0, g g0) {
        this.a = a0;
        this.b = k0;
        this.c = g0;
    }

    public c(com.kakao.adfit.i.a a0, k k0, g g0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        if((v & 2) != 0) {
            k0 = null;
        }
        if((v & 4) != 0) {
            g0 = null;
        }
        this(a0, k0, g0);
    }

    public final com.kakao.adfit.i.a a() {
        return this.a;
    }

    public final void a(com.kakao.adfit.i.a a0) {
        this.a = a0;
    }

    public final void a(g g0) {
        this.c = g0;
    }

    public final void a(k k0) {
        this.b = k0;
    }

    public final g b() {
        return this.c;
    }

    public final k c() {
        return this.b;
    }

    public final JSONObject d() {
        JSONObject jSONObject0 = null;
        JSONObject jSONObject1 = new JSONObject().putOpt("app", (this.a == null ? null : this.a.b())).putOpt("os", (this.b == null ? null : this.b.a()));
        g g0 = this.c;
        if(g0 != null) {
            jSONObject0 = g0.a();
        }
        JSONObject jSONObject2 = jSONObject1.putOpt("device", jSONObject0);
        L.o(jSONObject2, "JSONObject()\n           …, device?.toJsonObject())");
        return jSONObject2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(!L.g(this.a, ((c)object0).a)) {
            return false;
        }
        return L.g(this.b, ((c)object0).b) ? L.g(this.c, ((c)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        g g0 = this.c;
        if(g0 != null) {
            v = g0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixContexts(app=" + this.a + ", os=" + this.b + ", device=" + this.c + ')';
    }
}

