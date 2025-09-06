package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class h {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final h a(JSONObject jSONObject0) {
            o o0;
            L.p(jSONObject0, "json");
            String s = q.e(jSONObject0, "module");
            String s1 = q.e(jSONObject0, "type");
            String s2 = q.e(jSONObject0, "value");
            Long long0 = q.d(jSONObject0, "thread_id");
            JSONObject jSONObject1 = jSONObject0.optJSONObject("stacktrace");
            if(jSONObject1 == null) {
                o0 = null;
            }
            else {
                L.o(jSONObject1, "optJSONObject(key)");
                o0 = o.b.a(jSONObject1);
            }
            JSONObject jSONObject2 = jSONObject0.optJSONObject("mechanism");
            if(jSONObject2 != null) {
                L.o(jSONObject2, "optJSONObject(key)");
                return new h(s, s1, s2, long0, o0, i.c.a(jSONObject2));
            }
            return new h(s, s1, s2, long0, o0, null);
        }
    }

    private String a;
    private String b;
    private String c;
    private Long d;
    private o e;
    private i f;
    public static final a g;

    static {
        h.g = new a(null);
    }

    public h(String s, String s1, String s2, Long long0, o o0, i i0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = long0;
        this.e = o0;
        this.f = i0;
    }

    public h(String s, String s1, String s2, Long long0, o o0, i i0, int v, w w0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? long0 : null), ((v & 16) == 0 ? o0 : null), ((v & 0x20) == 0 ? i0 : null));
    }

    public final Long a() {
        return this.d;
    }

    public final void a(i i0) {
        this.f = i0;
    }

    public final void a(o o0) {
        this.e = o0;
    }

    public final void a(Long long0) {
        this.d = long0;
    }

    public final void a(String s) {
        this.a = s;
    }

    public final i b() {
        return this.f;
    }

    public final void b(String s) {
        this.b = s;
    }

    public final JSONObject c() {
        JSONObject jSONObject0 = null;
        JSONObject jSONObject1 = new JSONObject().putOpt("module", this.a).putOpt("type", this.b).putOpt("value", this.c).putOpt("thread_id", this.d).putOpt("stacktrace", (this.e == null ? null : this.e.a()));
        i i0 = this.f;
        if(i0 != null) {
            jSONObject0 = i0.a();
        }
        JSONObject jSONObject2 = jSONObject1.putOpt("mechanism", jSONObject0);
        L.o(jSONObject2, "JSONObject()\n           …echanism?.toJsonObject())");
        return jSONObject2;
    }

    public final void c(String s) {
        this.c = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(!L.g(this.a, ((h)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((h)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((h)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((h)object0).d)) {
            return false;
        }
        return L.g(this.e, ((h)object0).e) ? L.g(this.f, ((h)object0).f) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        i i0 = this.f;
        if(i0 != null) {
            v = i0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixException(module=" + this.a + ", type=" + this.b + ", value=" + this.c + ", threadId=" + this.d + ", stacktrace=" + this.e + ", mechanism=" + this.f + ')';
    }
}

