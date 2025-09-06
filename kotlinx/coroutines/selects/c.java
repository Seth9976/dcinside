package kotlinx.coroutines.selects;

import A3.o;
import kotlin.c0;
import kotlin.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.x0;
import y4.l;

public interface c {
    public static final class a {
        public static void a(@l c c0, @l i i0, @l o o0) {
            c0.e(i0, null, o0);
        }

        @h
        @k(level = m.b, message = "Replaced with the same extension function", replaceWith = @c0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @x0
        public static void b(@l c c0, long v, @l Function1 function10) {
            b.a(c0, v, function10);
        }
    }

    void b(@l e arg1, @l Function1 arg2);

    @h
    @k(level = m.b, message = "Replaced with the same extension function", replaceWith = @c0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @x0
    void c(long arg1, @l Function1 arg2);

    void e(@l i arg1, Object arg2, @l o arg3);

    void f(@l g arg1, @l o arg2);

    void i(@l i arg1, @l o arg2);
}

