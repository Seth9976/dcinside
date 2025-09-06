package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {
    public static final b a;
    public static final b b;
    protected a c;
    protected File d;
    protected List e;

    static {
        b.a = new d();
        new f();
        b.b = new e();
    }

    public abstract void a();

    public void a(a a0, File file0, List list0) {
        this.c = a0;
        this.d = file0;
        this.e = list0;
    }
}

