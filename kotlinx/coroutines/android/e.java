package kotlinx.coroutines.android;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.Z.a;
import kotlinx.coroutines.Z;
import kotlinx.coroutines.k0;
import y4.l;

public abstract class e extends U0 implements Z {
    private e() {
    }

    public e(w w0) {
    }

    @l
    public abstract e Q1();

    @Override  // kotlinx.coroutines.Z
    @l
    public k0 Y(long v, @l Runnable runnable0, @l g g0) {
        return a.b(this, v, runnable0, g0);
    }

    @Override  // kotlinx.coroutines.Z
    @k(level = m.b, message = "Deprecated without replacement as an internal method never intended for public use")
    @y4.m
    public Object l0(long v, @l d d0) {
        return a.a(this, v, d0);
    }
}

