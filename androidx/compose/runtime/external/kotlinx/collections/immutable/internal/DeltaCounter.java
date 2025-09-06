package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class DeltaCounter {
    private int a;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public DeltaCounter(int v) {
        this.a = v;
    }

    public DeltaCounter(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public final int a() {
        return this.a;
    }

    @l
    public final DeltaCounter b(int v) {
        return new DeltaCounter(v);
    }

    public static DeltaCounter c(DeltaCounter deltaCounter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = deltaCounter0.a;
        }
        return deltaCounter0.b(v);
    }

    public final int d() {
        return this.a;
    }

    public final void e(int v) {
        this.a += v;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DeltaCounter ? this.a == ((DeltaCounter)object0).a : false;
    }

    public final void f(int v) {
        this.a = v;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }
}

