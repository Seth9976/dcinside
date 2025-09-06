package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.q;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;

@n(a.a)
public class u implements q {
    private static final int a = 0x7FFFFFFF;
    private static final int b = 0x7FFFFFFF;
    private static final long c;

    static {
        u.c = TimeUnit.MINUTES.toMillis(5L);
    }

    // 去混淆评级： 低(20)
    public C a() {
        return new C(0x400000, 0x7FFFFFFF, 0x400000, 0x7FFFFFFF, 0x80000, u.c);
    }

    private int b() [...] // 潜在的解密器

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.a();
    }
}

