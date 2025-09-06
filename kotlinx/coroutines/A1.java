package kotlinx.coroutines;

import A3.o;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.k;
import kotlin.m;
import y4.l;

@k(level = m.b, message = "This is internal API and may be removed in the future releases")
@E0
public interface a1 extends I0 {
    public static final class a {
        @k(level = m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void a(a1 a10) {
            kotlinx.coroutines.I0.a.a(a10);
        }

        public static Object b(@l a1 a10, Object object0, @l o o0) {
            return kotlinx.coroutines.I0.a.d(a10, object0, o0);
        }

        @y4.m
        public static b c(@l a1 a10, @l c g$c0) {
            return kotlinx.coroutines.I0.a.e(a10, g$c0);
        }

        @l
        public static g d(@l a1 a10, @l c g$c0) {
            return kotlinx.coroutines.I0.a.h(a10, g$c0);
        }

        @l
        public static g e(@l a1 a10, @l g g0) {
            return kotlinx.coroutines.I0.a.i(a10, g0);
        }

        @k(level = m.b, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @l
        public static I0 f(@l a1 a10, @l I0 i00) {
            return i00;
        }
    }

    @E0
    @l
    CancellationException Y0();
}

