package androidx.compose.ui;

import A3.o;
import androidx.compose.runtime.Stable;
import kotlin.coroutines.g.b.a;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
public interface MotionDurationScale extends b {
    public static final class DefaultImpls {
        public static Object a(@l MotionDurationScale motionDurationScale0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return a.a(motionDurationScale0, object0, o0);
        }

        @m
        public static b b(@l MotionDurationScale motionDurationScale0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.b(motionDurationScale0, g$c0);
        }

        @l
        public static g c(@l MotionDurationScale motionDurationScale0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.c(motionDurationScale0, g$c0);
        }

        @l
        public static g d(@l MotionDurationScale motionDurationScale0, @l g g0) {
            L.p(g0, "context");
            return a.d(motionDurationScale0, g0);
        }
    }

    public static final class Key implements c {
        static final Key a;

        static {
            Key.a = new Key();
        }
    }

    @l
    public static final Key n0;

    static {
        MotionDurationScale.n0 = Key.a;
    }

    float T0();

    @Override  // kotlin.coroutines.g$b
    @l
    c getKey();
}

