package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.n.a;

public enum e implements d {
    ALLOW_JAVA_COMMENTS(false, a.d),
    ALLOW_YAML_COMMENTS(false, a.e),
    ALLOW_SINGLE_QUOTES(false, a.g),
    ALLOW_UNQUOTED_FIELD_NAMES(false, a.f),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, a.h),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, a.i),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, a.j),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false, a.k),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, a.l),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false, a.m),
    ALLOW_NON_NUMERIC_NUMBERS(false, a.n),
    ALLOW_MISSING_VALUES(false, a.o),
    ALLOW_TRAILING_COMMA(false, a.p);

    private final boolean a;
    private final int b;
    private final a c;

    private e(boolean z, a n$a0) {
        this.a = z;
        this.b = 1 << this.ordinal();
        this.c = n$a0;
    }

    @Override  // com.fasterxml.jackson.core.d
    public int a() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.core.d
    public boolean b(int v) {
        return (v & this.b) != 0;
    }

    @Override  // com.fasterxml.jackson.core.d
    public boolean c() {
        return this.a;
    }

    public static int e() {
        e[] arr_e = e.values();
        int v1 = 0;
        for(int v = 0; v < arr_e.length; ++v) {
            e e0 = arr_e[v];
            if(e0.c()) {
                v1 |= e0.a();
            }
        }
        return v1;
    }

    public a f() {
        return this.c;
    }
}

