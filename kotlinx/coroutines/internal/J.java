package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.jvm.internal.s0;
import kotlin.sequences.p;
import kotlinx.coroutines.CoroutineExceptionHandler;
import y4.l;

@s0({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class j {
    @l
    private static final Collection a;

    static {
        j.a = p.c3(p.e(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));
    }

    public static final void a(@l CoroutineExceptionHandler coroutineExceptionHandler0) {
        if(!j.a.contains(coroutineExceptionHandler0)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    @l
    public static final Collection b() {
        return j.a;
    }

    public static final void c(@l Throwable throwable0) {
        Thread thread0 = Thread.currentThread();
        thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
    }
}

