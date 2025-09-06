package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public interface o extends d {
    public static final class a {
        public static boolean a(o o0, Throwable throwable0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                throwable0 = null;
            }
            return o0.c(throwable0);
        }

        public static Object b(o o0, Object object0, Object object1, int v, Object object2) {
            if(object2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if((v & 2) != 0) {
                object1 = null;
            }
            return o0.H(object0, object1);
        }
    }

    @x0
    void B(Object arg1, @m Function1 arg2);

    @E0
    void E(@l Object arg1);

    @E0
    @m
    Object H(Object arg1, @m Object arg2);

    void K(@l Function1 arg1);

    @E0
    @m
    Object P(@l Throwable arg1);

    @E0
    @m
    Object U(Object arg1, @m Object arg2, @m Function1 arg3);

    @x0
    void X(@l K arg1, Object arg2);

    boolean c(@m Throwable arg1);

    @E0
    void c0();

    boolean isActive();

    boolean isCancelled();

    boolean k();

    @x0
    void u(@l K arg1, @l Throwable arg2);
}

