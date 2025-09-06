package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class l {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final l a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new l(q.e(jSONObject0, "name"), q.e(jSONObject0, "version"));
        }
    }

    private String a;
    private String b;
    public static final a c;

    static {
        l.c = new a(null);
    }

    public l(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("name", this.a).putOpt("version", this.b);
        L.o(jSONObject0, "JSONObject()\n           …Opt(KEY_VERSION, version)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        return L.g(this.a, ((l)object0).a) ? L.g(this.b, ((l)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixPackage(name=" + this.a + ", version=" + this.b + ')';
    }
}

