package com.bykv.vk.openvk.preload.a.b.b;

import java.lang.reflect.AccessibleObject;

public abstract class b {
    private static final b a;

    static {
        b.a = new a();
    }

    public static b a() {
        return b.a;
    }

    public abstract void a(AccessibleObject arg1);
}

