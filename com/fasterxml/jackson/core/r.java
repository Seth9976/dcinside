package com.fasterxml.jackson.core;

public enum r {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[r.values().length];
            a.a = arr_v;
            try {
                arr_v[r.k.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.l.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.o.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.m.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.n.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.u.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.t.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.p.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.s.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.r.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.q.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.v.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.j.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);

    final String a;
    final char[] b;
    final byte[] c;
    final int d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;

    private r(String s1, int v1) {
        boolean z = false;
        if(s1 == null) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        else {
            this.a = s1;
            char[] arr_c = s1.toCharArray();
            this.b = arr_c;
            this.c = new byte[arr_c.length];
            for(int v2 = 0; v2 < arr_c.length; ++v2) {
                this.c[v2] = (byte)this.b[v2];
            }
        }
        this.d = v1;
        this.h = v1 == 9 || v1 == 10;
        this.g = v1 == 7 || v1 == 8;
        boolean z1 = v1 == 1 || v1 == 3;
        this.e = z1;
        boolean z2 = v1 == 2 || v1 == 4;
        this.f = z2;
        if(!z1 && !z2 && (v1 != -1 && v1 != 5)) {
            z = true;
        }
        this.i = z;
    }

    public final byte[] a() {
        return this.c;
    }

    public final char[] b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.i;
    }

    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        return this.e;
    }

    public static String j(r r0) {
        if(r0 == null) {
            return "<end of input>";
        }
        switch(r0) {
            case 1: 
            case 2: 
            case 3: {
                return "Object value";
            }
            case 4: 
            case 5: {
                return "Array value";
            }
            case 6: 
            case 7: {
                return "Boolean value";
            }
            case 8: {
                return "Embedded Object value";
            }
            case 9: {
                return "Floating-point value";
            }
            case 10: {
                return "Integer value";
            }
            case 11: {
                return "String value";
            }
            case 12: {
                return "Null value";
            }
            default: {
                return "[Unavailable value]";
            }
        }
    }
}

