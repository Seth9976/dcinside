package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class t0 {
    @l
    public static final CancellationException a(@m String s, @m Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }
}

