package com.kakao.adfit.common.matrix;

import com.kakao.adfit.i.b;
import com.kakao.adfit.i.c;
import com.kakao.adfit.i.d;
import com.kakao.adfit.i.h;
import com.kakao.adfit.i.j;
import com.kakao.adfit.i.m;
import com.kakao.adfit.i.p;
import com.kakao.adfit.i.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public static e a(a e$a0, j j0, Throwable throwable0, MatrixLevel matrixLevel0, int v, Object object0) {
            if((v & 1) != 0) {
                j0 = null;
            }
            if((v & 2) != 0) {
                throwable0 = null;
            }
            if((v & 4) != 0) {
                matrixLevel0 = null;
            }
            return e$a0.a(j0, throwable0, matrixLevel0);
        }

        private final Map a(JSONObject jSONObject0, String s) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
            if(jSONObject1 == null) {
                return null;
            }
            Map map0 = new HashMap(jSONObject1.length());
            Iterator iterator0 = jSONObject1.keys();
            L.o(iterator0, "json.keys()");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                L.o(s1, "it");
                Object object1 = jSONObject1.opt(s1);
                String s2 = object1 instanceof String ? ((String)object1) : null;
                if(s2 != null) {
                    map0.put(s1, s2);
                }
            }
            return map0;
        }

        public final e a(j j0, Throwable throwable0, MatrixLevel matrixLevel0) {
            return new e(f.b.b(), d.b.a(), throwable0, j0, null, null, null, null, null, matrixLevel0, null, null, null, null, null, null, null, null, null, 0x7FDF0, null);
        }

        public final e a(JSONObject jSONObject0) {
            ArrayList arrayList4;
            b b0;
            JSONArray jSONArray5;
            MatrixLevel matrixLevel1;
            c c1;
            c c0;
            m m1;
            m m0;
            q q1;
            q q0;
            String s8;
            ArrayList arrayList2;
            h h0;
            JSONArray jSONArray3;
            p p0;
            JSONArray jSONArray1;
            ArrayList arrayList0;
            j j0;
            L.p(jSONObject0, "json");
            String s = com.kakao.adfit.m.q.e(jSONObject0, "event_id");
            f f0 = s == null ? null : f.b.a(s);
            String s1 = com.kakao.adfit.m.q.e(jSONObject0, "timestamp");
            d d0 = s1 == null ? null : d.b.a(s1);
            JSONObject jSONObject1 = jSONObject0.optJSONObject("message");
            if(jSONObject1 == null) {
                j0 = null;
            }
            else {
                L.o(jSONObject1, "optJSONObject(key)");
                j0 = j.b.a(jSONObject1);
            }
            String s2 = com.kakao.adfit.m.q.e(jSONObject0, "platform");
            String s3 = com.kakao.adfit.m.q.e(jSONObject0, "release");
            String s4 = com.kakao.adfit.m.q.e(jSONObject0, "dist");
            JSONObject jSONObject2 = jSONObject0.optJSONObject("threads");
            if(jSONObject2 == null) {
                arrayList0 = null;
            }
            else {
                L.o(jSONObject2, "optJSONObject(key)");
                JSONArray jSONArray0 = jSONObject2.optJSONArray("values");
                if(jSONArray0 == null) {
                    arrayList0 = null;
                }
                else {
                    L.o(jSONArray0, "optJSONArray(key)");
                    arrayList0 = new ArrayList(jSONArray0.length());
                    int v = jSONArray0.length();
                    int v1 = 0;
                    while(v1 < v) {
                        JSONObject jSONObject3 = jSONArray0.optJSONObject(v1);
                        if(jSONObject3 == null) {
                            jSONArray1 = jSONArray0;
                            p0 = null;
                        }
                        else {
                            L.o(jSONObject3, "optJSONObject(index)");
                            jSONArray1 = jSONArray0;
                            p0 = p.i.a(jSONObject3);
                        }
                        if(p0 != null) {
                            arrayList0.add(p0);
                        }
                        ++v1;
                        jSONArray0 = jSONArray1;
                    }
                }
            }
            JSONObject jSONObject4 = jSONObject0.optJSONObject("exception");
            if(jSONObject4 == null) {
                arrayList2 = null;
            }
            else {
                L.o(jSONObject4, "optJSONObject(key)");
                JSONArray jSONArray2 = jSONObject4.optJSONArray("values");
                if(jSONArray2 == null) {
                    arrayList2 = null;
                }
                else {
                    L.o(jSONArray2, "optJSONArray(key)");
                    ArrayList arrayList1 = new ArrayList(jSONArray2.length());
                    int v2 = jSONArray2.length();
                    int v3 = 0;
                    while(v3 < v2) {
                        JSONObject jSONObject5 = jSONArray2.optJSONObject(v3);
                        if(jSONObject5 == null) {
                            jSONArray3 = jSONArray2;
                            h0 = null;
                        }
                        else {
                            L.o(jSONObject5, "optJSONObject(index)");
                            jSONArray3 = jSONArray2;
                            h0 = h.g.a(jSONObject5);
                        }
                        if(h0 != null) {
                            arrayList1.add(h0);
                        }
                        ++v3;
                        jSONArray2 = jSONArray3;
                    }
                    arrayList2 = arrayList1;
                }
            }
            String s5 = com.kakao.adfit.m.q.e(jSONObject0, "level");
            MatrixLevel matrixLevel0 = s5 == null ? null : MatrixLevel.Companion.a(s5);
            String s6 = com.kakao.adfit.m.q.e(jSONObject0, "server_name");
            String s7 = com.kakao.adfit.m.q.e(jSONObject0, "environment");
            JSONObject jSONObject6 = jSONObject0.optJSONObject("user");
            if(jSONObject6 == null) {
                s8 = s6;
                q0 = null;
            }
            else {
                L.o(jSONObject6, "optJSONObject(key)");
                s8 = s6;
                q0 = q.b.a(jSONObject6);
            }
            JSONObject jSONObject7 = jSONObject0.optJSONObject("sdk");
            if(jSONObject7 == null) {
                q1 = q0;
                m0 = null;
            }
            else {
                L.o(jSONObject7, "optJSONObject(key)");
                q1 = q0;
                m0 = m.d.a(jSONObject7);
            }
            JSONObject jSONObject8 = jSONObject0.optJSONObject("contexts");
            if(jSONObject8 == null) {
                m1 = m0;
                c0 = null;
            }
            else {
                L.o(jSONObject8, "optJSONObject(key)");
                m1 = m0;
                c0 = c.d.a(jSONObject8);
            }
            JSONArray jSONArray4 = jSONObject0.optJSONArray("breadcrumbs");
            if(jSONArray4 == null) {
                matrixLevel1 = matrixLevel0;
                c1 = c0;
                arrayList4 = null;
            }
            else {
                L.o(jSONArray4, "optJSONArray(key)");
                c1 = c0;
                ArrayList arrayList3 = new ArrayList(jSONArray4.length());
                int v4 = jSONArray4.length();
                matrixLevel1 = matrixLevel0;
                int v5 = 0;
                while(v5 < v4) {
                    JSONObject jSONObject9 = jSONArray4.optJSONObject(v5);
                    if(jSONObject9 == null) {
                        jSONArray5 = jSONArray4;
                        b0 = null;
                    }
                    else {
                        L.o(jSONObject9, "optJSONObject(index)");
                        jSONArray5 = jSONArray4;
                        b0 = b.g.a(jSONObject9);
                    }
                    if(b0 != null) {
                        arrayList3.add(b0);
                    }
                    ++v5;
                    jSONArray4 = jSONArray5;
                }
                arrayList4 = arrayList3;
            }
            JSONObject jSONObject10 = jSONObject0.optJSONObject("debug_meta");
            if(jSONObject10 != null) {
                L.o(jSONObject10, "optJSONObject(key)");
                return new e(f0, d0, null, j0, s2, s3, s4, arrayList0, arrayList2, matrixLevel1, s8, s7, q1, m1, c1, arrayList4, com.kakao.adfit.i.f.b.a(jSONObject10), this.a(jSONObject0, "tags"), this.a(jSONObject0, "extra"), 4, null);
            }
            return new e(f0, d0, null, j0, s2, s3, s4, arrayList0, arrayList2, matrixLevel1, s8, s7, q1, m1, c1, arrayList4, null, this.a(jSONObject0, "tags"), this.a(jSONObject0, "extra"), 4, null);
        }
    }

    private f a;
    private d b;
    private Throwable c;
    private j d;
    private String e;
    private String f;
    private String g;
    private List h;
    private List i;
    private MatrixLevel j;
    private String k;
    private String l;
    private q m;
    private m n;
    private c o;
    private List p;
    private com.kakao.adfit.i.f q;
    private Map r;
    private Map s;
    public static final a t;

    static {
        e.t = new a(null);
    }

    public e(f f0, d d0, Throwable throwable0, j j0, String s, String s1, String s2, List list0, List list1, MatrixLevel matrixLevel0, String s3, String s4, q q0, m m0, c c0, List list2, com.kakao.adfit.i.f f1, Map map0, Map map1) {
        this.a = f0;
        this.b = d0;
        this.c = throwable0;
        this.d = j0;
        this.e = s;
        this.f = s1;
        this.g = s2;
        this.h = list0;
        this.i = list1;
        this.j = matrixLevel0;
        this.k = s3;
        this.l = s4;
        this.m = q0;
        this.n = m0;
        this.o = c0;
        this.p = list2;
        this.q = f1;
        this.r = map0;
        this.s = map1;
    }

    public e(f f0, d d0, Throwable throwable0, j j0, String s, String s1, String s2, List list0, List list1, MatrixLevel matrixLevel0, String s3, String s4, q q0, m m0, c c0, List list2, com.kakao.adfit.i.f f1, Map map0, Map map1, int v, w w0) {
        this(((v & 1) == 0 ? f0 : null), ((v & 2) == 0 ? d0 : null), ((v & 4) == 0 ? throwable0 : null), ((v & 8) == 0 ? j0 : null), ((v & 16) == 0 ? s : null), ((v & 0x20) == 0 ? s1 : null), ((v & 0x40) == 0 ? s2 : null), ((v & 0x80) == 0 ? list0 : null), ((v & 0x100) == 0 ? list1 : null), ((v & 0x200) == 0 ? matrixLevel0 : null), ((v & 0x400) == 0 ? s3 : null), ((v & 0x800) == 0 ? s4 : null), ((v & 0x1000) == 0 ? q0 : null), ((v & 0x2000) == 0 ? m0 : null), ((v & 0x4000) == 0 ? c0 : null), ((v & 0x8000) == 0 ? list2 : null), ((v & 0x10000) == 0 ? f1 : null), ((v & 0x20000) == 0 ? map0 : null), ((v & 0x40000) == 0 ? map1 : null));
    }

    public final List a() {
        return this.p;
    }

    public final void a(f f0) {
        this.a = f0;
    }

    public final void a(c c0) {
        this.o = c0;
    }

    public final void a(com.kakao.adfit.i.f f0) {
        this.q = f0;
    }

    public final void a(m m0) {
        this.n = m0;
    }

    public final void a(q q0) {
        this.m = q0;
    }

    public final void a(String s) {
        this.g = s;
    }

    public final void a(Throwable throwable0) {
        this.c = throwable0;
    }

    public final void a(List list0) {
        this.p = list0;
    }

    public final void a(Map map0) {
        this.s = map0;
    }

    public final c b() {
        return this.o;
    }

    public final void b(String s) {
        this.l = s;
    }

    public final void b(List list0) {
        this.i = list0;
    }

    public final void b(Map map0) {
        this.r = map0;
    }

    public final com.kakao.adfit.i.f c() {
        return this.q;
    }

    public final void c(String s) {
        this.e = s;
    }

    public final void c(List list0) {
        this.h = list0;
    }

    public final String d() {
        return this.g;
    }

    public final void d(String s) {
        this.f = s;
    }

    public final String e() {
        return this.l;
    }

    public final void e(String s) {
        this.k = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.a, ((e)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((e)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((e)object0).c)) {
            return false;
        }
        if(!L.g(this.d, ((e)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((e)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((e)object0).f)) {
            return false;
        }
        if(!L.g(this.g, ((e)object0).g)) {
            return false;
        }
        if(!L.g(this.h, ((e)object0).h)) {
            return false;
        }
        if(!L.g(this.i, ((e)object0).i)) {
            return false;
        }
        if(this.j != ((e)object0).j) {
            return false;
        }
        if(!L.g(this.k, ((e)object0).k)) {
            return false;
        }
        if(!L.g(this.l, ((e)object0).l)) {
            return false;
        }
        if(!L.g(this.m, ((e)object0).m)) {
            return false;
        }
        if(!L.g(this.n, ((e)object0).n)) {
            return false;
        }
        if(!L.g(this.o, ((e)object0).o)) {
            return false;
        }
        if(!L.g(this.p, ((e)object0).p)) {
            return false;
        }
        if(!L.g(this.q, ((e)object0).q)) {
            return false;
        }
        return L.g(this.r, ((e)object0).r) ? L.g(this.s, ((e)object0).s) : false;
    }

    public final List f() {
        return this.i;
    }

    public final f g() {
        return this.a;
    }

    public final String h() {
        return this.e;
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
        Map map0 = this.s;
        if(map0 != null) {
            v = map0.hashCode();
        }
        return (((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v;
    }

    public final String i() {
        return this.f;
    }

    public final m j() {
        return this.n;
    }

    public final String k() {
        return this.k;
    }

    public final Map l() {
        return this.r;
    }

    public final List m() {
        return this.h;
    }

    public final Throwable n() {
        return this.c;
    }

    public final q o() {
        return this.m;
    }

    public final JSONObject p() {
        JSONObject jSONObject13;
        JSONArray jSONArray2;
        String s1;
        JSONObject jSONObject8;
        JSONObject jSONObject4;
        JSONObject jSONObject0 = null;
        JSONObject jSONObject1 = new JSONObject().putOpt("event_id", (this.a == null ? null : this.a.toString())).putOpt("timestamp", (this.b == null ? null : this.b.toString())).putOpt("message", (this.d == null ? null : this.d.a())).putOpt("platform", this.e).putOpt("release", this.f).putOpt("dist", this.g);
        List list0 = this.h;
        if(list0 == null) {
            jSONObject4 = null;
        }
        else {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                JSONObject jSONObject3 = ((p)object0).b();
                if(jSONObject3 == null) {
                    jSONObject3 = JSONObject.NULL;
                }
                jSONArray0.put(jSONObject3);
            }
            jSONObject4 = jSONObject2.put("values", jSONArray0);
            L.o(jSONObject4, "JSONObject().put(\"values\", toJsonArray(transform))");
        }
        JSONObject jSONObject5 = jSONObject1.putOpt("threads", jSONObject4);
        List list1 = this.i;
        if(list1 == null) {
            jSONObject8 = null;
        }
        else {
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray1 = new JSONArray();
            for(Object object1: list1) {
                JSONObject jSONObject7 = ((h)object1).c();
                if(jSONObject7 == null) {
                    jSONObject7 = JSONObject.NULL;
                }
                jSONArray1.put(jSONObject7);
            }
            jSONObject8 = jSONObject6.put("values", jSONArray1);
            L.o(jSONObject8, "JSONObject().put(\"values\", toJsonArray(transform))");
        }
        JSONObject jSONObject9 = jSONObject5.putOpt("exception", jSONObject8);
        MatrixLevel matrixLevel0 = this.j;
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
        JSONObject jSONObject10 = jSONObject9.putOpt("level", s1).putOpt("server_name", this.k).putOpt("environment", this.l).putOpt("user", (this.m == null ? null : this.m.a())).putOpt("sdk", (this.n == null ? null : this.n.a())).putOpt("contexts", (this.o == null ? null : this.o.d()));
        List list2 = this.p;
        if(list2 == null) {
            jSONArray2 = null;
        }
        else {
            jSONArray2 = new JSONArray();
            for(Object object2: list2) {
                JSONObject jSONObject11 = ((b)object2).a();
                if(jSONObject11 == null) {
                    jSONObject11 = JSONObject.NULL;
                }
                jSONArray2.put(jSONObject11);
            }
        }
        JSONObject jSONObject12 = jSONObject10.putOpt("breadcrumbs", jSONArray2).putOpt("debug_meta", (this.q == null ? null : this.q.a()));
        Map map0 = this.r;
        if(map0 == null) {
            jSONObject13 = null;
        }
        else {
            jSONObject13 = new JSONObject();
            for(Object object3: map0.entrySet()) {
                jSONObject13.put(((String)((Map.Entry)object3).getKey()), ((Map.Entry)object3).getValue());
            }
        }
        JSONObject jSONObject14 = jSONObject12.putOpt("tags", jSONObject13);
        Map map1 = this.s;
        if(map1 != null) {
            jSONObject0 = new JSONObject();
            for(Object object4: map1.entrySet()) {
                jSONObject0.put(((String)((Map.Entry)object4).getKey()), ((Map.Entry)object4).getValue());
            }
        }
        JSONObject jSONObject15 = jSONObject14.putOpt("extra", jSONObject0);
        L.o(jSONObject15, "JSONObject()\n           …A, extra?.toJsonObject())");
        return jSONObject15;
    }

    @Override
    public String toString() {
        return "MatrixEvent(id=" + this.a + ", timestamp=" + this.b + ", throwable=" + this.c + ", message=" + this.d + ", platform=" + this.e + ", release=" + this.f + ", dist=" + this.g + ", threads=" + this.h + ", exception=" + this.i + ", level=" + this.j + ", serverName=" + this.k + ", environment=" + this.l + ", user=" + this.m + ", sdk=" + this.n + ", contexts=" + this.o + ", breadcrumbs=" + this.p + ", debugMeta=" + this.q + ", tags=" + this.r + ", extra=" + this.s + ')';
    }
}

