package kotlinx.coroutines.sync;

import kotlin.coroutines.d;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.selects.i;
import y4.l;

public interface a {
    public static final class kotlinx.coroutines.sync.a.a {
        @k(level = m.a, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static void a() {
        }

        public static Object b(a a0, Object object0, d d0, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if((v & 1) != 0) {
                object0 = null;
            }
            return a0.h(object0, d0);
        }

        public static boolean c(a a0, Object object0, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if((v & 1) != 0) {
                object0 = null;
            }
            return a0.b(object0);
        }

        public static void d(a a0, Object object0, int v, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if((v & 1) != 0) {
                object0 = null;
            }
            a0.i(object0);
        }
    }

    boolean b(@y4.m Object arg1);

    boolean c();

    boolean d(@l Object arg1);

    @l
    i e();

    @y4.m
    Object h(@y4.m Object arg1, @l d arg2);

    void i(@y4.m Object arg1);
}

