package androidx.compose.foundation.text;

import A3.o;
import androidx.compose.ui.MotionDurationScale.DefaultImpls;
import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import y4.l;
import y4.m;

final class FixedMotionDurationScale implements MotionDurationScale {
    @l
    public static final FixedMotionDurationScale a;

    static {
        FixedMotionDurationScale.a = new FixedMotionDurationScale();
    }

    @Override  // androidx.compose.ui.MotionDurationScale
    public float T0() {
        return 1.0f;
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return DefaultImpls.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return DefaultImpls.b(this, g$c0);
    }

    @Override  // androidx.compose.ui.MotionDurationScale
    public c getKey() {
        return androidx.compose.ui.c.a(this);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return DefaultImpls.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return DefaultImpls.d(this, g0);
    }
}

