package com.coupang.ads.clog;

import android.util.Log;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e implements a {
    private final int a;

    public e() {
        this(0, 1, null);
    }

    public e(int v) {
        this.a = v;
    }

    public e(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 4;
        }
        this(v);
    }

    @Override  // com.coupang.ads.clog.b$a
    public void a(int v, @m String s, @l String s1) {
        L.p(s1, "msg");
        if(v >= this.a) {
            Log.println(v, s, s1);
        }
    }
}

