package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.t;
import j..util.Map.-EL;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class k implements Serializable {
    protected final Class a;
    protected final Enum[] b;
    protected final HashMap c;
    protected final Enum d;
    protected final boolean e;
    protected final boolean f;
    private static final long g = 1L;

    protected k(Class class0, Enum[] arr_enum, HashMap hashMap0, Enum enum0, boolean z, boolean z1) {
        this.a = class0;
        this.b = arr_enum;
        this.c = hashMap0;
        this.d = enum0;
        this.e = z;
        this.f = z1;
    }

    public boolean A() {
        return this.f;
    }

    public int B() {
        return this.b.length - 1;
    }

    protected static Class a(Class class0) [...] // Inlined contents

    protected static Enum[] b(Class class0) {
        Enum[] arr_enum = (Enum[])class0.getEnumConstants();
        if(arr_enum == null) {
            throw new IllegalArgumentException("No enum constants for class " + class0.getName());
        }
        return arr_enum;
    }

    protected static Enum c(b b0, d d0, Enum[] arr_enum) {
        return b0 == null ? null : b0.m(d0, arr_enum);
    }

    @Deprecated
    protected static Enum d(b b0, Class class0) {
        return b0 == null ? null : b0.n(class0);
    }

    protected Enum e(String s) {
        for(Object object0: this.c.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(s.equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                return (Enum)map$Entry0.getValue();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected static boolean f(Class class0) {
        if(class0.isPrimitive()) {
            class0 = h.C0(class0);
        }
        return class0 == Long.class || class0 == Integer.class || class0 == Short.class || class0 == Byte.class;
    }

    public static k g(g g0, d d0) {
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Class class0 = d0.f();
        Enum[] arr_enum = k.b(class0);
        String[] arr_s = b0.x(g0, d0, arr_enum, new String[arr_enum.length]);
        String[][] arr2_s = new String[arr_s.length][];
        b0.r(g0, d0, arr_enum, arr2_s);
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < arr_enum.length; ++v) {
            Enum enum0 = arr_enum[v];
            String s = arr_s[v];
            if(s == null) {
                s = enum0.name();
            }
            hashMap0.put(s, enum0);
            String[] arr_s1 = arr2_s[v];
            if(arr_s1 != null) {
                int v1 = arr_s1.length;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Map.-EL.putIfAbsent(hashMap0, arr_s1[v2], enum0);
                }
            }
        }
        return new k(class0, arr_enum, hashMap0, k.c(b0, d0, arr_enum), z, false);
    }

    @Deprecated
    public static k h(g g0, Class class0) {
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Enum[] arr_enum = k.b(class0);
        String[] arr_s = b0.y(class0, arr_enum, new String[arr_enum.length]);
        String[][] arr2_s = new String[arr_s.length][];
        b0.s(class0, arr_enum, arr2_s);
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < arr_enum.length; ++v) {
            Enum enum0 = arr_enum[v];
            String s = arr_s[v];
            if(s == null) {
                s = enum0.name();
            }
            hashMap0.put(s, enum0);
            String[] arr_s1 = arr2_s[v];
            if(arr_s1 != null) {
                int v1 = arr_s1.length;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Map.-EL.putIfAbsent(hashMap0, arr_s1[v2], enum0);
                }
            }
        }
        return new k(class0, arr_enum, hashMap0, k.d(b0, class0), z, false);
    }

    public i i() {
        return i.b(this.c);
    }

    public static k j(g g0, d d0, com.fasterxml.jackson.databind.k k0) {
        int v2;
        String[] arr_s1;
        Enum enum0;
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Class class0 = d0.f();
        Enum[] arr_enum = k.b(class0);
        String[] arr_s = new String[arr_enum.length];
        String[][] arr2_s = new String[arr_enum.length][];
        if(b0 != null) {
            b0.x(g0, d0, arr_enum, arr_s);
            b0.r(g0, d0, arr_enum, arr2_s);
        }
        HashMap hashMap0 = new HashMap();
        int v = arr_enum.length;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                enum0 = arr_enum[v];
                String s = arr_s[v];
                if(s == null) {
                    s = k0.a(enum0.name());
                }
                hashMap0.put(s, enum0);
                arr_s1 = arr2_s[v];
                if(arr_s1 == null) {
                    continue alab1;
                }
                int v1 = arr_s1.length;
                v2 = 0;
            label_22:
            }
            while(v2 >= v1);
            Map.-EL.putIfAbsent(hashMap0, arr_s1[v2], enum0);
            ++v2;
            goto label_22;
        }
        return new k(class0, arr_enum, hashMap0, k.c(b0, d0, arr_enum), z, false);
    }

    @Deprecated
    public static k k(g g0, Class class0, com.fasterxml.jackson.databind.k k0) {
        int v2;
        String[] arr_s1;
        Enum enum0;
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Enum[] arr_enum = k.b(class0);
        HashMap hashMap0 = new HashMap();
        String[] arr_s = new String[arr_enum.length];
        String[][] arr2_s = new String[arr_enum.length][];
        if(b0 != null) {
            b0.y(class0, arr_enum, arr_s);
            b0.s(class0, arr_enum, arr2_s);
        }
        int v = arr_enum.length;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                enum0 = arr_enum[v];
                String s = arr_s[v];
                if(s == null) {
                    s = k0.a(enum0.name());
                }
                hashMap0.put(s, enum0);
                arr_s1 = arr2_s[v];
                if(arr_s1 == null) {
                    continue alab1;
                }
                int v1 = arr_s1.length;
                v2 = 0;
            label_21:
            }
            while(v2 >= v1);
            Map.-EL.putIfAbsent(hashMap0, arr_s1[v2], enum0);
            ++v2;
            goto label_21;
        }
        return new k(class0, arr_enum, hashMap0, k.d(b0, class0), z, false);
    }

    public static k l(g g0, d d0) {
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Class class0 = d0.f();
        Enum[] arr_enum = k.b(class0);
        HashMap hashMap0 = new HashMap();
        int v = arr_enum.length;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            hashMap0.put(String.valueOf(v), arr_enum[v]);
        }
        return new k(class0, arr_enum, hashMap0, k.c(b0, d0, arr_enum), z, false);
    }

    @Deprecated
    public static k m(g g0, Class class0) {
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Enum[] arr_enum = k.b(class0);
        HashMap hashMap0 = new HashMap();
        int v = arr_enum.length;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            hashMap0.put(String.valueOf(v), arr_enum[v]);
        }
        return new k(class0, arr_enum, hashMap0, k.d(b0, class0), z, false);
    }

    public static k n(g g0, d d0, com.fasterxml.jackson.databind.introspect.k k0) {
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Class class0 = d0.f();
        Enum[] arr_enum = k.b(class0);
        HashMap hashMap0 = new HashMap();
        int v = arr_enum.length;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            Enum enum0 = arr_enum[v];
            try {
                Object object0 = k0.q(enum0);
                if(object0 == null) {
                    continue;
                }
                hashMap0.put(object0.toString(), enum0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + enum0 + ": " + exception0.getMessage());
            }
        }
        return new k(class0, arr_enum, hashMap0, k.c(b0, d0, arr_enum), z, k.f(k0.f()));
    }

    @Deprecated
    public static k o(g g0, Class class0, com.fasterxml.jackson.databind.introspect.k k0) {
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Enum[] arr_enum = k.b(class0);
        HashMap hashMap0 = new HashMap();
        int v = arr_enum.length;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            Enum enum0 = arr_enum[v];
            try {
                Object object0 = k0.q(enum0);
                if(object0 == null) {
                    continue;
                }
                hashMap0.put(object0.toString(), enum0);
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + enum0 + ": " + exception0.getMessage());
            }
        }
        return new k(class0, arr_enum, hashMap0, k.d(b0, class0), z, k.f(k0.f()));
    }

    public static k p(g g0, d d0) {
        int v2;
        String[] arr_s1;
        Enum enum0;
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Class class0 = d0.f();
        Enum[] arr_enum = k.b(class0);
        String[] arr_s = new String[arr_enum.length];
        String[][] arr2_s = new String[arr_enum.length][];
        if(b0 != null) {
            b0.x(g0, d0, arr_enum, arr_s);
            b0.r(g0, d0, arr_enum, arr2_s);
        }
        HashMap hashMap0 = new HashMap();
        int v = arr_enum.length;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                enum0 = arr_enum[v];
                String s = arr_s[v];
                if(s == null) {
                    s = enum0.toString();
                }
                hashMap0.put(s, enum0);
                arr_s1 = arr2_s[v];
                if(arr_s1 == null) {
                    continue alab1;
                }
                int v1 = arr_s1.length;
                v2 = 0;
            label_22:
            }
            while(v2 >= v1);
            Map.-EL.putIfAbsent(hashMap0, arr_s1[v2], enum0);
            ++v2;
            goto label_22;
        }
        return new k(class0, arr_enum, hashMap0, k.c(b0, d0, arr_enum), z, false);
    }

    @Deprecated
    public static k q(g g0, Class class0) {
        int v2;
        String[] arr_s;
        Enum enum0;
        b b0 = g0.n();
        boolean z = g0.a0(t.z);
        Enum[] arr_enum = k.b(class0);
        HashMap hashMap0 = new HashMap();
        String[][] arr2_s = new String[arr_enum.length][];
        if(b0 != null) {
            b0.s(class0, arr_enum, arr2_s);
        }
        int v = arr_enum.length;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                enum0 = arr_enum[v];
                hashMap0.put(enum0.toString(), enum0);
                arr_s = arr2_s[v];
                if(arr_s == null) {
                    continue alab1;
                }
                int v1 = arr_s.length;
                v2 = 0;
            label_16:
            }
            while(v2 >= v1);
            Map.-EL.putIfAbsent(hashMap0, arr_s[v2], enum0);
            ++v2;
            goto label_16;
        }
        return new k(class0, arr_enum, hashMap0, k.d(b0, class0), z, false);
    }

    public Enum r(String s) {
        Enum enum0 = (Enum)this.c.get(s);
        return enum0 != null || !this.e ? enum0 : this.e(s);
    }

    public Enum s() {
        return this.d;
    }

    public Enum u(int v) {
        if(v >= 0) {
            return v >= this.b.length ? null : this.b[v];
        }
        return null;
    }

    public Class w() {
        return this.a;
    }

    public Collection x() {
        return this.c.keySet();
    }

    public List y() {
        List list0 = new ArrayList(this.b.length);
        Enum[] arr_enum = this.b;
        for(int v = 0; v < arr_enum.length; ++v) {
            ((ArrayList)list0).add(arr_enum[v]);
        }
        return list0;
    }

    public Enum[] z() {
        return this.b;
    }
}

