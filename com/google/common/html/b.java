package com.google.common.html;

import J1.b;
import com.google.common.escape.h;
import com.google.common.escape.i;

@b
@a
public final class com.google.common.html.b {
    private static final h a;

    static {
        com.google.common.html.b.a = i.b().b('\"', "&quot;").b('\'', "&#39;").b('&', "&amp;").b('<', "&lt;").b('>', "&gt;").c();
    }

    public static h a() {
        return com.google.common.html.b.a;
    }
}

