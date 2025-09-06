package kotlinx.coroutines.channels;

import com.google.common.util.concurrent.Z0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.y1;
import y4.l;
import y4.m;

@s0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3086:1\n1#2:3087\n*E\n"})
public final class q extends S {
    @m
    private final j e;
    private final AtomicReferenceArray f;

    public q(long v, @m q q0, @m j j0, int v1) {
        super(v, q0, v1);
        this.e = j0;
        this.f = new AtomicReferenceArray(k.b * 2);
    }

    public final boolean D(int v, @m Object object0, @m Object object1) {
        return Z0.a(this.H(), v * 2 + 1, object0, object1);
    }

    public final void E(int v) {
        this.M(v, null);
    }

    @m
    public final Object F(int v, @m Object object0) {
        return this.H().getAndSet(v * 2 + 1, object0);
    }

    @l
    public final j G() {
        L.m(this.e);
        return this.e;
    }

    private final AtomicReferenceArray H() {
        return this.f;
    }

    public final Object I(int v) {
        return this.H().get(v * 2);
    }

    @m
    public final Object J(int v) {
        return this.H().get(v * 2 + 1);
    }

    public final void K(int v, boolean z) {
        if(z) {
            this.G().j2(this.c * ((long)k.b) + ((long)v));
        }
        this.A();
    }

    public final Object L(int v) {
        Object object0 = this.I(v);
        this.E(v);
        return object0;
    }

    private final void M(int v, Object object0) {
        this.H().set(v * 2, object0);
    }

    public final void N(int v, @m Object object0) {
        this.H().set(v * 2 + 1, object0);
    }

    public final void O(int v, Object object0) {
        this.M(v, object0);
    }

    @Override  // kotlinx.coroutines.internal.S
    public int y() {
        return k.b;
    }

    @Override  // kotlinx.coroutines.internal.S
    public void z(int v, @m Throwable throwable0, @l g g0) {
        Object object1;
        int v1 = k.b;
        int v2 = v < v1 ? 0 : 1;
        if(v2 != 0) {
            v -= v1;
        }
        Object object0 = this.I(v);
    alab1:
        do {
            do {
                object1 = this.J(v);
                if(object1 instanceof y1 || object1 instanceof J) {
                    continue alab1;
                }
                if(object1 == k.l || object1 == k.m) {
                    goto label_12;
                }
            }
            while(object1 == k.i || object1 == k.h);
            if(object1 != k.k && object1 != k.f && object1 != k.z()) {
                throw new IllegalStateException(("unexpected state: " + object1).toString());
            }
            return;
        label_12:
            this.E(v);
            if(v2 != 0) {
                Function1 function10 = this.G().b;
                if(function10 != null) {
                    kotlinx.coroutines.internal.L.b(function10, object0, g0);
                }
            }
            return;
        }
        while(!this.D(v, object1, (v2 == 0 ? k.m : k.l)));
        this.E(v);
        this.K(v, ((boolean)(v2 ^ 1)));
        if(v2 != 0) {
            Function1 function11 = this.G().b;
            if(function11 != null) {
                kotlinx.coroutines.internal.L.b(function11, object0, g0);
            }
        }
    }
}

