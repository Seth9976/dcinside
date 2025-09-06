package com.google.common.hash;

import J1.c;
import java.nio.Buffer;

@c
@k
final class y {
    static void a(Buffer buffer0) {
        buffer0.clear();
    }

    static void b(Buffer buffer0) {
        buffer0.flip();
    }

    static void c(Buffer buffer0, int v) {
        buffer0.limit(v);
    }

    static void d(Buffer buffer0, int v) {
        buffer0.position(v);
    }
}

