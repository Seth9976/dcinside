package com.facebook.cache.disk;

import com.facebook.cache.common.e;
import com.facebook.cache.common.m;
import java.io.IOException;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public interface k extends u0.a {
    com.facebook.cache.disk.f.a a() throws IOException;

    void b();

    boolean c(e arg1);

    @h
    r0.a d(e arg1);

    boolean f(e arg1);

    long getCount();

    long getSize();

    boolean h(e arg1);

    long i(long arg1);

    boolean isEnabled();

    void j(e arg1);

    @h
    r0.a k(e arg1, m arg2) throws IOException;
}

