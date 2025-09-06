package com.kakao.adfit.ads.na;

import com.kakao.adfit.a.g;
import com.kakao.adfit.m.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class l {
    public static final b a(JSONObject jSONObject0) {
        d k$d2;
        d k$d1;
        L.p(jSONObject0, "<this>");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("backgroundImage");
        d k$d0 = null;
        if(jSONObject1 == null) {
            k$d1 = null;
        }
        else {
            L.o(jSONObject1, "optJSONObject(key)");
            k$d1 = l.c(jSONObject1);
        }
        if(k$d1 == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("textImage");
        if(jSONObject2 == null) {
            k$d2 = null;
        }
        else {
            L.o(jSONObject2, "optJSONObject(key)");
            k$d2 = l.c(jSONObject2);
        }
        if(k$d2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject0.optJSONObject("objectImage");
        if(jSONObject3 != null) {
            L.o(jSONObject3, "optJSONObject(key)");
            k$d0 = l.c(jSONObject3);
        }
        return new b(k$d1, k$d2, k$d0);
    }

    public static final c b(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "type");
        if(s != null) {
            switch(s) {
                case "image": {
                    return l.d(jSONObject0);
                }
                case "multi": {
                    return l.i(jSONObject0);
                }
                case "video": {
                    return l.n(jSONObject0);
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    public static final d c(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "url");
        f k$f0 = null;
        if(s == null) {
            return null;
        }
        int v = jSONObject0.optInt("width");
        int v1 = jSONObject0.optInt("height");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("link");
        if(jSONObject1 != null) {
            L.o(jSONObject1, "optJSONObject(key)");
            k$f0 = l.e(jSONObject1);
        }
        return new d(s, v, v1, k$f0);
    }

    public static final e d(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("images");
        k k$k0 = null;
        if(jSONArray0 != null) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(0);
            if(jSONObject1 != null) {
                d k$d0 = l.c(jSONObject1);
                if(k$d0 != null) {
                    JSONObject jSONObject2 = jSONObject0.optJSONObject("callToAction");
                    if(jSONObject2 != null) {
                        L.o(jSONObject2, "optJSONObject(key)");
                        k$k0 = l.l(jSONObject2);
                    }
                    return new e(k$d0, k$k0, g.a(jSONObject0));
                }
            }
        }
        return null;
    }

    public static final f e(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "url");
        List list0 = null;
        if(s == null) {
            return null;
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("clicktrackers");
        if(jSONArray0 != null) {
            L.o(jSONArray0, "optJSONArray(key)");
            ArrayList arrayList0 = new ArrayList(jSONArray0.length());
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
            list0 = arrayList0;
        }
        if(list0 == null) {
            list0 = u.H();
        }
        return new f(s, list0);
    }

    public static final com.kakao.adfit.ads.na.k.g f(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        com.kakao.adfit.ads.na.k.g k$g0 = l.m(jSONObject0);
        if(k$g0 == null) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject("mainImage");
            if(jSONObject1 != null) {
                L.o(jSONObject1, "optJSONObject(key)");
                return l.c(jSONObject1);
            }
            return null;
        }
        return k$g0;
    }

    public static final h g(JSONObject jSONObject0) {
        d k$d2;
        ArrayList arrayList0;
        d k$d1;
        d k$d0;
        L.p(jSONObject0, "<this>");
        com.kakao.adfit.ads.na.k.l k$l0 = l.m(jSONObject0);
        if(k$l0 != null) {
            com.kakao.adfit.ads.na.k.l k$l1 = k$l0.a() == null ? null : k$l0;
            if(k$l1 != null) {
                JSONObject jSONObject1 = jSONObject0.optJSONObject("backgroundImage");
                if(jSONObject1 == null) {
                    k$d0 = null;
                }
                else {
                    L.o(jSONObject1, "optJSONObject(key)");
                    k$d0 = l.c(jSONObject1);
                }
                if(k$d0 == null) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject0.optJSONObject("textImage");
                if(jSONObject2 == null) {
                    k$d1 = null;
                }
                else {
                    L.o(jSONObject2, "optJSONObject(key)");
                    k$d1 = l.c(jSONObject2);
                }
                if(k$d1 == null) {
                    return null;
                }
                JSONArray jSONArray0 = jSONObject0.optJSONArray("objectImages");
                if(jSONArray0 == null) {
                    arrayList0 = null;
                }
                else {
                    L.o(jSONArray0, "optJSONArray(key)");
                    arrayList0 = new ArrayList(jSONArray0.length());
                    int v = jSONArray0.length();
                    for(int v1 = 0; v1 < v; ++v1) {
                        JSONObject jSONObject3 = jSONArray0.optJSONObject(v1);
                        if(jSONObject3 == null) {
                            k$d2 = null;
                        }
                        else {
                            L.o(jSONObject3, "optJSONObject(index)");
                            k$d2 = l.c(jSONObject3);
                        }
                        if(k$d2 != null) {
                            arrayList0.add(k$d2);
                        }
                    }
                }
                if(arrayList0 != null) {
                    ArrayList arrayList1 = arrayList0.isEmpty() ? null : arrayList0;
                    if(arrayList1 != null) {
                        String s = q.e(jSONObject0, "interval");
                        if(s != null) {
                            Long long0 = v.d1(s);
                            return long0 == null ? new h(k$l1, k$d0, k$d1, arrayList1, 0L, q.e(jSONObject0, "intervalKey")) : new h(k$l1, k$d0, k$d1, arrayList1, ((long)long0) * 1000L, q.e(jSONObject0, "intervalKey"));
                        }
                        return new h(k$l1, k$d0, k$d1, arrayList1, 0L, q.e(jSONObject0, "intervalKey"));
                    }
                }
            }
        }
        return null;
    }

    public static final a h(JSONObject jSONObject0) {
        d k$d0;
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "landingUrl");
        k k$k0 = null;
        if(s != null) {
            String s1 = v.x3(s) ? null : s;
            if(s1 != null) {
                JSONObject jSONObject1 = jSONObject0.optJSONObject("image");
                if(jSONObject1 == null) {
                    k$d0 = null;
                }
                else {
                    L.o(jSONObject1, "optJSONObject(key)");
                    k$d0 = l.c(jSONObject1);
                }
                if(k$d0 == null) {
                    return null;
                }
                String s2 = q.e(jSONObject0, "title");
                String s3 = q.e(jSONObject0, "price");
                String s4 = q.e(jSONObject0, "discountPrice");
                JSONObject jSONObject2 = jSONObject0.optJSONObject("callToAction");
                if(jSONObject2 != null) {
                    L.o(jSONObject2, "optJSONObject(key)");
                    k$k0 = l.l(jSONObject2);
                }
                return new a(k$d0, s2, s3, s4, k$k0, s1, g.a(jSONObject0));
            }
        }
        return null;
    }

    public static final i i(JSONObject jSONObject0) {
        a k$i$a0;
        ArrayList arrayList0;
        L.p(jSONObject0, "<this>");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("multi");
        if(jSONArray0 == null) {
            arrayList0 = null;
        }
        else {
            L.o(jSONArray0, "optJSONArray(key)");
            arrayList0 = new ArrayList(jSONArray0.length());
            int v = jSONArray0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                if(jSONObject1 == null) {
                    k$i$a0 = null;
                }
                else {
                    L.o(jSONObject1, "optJSONObject(index)");
                    k$i$a0 = l.h(jSONObject1);
                }
                if(k$i$a0 != null) {
                    arrayList0.add(k$i$a0);
                }
            }
        }
        if(arrayList0 != null) {
            if(arrayList0.isEmpty()) {
                arrayList0 = null;
            }
            return arrayList0 == null ? null : new i(arrayList0, g.a(jSONObject0));
        }
        return null;
    }

    public static final com.kakao.adfit.ads.na.k j(JSONObject jSONObject0) {
        d k$d1;
        c k$c0;
        b k$b0;
        h k$h0;
        f k$f2;
        d k$d0;
        f k$f1;
        f k$f0;
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "type");
        j k$j0 = null;
        if(s != null) {
            if(!L.g(s, "native")) {
                s = null;
            }
            if(s != null) {
                String s1 = q.e(jSONObject0, "landingUrl");
                if(s1 != null) {
                    String s2 = v.x3(s1) ? null : s1;
                    if(s2 != null) {
                        String s3 = q.e(jSONObject0, "adInfoUrl");
                        if(s3 != null) {
                            String s4 = v.x3(s3) ? null : s3;
                            if(s4 != null) {
                                String s5 = q.e(jSONObject0, "title");
                                JSONObject jSONObject1 = jSONObject0.optJSONObject("titleLink");
                                if(jSONObject1 == null) {
                                    k$f0 = null;
                                }
                                else {
                                    L.o(jSONObject1, "optJSONObject(key)");
                                    k$f0 = l.e(jSONObject1);
                                }
                                String s6 = q.e(jSONObject0, "body");
                                JSONObject jSONObject2 = jSONObject0.optJSONObject("bodyLink");
                                if(jSONObject2 == null) {
                                    k$f1 = null;
                                }
                                else {
                                    L.o(jSONObject2, "optJSONObject(key)");
                                    k$f1 = l.e(jSONObject2);
                                }
                                JSONObject jSONObject3 = jSONObject0.optJSONObject("bodyExt");
                                JSONObject jSONObject4 = jSONObject0.optJSONObject("profileIcon");
                                if(jSONObject4 == null) {
                                    k$d0 = null;
                                }
                                else {
                                    L.o(jSONObject4, "optJSONObject(key)");
                                    k$d0 = l.c(jSONObject4);
                                }
                                String s7 = q.e(jSONObject0, "profileName");
                                JSONObject jSONObject5 = jSONObject0.optJSONObject("profileNameLink");
                                if(jSONObject5 == null) {
                                    k$f2 = null;
                                }
                                else {
                                    L.o(jSONObject5, "optJSONObject(key)");
                                    k$f2 = l.e(jSONObject5);
                                }
                                com.kakao.adfit.ads.na.k.g k$g0 = l.f(jSONObject0);
                                String s8 = q.e(jSONObject0, "callToAction");
                                if(k$g0 == null && s5 == null && s6 == null && k$d0 == null && s7 == null && s8 == null) {
                                    return null;
                                }
                                String s9 = q.e(jSONObject0, "dspId");
                                if(s9 == null) {
                                    s9 = "";
                                }
                                JSONObject jSONObject6 = jSONObject0.optJSONObject("motion");
                                if(jSONObject6 == null) {
                                    k$h0 = null;
                                }
                                else {
                                    L.o(jSONObject6, "optJSONObject(key)");
                                    k$h0 = l.g(jSONObject6);
                                }
                                JSONObject jSONObject7 = jSONObject0.optJSONObject("custombiz");
                                if(jSONObject7 == null) {
                                    k$b0 = null;
                                }
                                else {
                                    L.o(jSONObject7, "optJSONObject(key)");
                                    k$b0 = l.a(jSONObject7);
                                }
                                JSONObject jSONObject8 = jSONObject0.optJSONObject("expandable");
                                if(jSONObject8 == null) {
                                    k$c0 = null;
                                }
                                else {
                                    L.o(jSONObject8, "optJSONObject(key)");
                                    k$c0 = l.b(jSONObject8);
                                }
                                JSONObject jSONObject9 = jSONObject0.optJSONObject("adInfoIcon");
                                if(jSONObject9 == null) {
                                    k$d1 = null;
                                }
                                else {
                                    L.o(jSONObject9, "optJSONObject(key)");
                                    k$d1 = l.c(jSONObject9);
                                }
                                JSONObject jSONObject10 = jSONObject0.optJSONObject("mainImageAdInfoPosition");
                                if(jSONObject10 != null) {
                                    L.o(jSONObject10, "optJSONObject(key)");
                                    k$j0 = l.k(jSONObject10);
                                }
                                String s10 = q.e(jSONObject0, "altText");
                                String s11 = q.e(jSONObject0, "feedbackUrl");
                                String s12 = q.e(jSONObject0, "ckeywords");
                                return v.x3(s9) || L.g(s9, "ADFIT") ? new com.kakao.adfit.ads.na.k(s5, k$f0, s6, k$f1, jSONObject3, k$d0, s7, k$f2, k$g0, s8, k$h0, k$b0, k$c0, k$d1, s4, true, true, k$j0, s10, s11, s12, s2, true, s9, q.e(jSONObject0, "displayUrl"), g.a(jSONObject0)) : new com.kakao.adfit.ads.na.k(s5, k$f0, s6, k$f1, jSONObject3, k$d0, s7, k$f2, k$g0, s8, k$h0, k$b0, k$c0, k$d1, s4, true, true, k$j0, s10, s11, s12, s2, false, s9, q.e(jSONObject0, "displayUrl"), g.a(jSONObject0));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final j k(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        int v = jSONObject0.optInt("width");
        int v1 = jSONObject0.optInt("height");
        return v > 0 || v1 > 0 ? new j(jSONObject0.optInt("x"), jSONObject0.optInt("y"), v, v1) : null;
    }

    public static final k l(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "text");
        f k$f0 = null;
        if(s == null) {
            return null;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("link");
        if(jSONObject1 != null) {
            L.o(jSONObject1, "optJSONObject(key)");
            k$f0 = l.e(jSONObject1);
        }
        return new k(s, k$f0, jSONObject0.optJSONObject("ext"));
    }

    public static final com.kakao.adfit.ads.na.k.l m(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        String s = q.e(jSONObject0, "vastTag");
        d k$d0 = null;
        if(s != null) {
            com.kakao.adfit.n.e e0 = new com.kakao.adfit.n.g().b(s);
            if(e0 != null) {
                List list0 = e0.c();
                if(list0 == null || !list0.isEmpty() != 1) {
                    e0 = null;
                }
                if(e0 != null) {
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("videoImage");
                    if(jSONObject1 != null) {
                        L.o(jSONObject1, "optJSONObject(key)");
                        k$d0 = l.c(jSONObject1);
                    }
                    return new com.kakao.adfit.ads.na.k.l(e0, k$d0);
                }
            }
        }
        return null;
    }

    public static final m n(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        com.kakao.adfit.ads.na.k.l k$l0 = l.m(jSONObject0);
        k k$k0 = null;
        if(k$l0 == null) {
            return null;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("callToAction");
        if(jSONObject1 != null) {
            L.o(jSONObject1, "optJSONObject(key)");
            k$k0 = l.l(jSONObject1);
        }
        return new m(k$l0, k$k0, g.a(jSONObject0));
    }
}

