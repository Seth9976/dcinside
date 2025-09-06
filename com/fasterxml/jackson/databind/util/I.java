package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class i implements Serializable {
    private final int a;
    private final int b;
    private final Object[] c;
    private static final long d = 1L;
    private static final i e;

    static {
        i.e = new i(1, 0, new Object[4]);
    }

    private i(int v, int v1, Object[] arr_object) {
        this.a = v;
        this.b = v1;
        this.c = arr_object;
    }

    private final Object a(String s, int v, Object object0) {
        if(object0 == null) {
            return null;
        }
        int v1 = this.a + 1;
        int v2 = (v >> 1) + v1 << 1;
        Object object1 = this.c[v2];
        if(s.equals(object1)) {
            return this.c[v2 + 1];
        }
        if(object1 != null) {
            int v3 = v1 + (v1 >> 1) << 1;
            int v4 = this.b + v3;
            while(v3 < v4) {
                Object object2 = this.c[v3];
                if(object2 != s && !s.equals(object2)) {
                    v3 += 2;
                    continue;
                }
                return this.c[v3 + 1];
            }
        }
        return null;
    }

    public static i b(Map map0) {
        if(map0.isEmpty()) {
            return i.e;
        }
        int v = i.e(map0.size());
        int v1 = (v >> 1) + v;
        Object[] arr_object = new Object[v1 * 2];
        int v2 = 0;
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(s != null) {
                int v3 = s.hashCode() & v - 1;
                int v4 = v3 + v3;
                if(arr_object[v4] != null) {
                    int v5 = (v3 >> 1) + v << 1;
                    if(arr_object[v5] == null) {
                        v4 = v5;
                    }
                    else {
                        v4 = (v1 << 1) + v2;
                        v2 += 2;
                        if(v4 >= arr_object.length) {
                            arr_object = Arrays.copyOf(arr_object, arr_object.length + 4);
                        }
                    }
                }
                arr_object[v4] = s;
                arr_object[v4 + 1] = map$Entry0.getValue();
            }
        }
        return new i(v - 1, v2, arr_object);
    }

    public Object c(String s) {
        int v = s.hashCode() & this.a;
        Object object0 = this.c[v << 1];
        return object0 == s || s.equals(object0) ? this.c[(v << 1) + 1] : this.a(s, v, object0);
    }

    public Object d(String s) {
        for(int v = 0; v < this.c.length; v += 2) {
            Object object0 = this.c[v];
            if(object0 != null && ((String)object0).equalsIgnoreCase(s)) {
                return this.c[v + 1];
            }
        }
        return null;
    }

    private static final int e(int v) {
        if(v <= 5) {
            return 8;
        }
        if(v <= 12) {
            return 16;
        }
        int v1;
        for(v1 = 0x20; v1 < v + (v >> 2); v1 += v1) {
        }
        return v1;
    }

    public List f() {
        List list0 = new ArrayList(this.c.length >> 2);
        for(int v = 0; v < this.c.length; v += 2) {
            Object object0 = this.c[v];
            if(object0 != null) {
                list0.add(((String)object0));
            }
        }
        return list0;
    }
}

