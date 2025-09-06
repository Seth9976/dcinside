package com.google.common.io;

import J1.c;
import J1.d;
import java.nio.Buffer;

@c
@d
@q
final class w {
    static void a(Buffer buffer0) {
        buffer0.clear();
    }

    static void b(Buffer buffer0) {
        buffer0.flip();
    }

    static void c(Buffer buffer0, int v) {
        buffer0.limit(v);
    }

    static void d(Buffer buffer0) {
        buffer0.mark();
    }

    static void e(Buffer buffer0, int v) {
        buffer0.position(v);
    }

    static void f(Buffer buffer0) {
        buffer0.reset();
    }
}

