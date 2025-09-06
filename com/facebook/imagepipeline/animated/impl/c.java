package com.facebook.imagepipeline.animated.impl;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.e;
import com.facebook.common.internal.l;
import com.facebook.imagepipeline.cache.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class c {
    @VisibleForTesting
    static class b implements e {
        private final e a;
        private final int b;

        public b(e e0, int v) {
            this.a = e0;
            this.b = v;
        }

        @Override  // com.facebook.cache.common.e
        @h
        public String a() {
            return null;
        }

        @Override  // com.facebook.cache.common.e
        public boolean b() {
            return false;
        }

        @Override  // com.facebook.cache.common.e
        public boolean c(Uri uri0) {
            return this.a.c(uri0);
        }

        // 去混淆评级： 低(40)
        @Override  // com.facebook.cache.common.e
        public boolean equals(@h Object object0) {
            return object0 == this ? true : object0 instanceof b && (this.b == ((b)object0).b && this.a.equals(((b)object0).a));
        }

        @Override  // com.facebook.cache.common.e
        public int hashCode() {
            return this.a.hashCode() * 0x3F5 + this.b;
        }

        @Override  // com.facebook.cache.common.e
        public String toString() {
            return l.e(this).f("imageCacheKey", this.a).d("frameIndex", this.b).toString();
        }
    }

    private final e a;
    private final q b;
    private final com.facebook.imagepipeline.cache.q.b c;
    @p3.a("this")
    private final LinkedHashSet d;

    public c(e e0, q q0) {
        class com.facebook.imagepipeline.animated.impl.c.a implements com.facebook.imagepipeline.cache.q.b {
            final c a;

            @Override  // com.facebook.imagepipeline.cache.q$b
            public void a(Object object0, boolean z) {
                this.b(((e)object0), z);
            }

            public void b(e e0, boolean z) {
                c.this.f(e0, z);
            }
        }

        this.a = e0;
        this.b = q0;
        this.d = new LinkedHashSet();
        this.c = new com.facebook.imagepipeline.animated.impl.c.a(this);
    }

    @h
    public com.facebook.common.references.a a(int v, com.facebook.common.references.a a0) {
        b c$b0 = this.e(v);
        return this.b.h(c$b0, a0, this.c);
    }

    public boolean b(int v) {
        b c$b0 = this.e(v);
        return this.b.contains(c$b0);
    }

    @h
    public com.facebook.common.references.a c(int v) {
        b c$b0 = this.e(v);
        return this.b.get(c$b0);
    }

    @h
    public com.facebook.common.references.a d() {
        com.facebook.common.references.a a0;
        do {
            e e0 = this.g();
            if(e0 == null) {
                return null;
            }
            a0 = this.b.j(e0);
        }
        while(a0 == null);
        return a0;
    }

    private b e(int v) {
        return new b(this.a, v);
    }

    public void f(e e0, boolean z) {
        synchronized(this) {
            if(z) {
                this.d.add(e0);
            }
            else {
                this.d.remove(e0);
            }
        }
    }

    @h
    private e g() {
        e e0;
        synchronized(this) {
            Iterator iterator0 = this.d.iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                e0 = (e)object0;
                iterator0.remove();
            }
            else {
                e0 = null;
            }
            return e0;
        }
    }
}

