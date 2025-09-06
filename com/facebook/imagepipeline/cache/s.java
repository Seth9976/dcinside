package com.facebook.imagepipeline.cache;

import android.app.ActivityManager;
import com.facebook.common.internal.q;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;

@n(a.a)
public class s implements q {
    private final ActivityManager a;
    private static final int b = 0x100;
    private static final int c = 0x7FFFFFFF;
    private static final int d = 0x7FFFFFFF;
    private static final int e = 0x7FFFFFFF;
    private static final long f;

    static {
        s.f = TimeUnit.MINUTES.toMillis(5L);
    }

    public s(ActivityManager activityManager0) {
        this.a = activityManager0;
    }

    public C a() {
        return new C(this.b(), 0x100, 0x7FFFFFFF, 0x7FFFFFFF, 0x7FFFFFFF, s.f);
    }

    private int b() {
        int v = Math.min(this.a.getMemoryClass() * 0x100000, 0x7FFFFFFF);
        if(v < 0x2000000) {
            return 0x400000;
        }
        return v >= 0x4000000 ? v / 4 : 0x600000;
    }

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.a();
    }
}

