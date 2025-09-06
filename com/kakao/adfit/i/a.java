package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class a {
    public static final class com.kakao.adfit.i.a.a {
        private com.kakao.adfit.i.a.a() {
        }

        public com.kakao.adfit.i.a.a(w w0) {
        }

        public final a a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            String s = q.e(jSONObject0, "app_identifier");
            String s1 = q.e(jSONObject0, "app_name");
            String s2 = q.e(jSONObject0, "app_version");
            String s3 = q.e(jSONObject0, "app_build");
            String s4 = q.e(jSONObject0, "app_start_time");
            return s4 == null ? new a(s, s1, s2, s3, null) : new a(s, s1, s2, s3, d.b.a(s4));
        }
    }

    private String a;
    private String b;
    private String c;
    private String d;
    private d e;
    public static final com.kakao.adfit.i.a.a f;

    static {
        a.f = new com.kakao.adfit.i.a.a(null);
    }

    public a(String s, String s1, String s2, String s3, d d0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = d0;
    }

    public final String a() {
        return this.d;
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject().putOpt("app_identifier", this.a).putOpt("app_name", this.b).putOpt("app_version", this.c).putOpt("app_build", this.d).putOpt("app_start_time", (this.e == null ? null : this.e.toString()));
        L.o(jSONObject0, "JSONObject()\n           …E, startTime?.toString())");
        return jSONObject0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!L.g(this.a, ((a)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((a)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((a)object0).c)) {
            return false;
        }
        return L.g(this.d, ((a)object0).d) ? L.g(this.e, ((a)object0).e) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        d d0 = this.e;
        if(d0 != null) {
            v = d0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixApp(id=" + this.a + ", name=" + this.b + ", versionName=" + this.c + ", versionCode=" + this.d + ", startTime=" + this.e + ')';
    }
}

