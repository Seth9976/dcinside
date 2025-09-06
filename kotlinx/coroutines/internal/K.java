package kotlinx.coroutines.internal;

import kotlin.coroutines.g;
import kotlin.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.L;
import y4.l;

public final class k {
    public static final void a(@l g g0, @l Throwable throwable0) {
        for(Object object0: j.b()) {
            CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)object0;
            try {
                coroutineExceptionHandler0.handleException(g0, throwable0);
            }
            catch(p unused_ex) {
                return;
            }
            catch(Throwable throwable1) {
                j.c(L.c(throwable0, throwable1));
            }
        }
        try {
            o.a(throwable0, new m(g0));
        }
        catch(Throwable unused_ex) {
        }
        j.c(throwable0);
    }
}

