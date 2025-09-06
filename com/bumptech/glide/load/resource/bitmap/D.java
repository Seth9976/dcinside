package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

@Deprecated
public class d implements n {
    private final n c;

    public d(n n0) {
        this.c = (n)m.e(new z(n0, false));
    }

    @Override  // com.bumptech.glide.load.n
    @NonNull
    public v a(@NonNull Context context0, @NonNull v v0, int v1, int v2) {
        return d.c(this.c.a(context0, v0, v1, v2));
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        this.c.b(messageDigest0);
    }

    private static v c(v v0) {
        if(!(v0.get() instanceof BitmapDrawable)) {
            throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + v0.get());
        }
        return v0;
    }

    private static v d(v v0) [...] // Inlined contents

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof d ? this.c.equals(((d)object0).c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }
}

