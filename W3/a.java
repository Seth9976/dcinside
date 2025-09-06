package w3;

import java.util.concurrent.CancellationException;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nCancellationException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellationException.kt\nkotlin/coroutines/cancellation/CancellationExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class a {
    @h0(version = "1.4")
    @f
    private static final CancellationException a(String s, Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }

    @h0(version = "1.4")
    @f
    private static final CancellationException b(Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException((throwable0 == null ? null : throwable0.toString()));
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }

    @h0(version = "1.4")
    public static void c() {
    }
}

