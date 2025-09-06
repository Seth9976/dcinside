package com.facebook.imagepipeline.cache;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.d;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public interface q extends d, B {
    @VisibleForTesting
    public static class com.facebook.imagepipeline.cache.q.a {
        public final Object a;
        public final com.facebook.common.references.a b;
        public int c;
        public boolean d;
        @h
        public final b e;
        public int f;
        public int g;

        private com.facebook.imagepipeline.cache.q.a(Object object0, com.facebook.common.references.a a0, @h b q$b0, int v) {
            this.a = com.facebook.common.internal.n.i(object0);
            this.b = (com.facebook.common.references.a)com.facebook.common.internal.n.i(com.facebook.common.references.a.e(a0));
            this.c = 0;
            this.d = false;
            this.e = q$b0;
            this.f = 0;
            this.g = v;
        }

        @VisibleForTesting
        public static com.facebook.imagepipeline.cache.q.a a(Object object0, com.facebook.common.references.a a0, int v, @h b q$b0) {
            return new com.facebook.imagepipeline.cache.q.a(object0, a0, q$b0, v);
        }

        @VisibleForTesting
        public static com.facebook.imagepipeline.cache.q.a b(Object object0, com.facebook.common.references.a a0, @h b q$b0) {
            return com.facebook.imagepipeline.cache.q.a.a(object0, a0, -1, q$b0);
        }
    }

    public interface b {
        void a(Object arg1, boolean arg2);
    }

    void clear();

    @h
    p d();

    int e();

    C f();

    @h
    com.facebook.common.references.a h(Object arg1, com.facebook.common.references.a arg2, b arg3);

    @h
    com.facebook.common.references.a j(Object arg1);

    int k();

    void l();

    int m();

    @h
    Map o();
}

