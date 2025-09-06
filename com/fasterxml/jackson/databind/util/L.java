package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.w;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.p;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class l implements Serializable {
    private final Class a;
    private final Enum[] b;
    private final w[] c;
    private transient EnumMap d;
    private static final long e = 1L;

    private l(Class class0, w[] arr_w) {
        this.a = class0;
        this.b = (Enum[])class0.getEnumConstants();
        this.c = arr_w;
    }

    protected static Class a(Class class0) [...] // Inlined contents

    protected static Enum[] b(Class class0) {
        Enum[] arr_enum = (Enum[])h.t(class0).getEnumConstants();
        if(arr_enum == null) {
            throw new IllegalArgumentException("No enum constants for class " + class0.getName());
        }
        return arr_enum;
    }

    // 去混淆评级： 低(20)
    public static l c(G g0, d d0) {
        return g0.l1(H.r) ? l.h(g0, d0) : l.f(g0, d0);
    }

    public static l d(t t0, Class class0, List list0) {
        int v = list0.size();
        w[] arr_w = new w[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_w[v1] = t0.e(((String)list0.get(v1)));
        }
        return l.e(class0, arr_w);
    }

    public static l e(Class class0, w[] arr_w) {
        return new l(class0, arr_w);
    }

    public static l f(t t0, d d0) {
        b b0 = t0.n();
        boolean z = t0.b0(p.d);
        Class class0 = d0.f();
        Enum[] arr_enum = l.b(class0);
        String[] arr_s = b0.x(t0, d0, arr_enum, new String[arr_enum.length]);
        w[] arr_w = new w[arr_enum.length];
        for(int v = 0; v < arr_enum.length; ++v) {
            Enum enum0 = arr_enum[v];
            String s = arr_s[v];
            if(s == null) {
                s = enum0.name();
            }
            if(z) {
                s = s.toLowerCase();
            }
            arr_w[enum0.ordinal()] = t0.e(s);
        }
        return l.e(class0, arr_w);
    }

    @Deprecated
    public static l g(t t0, Class class0) {
        Class class1 = h.t(class0);
        Enum[] arr_enum = (Enum[])class1.getEnumConstants();
        if(arr_enum == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + class0.getName());
        }
        String[] arr_s = t0.n().y(class1, arr_enum, new String[arr_enum.length]);
        w[] arr_w = new w[arr_enum.length];
        for(int v = 0; v < arr_enum.length; ++v) {
            Enum enum0 = arr_enum[v];
            String s = arr_s[v];
            if(s == null) {
                s = enum0.name();
            }
            if(t0.b0(p.d)) {
                s = s.toLowerCase();
            }
            arr_w[enum0.ordinal()] = t0.e(s);
        }
        return l.e(class0, arr_w);
    }

    public static l h(t t0, d d0) {
        b b0 = t0.n();
        boolean z = t0.b0(p.d);
        Class class0 = d0.f();
        Enum[] arr_enum = l.b(class0);
        String[] arr_s = new String[arr_enum.length];
        if(b0 != null) {
            b0.x(t0, d0, arr_enum, arr_s);
        }
        w[] arr_w = new w[arr_enum.length];
        for(int v = 0; v < arr_enum.length; ++v) {
            String s = arr_s[v];
            if(s == null) {
                s = arr_enum[v].toString();
            }
            if(z) {
                s = s.toLowerCase();
            }
            arr_w[v] = t0.e(s);
        }
        return l.e(class0, arr_w);
    }

    @Deprecated
    public static l i(t t0, Class class0) {
        Enum[] arr_enum = (Enum[])h.t(class0).getEnumConstants();
        if(arr_enum == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + class0.getName());
        }
        ArrayList arrayList0 = new ArrayList(arr_enum.length);
        for(int v = 0; v < arr_enum.length; ++v) {
            arrayList0.add(arr_enum[v].toString());
        }
        return l.d(t0, class0, arrayList0);
    }

    public static l j(t t0, d d0, k k0) {
        b b0 = t0.n();
        boolean z = t0.b0(p.d);
        Class class0 = d0.f();
        Enum[] arr_enum = l.b(class0);
        String[] arr_s = new String[arr_enum.length];
        if(b0 != null) {
            b0.x(t0, d0, arr_enum, arr_s);
        }
        w[] arr_w = new w[arr_enum.length];
        for(int v = 0; v < arr_enum.length; ++v) {
            Enum enum0 = arr_enum[v];
            String s = arr_s[v];
            if(s == null) {
                s = k0.a(enum0.name());
            }
            if(z) {
                s = s.toLowerCase();
            }
            arr_w[v] = t0.e(s);
        }
        return l.e(class0, arr_w);
    }

    @Deprecated
    public static l k(t t0, Class class0, k k0) {
        Enum[] arr_enum = (Enum[])h.t(class0).getEnumConstants();
        if(arr_enum == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + class0.getName());
        }
        ArrayList arrayList0 = new ArrayList(arr_enum.length);
        for(int v = 0; v < arr_enum.length; ++v) {
            arrayList0.add(k0.a(arr_enum[v].name()));
        }
        return l.d(t0, class0, arrayList0);
    }

    public List l() {
        return Arrays.asList(this.b);
    }

    public Class m() {
        return this.a;
    }

    public EnumMap n() {
        EnumMap enumMap0 = this.d;
        if(enumMap0 == null) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            Enum[] arr_enum = this.b;
            for(int v = 0; v < arr_enum.length; ++v) {
                Enum enum0 = arr_enum[v];
                linkedHashMap0.put(enum0, this.c[enum0.ordinal()]);
            }
            EnumMap enumMap1 = new EnumMap(linkedHashMap0);
            this.d = enumMap1;
            return enumMap1;
        }
        return enumMap0;
    }

    public w o(Enum enum0) {
        return this.c[enum0.ordinal()];
    }

    public Collection p() {
        return Arrays.asList(this.c);
    }
}

