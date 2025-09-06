package org.bson.diagnostics;

import R3.a;

public final class c {
    public static final String a = "org.bson";
    private static final boolean b;

    static {
        c.b = true;
    }

    public static b a(String s) {
        a.e("suffix", s);
        if(s.startsWith(".") || s.endsWith(".")) {
            throw new IllegalArgumentException("The suffix can not start or end with a \'.\'");
        }
        return c.b ? new d("org.bson." + s) : new org.bson.diagnostics.a("org.bson." + s);
    }

    private static boolean b() [...] // Inlined contents
}

