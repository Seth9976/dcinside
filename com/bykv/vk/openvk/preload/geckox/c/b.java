package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.e;

public final class b {
    private static b a;
    private d b;

    static {
        b.a = new b();
    }

    private b() {
        e e0 = new e();
        a a0 = new a();
        e0.a(Boolean.class, a0);
        e0.a(Boolean.TYPE, new a());
        this.b = e0.a();
    }

    public static b a() {
        return b.a;
    }

    public final d b() {
        return this.b;
    }
}

