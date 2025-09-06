package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final e a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new e(q.e(jSONObject0, "type"), q.e(jSONObject0, "uuid"));
        }
    }

    private String a;
    private String b;
    public static final a c;

    static {
        e.c = new a(null);
    }

    public e(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("type", this.a).putOpt("uuid", this.b);
        L.o(jSONObject0, "JSONObject()\n           …  .putOpt(KEY_UUID, uuid)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return L.g(this.a, ((e)object0).a) ? L.g(this.b, ((e)object0).b) : false;
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
        return "MatrixDebugImage(type=" + this.a + ", uuid=" + this.b + ')';
    }
}

