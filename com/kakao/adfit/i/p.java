package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class p {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final p a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            Long long0 = q.d(jSONObject0, "id");
            Integer integer0 = q.c(jSONObject0, "priority");
            String s = q.e(jSONObject0, "name");
            String s1 = q.e(jSONObject0, "state");
            JSONObject jSONObject1 = jSONObject0.optJSONObject("stacktrace");
            if(jSONObject1 != null) {
                L.o(jSONObject1, "optJSONObject(key)");
                return new p(long0, integer0, s, s1, o.b.a(jSONObject1), q.a(jSONObject0, "daemon"), q.a(jSONObject0, "current"), q.a(jSONObject0, "crashed"));
            }
            return new p(long0, integer0, s, s1, null, q.a(jSONObject0, "daemon"), q.a(jSONObject0, "current"), q.a(jSONObject0, "crashed"));
        }
    }

    private Long a;
    private Integer b;
    private String c;
    private String d;
    private o e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    public static final a i;

    static {
        p.i = new a(null);
    }

    public p(Long long0, Integer integer0, String s, String s1, o o0, Boolean boolean0, Boolean boolean1, Boolean boolean2) {
        this.a = long0;
        this.b = integer0;
        this.c = s;
        this.d = s1;
        this.e = o0;
        this.f = boolean0;
        this.g = boolean1;
        this.h = boolean2;
    }

    public p(Long long0, Integer integer0, String s, String s1, o o0, Boolean boolean0, Boolean boolean1, Boolean boolean2, int v, w w0) {
        this(((v & 1) == 0 ? long0 : null), ((v & 2) == 0 ? integer0 : null), ((v & 4) == 0 ? s : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? o0 : null), ((v & 0x20) == 0 ? boolean0 : null), ((v & 0x40) == 0 ? boolean1 : null), ((v & 0x80) == 0 ? boolean2 : null));
    }

    public final Long a() {
        return this.a;
    }

    public final void a(o o0) {
        this.e = o0;
    }

    public final void a(Boolean boolean0) {
        this.h = boolean0;
    }

    public final void a(Integer integer0) {
        this.b = integer0;
    }

    public final void a(Long long0) {
        this.a = long0;
    }

    public final void a(String s) {
        this.c = s;
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject().putOpt("id", this.a).putOpt("priority", this.b).putOpt("name", this.c).putOpt("state", this.d).putOpt("stacktrace", (this.e == null ? null : this.e.a())).putOpt("daemon", this.f).putOpt("current", this.g).putOpt("crashed", this.h);
        L.o(jSONObject0, "JSONObject()\n           …EY_IS_CRASHED, isCrashed)");
        return jSONObject0;
    }

    public final void b(Boolean boolean0) {
        this.g = boolean0;
    }

    public final void b(String s) {
        this.d = s;
    }

    public final void c(Boolean boolean0) {
        this.f = boolean0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(!L.g(this.a, ((p)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((p)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((p)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((p)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((p)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((p)object0).f)) {
            return false;
        }
        return L.g(this.g, ((p)object0).g) ? L.g(this.h, ((p)object0).h) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        Boolean boolean0 = this.h;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixThread(id=" + this.a + ", priority=" + this.b + ", name=" + this.c + ", state=" + this.d + ", stacktrace=" + this.e + ", isDaemon=" + this.f + ", isCurrent=" + this.g + ", isCrashed=" + this.h + ')';
    }
}

