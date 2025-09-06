package com.kakao.adfit.i;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class o {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final o a(JSONObject jSONObject0) {
            n n0;
            L.p(jSONObject0, "json");
            JSONArray jSONArray0 = jSONObject0.optJSONArray("frames");
            List list0 = null;
            if(jSONArray0 != null) {
                L.o(jSONArray0, "optJSONArray(key)");
                ArrayList arrayList0 = new ArrayList(jSONArray0.length());
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    if(jSONObject1 == null) {
                        n0 = null;
                    }
                    else {
                        L.o(jSONObject1, "optJSONObject(index)");
                        n0 = n.g.a(jSONObject1);
                    }
                    if(n0 != null) {
                        arrayList0.add(n0);
                    }
                }
                list0 = arrayList0;
            }
            return new o(list0);
        }
    }

    private List a;
    public static final a b;

    static {
        o.b = new a(null);
    }

    public o(List list0) {
        this.a = list0;
    }

    public final JSONObject a() {
        JSONArray jSONArray0;
        JSONObject jSONObject0 = new JSONObject();
        List list0 = this.a;
        if(list0 == null) {
            jSONArray0 = null;
        }
        else {
            jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                JSONObject jSONObject1 = ((n)object0).a();
                if(jSONObject1 == null) {
                    jSONObject1 = JSONObject.NULL;
                }
                jSONArray0.put(jSONObject1);
            }
        }
        JSONObject jSONObject2 = jSONObject0.putOpt("frames", jSONArray0);
        L.o(jSONObject2, "JSONObject()\n           …ay { it.toJsonObject() })");
        return jSONObject2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o ? L.g(this.a, ((o)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public String toString() {
        return "MatrixStackTrace(frames=" + this.a + ')';
    }
}

