package com.dcinside.app.image.edit.filter.custom;

import Y2.a;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.resource.bitmap.i;
import java.security.MessageDigest;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import y4.l;

public final class m extends i {
    @l
    private final a c;

    public m(@l a a0) {
        L.p(a0, "filter");
        super();
        this.c = a0;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@l MessageDigest messageDigest0) {
        L.p(messageDigest0, "messageDigest");
        L.o("com.dcinside.app.image.edit.filter.custom.m", "getName(...)");
        byte[] arr_b = "com.dcinside.app.image.edit.filter.custom.m".getBytes(f.b);
        L.o(arr_b, "getBytes(...)");
        messageDigest0.update(arr_b);
        String s = this.c.getClass().getName();
        L.o(s, "getName(...)");
        byte[] arr_b1 = s.getBytes(f.b);
        L.o(arr_b1, "getBytes(...)");
        messageDigest0.update(arr_b1);
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.i
    @l
    protected Bitmap c(@l e e0, @l Bitmap bitmap0, int v, int v1) {
        L.p(e0, "pool");
        L.p(bitmap0, "origin");
        Bitmap bitmap1 = this.c.f(bitmap0);
        L.o(bitmap1, "processFilter(...)");
        return bitmap1;
    }

    @l
    public final a d() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof m ? L.g(((m)object0).c, this.c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }
}

