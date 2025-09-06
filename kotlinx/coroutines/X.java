package kotlinx.coroutines;

import A3.o;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.k;
import kotlin.m;
import y4.l;

public interface x extends X {
    public static final class a {
        @k(level = m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void a(x x0) {
            kotlinx.coroutines.I0.a.a(x0);
        }

        public static Object b(@l x x0, Object object0, @l o o0) {
            return kotlinx.coroutines.X.a.b(x0, object0, o0);
        }

        @y4.m
        public static b c(@l x x0, @l c g$c0) {
            return kotlinx.coroutines.X.a.c(x0, g$c0);
        }

        @l
        public static g d(@l x x0, @l c g$c0) {
            return kotlinx.coroutines.X.a.d(x0, g$c0);
        }

        @l
        public static g e(@l x x0, @l g g0) {
            return kotlinx.coroutines.X.a.e(x0, g0);
        }

        @k(level = m.b, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @l
        public static I0 f(@l x x0, @l I0 i00) {
            return kotlinx.coroutines.X.a.f(x0, i00);
        }
    }

    boolean Q(Object arg1);

    boolean f(@l Throwable arg1);
}

