package com.facebook.imagepipeline.core;

import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.common.executors.h;
import com.facebook.common.internal.q;
import com.facebook.imagepipeline.bitmaps.e;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.b;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.cache.x;
import com.facebook.imagepipeline.decoder.c;
import com.facebook.imagepipeline.decoder.d;
import com.facebook.imagepipeline.decoder.f;
import com.facebook.imagepipeline.memory.N;
import com.facebook.imagepipeline.producers.Z;
import java.util.Map;
import java.util.Set;
import s0.a;
import y4.l;
import y4.m;

public interface z {
    @m
    d A();

    @l
    q B();

    int C();

    @l
    q D();

    @l
    b E();

    @l
    n F();

    boolean G();

    @l
    Set H();

    @l
    q I();

    @l
    com.facebook.imagepipeline.core.n J();

    @m
    a K();

    @l
    p L();

    @l
    Set a();

    @m
    Bitmap.Config b();

    @m
    B c();

    @m
    e d();

    @l
    f e();

    @m
    Map f();

    @m
    com.facebook.imagepipeline.cache.q.b g();

    @l
    Context getContext();

    boolean h();

    @m
    c i();

    @l
    q j();

    @l
    N k();

    @l
    b1.a l();

    @l
    x m();

    @l
    q n();

    @m
    B o();

    @l
    com.facebook.common.memory.e p();

    @l
    l0 q();

    @l
    Z r();

    @l
    com.facebook.cache.disk.d s();

    @l
    Set t();

    @l
    com.facebook.imagepipeline.cache.B.a u();

    @l
    com.facebook.imagepipeline.cache.B.a v();

    @l
    com.facebook.cache.disk.d w();

    @m
    h x();

    @m
    Integer y();

    @m
    com.facebook.imagepipeline.transcoder.d z();
}

