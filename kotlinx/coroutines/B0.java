package kotlinx.coroutines;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.k;
import kotlin.m;
import y4.l;

@E0
public interface b0 extends Z {
    public static final class a {
        @k(level = m.b, message = "Deprecated without replacement as an internal method never intended for public use")
        @y4.m
        public static Object a(@l b0 b00, long v, @l d d0) {
            Object object0 = kotlinx.coroutines.Z.a.a(b00, v, d0);
            return object0 == b.l() ? object0 : S0.a;
        }

        @l
        public static k0 b(@l b0 b00, long v, @l Runnable runnable0, @l g g0) {
            return kotlinx.coroutines.Z.a.b(b00, v, runnable0, g0);
        }
    }

    @l
    String b(long arg1);
}

