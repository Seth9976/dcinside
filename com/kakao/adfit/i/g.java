package com.kakao.adfit.i;

import com.kakao.adfit.m.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final g a(JSONObject jSONObject0) {
            ArrayList arrayList0;
            L.p(jSONObject0, "json");
            String s = q.e(jSONObject0, "id");
            String s1 = q.e(jSONObject0, "name");
            String s2 = q.e(jSONObject0, "manufacturer");
            String s3 = q.e(jSONObject0, "brand");
            String s4 = q.e(jSONObject0, "family");
            String s5 = q.e(jSONObject0, "model");
            String s6 = q.e(jSONObject0, "model_id");
            Boolean boolean0 = q.a(jSONObject0, "simulator");
            JSONArray jSONArray0 = jSONObject0.optJSONArray("archs");
            if(jSONArray0 == null) {
                arrayList0 = null;
            }
            else {
                L.o(jSONArray0, "optJSONArray(key)");
                arrayList0 = new ArrayList(jSONArray0.length());
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object0 = jSONArray0.opt(v1);
                    if(!(object0 instanceof String)) {
                        object0 = null;
                    }
                    if(((String)object0) != null) {
                        arrayList0.add(((String)object0));
                    }
                }
            }
            Long long0 = q.d(jSONObject0, "memory_size");
            Long long1 = q.d(jSONObject0, "free_memory");
            Boolean boolean1 = q.a(jSONObject0, "low_memory");
            Long long2 = q.d(jSONObject0, "storage_size");
            Long long3 = q.d(jSONObject0, "free_storage");
            Integer integer0 = q.c(jSONObject0, "screen_width_pixels");
            Integer integer1 = q.c(jSONObject0, "screen_height_pixels");
            Float float0 = q.b(jSONObject0, "screen_density");
            Integer integer2 = q.c(jSONObject0, "screen_dpi");
            String s7 = q.e(jSONObject0, "orientation");
            Boolean boolean2 = q.a(jSONObject0, "online");
            String s8 = q.e(jSONObject0, "connection_type");
            Float float1 = q.b(jSONObject0, "battery_level");
            Float float2 = q.b(jSONObject0, "battery_temperature");
            Boolean boolean3 = q.a(jSONObject0, "charging");
            String s9 = q.e(jSONObject0, "boot_time");
            return s9 == null ? new g(s, s1, s2, s3, s4, s5, s6, boolean0, arrayList0, long0, long1, boolean1, long2, long3, integer0, integer1, float0, integer2, s7, boolean2, s8, float1, float2, boolean3, null, q.e(jSONObject0, "timezone"), q.e(jSONObject0, "language")) : new g(s, s1, s2, s3, s4, s5, s6, boolean0, arrayList0, long0, long1, boolean1, long2, long3, integer0, integer1, float0, integer2, s7, boolean2, s8, float1, float2, boolean3, d.b.a(s9), q.e(jSONObject0, "timezone"), q.e(jSONObject0, "language"));
        }

        public final String a(int v) {
            switch(v) {
                case 1: {
                    return "cellular";
                }
                case 2: {
                    return "wifi";
                }
                case 3: {
                    return "ethernet";
                }
                default: {
                    return null;
                }
            }
        }

        public final String b(int v) {
            switch(v) {
                case 0: 
                case 2: {
                    return "portrait";
                }
                case 1: 
                case 3: {
                    return "landscape";
                }
                default: {
                    return null;
                }
            }
        }
    }

    private String A;
    public static final a B;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Boolean h;
    private List i;
    private Long j;
    private Long k;
    private Boolean l;
    private Long m;
    private Long n;
    private Integer o;
    private Integer p;
    private Float q;
    private Integer r;
    private String s;
    private Boolean t;
    private String u;
    private Float v;
    private Float w;
    private Boolean x;
    private d y;
    private String z;

    static {
        g.B = new a(null);
    }

    public g(String s, String s1, String s2, String s3, String s4, String s5, String s6, Boolean boolean0, List list0, Long long0, Long long1, Boolean boolean1, Long long2, Long long3, Integer integer0, Integer integer1, Float float0, Integer integer2, String s7, Boolean boolean2, String s8, Float float1, Float float2, Boolean boolean3, d d0, String s9, String s10) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        this.h = boolean0;
        this.i = list0;
        this.j = long0;
        this.k = long1;
        this.l = boolean1;
        this.m = long2;
        this.n = long3;
        this.o = integer0;
        this.p = integer1;
        this.q = float0;
        this.r = integer2;
        this.s = s7;
        this.t = boolean2;
        this.u = s8;
        this.v = float1;
        this.w = float2;
        this.x = boolean3;
        this.y = d0;
        this.z = s9;
        this.A = s10;
    }

    public final JSONObject a() {
        JSONArray jSONArray0;
        JSONObject jSONObject0 = new JSONObject().putOpt("id", this.a).putOpt("name", this.b).putOpt("manufacturer", this.c).putOpt("brand", this.d).putOpt("family", this.e).putOpt("model", this.f).putOpt("model_id", this.g).putOpt("simulator", this.h);
        List list0 = this.i;
        String s = null;
        if(list0 == null) {
            jSONArray0 = null;
        }
        else {
            jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                jSONArray0.put(object0.toString());
            }
        }
        JSONObject jSONObject1 = jSONObject0.putOpt("archs", jSONArray0).putOpt("memory_size", this.j).putOpt("free_memory", this.k).putOpt("low_memory", this.l).putOpt("storage_size", this.m).putOpt("free_storage", this.n).putOpt("screen_width_pixels", this.o).putOpt("screen_height_pixels", this.p).putOpt("screen_density", this.q).putOpt("screen_dpi", this.r).putOpt("orientation", this.s).putOpt("online", this.t).putOpt("connection_type", this.u).putOpt("battery_level", this.v).putOpt("battery_temperature", this.w).putOpt("charging", this.x);
        d d0 = this.y;
        if(d0 != null) {
            s = d0.toString();
        }
        JSONObject jSONObject2 = jSONObject1.putOpt("boot_time", s).putOpt("timezone", this.z).putOpt("language", this.A);
        L.o(jSONObject2, "JSONObject()\n           …t(KEY_LANGUAGE, language)");
        return jSONObject2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        g g0 = (g)object0;
        if(!L.g(this.a, g0.a)) {
            return false;
        }
        if(!L.g(this.b, g0.b)) {
            return false;
        }
        if(!L.g(this.c, g0.c)) {
            return false;
        }
        if(!L.g(this.d, g0.d)) {
            return false;
        }
        if(!L.g(this.e, g0.e)) {
            return false;
        }
        if(!L.g(this.f, g0.f)) {
            return false;
        }
        if(!L.g(this.g, g0.g)) {
            return false;
        }
        if(!L.g(this.h, g0.h)) {
            return false;
        }
        if(!L.g(this.i, g0.i)) {
            return false;
        }
        if(!L.g(this.j, g0.j)) {
            return false;
        }
        if(!L.g(this.k, g0.k)) {
            return false;
        }
        if(!L.g(this.l, g0.l)) {
            return false;
        }
        if(!L.g(this.m, g0.m)) {
            return false;
        }
        if(!L.g(this.n, g0.n)) {
            return false;
        }
        if(!L.g(this.o, g0.o)) {
            return false;
        }
        if(!L.g(this.p, g0.p)) {
            return false;
        }
        if(!L.g(this.q, g0.q)) {
            return false;
        }
        if(!L.g(this.r, g0.r)) {
            return false;
        }
        if(!L.g(this.s, g0.s)) {
            return false;
        }
        if(!L.g(this.t, g0.t)) {
            return false;
        }
        if(!L.g(this.u, g0.u)) {
            return false;
        }
        if(!L.g(this.v, g0.v)) {
            return false;
        }
        if(!L.g(this.w, g0.w)) {
            return false;
        }
        if(!L.g(this.x, g0.x)) {
            return false;
        }
        if(!L.g(this.y, g0.y)) {
            return false;
        }
        return L.g(this.z, g0.z) ? L.g(this.A, g0.A) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        int v8 = this.h == null ? 0 : this.h.hashCode();
        int v9 = this.i == null ? 0 : this.i.hashCode();
        int v10 = this.j == null ? 0 : this.j.hashCode();
        int v11 = this.k == null ? 0 : this.k.hashCode();
        int v12 = this.l == null ? 0 : this.l.hashCode();
        int v13 = this.m == null ? 0 : this.m.hashCode();
        int v14 = this.n == null ? 0 : this.n.hashCode();
        int v15 = this.o == null ? 0 : this.o.hashCode();
        int v16 = this.p == null ? 0 : this.p.hashCode();
        int v17 = this.q == null ? 0 : this.q.hashCode();
        int v18 = this.r == null ? 0 : this.r.hashCode();
        int v19 = this.s == null ? 0 : this.s.hashCode();
        int v20 = this.t == null ? 0 : this.t.hashCode();
        int v21 = this.u == null ? 0 : this.u.hashCode();
        int v22 = this.v == null ? 0 : this.v.hashCode();
        int v23 = this.w == null ? 0 : this.w.hashCode();
        int v24 = this.x == null ? 0 : this.x.hashCode();
        int v25 = this.y == null ? 0 : this.y.hashCode();
        int v26 = this.z == null ? 0 : this.z.hashCode();
        String s = this.A;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((((((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v19) * 0x1F + v20) * 0x1F + v21) * 0x1F + v22) * 0x1F + v23) * 0x1F + v24) * 0x1F + v25) * 0x1F + v26) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "MatrixDevice(id=" + this.a + ", name=" + this.b + ", manufacturer=" + this.c + ", brand=" + this.d + ", family=" + this.e + ", model=" + this.f + ", modelId=" + this.g + ", simulator=" + this.h + ", archs=" + this.i + ", memorySize=" + this.j + ", freeMemorySize=" + this.k + ", lowMemory=" + this.l + ", storageSize=" + this.m + ", freeStorageSize=" + this.n + ", screenWidthPixels=" + this.o + ", screenHeightPixels=" + this.p + ", screenDensity=" + this.q + ", screenDpi=" + this.r + ", orientation=" + this.s + ", online=" + this.t + ", connectionType=" + this.u + ", batteryLevel=" + this.v + ", batteryTemperature=" + this.w + ", charging=" + this.x + ", bootTime=" + this.y + ", timezone=" + this.z + ", language=" + this.A + ')';
    }
}

