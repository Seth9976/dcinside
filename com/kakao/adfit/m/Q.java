package com.kakao.adfit.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class q {
    public static final Boolean a(JSONObject jSONObject0, String s) {
        L.p(jSONObject0, "<this>");
        L.p(s, "key");
        Object object0 = jSONObject0.opt(s);
        if(object0 != null) {
            if(object0 instanceof Boolean) {
                return (Boolean)object0;
            }
            if(object0 instanceof String) {
                if(v.O1(((String)object0), "true", true)) {
                    return true;
                }
                return v.O1(((String)object0), "false", true) ? false : null;
            }
        }
        return null;
    }

    private static final Object a(Object object0) {
        if(object0 instanceof JSONObject) {
            return q.a(((JSONObject)object0));
        }
        return object0 instanceof JSONArray ? q.a(((JSONArray)object0)) : object0;
    }

    public static final List a(JSONArray jSONArray0) {
        L.p(jSONArray0, "<this>");
        int v = jSONArray0.length();
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = jSONArray0.get(v1);
            L.o(object0, "this[i]");
            ((ArrayList)list0).add(v1, q.a(object0));
        }
        return list0;
    }

    public static final Map a(JSONObject jSONObject0) {
        L.p(jSONObject0, "<this>");
        Map map0 = new HashMap(jSONObject0.length());
        Iterator iterator0 = jSONObject0.keys();
        L.o(iterator0, "keys()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            L.o(((String)object0), "key");
            Object object1 = jSONObject0.get(((String)object0));
            L.o(object1, "this[key]");
            map0.put(((String)object0), q.a(object1));
        }
        return map0;
    }

    public static final Float b(JSONObject jSONObject0, String s) {
        L.p(jSONObject0, "<this>");
        L.p(s, "key");
        Object object0 = jSONObject0.opt(s);
        if(object0 != null) {
            if(object0 instanceof Float) {
                return (Float)object0;
            }
            if(object0 instanceof Number) {
                return ((Number)object0).floatValue();
            }
            return object0 instanceof String ? v.N0(((String)object0)) : null;
        }
        return null;
    }

    public static final Integer c(JSONObject jSONObject0, String s) {
        L.p(jSONObject0, "<this>");
        L.p(s, "key");
        Object object0 = jSONObject0.opt(s);
        if(object0 != null) {
            if(object0 instanceof Integer) {
                return (Integer)object0;
            }
            if(object0 instanceof Number) {
                return ((Number)object0).intValue();
            }
            return object0 instanceof String ? v.b1(((String)object0)) : null;
        }
        return null;
    }

    public static final Long d(JSONObject jSONObject0, String s) {
        L.p(jSONObject0, "<this>");
        L.p(s, "key");
        Object object0 = jSONObject0.opt(s);
        if(object0 != null) {
            if(object0 instanceof Long) {
                return (Long)object0;
            }
            if(object0 instanceof Number) {
                return ((Number)object0).longValue();
            }
            return object0 instanceof String ? v.d1(((String)object0)) : null;
        }
        return null;
    }

    public static final String e(JSONObject jSONObject0, String s) {
        L.p(jSONObject0, "<this>");
        L.p(s, "key");
        Object object0 = jSONObject0.opt(s);
        if(object0 != null) {
            return object0 instanceof String ? ((String)object0) : object0.toString();
        }
        return null;
    }
}

