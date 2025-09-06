package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.j;
import com.bumptech.glide.util.o;
import java.util.Queue;

public class n {
    @VisibleForTesting
    static final class b {
        private int a;
        private int b;
        private Object c;
        private static final Queue d;

        static {
            b.d = o.g(0);
        }

        static b a(Object object0, int v, int v1) {
            b n$b0;
            synchronized(b.d) {
                n$b0 = (b)b.d.poll();
            }
            if(n$b0 == null) {
                n$b0 = new b();
            }
            n$b0.b(object0, v, v1);
            return n$b0;
        }

        private void b(Object object0, int v, int v1) {
            this.c = object0;
            this.b = v;
            this.a = v1;
        }

        public void c() {
            synchronized(b.d) {
                b.d.offer(this);
            }
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof b && this.b == ((b)object0).b && this.a == ((b)object0).a && this.c.equals(((b)object0).c);
        }

        @Override
        public int hashCode() {
            return (this.a * 0x1F + this.b) * 0x1F + this.c.hashCode();
        }
    }

    private final j a;
    private static final int b = 0xFA;

    public n() {
        this(0xFAL);
    }

    public n(long v) {
        class a extends j {
            final n e;

            a(long v) {
                super(v);
            }

            @Override  // com.bumptech.glide.util.j
            protected void n(@NonNull Object object0, @Nullable Object object1) {
                this.r(((b)object0), object1);
            }

            protected void r(@NonNull b n$b0, @Nullable Object object0) {
                n$b0.c();
            }
        }

        this.a = new a(this, v);
    }

    public void a() {
        this.a.c();
    }

    @Nullable
    public Object b(Object object0, int v, int v1) {
        b n$b0 = b.a(object0, v, v1);
        Object object1 = this.a.k(n$b0);
        n$b0.c();
        return object1;
    }

    public void c(Object object0, int v, int v1, Object object1) {
        b n$b0 = b.a(object0, v, v1);
        this.a.o(n$b0, object1);
    }
}

