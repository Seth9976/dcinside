package com.fasterxml.jackson.core;

public final class b {
    static final String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;

    static {
        a a0 = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        b.b = a0;
        b.c = new a(a0, "MIME-NO-LINEFEEDS", 0x7FFFFFFF);
        b.d = new a(a0, "PEM", true, '=', 0x40);
        StringBuilder stringBuilder0 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        stringBuilder0.setCharAt(stringBuilder0.indexOf("+"), '-');
        stringBuilder0.setCharAt(stringBuilder0.indexOf("/"), '_');
        b.e = new a("MODIFIED-FOR-URL", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", false, '\u0000', 0x7FFFFFFF);
    }

    public static a a() {
        return b.c;
    }

    public static a b(String s) throws IllegalArgumentException {
        a a0 = b.b;
        if("MIME".equals(s)) {
            return a0;
        }
        a a1 = b.c;
        if("MIME-NO-LINEFEEDS".equals(s)) {
            return a1;
        }
        a a2 = b.d;
        if("PEM".equals(s)) {
            return a2;
        }
        a a3 = b.e;
        if(!"MODIFIED-FOR-URL".equals(s)) {
            throw new IllegalArgumentException("No Base64Variant with name " + (s == null ? "<null>" : "\'" + s + "\'"));
        }
        return a3;
    }
}

