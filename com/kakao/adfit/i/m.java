package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final m a(JSONObject jSONObject0) {
            l l0;
            L.p(jSONObject0, "json");
            String s = q.e(jSONObject0, "name");
            String s1 = q.e(jSONObject0, "version");
            JSONArray jSONArray0 = jSONObject0.optJSONArray("packages");
            List list0 = null;
            if(jSONArray0 != null) {
                L.o(jSONArray0, "optJSONArray(key)");
                ArrayList arrayList0 = new ArrayList(jSONArray0.length());
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    if(jSONObject1 == null) {
                        l0 = null;
                    }
                    else {
                        L.o(jSONObject1, "optJSONObject(index)");
                        l0 = l.c.a(jSONObject1);
                    }
                    if(l0 != null) {
                        arrayList0.add(l0);
                    }
                }
                list0 = arrayList0;
            }
            return new m(s, s1, list0);
        }
    }

    private String a;
    private String b;
    private List c;
    public static final a d;

    static {
        m.d = new a(null);
    }

    public m(String s, String s1, List list0) {
        this.a = s;
        this.b = s1;
        this.c = list0;
    }

    public m(String s, String s1, List list0, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            list0 = null;
        }
        this(s, s1, list0);
    }

    public final JSONObject a() {
        JSONArray jSONArray0;
        JSONObject jSONObject0 = new JSONObject().putOpt("name", this.a).putOpt("version", this.b);
        List list0 = this.c;
        if(list0 == null) {
            jSONArray0 = null;
        }
        else {
            jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                JSONObject jSONObject1 = ((l)object0).a();
                if(jSONObject1 == null) {
                    jSONObject1 = JSONObject.NULL;
                }
                jSONArray0.put(jSONObject1);
            }
        }
        JSONObject jSONObject2 = jSONObject0.putOpt("packages", jSONArray0);
        L.o(jSONObject2, "JSONObject()\n           …ay { it.toJsonObject() })");
        return jSONObject2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        if(!L.g(this.a, ((m)object0).a)) {
            return false;
        }
        return L.g(this.b, ((m)object0).b) ? L.g(this.c, ((m)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        List list0 = this.c;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixSdkPackage(name=" + this.a + ", version=" + this.b + ", packages=" + this.c + ')';
    }
}

