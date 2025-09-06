package com.google.firebase.crashlytics.internal.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class h {
    private final String a;
    private static final String b;
    private static final AtomicLong c;

    static {
        h.b = "3cb90c198d67fc2fdb6ca3bece3a224332c99df8";
        h.c = new AtomicLong(0L);
    }

    h() {
        byte[] arr_b = new byte[10];
        this.f(arr_b);
        this.e(arr_b);
        this.d(arr_b);
        String s = i.u(arr_b);
        this.a = String.format(Locale.US, "%s%s%s%s", s.substring(0, 12), s.substring(12, 16), s.subSequence(16, 20), "48882a01b0f1").toUpperCase(Locale.US);
    }

    private static byte[] a(long v) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.putInt(((int)v));
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.position(0);
        return byteBuffer0.array();
    }

    private static byte[] b(long v) [...] // 潜在的解密器

    public String c() [...] // 潜在的解密器

    private void d(byte[] arr_b) {
        arr_b[8] = 18;
        arr_b[9] = 53;
    }

    private void e(byte[] arr_b) {
        arr_b[6] = 0;
        arr_b[7] = 1;
    }

    private void f(byte[] arr_b) {
        long v = new Date().getTime();
        byte[] arr_b1 = h.a(v / 1000L);
        arr_b[0] = arr_b1[0];
        arr_b[1] = arr_b1[1];
        arr_b[2] = arr_b1[2];
        arr_b[3] = arr_b1[3];
        byte[] arr_b2 = h.b(v % 1000L);
        arr_b[4] = arr_b2[0];
        arr_b[5] = arr_b2[1];
    }

    @Override
    public String toString() {
        return this.a;
    }
}

