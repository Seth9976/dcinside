package com.facebook.imagepipeline.platform;

import android.os.Build.VERSION;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SynchronizedPool;
import com.facebook.common.memory.b;
import com.facebook.imagepipeline.memory.N;
import com.facebook.imagepipeline.memory.k;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.L;
import y4.l;
import z3.j;
import z3.n;

public final class e {
    @l
    public static final e a;

    static {
        e.a = new e();
    }

    @l
    @j
    @n
    public static final d a(@l N n0, boolean z, @l f f0) {
        L.p(n0, "poolFactory");
        L.p(f0, "platformDecoderOptions");
        return e.c(n0, z, false, f0, 4, null);
    }

    @l
    @j
    @n
    public static final d b(@l N n0, boolean z, boolean z1, @l f f0) {
        L.p(n0, "poolFactory");
        L.p(f0, "platformDecoderOptions");
        if(Build.VERSION.SDK_INT >= 26) {
            k k0 = n0.b();
            L.o(k0, "getBitmapPool(...)");
            return new c(k0, e.d(n0, z1), f0);
        }
        k k1 = n0.b();
        L.o(k1, "getBitmapPool(...)");
        return new a(k1, e.d(n0, z1), f0);
    }

    public static d c(N n0, boolean z, boolean z1, f f0, int v, Object object0) {
        if((v & 4) != 0) {
            z1 = false;
        }
        return e.b(n0, z, z1, f0);
    }

    @l
    @n
    public static final Pool d(@l N n0, boolean z) {
        L.p(n0, "poolFactory");
        if(z) {
            L.o(b.a, "INSTANCE");
            return b.a;
        }
        int v = n0.e();
        Pool pools$Pool0 = new SynchronizedPool(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x4000);
            L.o(byteBuffer0, "allocate(...)");
            pools$Pool0.a(byteBuffer0);
        }
        return pools$Pool0;
    }
}

