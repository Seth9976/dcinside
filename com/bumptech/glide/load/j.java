package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.b;
import java.security.MessageDigest;

public final class j implements g {
    private final ArrayMap c;

    public j() {
        this.c = new b();
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        for(int v = 0; v < this.c.size(); ++v) {
            j.g(((i)this.c.g(v)), this.c.l(v), messageDigest0);
        }
    }

    // 去混淆评级： 低(20)
    @Nullable
    public Object c(@NonNull i i0) {
        return this.c.containsKey(i0) ? this.c.get(i0) : i0.d();
    }

    public void d(@NonNull j j0) {
        this.c.h(j0.c);
    }

    public j e(@NonNull i i0) {
        this.c.remove(i0);
        return this;
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof j ? this.c.equals(((j)object0).c) : false;
    }

    @NonNull
    public j f(@NonNull i i0, @NonNull Object object0) {
        this.c.put(i0, object0);
        return this;
    }

    private static void g(@NonNull i i0, @NonNull Object object0, @NonNull MessageDigest messageDigest0) {
        i0.h(object0, messageDigest0);
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        return "Options{values=" + this.c + '}';
    }
}

