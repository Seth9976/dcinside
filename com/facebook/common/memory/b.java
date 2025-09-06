package com.facebook.common.memory;

import androidx.annotation.Nullable;
import androidx.core.util.Pools.Pool;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;

@n(a.a)
public class b implements Pool {
    class com.facebook.common.memory.b.a extends ThreadLocal {
        com.facebook.common.memory.b.a() {
            super();
        }

        // 去混淆评级： 低(20)
        protected ByteBuffer a() {
            return ByteBuffer.allocate(0x4000);
        }

        @Override
        protected Object initialValue() {
            return this.a();
        }
    }

    public static final b a = null;
    private static final int b = 0x4000;
    private static int c;
    private static final ThreadLocal d;

    static {
        b.a = new b();
        b.c = 0x4000;
        b.d = new com.facebook.common.memory.b.a();
    }

    @Override  // androidx.core.util.Pools$Pool
    public boolean a(Object object0) {
        return this.f(((ByteBuffer)object0));
    }

    @Override  // androidx.core.util.Pools$Pool
    @Nullable
    public Object b() {
        return this.d();
    }

    static int c() [...] // 潜在的解密器

    @Nullable
    public ByteBuffer d() {
        return (ByteBuffer)b.d.get();
    }

    public static int e() [...] // 潜在的解密器

    public boolean f(ByteBuffer byteBuffer0) {
        return true;
    }

    public static void g(int v) {
        b.c = v;
    }
}

