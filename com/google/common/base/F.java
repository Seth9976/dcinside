package com.google.common.base;

import J1.b;
import J1.c;
import J1.d;
import java.nio.charset.Charset;

@b(emulated = true)
@k
public final class f {
    @c
    @d
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    @c
    @d
    public static final Charset d;
    @c
    @d
    public static final Charset e;
    @c
    @d
    public static final Charset f;

    static {
        f.a = Charset.forName("US-ASCII");
        f.b = Charset.forName("ISO-8859-1");
        f.c = Charset.forName("UTF-8");
        f.d = Charset.forName("UTF-16BE");
        f.e = Charset.forName("UTF-16LE");
        f.f = Charset.forName("UTF-16");
    }
}

