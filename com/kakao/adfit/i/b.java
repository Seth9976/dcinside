package com.kakao.adfit.i;

import com.kakao.adfit.common.matrix.MatrixLevel;
import com.kakao.adfit.m.q;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONObject;

public final class b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public static b a(a b$a0, String s, String s1, MatrixLevel matrixLevel0, int v, Object object0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            if((v & 4) != 0) {
                matrixLevel0 = null;
            }
            return b$a0.a(s, s1, matrixLevel0);
        }

        public final b a(String s, String s1, MatrixLevel matrixLevel0) {
            return new b(d.b.a(), matrixLevel0, s1, null, s, null, 40, null);
        }

        public final b a(JSONObject jSONObject0) {
            L.p(jSONObject0, "json");
            String s = q.e(jSONObject0, "timestamp");
            Map map0 = null;
            d d0 = s == null ? null : d.b.a(s);
            String s1 = q.e(jSONObject0, "level");
            MatrixLevel matrixLevel0 = s1 == null ? null : MatrixLevel.Companion.a(s1);
            String s2 = q.e(jSONObject0, "category");
            String s3 = q.e(jSONObject0, "type");
            String s4 = q.e(jSONObject0, "message");
            JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
            if(jSONObject1 != null) {
                L.o(jSONObject1, "optJSONObject(key)");
                map0 = q.a(jSONObject1);
            }
            return new b(d0, matrixLevel0, s2, s3, s4, map0);
        }
    }

    private d a;
    private final MatrixLevel b;
    private final String c;
    private String d;
    private String e;
    private Map f;
    public static final a g;

    static {
        b.g = new a(null);
    }

    public b(d d0, MatrixLevel matrixLevel0, String s, String s1, String s2, Map map0) {
        this.a = d0;
        this.b = matrixLevel0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = map0;
    }

    public b(d d0, MatrixLevel matrixLevel0, String s, String s1, String s2, Map map0, int v, w w0) {
        this(((v & 1) == 0 ? d0 : null), ((v & 2) == 0 ? matrixLevel0 : null), ((v & 4) == 0 ? s : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? map0 : null));
    }

    public final JSONObject a() {
        String s1;
        JSONObject jSONObject0 = null;
        JSONObject jSONObject1 = new JSONObject().putOpt("timestamp", (this.a == null ? null : this.a.toString()));
        MatrixLevel matrixLevel0 = this.b;
        if(matrixLevel0 == null) {
            s1 = null;
        }
        else {
            String s = matrixLevel0.toString();
            if(s == null) {
                s1 = null;
            }
            else {
                Locale locale0 = Locale.ENGLISH;
                L.o(locale0, "ENGLISH");
                s1 = s.toLowerCase(locale0);
                L.o(s1, "this as java.lang.String).toLowerCase(locale)");
            }
        }
        JSONObject jSONObject2 = jSONObject1.putOpt("level", s1).putOpt("category", this.c).putOpt("type", this.d).putOpt("message", this.e);
        Map map0 = this.f;
        if(map0 != null) {
            jSONObject0 = new JSONObject();
            for(Object object0: map0.entrySet()) {
                jSONObject0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
        }
        JSONObject jSONObject3 = jSONObject2.putOpt("data", jSONObject0);
        L.o(jSONObject3, "JSONObject()\n           …TA, data?.toJsonObject())");
        return jSONObject3;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!L.g(this.a, ((b)object0).a)) {
            return false;
        }
        if(this.b != ((b)object0).b) {
            return false;
        }
        if(!L.g(this.c, ((b)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((b)object0).d)) {
            return false;
        }
        return L.g(this.e, ((b)object0).e) ? L.g(this.f, ((b)object0).f) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        Map map0 = this.f;
        if(map0 != null) {
            v = map0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixBreadcrumb(timestamp=" + this.a + ", level=" + this.b + ", category=" + this.c + ", type=" + this.d + ", message=" + this.e + ", data=" + this.f + ')';
    }
}

