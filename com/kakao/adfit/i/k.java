package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class k {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final k a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            return new k(q.e(jSONObject0, "name"), q.e(jSONObject0, "version"), q.e(jSONObject0, "build"), q.e(jSONObject0, "kernel_version"), q.a(jSONObject0, "rooted"));
        }
    }

    private String a;
    private String b;
    private String c;
    private String d;
    private Boolean e;
    public static final a f;

    static {
        k.f = new a(null);
    }

    public k(String s, String s1, String s2, String s3, Boolean boolean0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = boolean0;
    }

    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject().putOpt("name", this.a).putOpt("version", this.b).putOpt("build", this.c).putOpt("kernel_version", this.d).putOpt("rooted", this.e);
        L.o(jSONObject0, "JSONObject()\n           …utOpt(KEY_ROOTED, rooted)");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        if(!L.g(this.a, ((k)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((k)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((k)object0).c)) {
            return false;
        }
        return L.g(this.d, ((k)object0).d) ? L.g(this.e, ((k)object0).e) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        Boolean boolean0 = this.e;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixOs(name=" + this.a + ", version=" + this.b + ", build=" + this.c + ", kernelVersion=" + this.d + ", rooted=" + this.e + ')';
    }
}

