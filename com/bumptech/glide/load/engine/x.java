package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class x implements g {
    private final b c;
    private final g d;
    private final g e;
    private final int f;
    private final int g;
    private final Class h;
    private final j i;
    private final n j;
    private static final com.bumptech.glide.util.j k;

    static {
        x.k = new com.bumptech.glide.util.j(50L);
    }

    x(b b0, g g0, g g1, int v, int v1, n n0, Class class0, j j0) {
        this.c = b0;
        this.d = g0;
        this.e = g1;
        this.f = v;
        this.g = v1;
        this.j = n0;
        this.h = class0;
        this.i = j0;
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        byte[] arr_b = (byte[])this.c.e(8, byte[].class);
        ByteBuffer.wrap(arr_b).putInt(this.f).putInt(this.g).array();
        this.e.b(messageDigest0);
        this.d.b(messageDigest0);
        messageDigest0.update(arr_b);
        n n0 = this.j;
        if(n0 != null) {
            n0.b(messageDigest0);
        }
        this.i.b(messageDigest0);
        messageDigest0.update(this.c());
        this.c.put(arr_b);
    }

    private byte[] c() {
        com.bumptech.glide.util.j j0 = x.k;
        byte[] arr_b = (byte[])j0.k(this.h);
        if(arr_b == null) {
            arr_b = this.h.getName().getBytes(g.b);
            j0.o(this.h, arr_b);
        }
        return arr_b;
    }

    // 去混淆评级： 中等(60)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof x && this.g == ((x)object0).g && this.f == ((x)object0).f && o.e(this.j, ((x)object0).j) && this.h.equals(((x)object0).h) && this.d.equals(((x)object0).d) && this.e.equals(((x)object0).e) && this.i.equals(((x)object0).i);
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        int v = ((this.d.hashCode() * 0x1F + this.e.hashCode()) * 0x1F + this.f) * 0x1F + this.g;
        n n0 = this.j;
        if(n0 != null) {
            v = v * 0x1F + n0.hashCode();
        }
        return (v * 0x1F + this.h.hashCode()) * 0x1F + this.i.hashCode();
    }

    @Override
    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.d + ", signature=" + this.e + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + this.h + ", transformation=\'" + this.j + '\'' + ", options=" + this.i + '}';
    }
}

