package androidx.compose.animation.core;

import y4.l;

public interface Animation {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l Animation animation0, long v) {
            return a.a(animation0, v);
        }
    }

    boolean a();

    boolean b(long arg1);

    long c();

    @l
    TwoWayConverter d();

    Object e(long arg1);

    Object f();

    @l
    AnimationVector g(long arg1);
}

