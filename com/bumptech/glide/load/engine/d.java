package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import java.security.MessageDigest;

final class d implements g {
    private final g c;
    private final g d;

    d(g g0, g g1) {
        this.c = g0;
        this.d = g1;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        this.c.b(messageDigest0);
        this.d.b(messageDigest0);
    }

    g c() {
        return this.c;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof d && this.c.equals(((d)object0).c) && this.d.equals(((d)object0).d);
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode() * 0x1F + this.d.hashCode();
    }

    @Override
    public String toString() {
        return "DataCacheKey{sourceKey=" + this.c + ", signature=" + this.d + '}';
    }
}

