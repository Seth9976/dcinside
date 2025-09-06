package com.kakao.adfit.i;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class q {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final q a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new q(com.kakao.adfit.m.q.e(jSONObject0, "id"));
        }
    }

    private String a;
    public static final a b;

    static {
        q.b = new a(null);
    }

    public q(String s) {
        this.a = s;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("id", this.a);
        L.o(jSONObject0, "JSONObject()\n            .putOpt(KEY_ID, id)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q ? L.g(this.a, ((q)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public String toString() {
        return "MatrixUser(id=" + this.a + ')';
    }
}

