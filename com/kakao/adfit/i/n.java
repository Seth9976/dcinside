package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class n {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final n a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new n(q.e(jSONObject0, "module"), q.e(jSONObject0, "function"), q.e(jSONObject0, "filename"), q.c(jSONObject0, "lineno"), q.a(jSONObject0, "in_app"), q.a(jSONObject0, "native"));
        }
    }

    private String a;
    private String b;
    private String c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    public static final a g;

    static {
        n.g = new a(null);
    }

    public n(String s, String s1, String s2, Integer integer0, Boolean boolean0, Boolean boolean1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = integer0;
        this.e = boolean0;
        this.f = boolean1;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("module", this.a).putOpt("function", this.b).putOpt("filename", this.c).putOpt("lineno", this.d).putOpt("in_app", this.e).putOpt("native", this.f);
        L.o(jSONObject0, "JSONObject()\n           …(KEY_IS_NATIVE, isNative)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(!L.g(this.a, ((n)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((n)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((n)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((n)object0).d)) {
            return false;
        }
        return L.g(this.e, ((n)object0).e) ? L.g(this.f, ((n)object0).f) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        Boolean boolean0 = this.f;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixStackFrame(module=" + this.a + ", function=" + this.b + ", fileName=" + this.c + ", lineNumber=" + this.d + ", isInApp=" + this.e + ", isNative=" + this.f + ')';
    }
}

