package androidx.compose.foundation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NoOpOverscrollEffect implements OverscrollEffect {
    @l
    public static final NoOpOverscrollEffect a;

    static {
        NoOpOverscrollEffect.a = new NoOpOverscrollEffect();
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    public boolean a() {
        return false;
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    @l
    public Modifier b() {
        return Modifier.m0;
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    public long c(long v, int v1, @l Function1 function10) {
        L.p(function10, "performScroll");
        return ((Offset)function10.invoke(Offset.d(v))).A();
    }

    @Override  // androidx.compose.foundation.OverscrollEffect
    @m
    public Object d(long v, @l o o0, @l d d0) {
        Object object0 = o0.invoke(Velocity.b(v), d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

