package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

public final class e implements g {
    private final Object c;

    public e(@NonNull Object object0) {
        this.c = m.e(object0);
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(this.c.toString().getBytes(g.b));
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof e ? this.c.equals(((e)object0).c) : false;
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        return "ObjectKey{object=" + this.c + '}';
    }
}

