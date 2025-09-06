package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class j {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final j a(String s) {
            L.p(s, "message");
            return new j(s);
        }

        public final j a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new j(q.e(jSONObject0, "formatted"));
        }
    }

    private String a;
    public static final a b;

    static {
        j.b = new a(null);
    }

    public j(String s) {
        this.a = s;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("formatted", this.a);
        L.o(jSONObject0, "JSONObject()\n           …KEY_FORMATTED, formatted)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j ? L.g(this.a, ((j)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public String toString() {
        return "MatrixMessage(formatted=" + this.a + ')';
    }
}

