package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final i a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new i(q.e(jSONObject0, "type"), q.a(jSONObject0, "handled"));
        }
    }

    private String a;
    private Boolean b;
    public static final a c;

    static {
        i.c = new a(null);
    }

    public i(String s, Boolean boolean0) {
        this.a = s;
        this.b = boolean0;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("type", this.a).putOpt("handled", this.b);
        L.o(jSONObject0, "JSONObject()\n           …EY_IS_HANDLED, isHandled)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        return L.g(this.a, ((i)object0).a) ? L.g(this.b, ((i)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Boolean boolean0 = this.b;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixMechanism(type=" + this.a + ", isHandled=" + this.b + ')';
    }
}

