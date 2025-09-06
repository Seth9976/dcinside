package com.kakao.adfit.i;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final f a(JSONObject jSONObject0) {
            e e0;
            L.p(jSONObject0, "json");
            JSONArray jSONArray0 = jSONObject0.optJSONArray("images");
            List list0 = null;
            if(jSONArray0 != null) {
                L.o(jSONArray0, "optJSONArray(key)");
                ArrayList arrayList0 = new ArrayList(jSONArray0.length());
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    if(jSONObject1 == null) {
                        e0 = null;
                    }
                    else {
                        L.o(jSONObject1, "optJSONObject(index)");
                        e0 = e.c.a(jSONObject1);
                    }
                    if(e0 != null) {
                        arrayList0.add(e0);
                    }
                }
                list0 = arrayList0;
            }
            return new f(list0);
        }
    }

    private List a;
    public static final a b;

    static {
        f.b = new a(null);
    }

    public f(List list0) {
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
                JSONObject jSONObject1 = ((e)object0).a();
                if(jSONObject1 == null) {
                    jSONObject1 = JSONObject.NULL;
                }
                jSONArray0.put(jSONObject1);
            }
        }
        JSONObject jSONObject2 = jSONObject0.putOpt("images", jSONArray0);
        L.o(jSONObject2, "JSONObject()\n           …ay { it.toJsonObject() })");
        return jSONObject2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? L.g(this.a, ((f)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public String toString() {
        return "MatrixDebugMeta(images=" + this.a + ')';
    }
}

