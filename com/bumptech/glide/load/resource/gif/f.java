package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.h;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

public class f implements n {
    private final n c;

    public f(n n0) {
        this.c = (n)m.e(n0);
    }

    @Override  // com.bumptech.glide.load.n
    @NonNull
    public v a(@NonNull Context context0, @NonNull v v0, int v1, int v2) {
        c c0 = (c)v0.get();
        h h0 = new h(c0.h(), com.bumptech.glide.c.e(context0).h());
        v v3 = this.c.a(context0, h0, v1, v2);
        if(!h0.equals(v3)) {
            h0.recycle();
        }
        Bitmap bitmap0 = (Bitmap)v3.get();
        c0.r(this.c, bitmap0);
        return v0;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        this.c.b(messageDigest0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof f ? this.c.equals(((f)object0).c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }
}

